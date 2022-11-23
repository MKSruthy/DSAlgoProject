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

@severity=blocker
Feature: DSAlgo Portal
  I want to use this template for my feature file

  Scenario: User validate Home page
    Given User open Chrome Browser
    And User Open Url "https://dsportalapp.herokuapp.com/"
    When User clicks on Get Started button
    Then The user redirected to home page as the title "NumpyNinja"
    Then The user clicks on data structure dropdown
    When The user select one of the dropdown menu
    Then It should Alert the user with the message "You are not logged in"
    When The user click any of thr Get started button in home page
    Then It should Alert the user with the message "You are not logged in"
    When The user click on Register
    Then The user should be redirected to Register page as title "Registration"
