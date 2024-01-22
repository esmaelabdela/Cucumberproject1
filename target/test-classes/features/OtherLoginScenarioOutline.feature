@OtherLoginFeature @Regression
Feature: Other page fanctionality validation

Background:
Given User is on the codefios login page

@OtherScenario1 @Smoke
Scenario Outline: User should not be able to login with valid credencial
When User enter the userName as "<username>"
When User enter the password as "<password>"
And User click on sign in button
Then User should be able to land on dashboard page
Examples:
|username|password|
|demo@codefios.com|abc123|
|demo1@codefios.com|abc128|
|demo2@codefios.com|abc124|
|                  |      |









