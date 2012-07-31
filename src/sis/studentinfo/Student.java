package sis.studentinfo;

/**
 * Created with IntelliJ IDEA.
 * User: Rom4G
 * Date: 5/16/12
 * Time: 6:59 PM
 * To change this template use File | Settings | File Templates.
 */
public class Student {
    private String name;
    private int credits;
    private String state = "";
    static final String IN_STATE = "CA";
    static final int CREDITS_REQUIRED_FOR_FULL_TIME = 12;
    public Student(final String name) {
        this.name = name;
        credits = 0;
    }
    public String getName()	{
        return name;
    }

    public boolean isFullTime() {
        return credits >= CREDITS_REQUIRED_FOR_FULL_TIME;
    }

    public int getCredits(){
        return credits;
    }

    void addCredits(int credits){
        this.credits += credits;
    }
    void setState(String state){
        this.state = state.toUpperCase();
    }

    boolean isInState() {
        return state.equals(Student.IN_STATE);
    }

}
