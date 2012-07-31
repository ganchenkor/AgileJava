package garbage;

import junit.framework.TestCase;

/**
 * Created with IntelliJ IDEA.
 * User: Rom4G
 * Date: 6/24/12
 * Time: 5:33 PM
 * To change this template use File | Settings | File Templates.
 */
public class PrefixPostfixLesson extends TestCase{
    public void testPrefixPostFix(){
        int prefix = 5;
        assertEquals(12, ++prefix *2);
        assertEquals(6, prefix);

        int postfix = 5;
        assertEquals(10, postfix++ *2);
        assertEquals(6, postfix);
    }
}
