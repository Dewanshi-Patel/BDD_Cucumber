@LoginFeature @Regression
Feature: TechFios Billing Login Functionality validation


@Scenario1 @Smoke
Scenario: 1 User should be able to login with valid credentials
Given User is on Techfios login page
When User enters username as "demo@techfios.com"
When User enters password as "abc123"
When User clicks signin button
Then User should land on dashboard page

@Scenario2
Scenario:2 User should not be able to login with invalid credentials
Given User is on Techfios login page
When User enters "username"
When User enters "password"
When User clicks signin button
Then User should land on dashboard page