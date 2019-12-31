package stepDefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.But;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

@SuppressWarnings("deprecation")
public class Search {

	@Given("^I visist the site as a guest user$")
	public void I_visist_the_site_as_a_guest_user() {
		System.out.println("» Given: I visist the site as a guest user ");
	}
	
	@When("^I select \"(.*)\" option on the search category dropdown$")
	public void I_select_books_option(String option) {
		System.out.println("» When - I select "+option+ " option on the search category dropdown");
	}
	
	
	@And("^I click on the search icon$")
	public void I_click_search_icon() {
		System.out.println("» And: I click on the search icon");
		
	}
	
	
	@Then("^I should see the \"(.*)\" page loaded$")
	public void Should_see_the_books_page_loaded(String page) {
		System.out.println("» Then: I should see the "+page+ " page loaded");
	}
	
	
	@And("^I should see \"(.*)\" as headline$")
	public void books_at_Amazon_as_headline(String headline) {
		System.out.println("» And:I should see "+headline+ " as headline");
	}
	
	
	
	@But("^I should not see the other category products$")
	public void No_other_category_products() {
		System.out.println("» But: I should not see the other category products");
	}
	
}
