package uni.fmi.grades.model;

import uni.fmi.grades.service.GradesService;
import uni.fmi.login.service.LoginService;
import uni.fmi.models.Parent;

public class GradesScreenModel {

	
	private int studentId;
	private String subject;
	private String message;
	private Parent parent;

	public int getId() {
		return studentId;
	}

	public void setId(int id) {
		studentId = id;
	}
	
	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}
	
	public void clickSearchButton() {
		setMessage(GradesService.search(studentId, subject, parent));
	}
	

	public Parent getParent() {
		return parent;
	}

	public void setParent(Parent parent) {
		this.parent = parent;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	

}
