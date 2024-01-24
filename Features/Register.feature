Feature: User Registration
  As a new user
  I want to register on the website
  So that I can access the services
  

  Scenario: User registration with valid details
    Given I am navigate to the registration page
    When I enter my First Name as "Hari"
    And I enter my Last Name as "Anugu"
    And I enter my E-Mail as "harichandrareddy1365@gmail.com"
    And I enter my Telephone as "1234567890"
    And I enter my Password as "Hari@123"
    And I confirm my Password as "Hari@123"
    And I choose to subscribe with "Yes"
    And I agree to the Privacy Policy
    And I click on the Submit button
    

  
