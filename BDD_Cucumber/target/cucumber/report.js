$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("features/TechFiosLoginUseDataFromDatabase.feature");
formatter.feature({
  "line": 2,
  "name": "TechFios Billing Login Functionality validation",
  "description": "",
  "id": "techfios-billing-login-functionality-validation",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@DbLoginFeature"
    },
    {
      "line": 1,
      "name": "@Regression"
    }
  ]
});
formatter.before({
  "duration": 5103823500,
  "status": "passed"
});
formatter.scenario({
  "line": 6,
  "name": "1 User should be able to login with valid credentials",
  "description": "",
  "id": "techfios-billing-login-functionality-validation;1-user-should-be-able-to-login-with-valid-credentials",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 5,
      "name": "@DbScenario1"
    },
    {
      "line": 5,
      "name": "@Smoke"
    }
  ]
});
formatter.step({
  "line": 7,
  "name": "User is on Techfios login page",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "User enters \"username\" from Techfios database",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "User enters \"password\" from Techfios database",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "User clicks signin button",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "User should land on dashboard page",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStepDefinition.user_is_on_techfios_login_page()"
});
formatter.result({
  "duration": 1327356800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "username",
      "offset": 13
    }
  ],
  "location": "LoginStepDefinition.user_enters_from_Techfios_database(String)"
});
formatter.result({
  "duration": 1824100,
  "error_message": "java.lang.Error: Unresolved compilation problem: \n\tCannot switch on a value of type String for source level below 1.7. Only convertible int values or enum variables are permitted\n\r\n\tat steps.LoginStepDefinition.user_enters_from_Techfios_database(LoginStepDefinition.java:89)\r\n\tat ✽.When User enters \"username\" from Techfios database(features/TechFiosLoginUseDataFromDatabase.feature:8)\r\n",
  "status": "failed"
});
formatter.match({
  "arguments": [
    {
      "val": "password",
      "offset": 13
    }
  ],
  "location": "LoginStepDefinition.user_enters_from_Techfios_database(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "LoginStepDefinition.user_clicks_signin_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "LoginStepDefinition.user_should_land_on_dashboard_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "duration": 1198959400,
  "status": "passed"
});
});