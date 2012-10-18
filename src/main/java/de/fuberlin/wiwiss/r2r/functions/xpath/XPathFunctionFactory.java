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
package de.fuberlin.wiwiss.r2r.functions.xpath;

import java.io.StringWriter;
import java.io.UnsupportedEncodingException;
import java.math.BigDecimal;
import java.net.URLEncoder;
import java.text.Collator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.ibm.icu.text.Normalizer;
import com.ibm.icu.text.UTF16;
import com.ibm.icu.text.UTF16.StringComparator;

import de.fuberlin.wiwiss.r2r.Function;
import de.fuberlin.wiwiss.r2r.MultiFunctionFactory;

public class XPathFunctionFactory extends MultiFunctionFactory {

	private static final String XPATH_PREFIX = "xpath:";
	
	private static Logger log = LoggerFactory
			.getLogger(XPathFunctionFactory.class);

	public XPathFunctionFactory() {
		super();
		for (Class fClass : XPathFunctionFactory.class.getDeclaredClasses()) {
			try {
				Function function = (Function) fClass.newInstance();
				String key = function.getURI();
				if (functions.containsKey(key)) {
					log.warn("Duplicate function definition: " + key);
				} else {
					functions.put(key, function);
				}
			} catch (ClassCastException e) {
				log.warn(fClass + " does not implement Function");
			} catch (InstantiationException e) {
				log.error(fClass + " lacks empty constructor");
			} catch (IllegalAccessException e) {
				e.printStackTrace();
			}
		}
	}

	protected static class CodepointsToStringFunction implements Function {

		public String getURI() {
			return XPATH_PREFIX + "codepoints-to-string";
		}

		public List<String> execute(List<List<String>> arguments, String hint) {
			List<String> result = new ArrayList<String>();
			StringWriter sw = new StringWriter();
			String[] args = getArguments(arguments, 0, -1);
			for (String valStr : args) {
				try {
					int val = Integer.parseInt(valStr);
					sw.append((char) val);
				} catch (NumberFormatException e) {
					throw new IllegalArgumentException(
							"Argument is no codepoint: " + valStr);
				}
			}
			result.add(sw.toString());
			return result;
		}
	}

	protected static class StringToCodepointsFunction implements Function {

		public String getURI() {
			return XPATH_PREFIX + "string-to-codepoints";
		}

		public List<String> execute(List<List<String>> arguments, String hint) {
			List<String> result = new ArrayList<String>();
			String value = getArguments(arguments, 1, 1)[0];
			for (int i = 0; i < value.length(); i++) {
				result.add(Integer.toString(value.codePointAt(i)));
			}
			return result;
		}
	}

	protected static class CompareFunction implements Function {

		public String getURI() {
			return XPATH_PREFIX + "compare";
		}

		public List<String> execute(List<List<String>> arguments, String hint) {
			List<String> result = new ArrayList<String>();
			String[] args = getArguments(arguments, 2, 3);
			String value1 = args[0];
			String value2 = args[1];
			Collator collator = null;
			if (args.length == 3) {
				String lang = args[2];
				Locale locale = new Locale(lang);
				collator = Collator.getInstance(locale);
			}
			int intRes = 0;
			if (collator == null) {
				intRes = value1.compareTo(value2);
			} else {
				intRes = collator.compare(value1, value2);
			}
			result.add(Integer.toString(intRes));
			return result;
		}
	}

	protected static class CodepointEqualFunction implements Function {

		public String getURI() {
			return XPATH_PREFIX + "codepoint-equal";
		}

		public List<String> execute(List<List<String>> arguments, String hint) {
			List<String> result = new ArrayList<String>();
			String[] args = getArguments(arguments, 2, 2);
			String value0 = args[0];
			String value1 = args[1];
			StringComparator comp = new UTF16.StringComparator();
			result.add(Boolean.toString(comp.compare(value0, value1) == 0));
			return result;
		}
	}

	protected static class ConcatFunction implements Function {

		public String getURI() {
			return XPATH_PREFIX + "concat";
		}

		public List<String> execute(List<List<String>> arguments, String hint) {
			List<String> result = new ArrayList<String>();
			String[] args = getArguments(arguments, 2, -1);
			StringWriter sw = new StringWriter();
			for (String arg : args) {
				sw.append(arg);
			}
			result.add(sw.toString());
			return result;
		}

	}

	protected static class StringJoinFunction implements Function {

		public String getURI() {
			return XPATH_PREFIX + "string-join";
		}

		public List<String> execute(List<List<String>> arguments, String hint) {
			List<String> result = new ArrayList<String>();
			if (arguments.size() < 1) {
				throw new IllegalArgumentException("Too few arguments");
			}
			List<String> list = arguments.get(0);
			String sep = "";
			if (arguments.size() > 2) {
				throw new IllegalArgumentException("Too many arguments");
			}
			if (arguments.size() == 2) {
				List<String> sList = arguments.get(1);
				if (sList.size() != 1) {
					throw new IllegalArgumentException(
							"Wrong format for separator");
				}
				sep = sList.get(0);
			}
			StringWriter sw = new StringWriter();
			Iterator<String> it = list.iterator();
			if (it.hasNext()) {
				sw.append(it.next());
			}
			while (it.hasNext()) {
				sw.append(sep);
				sw.append(it.next());
			}
			result.add(sw.toString());
			return result;
		}
	}

	protected static class SubstringFunction implements Function {

		public String getURI() {
			return XPATH_PREFIX + "substring";
		}

		public List<String> execute(List<List<String>> arguments, String hint) {
			List<String> result = new ArrayList<String>();
			String[] args = getArguments(arguments, 2, 3);
			String str = args[0];
			int start = (int) Math.round(getDouble(args[1]));
			int oldStart = start;
			if (start > str.length()) {
				result.add("");
				return result;
			}
			if (start <= 0) {
				start = 0;
			} else {
				start -= 1;
			}
			if (args.length == 2) {
				result.add(str.substring(start));
				return result;
			}
			int length = (int) Math.round(getDouble(args[2]));
			int end = oldStart + length - 1;
			if (end > str.length() - 1) {
				end = str.length() - 1;
			}
			if (end < start) {
				result.add("");
				return result;
			}
			result.add(str.substring(start, end));
			return result;
		}
	}

	protected static class StringLengthFunction implements Function {

		public String getURI() {
			return XPATH_PREFIX + "string-length";
		}

		public List<String> execute(List<List<String>> arguments, String hint) {
			List<String> result = new ArrayList<String>();
			String[] args = getArguments(arguments, 0, 1);
			if (args.length == 0) {
				result.add("0");
				return result;
			}
			String str = args[0];
			result.add(Integer.toString(str.length()));
			return result;
		}
	}

	protected static class NormalizeSpaceFunction implements Function {

		public String getURI() {
			return XPATH_PREFIX + "normalize-space";
		}

		public List<String> execute(List<List<String>> arguments, String hint) {
			List<String> result = new ArrayList<String>();
			String[] args = getArguments(arguments, 0, 1);
			if (args.length == 0) {
				result.add("");
				return result;
			}
			String str = args[0];
			str = str.trim();
			str = str.replaceAll("\\s+", " ");
			result.add(str);
			return result;
		}
	}

	protected static class NormalizeUnicodeFunction implements Function {

		public String getURI() {
			return XPATH_PREFIX + "normalize-unicode";
		}

		public List<String> execute(List<List<String>> arguments, String hint) {
			List<String> result = new ArrayList<String>();
			String[] args = getArguments(arguments, 1, 2);
			String str = args[0];
			Normalizer.Mode mode = Normalizer.NFC;
			if (args.length == 2) {
				String modeStr = args[1].toUpperCase();
				if (modeStr.equals("NFD")) {
					mode = Normalizer.NFD;
				} else if (modeStr.equals("NFKC")) {
					mode = Normalizer.NFKC;
				} else if (modeStr.equals("NFKD")) {
					mode = Normalizer.NFKD;
				}
				// else if (modeStr.equals("FULLY-NORMALIZED")) {
				// mode = Normalizer.DEFAULT;
				// }
				else {
					throw new IllegalArgumentException(
							"Normalization mode unknown: " + modeStr);
				}
			}
			result.add(Normalizer.normalize(str, mode));
			return result;
		}
	}

	protected static class UpperCaseFunction implements Function {

		public String getURI() {
			return XPATH_PREFIX + "upper-case";
		}

		public List<String> execute(List<List<String>> arguments, String hint) {
			List<String> result = new ArrayList<String>();
			String[] args = getArguments(arguments, 1, 1);
			String str = args[0];
			result.add(str.toUpperCase());
			return result;
		}
	}

	protected static class LowerCaseFunction implements Function {

		public String getURI() {
			return XPATH_PREFIX + "lower-case";
		}

		public List<String> execute(List<List<String>> arguments, String hint) {
			List<String> result = new ArrayList<String>();
			String[] args = getArguments(arguments, 1, 1);
			String str = args[0];
			result.add(str.toLowerCase());
			return result;
		}
	}

	protected static class TranslateFunction implements Function {

		public String getURI() {
			return XPATH_PREFIX + "translate";
		}

		public List<String> execute(List<List<String>> arguments, String hint) {
			List<String> result = new ArrayList<String>();
			String[] args = getArguments(arguments, 3, 3);
			String str = args[0];
			String map = args[1];
			String trans = args[2];
			Map<Character, Character> charMap = new HashMap<Character, Character>();
			for (int i = 0; i < map.length(); i++) {
				char ch = map.charAt(i);
				Character val = null;
				if (trans.length() > i) {
					val = trans.charAt(i);
				} else {
					val = null;
				}
				if (!charMap.containsKey(ch)) {
					charMap.put(ch, val);
				}
			}
			StringWriter sw = new StringWriter();
			for (int i = 0; i < str.length(); i++) {
				char ch = str.charAt(i);
				if (charMap.containsKey(ch)) {
					Character newCh = charMap.get(ch);
					if (newCh != null) {
						sw.append(newCh);
					}
				} else {
					sw.append(ch);
				}
			}
			result.add(sw.toString());
			return result;
		}
	}

	protected static class EncodeForUriFunction implements Function {

		public String getURI() {
			return XPATH_PREFIX + "encode-for-uri";
		}

		public List<String> execute(List<List<String>> arguments, String hint) {
			List<String> result = new ArrayList<String>();
			String[] args = getArguments(arguments, 1, 1);
			String str = args[0];
			try {
				// Java URLencoding is NOT conformant to RFC 3986!
				str = URLEncoder.encode(str, "UTF-8");
				// FIXME what if the original URI contained a "+"?! what?!
				str = str.replaceAll("\\+", "%20");
				result.add(str);
			} catch (UnsupportedEncodingException e) {
				e.printStackTrace();
			}
			return result;
		}
	}

	protected static class IriToUriFunction implements Function {

		public String getURI() {
			return XPATH_PREFIX + "iri-to-uri";
		}

		public List<String> execute(List<List<String>> arguments, String hint) {
			List<String> result = new ArrayList<String>();
			String[] args = getArguments(arguments, 1, 1);
			String str = args[0];
			result.add(java.net.URI.create(str).toASCIIString());
			return result;
		}
	}

	protected static class EscapeHtmlUriFunction implements Function {

		public String getURI() {
			return XPATH_PREFIX + "escape-html-uri";
		}

		public List<String> execute(List<List<String>> arguments, String hint) {
			List<String> result = new ArrayList<String>();
			String[] args = getArguments(arguments, 1, 1);
			String str = args[0];
			try {
				result.add(URLEncoder.encode(str, "UTF-8"));
			} catch (UnsupportedEncodingException e) {
				e.printStackTrace();
			}
			return result;
		}
	}

	/*
	 * The following functions do not use Unicode collations but just implement
	 * the resp. simple functions of XPath.
	 */

	protected static class ContainsFunction implements Function {

		public String getURI() {
			return XPATH_PREFIX + "contains";
		}

		public List<String> execute(List<List<String>> arguments, String hint) {
			List<String> result = new ArrayList<String>();
			String[] args = getArguments(arguments, 2, 2);
			if (arguments.get(0).isEmpty()) {
				result.add("false");
				return result;
			}
			String str = args[0];
			String sub = args[1];
			result.add(Boolean.toString(str.contains(sub)));
			return result;
		}
	}

	protected static class StartsWithFunction implements Function {

		public String getURI() {
			return XPATH_PREFIX + "starts-with";
		}

		public List<String> execute(List<List<String>> arguments, String hint) {
			List<String> result = new ArrayList<String>();
			String[] args = getArguments(arguments, 2, 2);
			String str = args[0];
			String sub = args[1];
			result.add(Boolean.toString(str.startsWith(sub)));
			return result;
		}
	}

	protected static class EndsWithFunction implements Function {

		public String getURI() {
			return XPATH_PREFIX + "ends-with";
		}

		public List<String> execute(List<List<String>> arguments, String hint) {
			List<String> result = new ArrayList<String>();
			String[] args = getArguments(arguments, 2, 2);
			String str = args[0];
			String sub = args[1];
			result.add(Boolean.toString(str.endsWith(sub)));
			return result;
		}
	}

	protected static class SubstringBeforeFunction implements Function {

		public String getURI() {
			return XPATH_PREFIX + "substring-before";
		}

		public List<String> execute(List<List<String>> arguments, String hint) {
			List<String> result = new ArrayList<String>();
			String[] args = getArguments(arguments, 2, 2);
			String str = args[0];
			String sub = args[1];
			int index = str.indexOf(sub);
			String res = "";
			if (index > 0) {
				res = str.substring(0, index);
			}
			result.add(res);
			return result;
		}
	}

	protected static class SubstringAfterFunction implements Function {

		public String getURI() {
			return XPATH_PREFIX + "substring-after";
		}

		public List<String> execute(List<List<String>> arguments, String hint) {
			List<String> result = new ArrayList<String>();
			String[] args = getArguments(arguments, 2, 2);
			String str = args[0];
			String sub = args[1];
			int index = str.indexOf(sub);
			String res = "";
			if (index >= 0) {
				res = str.substring(index + sub.length());
			}
			result.add(res);
			return result;
		}
	}

	/**
	 * Tests for pattern matching. Attention! Unlike in the XPath doc, this one
	 * is using Java regex for convenience purposes.
	 * 
	 * @author maggi
	 * 
	 */
	protected static class MatchesFunction implements Function {

		public String getURI() {
			return XPATH_PREFIX + "matches";
		}

		public List<String> execute(List<List<String>> arguments, String hint) {
			List<String> result = new ArrayList<String>();
			String[] args = getArguments(arguments, 2, 2);
			String str = args[0];
			String pattern = args[1];
			Pattern p = Pattern.compile(pattern);
			Matcher m = p.matcher(str);
			result.add(Boolean.toString(m.find()));
			return result;
		}
	}

	protected static class ReplaceFunction implements Function {

		public String getURI() {
			return XPATH_PREFIX + "replace";
		}

		public List<String> execute(List<List<String>> arguments, String hint) {
			List<String> result = new ArrayList<String>();
			String[] args = getArguments(arguments, 3, 3);
			String str = args[0];
			String pattern = args[1];
			String replaceStr = args[2];
			result.add(str.replaceAll(pattern, replaceStr));
			return result;
		}
	}

	protected static class TokenizeFunction implements Function {

		public String getURI() {
			return XPATH_PREFIX + "tokenize";
		}

		public List<String> execute(List<List<String>> arguments, String hint) {
			List<String> result = new ArrayList<String>();
			String[] args = getArguments(arguments, 2, 2);
			String str = args[0];
			String pattern = args[1];
			String[] parts = str.split(pattern, -1);
			result.addAll(Arrays.asList(parts));
			return result;
		}
	}

	/*
	 * Numeric functions
	 */

	protected static class AbsFunction implements Function {

		public String getURI() {
			return XPATH_PREFIX + "abs";
		}

		public List<String> execute(List<List<String>> arguments, String hint) {
			List<String> result = new ArrayList<String>();
			String[] args = getArguments(arguments, 1, 1);
			double x = getDouble(args[0]);
			result.add(Double.toString(Math.abs(x)));
			return result;
		}
	}

	protected static class CeilingFunction implements Function {

		public String getURI() {
			return XPATH_PREFIX + "ceiling";
		}

		public List<String> execute(List<List<String>> arguments, String hint) {
			List<String> result = new ArrayList<String>();
			String[] args = getArguments(arguments, 1, 1);
			double x = getDouble(args[0]);
			result.add(Double.toString(Math.ceil(x)));
			return result;
		}
	}

	protected static class FloorFunction implements Function {

		public String getURI() {
			return XPATH_PREFIX + "floor";
		}

		public List<String> execute(List<List<String>> arguments, String hint) {
			List<String> result = new ArrayList<String>();
			String[] args = getArguments(arguments, 1, 1);
			double x = getDouble(args[0]);
			result.add(Double.toString(Math.floor(x)));
			return result;
		}
	}

	protected static class RoundFunction implements Function {

		public String getURI() {
			return XPATH_PREFIX + "round";
		}

		public List<String> execute(List<List<String>> arguments, String hint) {
			List<String> result = new ArrayList<String>();
			String[] args = getArguments(arguments, 1, 1);
			double x = getDouble(args[0]);
			result.add(Long.toString(Math.round(x)));
			return result;
		}
	}

	protected static class RoundHalfToEvenFunction implements Function {

		public String getURI() {
			return XPATH_PREFIX + "round-half-to-even";
		}

		public List<String> execute(List<List<String>> arguments, String hint) {
			List<String> result = new ArrayList<String>();
			String[] args = getArguments(arguments, 1, 2);
			double x = getDouble(args[0]);
			int prec = 0;
			if (args.length == 2) {
				prec = getInteger(args[1]);
			}
			BigDecimal bd = new BigDecimal(Double.toString(x));
			bd = bd.setScale(prec, BigDecimal.ROUND_HALF_EVEN);
			result.add(Double.toString(bd.doubleValue()));
			return result;
		}
	}

	/*
	 * Static auxiliary functions.
	 */

	private static int getInteger(String string) {
		try {
			return Integer.parseInt(string);

		} catch (NumberFormatException e) {
			throw new IllegalArgumentException("Argument is not an integer: "
					+ string);
		}
	}

	private static double getDouble(String string) {
		try {
			return Double.parseDouble(string);
		} catch (NumberFormatException e) {
			throw new IllegalArgumentException("Argument is not a double: "
					+ string);
		}
	}

	private static String[] getArguments(List<List<String>> arguments, int min,
			int max) {
		if (max == -1) {
			max = Integer.MAX_VALUE;
		}
		if (arguments.size() < min) {
			throw new IllegalArgumentException("Too few arguments");
		}
		if (arguments.size() > max) {
			throw new IllegalArgumentException("Too many arguments");
		}
		String[] args = new String[arguments.size()];
		for (int i = 0; i < arguments.size(); i++) {
			List<String> arg = arguments.get(i);
			if (arg.isEmpty()) {
				args[i] = "";
			} else if (arg.size() != 1) {
				throw new IllegalArgumentException(
						"Wrong argument format in argument #" + i);
			} else {
				args[i] = arg.get(0);
			}
		}
		return args;
	}
}
