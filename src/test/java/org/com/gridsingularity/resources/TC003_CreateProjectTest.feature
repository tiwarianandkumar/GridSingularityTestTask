Feature: To Test & Verify if User is able to create a new project

  Background:

    Given Test DAO is Up and Running
    Given User is Logged in Successfully

  Scenario:
    When User click on left side project link on home page
    And User click on new project link
    And User enters new project name as "Test1"
    And User enters new project description as "Testing"
    And User click on add button for new project creation
    Then Verify if the new Project is Created with the name "Test1"
