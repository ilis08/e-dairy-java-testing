package uni.fmi.models;
import java.util.*;

/**
 * 
 */
public class Student extends User {

    /**
     * Default constructor
     */
    public Student(int id,final String fname,final String lname,final String pass,final String mail){
    	 super(fname, lname, pass, mail);
    	 this.id = id;
    }


	private int id;
    private Set<Parent> parents;
    private Set<Grade> grades;
    private Class course;


    /**
     * @return
     */
    public int getId() {
        // TODO implement here
        return id;
    }

    /**
     * @param id 
     * @return
     */
    public void setId(int id) {
        // TODO implement here
        this.id = id;
    }

    /**
     * @return
     */
    public Set<Grade> getGrades() {
        // TODO implement here
        return grades;
    }

    /**
     * @param grade 
     * @return
     */
    public void setGrades(Set<Grade> grade) {
        // TODO implement here
        grades = grade;
    }

    /**
     * @return
     */
    public Set<Parent> getParents() {
        // TODO implement here
        return parents;
    }

    /**
     * @param parents 
     * @return
     */
    public void setParents(Set<Parent> parents) {
        // TODO implement here
        this.parents = parents;
    }
    
    public Class getCourse() {
        // TODO implement here
        return course;
    }

    /**
     * @param parents 
     * @return
     */
    public void setClass(Class course) {
        // TODO implement here
        this.course = course;
    }

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (id != other.id)
			return false;
		return true;
	}
    
    

}