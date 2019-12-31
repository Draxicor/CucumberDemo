package stepDefinitions;

import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.After;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

@SuppressWarnings("deprecation")
public class Registration {
	
	WebDriver driver = null;
	
	@Given("User navigates to registration page")
	public void user_navigates_to_registration_page() {
		 System.setProperty("webdriver.chrome.driver", "drivers//chromedriver.exe");
		 driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 driver.get("http://tutorialsninja.com/demo/index.php?route=account/register");
		    
	}

	@When("User provides the following details into the input fields")
	public void user_provides_the_following_details_into_the_input_fields(io.cucumber.datatable.DataTable dataTable) {
		Map<String,String> map = dataTable.asMap(String.class, String.class);
		driver.findElement(By.id("input-firstname")).sendKeys(map.get("firstName"));
		driver.findElement(By.id("input-lastname")).sendKeys(map.get("lastName"));
		driver.findElement(By.id("input-email")).sendKeys(map.get("email"));
		driver.findElement(By.id("input-telephone")).sendKeys(map.get("phone"));
		driver.findElement(By.id("input-password")).sendKeys(map.get("password"));
		driver.findElement(By.id("input-confirm")).sendKeys(map.get("password"));
		
	
	}

	@And("Selects the privacy policy option")
	public void selects_the_privacy_policy_option() {
	    driver.findElement(By.name("agree")).click();
	}

	@And("Clicks on continue button")
	public void clicks_on_continue_button() {
	    driver.findElement(By.xpath("//input[@class='btn btn-primary']")).click();
	    
	}

	@Then("User should get successfully regsitered")
	public void user_should_get_successfully_regsitered() {
	   String url = driver.getCurrentUrl();
	   if(url.equals("http://tutorialsninja.com/demo/index.php?route=account/success")) {
		   
	   }else {
		   Assert.fail("User did not register succesfully");
	   }
	}
	@After("@qafox")
	public void quit() {
		driver.quit();
	}
}
