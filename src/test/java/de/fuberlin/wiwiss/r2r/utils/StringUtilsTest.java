package de.fuberlin.wiwiss.r2r.utils;

/**
 * Created by IntelliJ IDEA.
 * User: andreas
 * Date: 2/23/12
 * Time: 11:51 AM
 * To change this template use File | Settings | File Templates.
 */

import de.fuberlin.wiwiss.r2r.functions.Helper;
import org.junit.Before;
import org.junit.Test;
import de.fuberlin.wiwiss.r2r.utils.StringUtils;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class StringUtilsTest {
    @Test
	public void unescapeEmptyString() {
        assertEquals(StringUtils.unescapeString(""), "");
	}

    @Test
	public void unescapeNonEscapedString() {
        assertEquals(StringUtils.unescapeString("abcsdhfi238zr2hfsd-.,!§$%&/()="), "abcsdhfi238zr2hfsd-.,!§$%&/()=");
	}

    @Test
	public void unescapeNewline() {
        assertEquals(StringUtils.unescapeString("\\n"), "\n");
	}

    @Test
	public void unescapeBackslash() {
        assertEquals(StringUtils.unescapeString("\\\\"), "\\");
	}

    @Test
	public void unescapeTab() {
        assertEquals(StringUtils.unescapeString("\\t"), "\t");
	}

    @Test
	public void unescapeB() {
        assertEquals(StringUtils.unescapeString("\\b"), "\b");
	}

    @Test
	public void unescapeR() {
        assertEquals(StringUtils.unescapeString("\\r"), "\r");
	}

    @Test
	public void unescapeF() {
        assertEquals(StringUtils.unescapeString("\\f"), "\f");
	}

    @Test
	public void unescapeApos() {
        assertEquals(StringUtils.unescapeString("\\'"), "'");
	}

    @Test
	public void unescapeQuote() {
        assertEquals(StringUtils.unescapeString("\\\""), "\"");
	}

    @Test(expected=java.util.NoSuchElementException.class)
	public void unescapeException() {
        assertEquals(StringUtils.unescapeString("\\u"), "");
	}
}
