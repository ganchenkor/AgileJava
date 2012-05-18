package pkg.courseSession;

import pkg.student.Student;
import java.util.*;

/**
 * Created with IntelliJ IDEA.
 * User: Rom4G
 * Date: 5/16/12
 * Time: 6:59 PM
 * To change this template use File | Settings | File Templates.
 */
public class CourseSession {
    private String department;
    private String number;
    private ArrayList<Student> students = new ArrayList<Student>();
    private Date startDate;

    public CourseSession(String department, String number, Date date) {
        this.department = department;
        this.number = number;
        this.startDate = date;
    }

    String getDepartment(){
        return department;
    }

    String getNumber(){
        return number;
    }

    int getNumberOfStudents(){
        return students.size();
    }

    public void enroll(Student student){
        students.add(student);
    }

    public Student get(int index){
       return students.get(index);
    }

    public Date getStartDate(){
        return  startDate;
    }

    public Date getEndDate(){
        GregorianCalendar calendar = new GregorianCalendar();
        calendar.setTime(startDate);
        int numberOfDays = 16 * 7 -3 ;
        calendar.add(Calendar.DAY_OF_YEAR, numberOfDays);
        return calendar.getTime();
    }
}
