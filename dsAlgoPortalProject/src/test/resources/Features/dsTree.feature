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
Feature: Tree
  I want to use this template for my feature file

  Scenario: User validate Title of your scenario page
    Given The user is in home page with title "NumpyNinja"
    When user click on Get Started button on Tree
    And It should navigate to corresponding page with title "Tree"
    When user click on Overview of Trees
    And It should navigate to corresponding page with title "Overview of Trees"
    When user click on Try here
    And It should navigate to corresponding page with title "Assessment"
    When user enter the Python code
      | print"Overview of Trees" |
    And click on run button
    Then User navigate back

  Scenario: User validate Terminologies page
    When user click on Terminologies
    Then It should navigate to corresponding page with title "Terminologies"
    When user click on Try here
    Then It should navigate to corresponding page with title "Assessment"
    When user enter the Python code
      | print"Terminologies" |
    And click on run button
    Then User navigate back

  Scenario: User validate Types of Trees page
    When user click on Types of Trees
    Then It should navigate to corresponding page with title "Types of Trees"
    When user click on Try here
    Then It should navigate to corresponding page with title "Assessment"
    When user enter the Python code
      | print"Types of Trees" |
    And click on run button
    Then User navigate back

  Scenario: User validate Tree Traversals page
    When user click on Tree Traversals
    Then It should navigate to corresponding page with title "Tree Traversals"
    When user click on Try here
    Then It should navigate to corresponding page with title "Assessment"
    When user enter the Python code
      | print"Tree Traversals" |
    And click on run button
    Then User navigate back

  Scenario: User validate Traversals-Illustration page
    When user click on Traversals-Illustration
    Then It should navigate to corresponding page with title "Traversals-Illustration"
    When user click on Try here
    Then It should navigate to corresponding page with title "Assessment"
    When user enter the Python code
      | print"Traversals-Illustration" |
    And click on run button
    Then User navigate back

  Scenario: User validate Binary Trees page
    When user click on Binary Trees
    Then It should navigate to corresponding page with title "Binary Trees"
    When user click on Try here
    Then It should navigate to corresponding page with title "Assessment"
    When user enter the Python code
      | print"Binary Trees" |
    And click on run button
    Then User navigate back

  Scenario: User validate Types of Binary Trees page
    When user click on Types of Binary Trees
    Then It should navigate to corresponding page with title "Types of Binary Trees"
    When user click on Try here
    Then It should navigate to corresponding page with title "Assessment"
    When user enter the Python code
      | print"Types of Binary Trees" |
    And click on run button
    Then User navigate back

  Scenario: User validate Implementation in Python page
    When user click on Implementation in Python
    Then It should navigate to corresponding page with title "Implementation in Python"
    When user click on Try here
    Then It should navigate to corresponding page with title "Assessment"
    When user enter the Python code
      | print"HelloWorld" |
    And click on run button
    Then User navigate back

  Scenario: User validate Binary Tree Traversals page
    When user click on Binary Tree Traversals
    Then It should navigate to corresponding page with title "Binary Tree Traversals"
    When user click on Try here
    Then It should navigate to corresponding page with title "Assessment"
    When user enter the Python code
      | print"Binary Tree Traversals" |
    And click on run button
    Then User navigate back

  Scenario: User validate Implementation of Binary Trees page
    When user click on Implementation of Binary Trees
    Then It should navigate to corresponding page with title "Implementation of Binary Trees"
    When user click on Try here
    Then It should navigate to corresponding page with title "Assessment"
    When user enter the Python code
      | print"Implementation of Binary Trees" |
    And click on run button
    Then User navigate back

  Scenario: User validate Applications of Binary trees page
    When user click on Applications of Binary trees
    Then It should navigate to corresponding page with title "Applications of Binary trees"
    When user click on Try here
    Then It should navigate to corresponding page with title "Assessment"
    When user enter the Python code
      | print"Applications of Binary trees" |
    And click on run button
    Then User navigate back

  Scenario: User validate Binary Search Trees page
    When user click on Binary Search Trees
    Then It should navigate to corresponding page with title "Binary Search Trees"
    When user click on Try here
    Then It should navigate to corresponding page with title "Assessment"
    When user enter the Python code
      | print"Binary Search Trees" |
    And click on run button
    Then User navigate back

  Scenario: User validate Implementation Of BST page
    When user click on Implementation Of BST
    Then It should navigate to corresponding page with title "Implementation Of BST"
    When user click on Try here
    Then It should navigate to corresponding page with title "Assessment"
    When user enter the Python code
      | print"Implementation Of BST" |
    And click on run button
    Then user is navigated to home page "https://dsportalapp.herokuapp.com/home"
