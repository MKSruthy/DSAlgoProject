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
Feature: Graph
  I want to use this template for my feature file

  Scenario: User validate Get Started On Graph page
    Given The user is in home page with title "NumpyNinja"
    When user click on Get Started button on Graph
    Then It should navigate to corresponding page with title "Graph"
    When user click on Graph
    Then It should navigate to corresponding page with title "Graph"
    When user click on Try here
    Then It should navigate to corresponding page with title "Assessment"
    When user enter the Python code
      | print"Graph" |
    And click on run button
    Then User navigate back

  Scenario: User validate Graph Representations page
    When user click on Graph Representations
    Then It should navigate to corresponding page with title "Graph Representations"
    When user click on Try here
    Then It should navigate to corresponding page with title "Assessment"
    When user enter the Python code
      | print"Graph Representations" |
    And click on run button
    Then user is navigated to home page "https://dsportalapp.herokuapp.com/home"
    Then click on signout
