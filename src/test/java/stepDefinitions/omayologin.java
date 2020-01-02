package stepDefinitions;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;




@SuppressWarnings("deprecation")
public class omayologin {
	
	WebDriver driver=null;
	
	@Before("@Login")
	public void setup() {
		//System.setProperty("webdriver.chrome.driver", "drivers//chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	}
	
	@Given("^I navigate to the omayo website$")
	public void I_navigate_to_the_omayo_website() {
		
		driver.get("http://www.omayo.blogspot.com");		
		
	}
	
	@When("^I enter Username as \"([^\"]*)\" and Password as \"([^\"]*)\" into the fields$") 
	public void I_enter_Username_as_and_Password_as(String username,String password) {
		
		driver.findElement(By.name("userid")).sendKeys(username);
        driver.findElement(By.name("pswrd")).sendKeys(password);       
		
	}
	
	@And("^I click on Login button$")
	public void I_click_on_Login_button() {
		
		driver.findElement(By.cssSelector("input[type='button'][value='Login']")).click();	
		
	}
	
	@Then("^User should login based on expected \"([^\"]*)\" status$")
	public void User_should_login_based_on_expected_status(String expectedLoginStatus) {
		
		String expectedStatus=expectedLoginStatus;
		String actualStatus=null;
		try {
			Alert alert = driver.switchTo().alert();
			String actualText = alert.getText();
			if(actualText.equals("Error Password or Username")) {
				actualStatus="failure";
			}else {
				actualStatus="success";
			}
		}catch(Exception e) {
			actualStatus="success";		
		}
		
		if(actualStatus.equals(expectedStatus)) {
			//Do nothing
		}else {
			Assert.fail("Actual login status is not equal to the expected login status");
		}
		
		
	}
	
	@After("@Login")
	public void tearDown() {
		driver.quit();
	}
	

}
