package stepdefinitions;

import cucumber.api.java8.En;
import pages.Signup;

public class SignUpSteps implements En{
	
	
	public SignUpSteps() {
		
		Signup sign = new Signup();		
		

		When("^User enters \"([^\"]*)\" as First Name and \"([^\"]*)\" as Last Name$", (String arg1, String arg2) -> {
			sign.enterFirstName(arg1);
			sign.enterLastName(arg2);
		 
		});

		Then("^User enters \"([^\"]*)\" as Phone and \"([^\"]*)\" as email$", (String arg1, String arg2) -> {
			sign.enterPhone(arg1);
			sign.enteremail(arg2);
		
		});

		Then("^User enters password \"([^\"]*)\" and clicks submit$", (String arg1) -> {
			sign.enterPassword(arg1);
			sign.clickSignupButton();
		    
		});

		
	}
	
	

}
