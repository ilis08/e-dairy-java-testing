package uni.fmi.grades.service;

import java.util.HashSet;
import java.util.Optional;

import uni.fmi.models.Grade;
import uni.fmi.models.Parent;
import uni.fmi.models.Student;
import uni.fmi.models.Subject;

public class GradesService {
	private static HashSet<Student> students = new HashSet<Student>();
	private static HashSet<Grade> grades = new HashSet<Grade>();
	private static HashSet<Subject> subjects = new HashSet<Subject>();
	private static Student student1 = new Student(1901321105 ,"Iliya", "Nankov", "1234Pet", "iliya@gmail.com");
	private static Student student2 = new Student(1901321104 ,"Ivan", "Ivanov", "Pethg3", "ivan@gmail.com");
	private static Parent parent = new Parent("Irina", "Nankova", "1245", "irina@gmail.com");
	private static Subject subj = new Subject("Java");
	private static Subject subj2 = new Subject("C#");
	private static Grade grade = new Grade(5,student1, subj);
	private static Grade grade2 = new Grade(0,student1, subj2);
	
	public static String search(int studentId, String subjectName, Parent parent) {
		parent.addStudent(student1);
		grades.add(grade);
		grades.add(grade2);
		student1.setGrades(grades);
		subjects.add(subj);
		subjects.add(subj2);
		students.add(student1);
		students.add(student2);

		if(!students.stream().anyMatch(x -> x.getId() == studentId)) {
			return "Student doesn't exist";
		}
		
		if(!checkIfParentHasStudent(parent, studentId)) {
			return "You haven't permission to get this user grade";
		}
		
		if(!subjects.stream().anyMatch(x -> x.getName().equals(subjectName))) {
			return "Subject doesn't exist";
		}

		if(!checkIfStudentHasGradeBySubject(studentId, subjectName)) {
			return "The student does not have a grade in this subject";
		}

		return "Succesfully gets grade";
	}

	private static boolean checkIfStudentHasGradeBySubject(int studentId, String subjectName){
		Optional<Student> optionalStudent = students.stream().filter(x -> x.getId() == studentId).findFirst();
		Student student = optionalStudent.get();

		Optional<Grade> optionalGrade = student.getGrades().stream().filter(x -> x.getSubject().getName().equals(subjectName)).findFirst();
		Grade grade = optionalGrade.get();

		if (grade.getGradeValue() > 0 && grade.getGradeValue() <= 6)
			return true;

		return false;
	}

	private static boolean checkIfParentHasStudent(Parent parent, int studentId){
		Optional<Student> optionalStudent = students.stream().filter(x -> x.getId() == studentId).findFirst();
		Student student = optionalStudent.get();

		if (parent.getStudents().contains(student)) {
			return true;
		}

		return false;
	}
}
