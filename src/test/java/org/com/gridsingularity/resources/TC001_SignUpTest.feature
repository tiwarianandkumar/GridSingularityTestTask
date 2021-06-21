Feature: To Test Successfull Sign Up for User

Background:

Given Test DAO is Up and Running

Scenario:
  When User click on the Link CreateNewAccount
  And User enters email as "anandkumard@gmail.com"
  And User enters name as "Anandkumar T"
  And User enters organization as "ITC"
  And User enters password as "Grid_SingularityTest001"
  And User Click on Agree Checkbox
  And Click on next button on sign up page
  Then User Should be signed up successfully





