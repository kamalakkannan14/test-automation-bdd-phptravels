package stepdefinitions;

import cucumber.api.java8.En;
import pages.Login;

public class LoginSteps implements En{
	
	public LoginSteps() {
		
		Login log = new Login();
		
		Given("^User enters the \"([^\"]*)\" as email and \"([^\"]*)\" as password$", (String arg1, String arg2) -> {
			log.enteremail(arg1);
			log.enterPassword(arg2);
		    
		});

		When("^User clicks Submit and verifies for the \"([^\"]*)\" for first Name at the top right corner$", (String arg1) -> {
		    log.clickSignupButton();
		    log.verifyUsername();
		});

		Then("^User clicks Profile button and updates the email \"([^\"]*)\"$", (String arg1) -> {
		    log.clickProfile();
		    log.editemailProfile(arg1);
		});

		Then("^User clicks Update button$", () -> {
		    log.clickUpdateProfile();
		});

		Then("^User Logsout$", () -> {
		   log.clickLogOutButton();
		});
		
		Then("^User closes the browser$", () -> {
			   log.closeBrowser();
			});
	}

}
