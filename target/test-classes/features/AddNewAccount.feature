@AddNewAccountFeature @Regression
Feature: Add new account page fanctionality validation

@AddAcountScenario 
Scenario Outline: User should be able to add a new account with valid credencial
Given User is on the codefios login page
When User enter the userName as "<username>"
When User enter the password as "<password>"
And User click on sign in button
Then User should be able to land on dashboard page
When User click on list accounts
Then User should be able to land on list account page
When User click on add account
When User fill all the required information
When User enter the account name as "<accountname>"
When User enter the descriptin as "<description>"
When User entert the initial balance as "<initialbalance>"
When User enter the account number as "<accountnumber>"
When User enter the contact person as "<contactperson>"
And  User click on save button
Then User should be able to create an account

Examples:
|username|password|accountname|description|initialbalance|accountnumber|contactperson|
|demo1@codefios.com|abc123|ESMAEL account|New bank account|2000|123456654321 |Yusra|

