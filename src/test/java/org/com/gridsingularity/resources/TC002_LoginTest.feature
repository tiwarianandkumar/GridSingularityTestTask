Feature: To Test Successfull Login for User

  Background:

    Given Test DAO is Up and Running

  Scenario:
    When User enters email "anandkumart.1993@gmail.com" on login page
    And User enters password "Grid_SingularityTest001" on login page
    And Click on the Login button
    Then User should be logged in successfully
