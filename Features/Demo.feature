#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template

Feature: Login 
  
  Scenario: Validate that user is able to login to ecommerce portal successfully with valid credentials
    Given User launch the Chrome Browser successfully
    When 	User keys url "https://admin-demo.nopcommerce.com/login"
    And  	User enters the email as "admin@yourstore.com" and password as "admin"
    And 	clicks Login button
    Then 	Page title should be "Dashboard / nopCommerce administration"
    When 	user clicks log out button
    Then 	Page title should be "Your store. Login"
    And 	Close the Browser