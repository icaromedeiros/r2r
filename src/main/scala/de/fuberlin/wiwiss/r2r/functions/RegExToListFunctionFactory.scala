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
package de.fuberlin.wiwiss.r2r.functions

import de.fuberlin.wiwiss.r2r._
import java.util.List
import java.util.ArrayList

class RegExToListFunctionFactory extends FunctionFactory {
	private val function = new RegExToListFunction()
	def getInstance(): Function = {
	  function
	}
 
	private class RegExToListFunction() extends Function {
	  def getURI(): String = {
	     "regexToList"
	  }

	  def execute(arguments: List[List[String]], hint: String): List[String] = {
	    val regex = arguments.get(0).get(0)
	    val workString = arguments.get(1).get(0)
            val resultList: java.util.List[String] = new ArrayList[String]();
     
            val re = regex.r
            workString match {
              case re(contents @ _* ) => for(element <- contents.toList)
                                              resultList.add(element)
                                         resultList
              case _ => resultList 
            }
	  }
	}
}
