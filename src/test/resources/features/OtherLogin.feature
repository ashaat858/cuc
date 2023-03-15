#@OtherLoginFeature
#Feature: Other Techfios billing login page functionality validation
#
#
#@OtherSenario1
#Scenario: Other scenario - User should not be able to login with invalid credentials 
#
#Given User is on the techfios login page 
#When User enters username as "demo2@techfios.com"
#When User enters password as "abc123"
#When User clicks on sign in button
#Then User should land on dashboard page
#
#@OtherSenario2 @Smoke
#Scenario: Other scenario - User should not be able to login with invalid credentials 
#
#Given User is on the techfios login page 
#When User enters username as "demo@techfios.com"
#When User enters password as "abcd123"
#When User clicks on sign in button
#Then User should land on dashboard page