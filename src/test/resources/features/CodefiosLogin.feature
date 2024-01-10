@codefiosLoginFeature @Regression @Smoke
Feature: Codefios login page fanctionality validation

Background:
Given User is on the codefios login page
When User enter the userName as "demo2@codefios.com"

@LoginScenario1  @Smoke
Scenario: User should be able to login with valid credencial
When User enter the password as "abc123"
And User click on sign in button
Then User should be able to land dashBoard page

@LoginScenario2 @sanity
Scenario: User should not be able to login with invalid credencial
When User enter the password as "abc128"
And User click on sign in button
Then User should be able to land dashBoard page
