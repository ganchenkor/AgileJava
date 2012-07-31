package sis;

import junit.framework.TestSuite;

/**
 * Created with IntelliJ IDEA.
 * User: Rom4G
 * Date: 5/28/12
 * Time: 8:41 PM
 * To change this template use File | Settings | File Templates.
 */
public class AllTests extends TestSuite {
    public static TestSuite suite() {
        TestSuite suite = new TestSuite();
        suite.addTest(sis.report.AllTests.suite());
        suite.addTest(sis.studentinfo.AllTests.suite());
        return suite;
    }
}
