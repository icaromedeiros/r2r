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
 * Time: 4:39 PM
 * To change this template use File | Settings | File Templates.
 */
public class Sha1sumFunctionFactory implements FunctionFactory {
    private Sha1sumFunction function = null;

	public Function getInstance() {
		if(function==null)
			function = new Sha1sumFunction();

		return function;
	}

	private class Sha1sumFunction implements Function {

		public String getURI() {
			return "sha1sum";
		}

		public List<String> execute(List<List<String>> arguments, String hint) {
			List<String> resultList = new ArrayList<String>();
			String value = arguments.get(0).get(0);
            try {
                String hash = new BigInteger(1, MessageDigest.getInstance("SHA1").digest(value.getBytes())).toString(16);
                if(hash.length()<40)
                    hash = "0" + hash;
                resultList.add(hash);
            } catch (NoSuchAlgorithmException e) {
                e.printStackTrace();
            }

            return resultList;
		}
	}
}
