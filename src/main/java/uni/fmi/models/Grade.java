package uni.fmi.models;
import java.util.*;

/**
 * 
 */
public class Grade {

    /**
     * Default constructor
     */
    public Grade(Student student, Subject subject) {
    	this.student = student;
    }

    private int gradeValue;
    private Subject subject;
    private Student student;
    private Exam exam;

    /**
     * @return
     */
    public int getGradeValue() {
        // TODO implement here
        return gradeValue;
    }

    /**
     * @param value 
     * @return
     */
    public void setGradeValue(int value) {
        // TODO implement here
        gradeValue = value;
    }

    /**
     * @return
     */
    public Student getStudent() {
        // TODO implement here
        return student;
    }

    /**
     * @param student 
     * @return
     */
    public void setStudent(Student student) {
        // TODO implement here
        this.student = student;
    }
    
    /**
     * @return
     */
    public Exam getExam() {
        // TODO implement here
        return exam;
    }

    /**
     * @param student 
     * @return
     */
    public void setExam(Exam exam) {
        // TODO implement here
        this.exam = exam;
    }
    
    /**
     * @return
     */
    public Subject getSubject() {
        // TODO implement here
        return subject;
    }

    /**
     * @param student 
     * @return
     */
    public void setSubject(Subject subject) {
        // TODO implement here
        this.subject = subject;
    }


}