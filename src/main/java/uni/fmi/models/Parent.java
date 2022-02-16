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
    private Set<Student> students;

    /**
     * @return
     */
    public Set<Student> getStudents() {
        // TODO implement here
        return students;
    }

    public void setStudents(Set<Student> students) {
        this.students = students;
    }

    public void addStudent(Student student){
        if (students == null){
            students = new HashSet<Student>();
        }
        students.add(student);
    }

    /**
     * 
     */
    public Set<Grade> getStudentsGrade(Student student) {
        // TODO implement here'
    	return null;
    }

}