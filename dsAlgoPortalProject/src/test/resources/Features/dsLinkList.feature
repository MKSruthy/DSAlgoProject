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

Feature: Linklist
  I want to use this template for my feature file

  Scenario: User validate LinkList Introduction page
    Given The user is in home page with title "NumpyNinja"
    When user click on Get Started button on Linklist
    Then It should navigate to corresponding page with title "Linked List"
    When user click on Introduction
    Then It should navigate to corresponding page with title "Introduction"
    When user click on Try here
    Then It should navigate to corresponding page with title "Assessment"
    When user enter the Python code
      | print"LinkList Introduction" |
    And click on run button
    Then User navigate back

  Scenario: User validate Creating Linked LIst page
    When user click on Creating Linked LIst
    Then It should navigate to corresponding page with title "Creating Linked LIst"
    When user click on Try here
    Then It should navigate to corresponding page with title "Assessment"
    When user enter the Python code
      | print"Types of Linked List" |
    And click on run button
    Then User navigate back

  Scenario: User validate Types of Linked List page
    When user click on Types of Linked List
    Then It should navigate to corresponding page with title "Types of Linked List"
    When user click on Try here
    Then It should navigate to corresponding page with title "Assessment"
    When user enter the Python code
      | print"Types of Linked List" |
    And click on run button
    Then User navigate back

  Scenario: User validate Implement Linked List in Python page
    When user click on Implement Linked List in Python
    Then It should navigate to corresponding page with title "Implement Linked List in Python"
    When user click on Try here
    Then It should navigate to corresponding page with title "Assessment"
    When user enter the Python code
      | print"Implement Linked List in Python" |
    And click on run button
    Then User navigate back

  Scenario: User validate Traversal page
    When user click on Traversal
    Then It should navigate to corresponding page with title "Traversal"
    When user click on Try here
    Then It should navigate to corresponding page with title "Assessment"
    When user enter the Python code
      | print"Traversal" |
    And click on run button
    Then User navigate back

  Scenario: User validate Insertion page
    When user click on Insertion
    Then It should navigate to corresponding page with title "Insertion"
    When user click on Try here
    Then It should navigate to corresponding page with title "Assessment"
    When user enter the Python code
      | print"Insertion" |
    And click on run button
    Then User navigate back

  Scenario: User validate Deletion page
    When user click on Deletion
    Then It should navigate to corresponding page with title "Deletion"
    When user click on Try here
    Then It should navigate to corresponding page with title "Assessment"
    When user enter the Python code
      | print"Deletion" |
    And click on run button
    Then user is navigated to home page "https://dsportalapp.herokuapp.com/home"
