package uni.fmi.login;

import static org.junit.Assert.assertEquals;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import uni.fmi.login.model.LoginScreenModel;

public class LoginSteps {
	
	private LoginScreenModel loginModel;

	@Given("^User open a log in screen$")
	public void userOpenLogInScreen() throws Throwable {	    
	    loginModel = new LoginScreenModel();
	}

	@When("^Insert a valid user email$")
	public void insertValidUserEmail() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    loginModel.setEmail("iliya@gmail.com");
	}

	@When("^Insert a valid user password$")
	public void insertValidUserPassword() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    loginModel.setPassword("1234Pet");
	}

	@When("^Insert a invalid user password$")
	public void insert_a_invalid_user_password() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		loginModel.setPassword("32F1");
	}
	
	@When("^Insert a invalid user email$")
	public void insert_a_invalid_user_email() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		loginModel.setEmail("allo@mail.ru");
	}
	
	@When("^press login button$")
	public void pressLoginButton() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    loginModel.clickLoginButton();
	}

	@Then("^check at the succesfull message$")
	public void checkAtTheSuccesfullMessage() throws Throwable {
	    assertEquals("Login succesfully!", loginModel.getMessage());
	}
	
	@Then("^check at the missing data message$")
	public void checkAtTheMissingDataMessage() throws Throwable {
	    assertEquals("Please, insert email or password.", loginModel.getMessage());
	}

	@Then("^check at the wrong data message$")
	public void checkAtTheWrongDataMessage() throws Throwable {
		assertEquals("Wrong data!", loginModel.getMessage());
	}	
}
