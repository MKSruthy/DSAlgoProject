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

Feature: Array
  I want to use this template for my feature file
 
  Scenario: User validate Array Page
    Given The user is in home page with title "NumpyNinja"
    Then click on Get started button in array
    And It should navigate to corresponding page with title "Array"
    When user click on Arrays in Phython
    And It should navigate to corresponding page with title "Arrays in Python"
    Then user click on Try here
    And It should navigate to corresponding page with title "Assessment"
    When user enter the Python code
      | print("Arrays in Python") |
    And click on run button
    Then The result should be displayed below the run button
    Then User navigate back

  Scenario: User validate Arrays using list page
    When User click on Arrays using list
    And It should navigate to corresponding page with title "Arrays Using List"
    Then user click on Try here
    And It should navigate to corresponding page with title "Assessment"
    When user enter the Python code
      | print("Arrays using list") |
    And click on run button
    Then The result should be displayed below the run button
    Then User navigate back
	
  Scenario: User validate Basic Operations in list page
    When User click on Basic Operations in list
    And It should navigate to corresponding page with title "Basic Operations in Lists"
    Then user click on Try here
    And It should navigate to corresponding page with title "Assessment"
    When user enter the Python code
      | print("Basic Operations in list") |
    And click on run button
    Then User navigate back

  Scenario: User validate Applications of Array page
    When User click on Applications of Array
    And It should navigate to corresponding page with title "Applications of Array"
    Then user click on Try here
    And It should navigate to corresponding page with title "Assessment"
    When user enter the Python code
      | print("Applications of Array") |
    And click on run button
    Then User navigate back
    When user click on Practice Questions
    And It should navigate to corresponding page with title "Practice Questions"

  Scenario Outline: User validate Search the array page
    When user click on Search the array
    And It should navigate to corresponding page with title "Assessment"
    When user clear the text and enter the Python code <PythonCode>
    And click on run button
    Then User navigate back
    
  Examples:
  
      |PythonCode|
      | print("Search the array") |

  Scenario Outline:  User validate Max Consecutive Ones page
    When user click on Max Consecutive Ones
    And It should navigate to corresponding page with title "Assessment"
    When user clear the text and enter the Python code <PythonCode>
    And click on run button
    Then User navigate back
    
   Examples:
     	|PythonCode|
      | print("Max Consecutive Ones")|

  Scenario Outline: User validate Even Number page
    When user click on Find Numbers with Even Number of Digits
    And It should navigate to corresponding page with title "Assessment"
    When user clear the text and enter the Python code <PythonCode>
    And click on run button
    Then User navigate back
    
   Examples:
     	|PythonCode|
      | print("Even Number") |

  Scenario Outline: User validate Sorted Array page
    When user click on Find Numbers with Squares of  a Sorted Array
    And It should navigate to corresponding page with title "Assessment"
    When user clear the text and enter the Python code <PythonCode>
    And click on run button
    Then user is navigated to home page "https://dsportalapp.herokuapp.com/home"
 
  Examples:
  
     	|PythonCode|
      | print("Sorted Array")|
