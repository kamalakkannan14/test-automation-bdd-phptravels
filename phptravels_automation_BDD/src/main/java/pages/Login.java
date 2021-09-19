package pages;

import static org.junit.Assert.assertTrue;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Login extends Base{
	
	//**
	//Elements of page Login
	//**
	
	
	public WebElement getEmailLogin() {
		return driver.findElement(By.xpath("//input[@name='email']"));
	}
	
	public WebElement getPasswordLogin() {
		return driver.findElement(By.xpath("//input[@name='password']"));
	}
	
	public WebElement getLoginButton() {
		return driver.findElement(By.xpath("//button[@type='submit']"));
	}
	
	public WebElement getUserName() {
		return driver.findElement(By.xpath("//Strong[text()='New User']"));
	}
	
	public WebElement getProfile() {
		return driver.findElement(By.xpath("//a[text()=' My Profile']"));
	}
	
	public WebElement getProfileemail() {
		return driver.findElement(By.xpath("//input[@type='email']"));
	}
	
	public WebElement getUpdateProfileButton() {
		return driver.findElement(By.xpath("//button[@type='submit']"));
	}
	
	public WebElement getLogOutButton() {
		return driver.findElement(By.xpath("//a[text()=' My Profile']//following::li[1]"));
	}
	
	public WebElement getLoginPageLoad() {
		return driver.findElement(By.xpath("//h5[text()='Login']"));
	}
	
	
	//h5[@class='modal-title title']
	
	//**
	//Functions starts here
	//**
	
	public Login enteremail(String email) {
		waitForElement(getLoginPageLoad());
		getEmailLogin().click();
		getEmailLogin().clear();		
		getEmailLogin().sendKeys(email);
		return this;
	}
	public Login enterPassword(String pwd) {
		getPasswordLogin().click();
		getPasswordLogin().clear();
		getPasswordLogin().sendKeys(pwd);
		return this;
	}
	
	public Login clickSignupButton() {
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		getLoginButton().click();
		return this;
	}
	
	public Login verifyUsername() {
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		assertTrue(getUserName().isDisplayed());
		return this;
	}
	
	public Login clickProfile() {
		getProfile().click();
		//driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		return this;
	}
	
	public Login editemailProfile(String newemail) {
		scrollToView();
		//getProfileemail().click();
		getProfileemail().clear();
		getProfileemail().sendKeys(newemail);
		return this;
	}
	
	public Login clickUpdateProfile() {
		
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		getUpdateProfileButton().click();
		return this;
	}
	
	public Login clickLogOutButton() {
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		if (!getLogOutButton().isEnabled()) {
			waitForElement(getLogOutButton());
			getLogOutButton().click();
		}
		else{
		
		getLogOutButton().click();
		}
		return this;
	}

}
