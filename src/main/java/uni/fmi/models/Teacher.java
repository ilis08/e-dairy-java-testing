package uni.fmi.models;
import java.util.*;

/**
 * 
 */
public class Teacher extends User {

    /**
     * Default constructor
     */
	public Teacher(String fname, String lname, String pass, String mail){
   	 super(fname, lname, pass, mail);
   }

    private Class course;
    private Set<Subject> subjects;

    /**
     * @return
     */
    public Set<Subject> getSubjects() {
        // TODO implement here
        return subjects;
    }

    /**
     * @param subjects 
     * @return
     */
    public void setSubjects(Set<Subject> subjects) {
        // TODO implement here
        this.subjects = subjects;
    }

    /**
     * @return
     */
    public Class getCourse() {
        // TODO implement here
        return course;
    }

    /**
     * @param class 
     * @return
     */
    public void setClass(Class course) {
        // TODO implement here
    	this.course = course;
    }

}