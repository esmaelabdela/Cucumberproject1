@AddNewBankAccountFeature @Regression
Feature: Add new account page fanctionality validation

  @AddBankAcountScenario
  Scenario: User should be able to add a new account with valid credencial
    Given User is on the codefios login page
    When User enters "username" from mysql database
    When User enters "password" from mysql database
    And User click on sign in button
    Then User should be able to land on dashboard page
    When User click on list accounts
    Then User should be able to land on list account page
    When User click on add account
    Then User should be able to land on add new account window
    When User fill all the required information
    And User click on save button
    Then User should be able to create an account
