Feature: verify Robot Manager webpage functionality
Scenario: Login
Given user navigates to RobotManager
When  user enters correct email address
And  User enters correct password
And  User click on "Login" button
Then User should see "My Account"