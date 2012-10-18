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

import static org.junit.Assert.*;

import java.util.List;

import org.junit.BeforeClass;
import org.junit.Test;

import scala.actors.threadpool.Arrays;

import de.fuberlin.wiwiss.r2r.Function;
import de.fuberlin.wiwiss.r2r.functions.Helper;

public class XPathFunctionFactoryTest {

	private static XPathFunctionFactory factory;

	@BeforeClass
	public static void setupBeforeClass() {
		factory = new XPathFunctionFactory();
	}

	@Test
	public void testCodepointsToStringFunction() {
		Function function = factory.getInstance("xpath:codepoints-to-string");
		List<List<String>> argumentList = Helper.getArgumentLists("84", "104",
				"233", "114", "232", "115", "101");
		List<String> results = function.execute(argumentList, null);
		assertEquals("Thérèse", results.get(0));
	}

	@Test
	public void testStringToCodepointsFunction() {
		Function function = factory.getInstance("xpath:string-to-codepoints");
		List<List<String>> argumentList = Helper.getArgumentLists("Thérèse");
		List<String> results = function.execute(argumentList, null);
		String[] expected = { "84", "104", "233", "114", "232", "115", "101" };
		assertEquivalent(expected, results);
	}

	@Test
	public void testCompareFunction() {
		Function function = factory.getInstance("xpath:compare");
		List<List<String>> argumentList = Helper.getArgumentLists("abc", "abc");
		List<String> results = function.execute(argumentList, null);
		String[] expected = { "0" };
		assertEquivalent(expected, results);

		argumentList = Helper.getArgumentLists("abc", "bbc");
		results = function.execute(argumentList, null);
		expected[0] = "-1";
		assertEquivalent(expected, results);

		argumentList = Helper.getArgumentLists("bbc", "abc");
		results = function.execute(argumentList, null);
		expected[0] = "1";
		assertEquivalent(expected, results);
	}

	@Test
	public void testCodepointEqualFunction() {
		Function function = factory.getInstance("xpath:codepoint-equal");
		List<List<String>> argumentList = Helper.getArgumentLists("abc", "abc");
		List<String> results = function.execute(argumentList, null);
		String[] expected = { "true" };
		assertEquivalent(expected, results);

		argumentList = Helper.getArgumentLists("abc", "bbc");
		results = function.execute(argumentList, null);
		expected[0] = "false";
		assertEquivalent(expected, results);
	}

	@Test
	public void testConcatFunction() {
		Function function = factory.getInstance("xpath:concat");
		List<List<String>> argumentList = Helper.getArgumentLists("un",
				"grateful");
		List<String> results = function.execute(argumentList, null);
		String[] expected = { "ungrateful" };
		assertEquivalent(expected, results);

		argumentList = Helper.getArgumentLists("Thy ", null, "old ", "groans",
				"", " ring", " yet", " in", " my", " ancient", " ears.");
		results = function.execute(argumentList, null);
		expected[0] = "Thy old groans ring yet in my ancient ears.";
		assertEquivalent(expected, results);

		argumentList = Helper.getArgumentLists("Ciao!", null);
		results = function.execute(argumentList, null);
		expected[0] = "Ciao!";
		assertEquivalent(expected, results);

		argumentList = Helper.getArgumentLists("Ingratitude, ", "thou ",
				"marble-hearted", " fiend!");
		results = function.execute(argumentList, null);
		expected[0] = "Ingratitude, thou marble-hearted fiend!";
		assertEquivalent(expected, results);
	}

	@Test
	public void testStringJoinFunction() {
		Function function = factory.getInstance("xpath:string-join");
		List<List<String>> argumentList = Helper.getArgumentLists("", " ");
		String[] list = { "Now", "is", "the", "time", "..." };
		argumentList.set(0, Arrays.asList(list));
		List<String> results = function.execute(argumentList, null);
		String[] expected = { "Now is the time ..." };
		assertEquivalent(expected, results);

		argumentList = Helper.getArgumentLists("", "");
		String[] list2 = { "Blow, ", "blow, ", "thou ", "winter ", "wind!" };
		argumentList.set(0, Arrays.asList(list2));
		results = function.execute(argumentList, null);
		expected[0] = "Blow, blow, thou winter wind!";
		assertEquivalent(expected, results);

		argumentList = Helper.getArgumentLists(null, "torte");
		results = function.execute(argumentList, null);
		expected[0] = "";
		assertEquivalent(expected, results);
	}

	@Test
	public void testSubStringFunction() {
		Function function = factory.getInstance("xpath:substring");
		List<List<String>> argumentList = Helper.getArgumentLists("motor car",
				"6");
		List<String> results = function.execute(argumentList, null);
		String[] expected = { " car" };
		assertEquivalent(expected, results);

		argumentList = Helper.getArgumentLists("metadata", "4", "3");
		results = function.execute(argumentList, null);
		expected[0] = "ada";
		assertEquivalent(expected, results);

		argumentList = Helper.getArgumentLists("12345", "1.5", "2.6");
		results = function.execute(argumentList, null);
		expected[0] = "234";
		assertEquivalent(expected, results);

		argumentList = Helper.getArgumentLists("12345", "0", "3");
		results = function.execute(argumentList, null);
		expected[0] = "12";
		assertEquivalent(expected, results);

		argumentList = Helper.getArgumentLists("12345", "5", "-3");
		results = function.execute(argumentList, null);
		expected[0] = "";
		assertEquivalent(expected, results);

		argumentList = Helper.getArgumentLists("12345", "-3", "5");
		results = function.execute(argumentList, null);
		expected[0] = "1";
		assertEquivalent(expected, results);

		argumentList = Helper.getArgumentLists(null, "1", "3");
		results = function.execute(argumentList, null);
		expected[0] = "";
		assertEquivalent(expected, results);
	}

	@Test
	public void testStringLengthFunction() {
		Function function = factory.getInstance("xpath:string-length");
		List<List<String>> argumentList = Helper
				.getArgumentLists("Harp not on that string, madam; that is past.");
		List<String> results = function.execute(argumentList, null);
		String[] expected = { "45" };
		assertEquivalent(expected, results);

		argumentList = Helper.getArgumentLists((String) null);
		results = function.execute(argumentList, null);
		expected[0] = "0";
		assertEquivalent(expected, results);
	}

	@Test
	public void testNormalizeSpaceFunction() {
		Function function = factory.getInstance("xpath:normalize-space");
		List<List<String>> argumentList = Helper
				.getArgumentLists(" The  wealthy curled darlings of   our  nation. ");
		List<String> results = function.execute(argumentList, null);
		String[] expected = { "The wealthy curled darlings of our nation." };
		assertEquivalent(expected, results);

		argumentList = Helper.getArgumentLists((String) null);
		results = function.execute(argumentList, null);
		expected[0] = "";
		assertEquivalent(expected, results);
	}

	@Test
	public void testNormalizeUnicodeFunction() {
		Function function = factory.getInstance("xpath:normalize-unicode");
		List<List<String>> argumentList = Helper.getArgumentLists("￡", "NFKC");
		List<String> results = function.execute(argumentList, null);
		String[] expected = { "£" };
		assertEquivalent(expected, results);

		argumentList = Helper.getArgumentLists("15 ㎗");
		results = function.execute(argumentList, null);
		expected[0] = "15 ㎗";
		assertEquivalent(expected, results);

		argumentList = Helper.getArgumentLists("15 ㎗", "NFKC");
		results = function.execute(argumentList, null);
		expected[0] = "15 dl";
		assertEquivalent(expected, results);
	}

	@Test
	public void testUpperCaseFunction() {
		Function function = factory.getInstance("xpath:upper-case");
		List<List<String>> argumentList = Helper.getArgumentLists("abCd0");
		List<String> results = function.execute(argumentList, null);
		String[] expected = { "ABCD0" };
		assertEquivalent(expected, results);
	}

	@Test
	public void testLowerCaseFunction() {
		Function function = factory.getInstance("xpath:lower-case");
		List<List<String>> argumentList = Helper.getArgumentLists("abCd0");
		List<String> results = function.execute(argumentList, null);
		String[] expected = { "abcd0" };
		assertEquivalent(expected, results);
	}

	@Test
	public void testTranslateFunction() {
		Function function = factory.getInstance("xpath:translate");
		List<List<String>> argumentList = Helper.getArgumentLists("bar", "abc",
				"ABC");
		List<String> results = function.execute(argumentList, null);
		String[] expected = { "BAr" };
		assertEquivalent(expected, results);

		argumentList = Helper.getArgumentLists("--aaa--", "abc-", "ABC");
		results = function.execute(argumentList, null);
		expected[0] = "AAA";
		assertEquivalent(expected, results);

		argumentList = Helper.getArgumentLists("abcdabc", "abc", "AB");
		results = function.execute(argumentList, null);
		expected[0] = "ABdAB";
		assertEquivalent(expected, results);
	}

	@Test
	public void testEncodeForUriFunction() {
		Function function = factory.getInstance("xpath:encode-for-uri");
		List<List<String>> argumentList = Helper
				.getArgumentLists("http://www.example.com/00/Weather/CA/Los%20Angeles#ocean");
		List<String> results = function.execute(argumentList, null);
		String[] expected = { "http%3A%2F%2Fwww.example.com%2F00%2FWeather%2FCA%2FLos%2520Angeles%23ocean" };
		assertEquivalent(expected, results);

		argumentList = Helper.getArgumentLists("~bébé");
		results = function.execute(argumentList, null);
		// not according to the XPath example, the tilde sign is also encoded
		expected[0] = "%7Eb%C3%A9b%C3%A9";
		assertEquivalent(expected, results);

		argumentList = Helper.getArgumentLists("100% organic");
		results = function.execute(argumentList, null);
		expected[0] = "100%25%20organic";
		assertEquivalent(expected, results);
	}

	@Test
	public void testIriToUriFunction() {
		Function function = factory.getInstance("xpath:iri-to-uri");
		List<List<String>> argumentList = Helper
				.getArgumentLists("http://www.example.com/00/Weather/CA/Los%20Angeles#ocean");
		List<String> results = function.execute(argumentList, null);
		String[] expected = { "http://www.example.com/00/Weather/CA/Los%20Angeles#ocean" };
		assertEquivalent(expected, results);

		argumentList = Helper.getArgumentLists("http://www.example.com/~bébé");
		results = function.execute(argumentList, null);
		expected[0] = "http://www.example.com/~b%C3%A9b%C3%A9";
		assertEquivalent(expected, results);
	}

	// @Test
	// FIXME the function is not working as expected
	public void testEscapeHtmlUriFunction() {
		Function function = factory.getInstance("xpath:escape-html-uri");
		List<List<String>> argumentList = Helper
				.getArgumentLists("http://www.example.com/00/Weather/CA/Los Angeles#ocean");
		List<String> results = function.execute(argumentList, null);
		String[] expected = { "http://www.example.com/00/Weather/CA/Los Angeles#ocean" };
		assertEquivalent(expected, results);

		argumentList = Helper
				.getArgumentLists("javascript:if (navigator.browserLanguage == 'fr') window.open('http://www.example.com/~bébé');");
		results = function.execute(argumentList, null);
		expected[0] = "javascript:if (navigator.browserLanguage == 'fr') window.open('http://www.example.com/~b%C3%A9b%C3%A9');";
		assertEquivalent(expected, results);
	}

	@Test
	public void testContainsFunction() {
		Function function = factory.getInstance("xpath:contains");
		List<List<String>> argumentList = Helper
				.getArgumentLists("tattoo", "t");
		List<String> results = function.execute(argumentList, null);
		String[] expected = { "true" };
		assertEquivalent(expected, results);

		argumentList = Helper.getArgumentLists("tattoo", "ttt");
		results = function.execute(argumentList, null);
		expected[0] = "false";
		assertEquivalent(expected, results);

		argumentList = Helper.getArgumentLists("", null);
		results = function.execute(argumentList, null);
		expected[0] = "true";
		assertEquivalent(expected, results);

		argumentList = Helper.getArgumentLists(null, "");
		results = function.execute(argumentList, null);
		expected[0] = "false";
		assertEquivalent(expected, results);
	}

	@Test
	public void testStartsWithFunction() {
		Function function = factory.getInstance("xpath:starts-with");
		List<List<String>> argumentList = Helper.getArgumentLists("tattoo",
				"tat");
		List<String> results = function.execute(argumentList, null);
		String[] expected = { "true" };
		assertEquivalent(expected, results);

		argumentList = Helper.getArgumentLists("tattoo", "att");
		results = function.execute(argumentList, null);
		expected[0] = "false";
		assertEquivalent(expected, results);

		argumentList = Helper.getArgumentLists(null, null);
		results = function.execute(argumentList, null);
		expected[0] = "true";
		assertEquivalent(expected, results);

		argumentList = Helper.getArgumentLists(null, "tat");
		results = function.execute(argumentList, null);
		expected[0] = "false";
		assertEquivalent(expected, results);
	}

	@Test
	public void testEndsWithFunction() {
		Function function = factory.getInstance("xpath:ends-with");
		List<List<String>> argumentList = Helper.getArgumentLists("tattoo",
				"too");
		List<String> results = function.execute(argumentList, null);
		String[] expected = { "true" };
		assertEquivalent(expected, results);

		argumentList = Helper.getArgumentLists("tattoo", "tto");
		results = function.execute(argumentList, null);
		expected[0] = "false";
		assertEquivalent(expected, results);

		argumentList = Helper.getArgumentLists(null, null);
		results = function.execute(argumentList, null);
		expected[0] = "true";
		assertEquivalent(expected, results);

		argumentList = Helper.getArgumentLists(null, "too");
		results = function.execute(argumentList, null);
		expected[0] = "false";
		assertEquivalent(expected, results);
	}

	@Test
	public void testSubstringBeforeFunction() {
		Function function = factory.getInstance("xpath:substring-before");
		List<List<String>> argumentList = Helper.getArgumentLists("tattoo",
				"attoo");
		List<String> results = function.execute(argumentList, null);
		String[] expected = { "t" };
		assertEquivalent(expected, results);

		argumentList = Helper.getArgumentLists("tattoo", "tatto");
		results = function.execute(argumentList, null);
		expected[0] = "";
		assertEquivalent(expected, results);

		argumentList = Helper.getArgumentLists(null, null);
		results = function.execute(argumentList, null);
		expected[0] = "";
		assertEquivalent(expected, results);

		argumentList = Helper.getArgumentLists(null, "too");
		results = function.execute(argumentList, null);
		expected[0] = "";
		assertEquivalent(expected, results);
	}

	@Test
	public void testSubstringAfterFunction() {
		Function function = factory.getInstance("xpath:substring-after");
		List<List<String>> argumentList = Helper.getArgumentLists("tattoo",
				"tatto");
		List<String> results = function.execute(argumentList, null);
		String[] expected = { "o" };
		assertEquivalent(expected, results);

		argumentList = Helper.getArgumentLists("tattoo", "attoo");
		results = function.execute(argumentList, null);
		expected[0] = "";
		assertEquivalent(expected, results);

		argumentList = Helper.getArgumentLists(null, null);
		results = function.execute(argumentList, null);
		expected[0] = "";
		assertEquivalent(expected, results);

		argumentList = Helper.getArgumentLists(null, "too");
		results = function.execute(argumentList, null);
		expected[0] = "";
		assertEquivalent(expected, results);
	}

	@Test
	public void testMatchesFunction() {
		Function function = factory.getInstance("xpath:matches");
		List<List<String>> argumentList = Helper.getArgumentLists(
				"abracadabra", "bra");
		List<String> results = function.execute(argumentList, null);
		String[] expected = { "true" };
		assertEquivalent(expected, results);

		argumentList = Helper.getArgumentLists("abracadabra", "^a.*a$");
		results = function.execute(argumentList, null);
		expected[0] = "true";
		assertEquivalent(expected, results);

		argumentList = Helper.getArgumentLists("abracadabra", "^bra");
		results = function.execute(argumentList, null);
		expected[0] = "false";
		assertEquivalent(expected, results);
	}

	@Test
	public void testReplaceFunction() {
		Function function = factory.getInstance("xpath:replace");
		List<List<String>> argumentList = Helper.getArgumentLists(
				"abracadabra", "a.*a", "*");
		List<String> results = function.execute(argumentList, null);
		String[] expected = { "*" };
		assertEquivalent(expected, results);

		argumentList = Helper.getArgumentLists("abracadabra", "a.*?a", "*");
		results = function.execute(argumentList, null);
		expected[0] = "*c*bra";
		assertEquivalent(expected, results);

		argumentList = Helper.getArgumentLists("abracadabra", "a(.)", "a$1$1");
		results = function.execute(argumentList, null);
		expected[0] = "abbraccaddabbra";
		assertEquivalent(expected, results);

		argumentList = Helper.getArgumentLists("abracadabra", ".*?", "$1");
		try {
			results = function.execute(argumentList, null);
			fail("Should have raised an IndexOutOfBoundsException");
		} catch (IndexOutOfBoundsException e) {
		}

		argumentList = Helper.getArgumentLists("AAAA", "A+", "b");
		results = function.execute(argumentList, null);
		expected[0] = "b";
		assertEquivalent(expected, results);

		argumentList = Helper.getArgumentLists("AAAA", "A+?", "b");
		results = function.execute(argumentList, null);
		expected[0] = "bbbb";
		assertEquivalent(expected, results);

		argumentList = Helper.getArgumentLists("darted", "^(.*?)d(.*)$",
				"$1c$2");
		results = function.execute(argumentList, null);
		expected[0] = "carted";
		assertEquivalent(expected, results);
	}

	@Test
	public void testTokenizeFunction() {
		Function function = factory.getInstance("xpath:tokenize");
		List<List<String>> argumentList = Helper.getArgumentLists(
				"The cat sat on the mat", "\\s+");
		List<String> results = function.execute(argumentList, null);
		String[] expected = { "The", "cat", "sat", "on", "the", "mat" };
		assertEquivalent(expected, results);

		argumentList = Helper.getArgumentLists("4, 8, 15, 16, 23, 42", ",\\s*");
		results = function.execute(argumentList, null);
		String[] expected1 = {"4", "8", "15", "16", "23", "42"};
		assertEquivalent(expected1, results);

		argumentList = Helper.getArgumentLists("4,8,,15,16,23,42,", ",");
		results = function.execute(argumentList, null);
		String[] expected2 = {"4", "8", "", "15", "16", "23", "42", ""};
		assertEquivalent(expected2, results);

		// the Java split method does not throw an Exception here!
//		argumentList = Helper.getArgumentLists("abba", ".?");
//		try {
//			results = function.execute(argumentList, null);
//			System.out.println(results);
//			fail("Should have raised an IndexOutOfBoundsException");
//		} catch (IndexOutOfBoundsException e) {
//		}

		argumentList = Helper.getArgumentLists("Some unparsed <br> HTML <br> text", "\\s*<br>\\s*");
		results = function.execute(argumentList, null);
		String[] expected3 = {"Some unparsed", "HTML", "text"};
		assertEquivalent(expected3, results);
	}
	
	@Test
	public void testAbsFunction() {
		Function function = factory.getInstance("xpath:abs");
		List<List<String>> argumentList = Helper.getArgumentLists("10.5");
		List<String> results = function.execute(argumentList, null);
		String[] expected = { "10.5" };
		assertEquivalent(expected, results);

		argumentList = Helper.getArgumentLists("-10.5");
		results = function.execute(argumentList, null);
		expected[0] = "10.5";
		assertEquivalent(expected, results);
	}

	@Test
	public void testCeilingFunction() {
		Function function = factory.getInstance("xpath:ceiling");
		List<List<String>> argumentList = Helper.getArgumentLists("10.5");
		List<String> results = function.execute(argumentList, null);
		String[] expected = { "11.0" };
		assertEquivalent(expected, results);

		argumentList = Helper.getArgumentLists("-10.5");
		results = function.execute(argumentList, null);
		expected[0] = "-10.0";
		assertEquivalent(expected, results);
	}

	@Test
	public void testFloorFunction() {
		Function function = factory.getInstance("xpath:floor");
		List<List<String>> argumentList = Helper.getArgumentLists("10.5");
		List<String> results = function.execute(argumentList, null);
		String[] expected = { "10.0" };
		assertEquivalent(expected, results);

		argumentList = Helper.getArgumentLists("-10.5");
		results = function.execute(argumentList, null);
		expected[0] = "-11.0";
		assertEquivalent(expected, results);
	}

	@Test
	public void testRoundFunction() {
		Function function = factory.getInstance("xpath:round");
		List<List<String>> argumentList = Helper.getArgumentLists("2.5");
		List<String> results = function.execute(argumentList, null);
		String[] expected = { "3" };
		assertEquivalent(expected, results);

		argumentList = Helper.getArgumentLists("2.4999");
		results = function.execute(argumentList, null);
		expected[0] = "2";
		assertEquivalent(expected, results);
		
		argumentList = Helper.getArgumentLists("-2.5");
		results = function.execute(argumentList, null);
		expected[0] = "-2";
		assertEquivalent(expected, results);
	}

	@Test
	public void testRoundHalfToEvenFunction() {
		Function function = factory.getInstance("xpath:round-half-to-even");
		List<List<String>> argumentList = Helper.getArgumentLists("0.5");
		List<String> results = function.execute(argumentList, null);
		String[] expected = { "0.0" };
		assertEquivalent(expected, results);

		argumentList = Helper.getArgumentLists("1.5");
		results = function.execute(argumentList, null);
		expected[0] = "2.0";
		assertEquivalent(expected, results);
		
		argumentList = Helper.getArgumentLists("2.5");
		results = function.execute(argumentList, null);
		expected[0] = "2.0";
		assertEquivalent(expected, results);
		
		argumentList = Helper.getArgumentLists("3.567812E+3", "2");
		results = function.execute(argumentList, null);
		expected[0] = "3567.81";
		assertEquivalent(expected, results);
		
		argumentList = Helper.getArgumentLists("35612.25", "-2");
		results = function.execute(argumentList, null);
		expected[0] = "35600.0";
		assertEquivalent(expected, results);
		
		argumentList = Helper.getArgumentLists("4.7564E-3", "2");
		results = function.execute(argumentList, null);
		expected[0] = "0.0";
		assertEquivalent(expected, results);
	}

	
	private void assertEquivalent(String[] expected, List<String> results) {
		assertEquals(expected.length, results.size());
		for (int i = 0; i < expected.length; i++) {
			assertEquals(expected[i], results.get(i));
		}
	}
}
