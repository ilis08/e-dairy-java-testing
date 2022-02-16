package uni.fmi.grades.service;

import java.util.Collections;
import java.util.HashSet;
import java.util.List;

import uni.fmi.models.Grade;
import uni.fmi.models.Parent;
import uni.fmi.models.Student;
import uni.fmi.models.Subject;
import uni.fmi.models.User;

public class GradesService {
	private static HashSet<Parent> parents = new HashSet<Parent>();
	private static HashSet<Grade> grades = new HashSet<Grade>();
	private static Student student = new Student(1901321105 ,"Iliya", "Nankov", "1234Pet", "iliya@gmail.com");
	private static Parent parent = new Parent("Irina", "Nankova", "1245", "irina@gmail.com");
	private static Subject subj = new Subject("Java");
	private static Grade grade = new Grade(student, subj);
	
	public static String search(int id, String subject, Parent parent) {
		parents.add(parent);
		grades.add(grade);
		student.setParents(parents);
		student.setGrades(grades);
		
		if(student.getId() != id) {
			return "Student doesn't exist";
		}
		
		if(!student.getParents().contains(parent)) {
			return "You haven't permission to get this user grade";
		}
		
		if(subj.getName() != subject) {
			return "Subject doesn't exist";
		}
		
		if(student.getGrades().stream().anyMatch(x -> x.getSubject() == subj && x.getGradeValue() < 0)) {
			return "The student does not have a grade in this subject";
		}

		return "Succesfully gets grade";
	}
}
