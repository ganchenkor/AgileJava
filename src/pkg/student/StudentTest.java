package pkg.student;

import junit.framework.TestCase;

/**
 * Created with IntelliJ IDEA.
 * User: Rom4G
 * Date: 5/16/12
 * Time: 6:59 PM
 * To change this template use File | Settings | File Templates.
 */
public class StudentTest extends TestCase {
    public void testCreate() {
        final String firstStudentName = "Jane Doe";
        Student firstStudent = new Student(firstStudentName);
        assertEquals(firstStudentName, firstStudent.getName());

        final String secondStudentName = "Joe Blow";
        Student secondStudent = new Student(secondStudentName);
        assertEquals(secondStudentName, secondStudent.getName());

        assertEquals(firstStudentName, firstStudent.getName());
    }
}
