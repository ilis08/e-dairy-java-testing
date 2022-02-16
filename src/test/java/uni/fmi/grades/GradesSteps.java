package uni.fmi.grades;

import static org.junit.Assert.assertEquals;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import uni.fmi.grades.model.GradesScreenModel;
import uni.fmi.login.model.LoginScreenModel;
import uni.fmi.login.service.LoginService;
import uni.fmi.models.Parent;

public class GradesSteps {

	private GradesScreenModel gradeModel;

	@Given("^Parent is logged in$")
	public void parentIsLoggedIn() throws Throwable {
		assertEquals("Login succesfully!",LoginService.login("irina@gmail.com", "1245"));
	}

	@Given("^Parent open student grade screen$")
	public void parentOpenStudentGradeScreen() throws Throwable {
		gradeModel = new GradesScreenModel();
		gradeModel.setParent(new Parent("Ivanna", "Nankova", "1245", "ivanna@gmail.com"));
	}

	@Given("^inputs student id: \"([^\"]*)\"$")
	public void inputsStudentId(int id) throws Throwable {
		gradeModel.setId(id);
	}

	@Given("^inputs subject: \"([^\"]*)\"$")
	public void inputsSubject(String subject) throws Throwable {
		gradeModel.setSubject(subject);
	}

	@Given("^clicks submit button$")
	public void clickSubmitButton() throws Throwable {
		gradeModel.clickSearchButton();
	}

	@Then("^show message: \"([^\"]*)\"$")
	public void showMessage(String message) throws Throwable {
		assertEquals(message, gradeModel.getMessage());
	}
}
