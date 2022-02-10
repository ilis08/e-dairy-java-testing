package uni.fmi.login;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@CucumberOptions(monochrome = true, plugin = {"pretty","html:target/login-feature"})
@RunWith(Cucumber.class)
public class LoginStarter {

}
