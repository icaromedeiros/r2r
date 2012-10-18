/*
 *  R2R
 *
 *  Copyright 2010-2011 Freie Universität Berlin
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
package de.fuberlin.wiwiss.r2r.functions;

import java.util.List;
import java.util.regex.Pattern;
import java.util.Map;
import java.util.HashMap;
import java.math.BigDecimal;

public class HelperFunctions {
	private static final Pattern nonNumeric = Pattern.compile("[^\\deE\\.+-]");
	private static final Pattern nonDecimal = Pattern.compile("[^\\d+-\\.]");
	private static final Pattern nonInteger = Pattern.compile("[^\\d+-]");
	private static final Map<String, DataType> dtMap = new HashMap<String, DataType>();
	
	static {
		// Map to a Java Type that can handle the XSD data type
		// DataType.Integer is a BigInteger
		
		dtMap.put("http://www.w3.org/2001/XMLSchema#decimal", DataType.Decimal);
		dtMap.put("http://www.w3.org/2001/XMLSchema#int", DataType.Int);
		dtMap.put("http://www.w3.org/2001/XMLSchema#long", DataType.Long);
		dtMap.put("http://www.w3.org/2001/XMLSchema#double", DataType.Double);
		dtMap.put("http://www.w3.org/2001/XMLSchema#float", DataType.Double);
		dtMap.put("http://www.w3.org/2001/XMLSchema#integer", DataType.Integer);
		dtMap.put("http://www.w3.org/2001/XMLSchema#byte", DataType.Int);
		dtMap.put("http://www.w3.org/2001/XMLSchema#negativeInteger", DataType.Integer);
		dtMap.put("http://www.w3.org/2001/XMLSchema#nonNegativeInteger", DataType.Integer);
		dtMap.put("http://www.w3.org/2001/XMLSchema#nonPositiveInteger", DataType.Integer);
		dtMap.put("http://www.w3.org/2001/XMLSchema#positiveInteger", DataType.Integer);
		dtMap.put("http://www.w3.org/2001/XMLSchema#short", DataType.Int);
		dtMap.put("http://www.w3.org/2001/XMLSchema#unsignedByte", DataType.Int);
		dtMap.put("http://www.w3.org/2001/XMLSchema#unsignedInt", DataType.Long);
		dtMap.put("http://www.w3.org/2001/XMLSchema#unsignedLong", DataType.Long);
		dtMap.put("http://www.w3.org/2001/XMLSchema#unsignedShort", DataType.Int);		
	}
	
	/**
	 * finds out the most general data type of the arguments
	 * @param arguments all arguments of the Function
	 * @return DataType value
	 */
	public static DataType getDataTypeInformationOfAllArguments(List<List<String>> arguments) {
		DataType returnType = DataType.Integer;
		
		for(List<String> argument: arguments) {
			DataType t = getDataTypeInformationOfArgument(argument);
			if(t==DataType.String)
				return DataType.String;
			else if(t==DataType.Double)
				returnType = DataType.Double;
			else if(returnType!=DataType.Double && t==DataType.Decimal)
				returnType = DataType.Decimal;
		}
		return returnType;
	}
	
	/**
	 * finds out the most general data type of the arguments
	 * @param arguments the Function arguments
	 * @return DataType value
	 */
	public static DataType getDataTypeInformationOfArgument(List<String> arguments) {
		DataType returnType = DataType.Integer;
		
		for(String argument: arguments) {
			if(nonNumeric.matcher(argument).find())
				return DataType.String;
			else if(nonDecimal.matcher(argument).find())
				returnType = DataType.Double;
			else if(returnType!=DataType.Double && nonInteger.matcher(argument).find())
				returnType = DataType.Decimal;
		}
		
		return returnType;
	}
	
	/**
	 * returns a data type that can handle the requested data type
	 * @param hint the requested data type
	 * @return the data type that handles the XSD data type
	 */
	public static DataType getWorkingDataTypeOfDataTypeString(String hint) {
		return dtMap.get(hint);
	}
	
	/**
	 * gets the data type that can handle the values for the given arguments in consideration of the requested data type.
	 * @param found the most general data type of the arguments
	 * @param hint the requested data type
	 * @return the data type that should be used for calculations
	 */
	public static DataType takeMostAppropriateDataTypeForAddLikeCalculations(DataType found, String hint) {
		// Can't calculate with String, return DataType.String and fail
		if(found==DataType.String)
			return DataType.String;
		
		DataType hintDT = getWorkingDataTypeOfDataTypeString(hint);
		// No known hint given
		if(hintDT==null) {
			if(found==DataType.Decimal || found==DataType.Double)// Without hint, calculate with doubles
				return DataType.Double;
			else// For integral values, use long
				return DataType.Long;
		}
		// The hint is known. Handling of non-integral types should always be possible, casting to the right type is done later 
		else {
			// Type is integral, no need to compute with Decimal types
			if(found==DataType.Integer)
				return hintDT;
			// Else take a non-integral data type that can hold the value 
			if(hintDT==DataType.Double || hintDT==DataType.Int)// Ints fit into Doubles
				return DataType.Double;
			else 
			// else compute with decimal for bigger data types
				return DataType.Decimal;
		}
	}
	
	/**
	 * gets the data type that can handle the values for the given arguments in consideration of the requested data type for divide-like calculations. For example: (2 / 3) should be computed as double values.
	 * @param found
	 * @param hint
	 * @return
	 */
	public static DataType takeMostAppropriateDataTypeForDivideLikeCalculations(DataType found, String hint) {
		DataType hintDT = getWorkingDataTypeOfDataTypeString(hint);

		// Can't calculate with String, return DataType.String and fail
		if(found==DataType.String)
			return DataType.String;
		
		if(hintDT==null)
			// Hint not recognized, always calculate as decimal as most universal type
			return DataType.Decimal;
		else {
			if(hintDT==DataType.Decimal)
				return DataType.Decimal;
			// Long and xsd:integer need a more precise data type than Double => Decimal
			else if(hintDT==DataType.Long || hintDT==DataType.Integer)
				return DataType.Decimal;
			else
			// Use Double for any other requested data type
				return DataType.Double;
		}
	}
	
	public static String convertValueToDataType(String value, String datatype) {
		// No known data type to convert to, return unconverted value
		if(dtMap.get(datatype)==null)
			return value;
		
		datatype = datatype.substring(33);
		BigDecimal numericValue = new BigDecimal(value);

		// doesn't deal with unsigned or explicitly signed values (converts them to BigInteger)
		if(datatype.equals("int"))
			return "" + numericValue.intValue();
		else if(datatype.equals("long"))
			return "" + numericValue.longValue();
		else if(datatype.equals("integer"))
			return numericValue.toBigInteger().toString();
		else if(datatype.equals("byte"))
			return "" + numericValue.byteValue(); 
		else if(datatype.equals("negativeInteger"))
			return numericValue.toBigInteger().toString();
		else if(datatype.equals("nonNegativeInteger"))
			return numericValue.toBigInteger().toString();
		else if(datatype.equals("nonPositiveInteger"))
			return numericValue.toBigInteger().toString();
		else if(datatype.equals("positiveInteger"))
			return numericValue.toBigInteger().toString();
		else if(datatype.equals("short"))
			return "" + numericValue.shortValue();
		else if(datatype.equals("unsignedByte"))
			return numericValue.toBigInteger().toString();
		else if(datatype.equals("unsignedInt"))
			return numericValue.toBigInteger().toString();
		else if(datatype.equals("unsignedLong"))
			return numericValue.toBigInteger().toString();
		else if(datatype.equals("unsignedShort"))
			return numericValue.toBigInteger().toString();
		
		// For the rest - float, double, decimal - do nothing, already correct
		return value;
	}
	
	public static DataType pickMoreGeneralDataType(DataType dt1, DataType dt2) {
		if(dt1==DataType.String || dt2==DataType.String)
			return DataType.String;
		else if(dt1==DataType.Integer && dt2==DataType.Integer)
			return DataType.Integer;
		else
			return DataType.Double;
	}
	
	// The data types the calculations are done, Integer is a BigInteger
	public enum DataType {
		Int, Long, Integer, Decimal, Double, String
	}
}
