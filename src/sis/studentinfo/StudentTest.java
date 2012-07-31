package sis.studentinfo;

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

    public void testFullTime() {
        Student student = new Student("a");
        assertEquals(false, student.isFullTime());
    }

    public void testStudentStatus(){
        Student student = new Student("a");
        assertEquals(0, student.getCredits());
        assertEquals(false, student.isFullTime());
        student.addCredits(3);
        assertEquals(3, student.getCredits());
        assertEquals(false, student.isFullTime());
        student.addCredits(4);
        assertEquals(7, student.getCredits());
        assertEquals(false, student.isFullTime());
        student.addCredits(5);
        assertEquals(Student.CREDITS_REQUIRED_FOR_FULL_TIME, student.getCredits());
        assertEquals(true, student.isFullTime());
    }

    public void testInState() {
        Student student = new Student("a");
        assertEquals(false, student.isInState());
        student.setState(Student.IN_STATE);
        assertEquals(true, student.isInState());
        student.setState("MD");
        assertEquals(false, student.isInState());

        student.setState("cA");
        assertEquals(true, student.isInState());
    }
}
