package pkg.util;

import junit.framework.TestCase;

/**
 * Created with IntelliJ IDEA.
 * User: Rom4G
 * Date: 6/24/12
 * Time: 7:02 PM
 * To change this template use File | Settings | File Templates.
 */
public class StringUtilTest extends TestCase{
    public void testAppendLineEnd() {
        String input = "abc";
        assertEquals(input + StringUtil.NEWLINE, StringUtil.appendNewLine(input));
    }
}
