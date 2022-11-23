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
Feature: DSAlgoSignIn
  I want to use this template for my feature file

  Scenario Outline: User Validate SignIn page
    Given The user opens Chrome Browser and  Enter the LogIn page url "https://dsportalapp.herokuapp.com/login"
    When user enter the <username>and<password>
    And click on Login
    Then It should navigate to the home page with a message " You are logged in  "

    Examples: 
      | username | password   | Status |
      | Geetha   | Manual     | Fail   |
      | sdet82   | selenium82 | pass   |
