package uni.fmi.models;
import java.util.*;

/**
 * 
 */
public class Student extends User {

    /**
     * Default constructor
     */
    public Student() {
    }

    private int id;
    private Set<Parent> parents;
    private Set<Grade> grades;
    private Class clas;


    /**
     * @return
     */
    public int getId() {
        // TODO implement here
        return 0;
    }

    /**
     * @param id 
     * @return
     */
    public void setId(int id) {
        // TODO implement here
        
    }

    /**
     * @return
     */
    public Set<Grade> getGrades() {
        // TODO implement here
        return null;
    }

    /**
     * @param grade 
     * @return
     */
    public void setGrades(Set<Grade> grade) {
        // TODO implement here
        
    }

    /**
     * @return
     */
    public Set<Parent> getParents() {
        // TODO implement here
        return null;
    }

    /**
     * @param parents 
     * @return
     */
    public void setParents(Set<Parent> parents) {
        // TODO implement here
        
    }
    
    public Class getCourse() {
        // TODO implement here
        return null;
    }

    /**
     * @param parents 
     * @return
     */
    public void setClass(Class clas) {
        // TODO implement here
        
    }

}