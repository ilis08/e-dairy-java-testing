package uni.fmi.models;
import java.util.*;

/**
 * 
 */
public class Subject {

    /**
     * Default constructor
     */
    public Subject(String name) {
    	this.name = name;
    }
  
    private String name;
    private Set<Class> classes;
    private Set<Exam> exams;
    private Set<Teacher> teachers;

    /**
     * @return
     */
    public String getName() {
        // TODO implement here
        return name;
    }

    /**
     * @param name 
     * @return
     */
    public void setName(String name) {
        // TODO implement here
       this.name = name;
    }

    /**
     * @return
     */
    public Set<Teacher> getTeachers() {
        // TODO implement here
        return teachers;
    }

    /**
     * @param teachers 
     * @return
     */
    public void setTeachers(Set<Teacher> teachers) {
        // TODO implement here
        this.teachers = teachers;
    }

    /**
     * @return
     */
    public Set<Exam> getExams() {
        // TODO implement here
        return exams;
    }

    /**
     * @param exams 
     * @return
     */
    public void setExams(Set<Exam> exams) {
        // TODO implement here
        this.exams = exams;
    }

    
    /**
     * @return
     */
    public Set<Class> getClasses() {
        // TODO implement here
        return classes;
    }

    /**
     * @param exams 
     * @return
     */
    public void setClasses(Set<Class> classes) {
        // TODO implement here
        this.classes = classes;
    }
}