@OtherLoginFeature @Regression
Feature: TechFios Other Login Functionality validation

Background:
Given User is on Techfios login page


@OtherScenario1
Scenario Outline: 1 User should be able to login with valid credentials (Other)
When User enters username as "<username>"
When User enters password as "<password>"
When User clicks signin button
Then User should land on dashboard page

Examples:
|username|password|
|demo2@techfios.com|abc123|
|demo@techfios.com|abc124|
|demo2@techfios.com|abc124|







#@OtherScenario2 @Smoke
#Scenario:2 User should not be able to login with invalid credentials (Other)
#When User enters username as "demo@techfios.com"
#When User enters password as "abc124"
#When User clicks signin button
#Then User should land on dashboard page

#@OtherScenario2 @Smoke
#Scenario:3 User should not be able to login with invalid credentials (Other)
#When User enters username as "demo2@techfios.com"
#When User enters password as "abc124"
#When User clicks signin button
#Then User should land on dashboard page