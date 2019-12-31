package stepDefinitions;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.After;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

@SuppressWarnings("deprecation")
public class login {

	WebDriver driver = null;
	
	@Given("User navigates to login page of application")
	public void user_navigates_to_login_page_of_application() {
	    System.setProperty("webdriver.chrome.driver", "drivers//chromedriver.exe");
	    driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    driver.get("http://tutorialsninja.com/demo/index.php?route=account/login");
	    
	}

	@When("User enters the Username \"(.*)\" and Password \"(.*)\" into the fields")
	public void user_enters_the_Username_and_Password_into_the_fields(String username, String password) {
	   driver.findElement(By.id("input-email")).sendKeys(username);
	   driver.findElement(By.id("input-password")).sendKeys(password);
	}

	@And("Click on Login button")
	public void click_on_Login_button() {
	    driver.findElement(By.cssSelector("input[type='submit'][value='Login']")).click();
	}

	@Then("User should successfully login")
	public void user_should_successfully_login() {
		WebElement element =null;
		try {
			element = driver.findElement(By.linkText("Register for an affiliate account"));
	
				
		}catch(Exception exc) {
			
			Assert.fail("User has not logged in");
		}
		
		Assert.assertNotNull("User has not logged in", element);
	
		if(element.isDisplayed()) {
			
		}else {
			Assert.fail();
		}
		
	
	
	}
	@After("@ninja")
	public void quit() {
		driver.quit();
	}
}
