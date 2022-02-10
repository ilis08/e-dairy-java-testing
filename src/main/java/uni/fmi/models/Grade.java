package uni.fmi.models;
import java.util.*;

/**
 * 
 */
public class Grade {

    /**
     * Default constructor
     */
    public Grade() {
    }

    private int gradeValue;
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

}