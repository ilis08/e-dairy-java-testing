package uni.fmi.login.model;

import uni.fmi.login.service.LoginService;

public class LoginScreenModel {

	private String username;
	private String password;
	private String message;

	public void setEmail(String username) {
		this.username = username;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void clickLoginButton() {
		message = LoginService.login(username, password);
	}
	

	public String getMessage() {
		// TODO Auto-generated method stub
		return message;
	}
}
