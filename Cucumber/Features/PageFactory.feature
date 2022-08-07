Feature: Test login functionality

  Scenario Outline: Check login is succesful with valid and invalid credentials
    Given browser is opening
    And user is on loging page
    When user entering <username> and <password>
    And user clicking on login button
    Then user click on welcome link on next page
    Then user clicks on logout button

    Examples: 
      | username | password |
      | Admin    | admin123 |
      
