Feature: Login Tests

This feature will contain all the test scenarios related to Login functionality of the application

@ninja
Scenario: Login with valid credentials
This test will verify wheter the user is able to login wit valid credentials
	Given User navigates to login page of application
	When User enters the Username "arun@qafox.com" and Password "SeleniumTester$" into the fields
	And Click on Login button
	Then User should successfully login
	