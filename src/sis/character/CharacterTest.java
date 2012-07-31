package sis.character;
import junit.framework.TestCase;
import junit.framework.TestSuite;
/**
 * Created with IntelliJ IDEA.
 * User: Rom4G
 * Date: 6/22/12
 * Time: 10:40 PM
 * To change this template use File | Settings | File Templates.
 */
public class CharacterTest extends TestCase {
    public void testWhitespace() {
        assertTrue(Character.isWhitespace('\n'));
        assertTrue(Character.isWhitespace('\t'));
        assertTrue(Character.isWhitespace(' '));
        assertTrue(Character.isWhitespace('\f'));

        assertFalse(Character.isWhitespace('A'));

        }
    public void testIdentifierCharacters(){
        assertEquals(true, Character.isJavaIdentifierStart('a'));
        assertEquals(false, Character.isJavaIdentifierStart('^'));
        assertEquals(false, Character.isJavaIdentifierStart('1'));

        assertEquals(true, Character.isJavaIdentifierPart('a'));
        assertEquals(false, Character.isJavaIdentifierPart('^'));
        assertEquals(true, Character.isJavaIdentifierPart('1'));

    }

}
