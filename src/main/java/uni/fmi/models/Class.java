package uni.fmi.models;
import java.util.*;

/**
 * 
 */
public class Class {

    /**
     * Default constructor
     */
    public Class() {
    }

    private String name;
    private Set<Subject> subjects;
    private Set<Student> students;

    private Teacher teacher;

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
        this.name = name;
       
    }

    /**
     * @return
     */
    public Set<Subject> getSubjects() {
        // TODO implement here
        return subjects;
    }

    /**
     * @param subject 
     * @return
     */
    public void setSubjects(Set<Subject> subjects) {
        this.subjects = subjects;
        
    }

    /**
     * @return
     */
    public Teacher getTeacher() {
        // TODO implement here
        return teacher;
    }

    /**
     * @param teacher 
     * @return
     */
    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
        
    }
    
    /**
     * @return
     */
    public Set<Student> getStudents() {
        // TODO implement here
        return students;
    }

    /**
     * @param teacher 
     * @return
     */
    public void setStudents(Set<Student> students) {
        // TODO implement here
        this.students = students;
    }

}