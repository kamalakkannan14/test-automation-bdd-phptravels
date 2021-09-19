package pages;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public class PHPHome extends Base{


	//Elements of Homepage

	public WebElement getPhoneNumber() {

		return driver.findElement(By.xpath("//a[text()=' +1-234-56789']"));
	}

	public WebElement getMailId() {

		return driver.findElement(By.xpath("//a[text()='info@travelagency.com']"));
	}
	public WebElement getLogo() {

		return driver.findElement(By.xpath("//img[@alt='logo']"));
	}
	public WebElement get2ndLineLabels(String label) {

		return driver.findElement(By.xpath("//a[text()='"+label+"']"));
	}

	public WebElement getSignupButton() {
		return driver.findElement(By.xpath("//a[@class='theme-btn theme-btn-small waves-effect']"));
	}


	//Functions

	public PHPHome verifyWebsitePhoneNumber(String number) {
		driver.manage().timeouts().implicitlyWait(150,TimeUnit.SECONDS);
		assertEquals(number,getPhoneNumber().getText());
		return this;
	}

	public PHPHome verifyWebsiteMailId(String mail) {
		assertEquals(mail,getMailId().getText());
		return this;
	}

	public PHPHome verifyLogo() {
		assertTrue(getLogo().isEnabled());
		return this;
	}

	public PHPHome verify2ndLineLabels(String labels) {
		assertEquals(labels,get2ndLineLabels(labels).getText());
		System.out.println(get2ndLineLabels(labels).getText());
		return this;
	}

	public PHPHome clickSignUpButton() {
		assertTrue(getSignupButton().isEnabled());
		getSignupButton().click();
		return this;
	}


}
