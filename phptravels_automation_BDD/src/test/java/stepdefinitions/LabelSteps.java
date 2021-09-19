package stepdefinitions;


import pages.PHPHome;
import cucumber.api.java8.En;

public class LabelSteps implements En {

	public LabelSteps() {

		PHPHome home = new PHPHome();
		

		Given("^User launches the Google Chrome browser$", () -> home.launchChrome());

		Then ("^Launch the Webiste$", () -> {
			home.launchWebsite();

		});

		Given ("^User is in home page verify for logo$", () -> {
			home.verifyLogo();

		});

		Then ("^User should be able to see phone number to be \"([^\"]*)\"$", (String arg1) -> {
			home.verifyWebsitePhoneNumber(arg1);

		});

		Then("^User should be able to see the company mail id to be \"([^\"]*)\"$", (String arg1) -> {
			home.verifyWebsiteMailId(arg1);

		});

		Then("^User verifies all the label options \"(.*)\"$", (String arg1) -> {
			home.verify2ndLineLabels(arg1);

		});
		
		Given("^User clicks the Sign up page$", () -> {
			home.clickSignUpButton();
			});

	}



}
