package stepDefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

@SuppressWarnings("deprecation")
public class SoftwareTester {

	
	//([a-zA-Z]{1,}) means it can pass alphabet characters
	@Given("^I am a \"([a-zA-Z]{1,})\" software tester$")
	public void i_am_a_good_software_tester(String testerType) {
	    System.out.println("-- Given I am a " +testerType +" software tester");
	    
	}
	
	@When("^I go to work$")
	public void i_go_to_work() {
		System.out.println("-- When I go to work");
	}
	
	//([^\"]*) means it can pass any alphanmeric and special characters
	@And("^I \"([^\"]*)\" with it$")
	public void i_involve_with_it(String workType) {
	    System.out.println("-- And I "+workType +" with it");
	}
	
	// (.*) means it can pass anything 
	@Then("^My boss \"(.*)\" me$")
	public void my_boss_loves_me(String bossReaction) {
	    System.out.println("-- Then My boss " +bossReaction  +" me");
	}
	
	
	
	
	

}
