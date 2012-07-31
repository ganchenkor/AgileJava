package sis.studentinfo;

import java.util.*;

/**
 * Provides a representation of a single-semester
 * session of a specific university course
 * @author Roman Ganchenko
 */
public class CourseSession {
    private String department;
    private String number;
    private ArrayList<Student> students = new ArrayList<Student>();
    private Date startDate;
    private int numberOfCredits;

    private static int count;

    /**
     * Constructs a CourseSession starting on a specific date
     * @param department department name
     * @param number course number
     * @param startDate the date on which the CourseSession begins
     */
    private CourseSession(String department, String number, Date startDate) {
        this.department = department;
        this.number = number;
        this.startDate = startDate;
    }

    public static CourseSession create(String department, String number, Date startDate){
        incrementCount();
        return new CourseSession(department, number, startDate);
    }

    public String getDepartment(){
        return department;
    }

    public String getNumber(){
        return number;
    }

    int getNumberOfStudents(){
        return students.size();
    }

    public void enroll(Student student){
        student.addCredits(numberOfCredits);
        students.add(student);
    }

    Student get(int index){
       return students.get(index);
    }

    Date getStartDate(){
        return  startDate;
    }

    public ArrayList<Student> getAllStudents() {
        return students;
    }

    static int getCount(){
        return CourseSession.count;
    }

    static void resetCount(){
        count = 0;
    }

    private static void incrementCount(){
        ++count;
    }

    void setNumberOfCredits(int numberOfCredits){
        this.numberOfCredits = numberOfCredits;
    }

    /**
     *
     * @return Date the last date of the course session
     */
    Date getEndDate(){
        GregorianCalendar calendar = new GregorianCalendar();
        calendar.setTime(startDate);
        int numberOfDays = 16 * 7 - 3 ;
        calendar.add(Calendar.DAY_OF_YEAR, numberOfDays);
        return calendar.getTime();
    }
}
