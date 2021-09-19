package pages;

import static org.junit.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Signup extends Base{
	
	//**
	//Elements of Sign Up Page
	//**

	public WebElement getFirstName() {
		return driver.findElement(By.xpath("//input[@name='first_name']"));
	}

	public WebElement getLastName() {
		return driver.findElement(By.xpath("//input[@name='last_name']"));
	}

	public WebElement getPhone() {
		return driver.findElement(By.xpath("//input[@name='phone']"));
	}

	public WebElement getEmail() {
		return driver.findElement(By.xpath("//input[@name='email']"));
	}
	public WebElement getPassword() {
		return driver.findElement(By.xpath("//input[@name='password']"));
	}
	
	public WebElement getSignUp() {
		return driver.findElement(By.xpath("//div[@class='contact-form-action']//descendant::button[@type='submit']"));
	}
	
	//**
	//Functions start here
	//**
	
	public Signup enterFirstName(String fname) {
		getFirstName().click();
		getFirstName().sendKeys(fname);
		return this;
	}
	
	public Signup enterLastName(String lname) {
		getLastName().click();
		getLastName().sendKeys(lname);
		return this;
	}
	
	public Signup enterPhone(String phone) {
		getPhone().click();
		getPhone().sendKeys(phone);
		return this;
	}
	
	public Signup enteremail(String email) {
		//getEmail().click();
		getEmail().clear();
		getEmail().sendKeys(email);
		return this;
	}
	public Signup enterPassword(String pwd) {
		//getPassword().click();
		getPassword().clear();
		getPassword().sendKeys(pwd);
		return this;
	}
	
	public Signup clickSignupButton() {
		scrollToView();
		waitForElement(getSignUp());
		getSignUp().click();
		
		return this;
	}

}
