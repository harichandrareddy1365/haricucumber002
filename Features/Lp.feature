Feature: User Login
  As a registered user
  I want to be able to log in to the system
  So that I can access my account and perform actions

  Scenario: Successful login
    Given I am on the login page
    When I enter my valid username and password
    And I click the "Login" button
    Then I should be redirected to the home page
    And I should see a welcome message

  