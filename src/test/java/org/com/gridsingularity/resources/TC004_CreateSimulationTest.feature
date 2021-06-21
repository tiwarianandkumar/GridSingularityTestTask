Feature: To Test & Verify if User is able to craete a new simulation for project

  Background:

    Given Test DAO is Up and Running
    Given User is Logged in Successfully

  Scenario:
    When User click on left side project link on home page
    And User click on new project link
    And User enters new project name as "Test2"
    And User enters new project description as "Testing"
    And User click on add button for new project creation
    Then Verify if the new Project is Created with the name "Test2"
    When User click on the expand link for project "Test2"
    And User click on new simulation link on project page
    And User enters simulation name as "Simulation Test"
    And User enters simulation description as "Simulation Description Test"
    And User Select simulation project as "Test2"
    And User enters simulation start date as "Mon, 21 Jun 2021"
    And User enters simulation end date as "Tue, 22 Jun 2021"
    And User select simulation solar profile as "Sunny"
    And User select simulation spot market type as "One sided pay as offer"
    And User enters simulation no of spot market as "1"
    And User select grid fees as "Constant value"
    And User enters simulation Market slot real time duration as "0"
    And User click on next button on simulation page
    Then Verify if the new simulation has been created












