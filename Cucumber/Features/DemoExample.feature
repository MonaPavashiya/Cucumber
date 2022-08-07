Feature: Test login functionality

  Scenario Outline: Check login is succesful wit valid credentials
    Given browser is now open
    And user is on login page
    When user enters <username> and <password>
    And user clicks on login
    Then user is navigated to the home page

    Examples: 
      | username | password |
      | Mona     |    12345 |
      | Sandeep  |    45678 |
