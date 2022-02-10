package uni.fmi;

import static org.junit.Assert.assertEquals;

import java.util.HashSet;
import java.util.Set;

import org.junit.Test;

import uni.fmi.models.Student;
import uni.fmi.models.Subject;
import uni.fmi.models.User;


public class InitialTest {
	@Test
	public void testSetWithStrings() {
		final Set<String> testInstance = new HashSet<String>();
		String value1 = "value1";
		testInstance.add(value1);
		String value2 = "value1";
		testInstance.add(value2);
		String value3 = "value3";
		testInstance.add(value3);
		assertEquals(2, testInstance.size());
	}
	@Test
	public void testSetWithStudents() {
		final Set<Student> testInstance = new HashSet<Student>();
		
		Student stud1 = new Student(1 ,"Iliya", "Nankov", "1234", "iliya@gmail.com");
		testInstance.add(stud1);
		Student stud2 = new Student(2, "Ivan", "Ivanov", "3421", "ivan@gmail.com");
		testInstance.add(stud2);
		Student stud3 = new Student(3, "Elena", "Ivanova", "5478", "elena@gmail.com");
		testInstance.add(stud3);
		Student stud4 = new Student(3,"Elena", "Ivanova", "5478", "elena@gmail.com");
		testInstance.add(stud4);
		assertEquals(3, testInstance.size());
	}
}
