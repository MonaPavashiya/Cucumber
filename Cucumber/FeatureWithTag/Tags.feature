@MustRun
Feature: feature to demo tags

  @Smoke
  Scenario: Sample 1
    Given I navigate to url
    And I enter username as "username"
    And I enter password as "password"
    When I click Login
    Then I should be logged into the system

  @Regression
  Scenario: Sample 2
    Given navigate to url
    And enter username as "username"
    And enter password as "password"
    When click Login
    Then should be logged into the system

  @Smoke @Regression
  Scenario: Sample 3
   Given navigate url
    And enter uname as "username"
    And enter psword as "password"
    When click on Login
    Then should log into the system

