package uni.fmi.models;
import java.util.*;

/**
 * 
 */
public class Parent extends User {

    /**
     * Default constructor
     */
	public Parent(String fname, String lname, String pass, String mail){
   	 super(fname, lname, pass, mail);
   }

    /**
     * 
     */
    private Set<Student> student;

    /**
     * @return
     */
    public Set<Student> getStudents() {
        // TODO implement here
        return student;
    }

    /**
     * 
     */
    public Set<Grade> getStudentsGrade(Student student) {
        // TODO implement here'
    	return null;
    }

}