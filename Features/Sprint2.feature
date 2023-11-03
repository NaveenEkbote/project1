Feature: password checking

Scenario: invalid password
	Given enduser navigate to application
	When user entres invalid credentials
	Then checking error msg entering wrong password
	
