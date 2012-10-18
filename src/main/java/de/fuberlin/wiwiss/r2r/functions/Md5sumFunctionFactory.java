package de.fuberlin.wiwiss.r2r.functions;

import de.fuberlin.wiwiss.r2r.Function;
import de.fuberlin.wiwiss.r2r.FunctionFactory;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: andreas
 * Date: 1/23/12
 * Time: 4:47 PM
 * To change this template use File | Settings | File Templates.
 */
public class Md5sumFunctionFactory implements FunctionFactory {
        private Md5sumFunction function = null;

	public Function getInstance() {
		if(function==null)
			function = new Md5sumFunction();

		return function;
	}

	private class Md5sumFunction implements Function {

		public String getURI() {
			return "md5sum";
		}

		public List<String> execute(List<List<String>> arguments, String hint) {
			List<String> resultList = new ArrayList<String>();
			String value = arguments.get(0).get(0);
            try {
                String hash = new BigInteger(1, MessageDigest.getInstance("MD5").digest(value.getBytes())).toString(16);
                if(hash.length()<32)
                    hash = "0" + hash;
                resultList.add(hash);
            } catch (NoSuchAlgorithmException e) {
                e.printStackTrace();
            }

            return resultList;
		}
	}
}
