package testrunner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/java/features", 
		glue = {"stepdefinitions"},
		plugin = {"pretty", "html:target/cucumber-reports" , "json:target/cucumber-reports/Cucumber.json"},
		monochrome = true,
		tags="@LabelValidation"
		
)

public class TestRunner {

}
