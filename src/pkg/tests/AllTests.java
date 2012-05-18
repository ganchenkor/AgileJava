package pkg.tests;

import junit.framework.TestSuite;
import junit.framework.Test;
import pkg.courseSession.CourseSessionTest;
import pkg.student.StudentTest;


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
       return suite;
    }
}
