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
package de.fuberlin.wiwiss.r2r;

import java.util.ResourceBundle;
import java.util.*;

/**
 * Config handles configuration parameters from the r2r property file from the class path.
 * @author andreas
 *
 */
public class Config {
	static private Properties properties = new Properties();
	
	static {
		try {
			ResourceBundle rb = ResourceBundle.getBundle("r2r"); 
			for(String key: rb.keySet())
				properties.setProperty(key, rb.getString(key));
		} catch(MissingResourceException e) {
			// TODO: log and fill with default values
			
		}
	}
	
	static public String getProperty(String key) {
		return properties.getProperty(key); 
	}
	
	static public String getProperty(String key, String defaultValue) {
		String value = getProperty(key);
		return value!=null ? value : defaultValue; 
	}
	
	static public boolean rethrowActivated() {
		return getProperty("r2r.ExceptionHandling.rethrow", "true").equalsIgnoreCase("true");
	}
}