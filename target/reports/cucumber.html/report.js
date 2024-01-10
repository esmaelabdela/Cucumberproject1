$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("classpath:features/AddNewAccount.feature");
formatter.feature({
  "name": "Add new account page fanctionality validation",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@AddAccountFeature"
    },
    {
      "name": "@Regression"
    }
  ]
});
formatter.scenarioOutline({
  "name": "User should be able to add a new account with valid credencial",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@AddAcountScenario"
    }
  ]
});
formatter.step({
  "name": "User is on the codefios login page",
  "keyword": "Given "
});
formatter.step({
  "name": "User enter the userName as \"\u003cusername\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "User enter the password as \"\u003cpassword\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "User click on sign in button",
  "keyword": "And "
});
formatter.step({
  "name": "User should be able to land dashBoard page",
  "keyword": "Then "
});
formatter.step({
  "name": "User click on list accounts",
  "keyword": "When "
});
formatter.step({
  "name": "User should be able to land on list account page",
  "keyword": "Then "
});
formatter.step({
  "name": "User click on add account",
  "keyword": "When "
});
formatter.step({
  "name": "User enter the account name as \"\u003caccountname\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "User enter the descriptin as \"\u003cdescription\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "User entert the initial balance as \"\u003cinitialbalance\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "User enter the account number as \"\u003caccountnumber\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "User enter the contact person as \"\u003ccontactperson\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "User click on save button",
  "keyword": "And "
});
formatter.step({
  "name": "User should be able to create an account",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "username",
        "password",
        "accountname",
        "description",
        "initialbalance",
        "accountnumber",
        "contactperson"
      ]
    },
    {
      "cells": [
        "demo2@codefios.com",
        "abc123",
        "ESMAEL account",
        "New bank account",
        "2000",
        "123456654321",
        "Yusra"
      ]
    }
  ]
});
formatter.scenario({
  "name": "User should be able to add a new account with valid credencial",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@AddAccountFeature"
    },
    {
      "name": "@Regression"
    },
    {
      "name": "@AddAcountScenario"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User is on the codefios login page",
  "keyword": "Given "
});
formatter.match({
  "location": "steps.StepDefinition.user_is_on_the_techfios_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enter the userName as \"demo2@codefios.com\"",
  "keyword": "When "
});
formatter.match({
  "location": "steps.StepDefinition.userEnterTheUserNameAs(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enter the password as \"abc123\"",
  "keyword": "When "
});
formatter.match({
  "location": "steps.StepDefinition.user_enter_the_password_as(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User click on sign in button",
  "keyword": "And "
});
formatter.match({
  "location": "steps.StepDefinition.user_click_on_sign_in_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should be able to land dashBoard page",
  "keyword": "Then "
});
formatter.match({
  "location": "steps.StepDefinition.user_should_be_able_to_land_dashBoard_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User click on list accounts",
  "keyword": "When "
});
formatter.match({
  "location": "steps.StepDefinition.user_click_on_list_accounts()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should be able to land on list account page",
  "keyword": "Then "
});
formatter.match({
  "location": "steps.StepDefinition.user_should_be_able_to_land_on_list_account_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User click on add account",
  "keyword": "When "
});
formatter.match({
  "location": "steps.StepDefinition.user_click_on_add_account()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enter the account name as \"ESMAEL account\"",
  "keyword": "When "
});
formatter.match({
  "location": "steps.StepDefinition.user_enter_the_account_name(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enter the descriptin as \"New bank account\"",
  "keyword": "When "
});
formatter.match({
  "location": "steps.StepDefinition.user_enter_the_descriptin(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User entert the initial balance as \"2000\"",
  "keyword": "When "
});
formatter.match({
  "location": "steps.StepDefinition.user_entert_the_initial_balance(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enter the account number as \"123456654321\"",
  "keyword": "When "
});
formatter.match({
  "location": "steps.StepDefinition.user_enter_the_account_number(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enter the contact person as \"Yusra\"",
  "keyword": "When "
});
formatter.match({
  "location": "steps.StepDefinition.user_enter_the_contact_person(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User click on save button",
  "keyword": "And "
});
formatter.match({
  "location": "steps.StepDefinition.user_click_on_save_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should be able to create an account",
  "keyword": "Then "
});
formatter.match({
  "location": "steps.StepDefinition.user_should_be_able_to_create_an_account()"
});
formatter.result({
  "status": "passed"
});
});