package pages;

import java.util.concurrent.TimeUnit;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import io.github.bonigarcia.wdm.WebDriverManager;


public class Base {

	static WebDriver driver = null;
	JavascriptExecutor js = (JavascriptExecutor) driver;


	@BeforeClass
	//To launch chrome browser
	public void launchChrome(){
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();	
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	}


	public void launchWebsite(){
		driver.get("https://www.phptravels.net/");
		driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
		driver.findElement(By.id("cookie_stop")).click();
	}

	public void scrollToView(){
		js.executeScript("scroll(0, 500)"); 		
	}

	public void waitForElement(WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOf(element));
	}

	@AfterClass
	public void closeBrowser() {
		driver.quit();
	}


}
