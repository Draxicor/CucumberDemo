Feature: Registration Tests
@qafox
Scenario: Register an account with valid details
	Given User navigates to registration page
	When User provides the following details into the input fields
		|firstName|kiko               |
		|lastName |draxicor           |
		|email    |draxicor@gmail.com |
		|phone    |12345678						|
		|password |SeleniumTester$		|
	And Selects the privacy policy option
	And Clicks on continue button
	Then User should get successfully regsitered