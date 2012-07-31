package sis.studentinfo;

import junit.framework.TestSuite;
import pkg.chess.BoardTest;
import pkg.chess.PawnTest;

/**
 * Created with IntelliJ IDEA.
 * User: Rom4G
 * Date: 5/16/12
 * Time: 7:25 PM
 * To change this template use File | Settings | File Templates.
 */
public class AllTests  {
    public static TestSuite suite() {
        TestSuite suite = new TestSuite();
        suite.addTestSuite(CourseSessionTest.class);
        suite.addTestSuite(StudentTest.class);
        suite.addTestSuite(PawnTest.class);
        suite.addTestSuite(BoardTest.class);
        suite.addTestSuite(DateUtilTest.class);
       return suite;
    }
}
