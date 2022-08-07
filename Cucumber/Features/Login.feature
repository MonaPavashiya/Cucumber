Feature: Login

@Smoke
Scenario: Check login is successful with valid credentials 

	Given User Launch Chrome browser
	When user opens URL "https://opensource-demo.orangehrmlive.com/"
	And user entering Username as "Admin" and Password as "admin123"
	And click on login
	Then page title should be "OrangeHRM"
	When user clicks on Welcome link
	Then User clicks on logout link
	And user close browser