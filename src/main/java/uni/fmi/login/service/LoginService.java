package uni.fmi.login.service;

import java.util.List;
import java.util.Set;
import java.util.ArrayList;
import java.util.Collections;

import uni.fmi.models.Parent;
import uni.fmi.models.Student;
import uni.fmi.models.User;

public class LoginService {

	private static ArrayList<User> userDb = new ArrayList<User>();
	
	private static Student student = new Student(1901321105 ,"Iliya", "Nankov", "1234Pet", "iliya@gmail.com");
	private static Parent parent = new Parent("Irina", "Nankova", "1245", "irina@gmail.com");
	
	public static String login(String email, String password) {
		userDb.add(student);
		userDb.add(parent);
		
		
		if (null == password || null == email) {
			return "Please, insert email or password.";
		}
		
		final boolean isUserExists = userDb.stream().anyMatch(x -> email.equals(x.getEmail())&&password.equals(x.getPassword()));
		
		return isUserExists? "Login succesfully!" : "Wrong data!";
	}

}
