package uni.fmi.login.service;

import java.util.List;
import java.util.Collections;

import uni.fmi.models.Student;
import uni.fmi.models.User;

public class LoginService {

	private static List<User> userDb = Collections.singletonList(new Student(1 ,"Iliya", "Nankov", "1234Pet", "iliya@gmail.com"));
	
	public static String login(String email, String password) {
		if (null == password || null == email) {
			return "Please, insert email or password.";
		}
		
		final boolean isUserExists = userDb.stream().anyMatch(x -> email.equals(x.getEmail())&&password.equals(x.getPassword()));
		
		return isUserExists? "Login succesfully!" : "Wrong data!";
	}

}
