package garbage.scratch;

import junit.framework.TestCase;

import java.util.ArrayList;

/**
 * Created with IntelliJ IDEA.
 * User: Rom4G
 * Date: 5/28/12
 * Time: 4:13 PM
 * To change this template use File | Settings | File Templates.
 */
public class Scrtach extends TestCase {
    public void test1(){
        char capitalA = 'A';
        assertEquals(65, capitalA);
        assertEquals('\u0041', capitalA);
        assertEquals('\101', capitalA);
        assertEquals("abcd", "ab".concat("cd"));

    }

    public void testSortStringsInPlace() {
        ArrayList<String> list = new ArrayList<String>();
        list.add("Heller");
        list.add("Kafka");
        list.add("Camus");
        list.add("Boyle");
        java.util.Collections.sort(list);
        assertEquals("Boyle", list.get(0));
        assertEquals("Camus", list.get(1));
        assertEquals("Heller", list.get(2));
        assertEquals("Kafka", list.get(3));
    }

    public void testSortStringsInNewList() {
        ArrayList<String> list = new ArrayList<String>();
        list.add("Heller");
        list.add("Kafka");
        list.add("Camus");
        list.add("Boyle");
        ArrayList<String> sortedList = new ArrayList<String>(list);
        java.util.Collections.sort(sortedList);
        assertEquals("Boyle", sortedList.get(0));
        assertEquals("Camus", sortedList.get(1));
        assertEquals("Heller", sortedList.get(2));
        assertEquals("Kafka", sortedList.get(3));
    }

}
