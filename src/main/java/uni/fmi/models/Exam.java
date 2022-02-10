package uni.fmi.models;
import java.util.*;

/**
 * 
 */
public class Exam {

    /**
     * Default constructor
     */
    public Exam() {
    }

    private String name;
    private String examDate;


    private Set<Grade> grades;
    private Subject subject;

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
	public String getExamDate() {
		return examDate;
	}

	/**
	 * @param date
	 * @return
	 */
	public void setExamDate(String date) {
		this.examDate = date;
	}

    /**
     * @return
     */
    public Set<Grade> getGrades() {
        // TODO implement here
        return grades;
    }

    /**
     * @param grades 
     * @return
     */
    public void setGrades(Set<Grade> grades) {
        // TODO implement here
        this.grades = grades;
    }

    /**
     * @return
     */
    public Subject getSubject() {
        // TODO implement here
        return subject;
    }

    /**
     * @param subj 
     * @return
     */
    public void setSubject(Subject subj) {
        // TODO implement here
        this.subject = subj;
    }

}