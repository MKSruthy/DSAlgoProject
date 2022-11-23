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
Feature: Stack
  I want to use this template for my feature file

  Scenario: User validate Stack Main page
    Given The user is in home page with title "NumpyNinja"
    When user click on Get Started button on Stack
    Then It should navigate to corresponding page with title "Stack"
    When user click on Operations in Stack
    Then It should navigate to corresponding page with title "Operations in Stack"
    When user click on Try here
    Then It should navigate to corresponding page with title "Assessment"
    When user enter the Python code
      | print"Operations in Stack" |
    And click on run button
    Then User navigate back

  Scenario: User validate Implementation page
    When user click on Implementation
    Then It should navigate to corresponding page with title "Implementation"
    When user click on Try here
    Then It should navigate to corresponding page with title "Assessment"
    When user enter the Python code
      | print"Implementation" |
    And click on run button
    Then User navigate back

  Scenario: User validate Applications page
    When user click on Applications
    Then It should navigate to corresponding page with title "Applications"
    When user click on Try here
    Then It should navigate to corresponding page with title "Assessment"
    When user enter the Python code
      | print"Applications" |
    And click on run button
    Then user is navigated to home page "https://dsportalapp.herokuapp.com/home"
