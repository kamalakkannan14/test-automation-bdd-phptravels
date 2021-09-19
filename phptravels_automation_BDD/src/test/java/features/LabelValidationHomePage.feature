@LabelValidation
Feature: To test all the basic label are enabled in the Home page and SignUp validations

  @WebsiteInformation
  Scenario: Check for all website informations
    Given User launches the Google Chrome browser
    Then Launch the Webiste
    When User is in home page verify for logo
    Then User should be able to see phone number to be "  +1-234-56789"
    Then User should be able to see the company mail id to be "info@travelagency.com"
    Given User clicks the Sign up page

  @SignUptest
  Scenario: Check Sign Up functions
    When User enters "New User" as First Name and "Test" as Last Name
    Then User enters "+987456321" as Phone and "User231@gmail.com" as email
    Then User enters password "test" and clicks submit
    
   @LoginandUpdateTest
   Scenario: Check for the login and update functions
   Given User enters the "User231@gmail.com" as email and "test" as password
   When User clicks Submit and verifies for the "New User" for first Name at the top right corner
   Then User clicks Profile button and updates the email "NewUserChanged@gmail.com"
   And User clicks Update button
   And User Logsout
   Then User closes the browser
