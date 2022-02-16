package uni.fmi.grades;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@CucumberOptions(monochrome = true, plugin = {"pretty","html:target/grade-feature"})
@RunWith(Cucumber.class)
public class GradesStarter {

}
