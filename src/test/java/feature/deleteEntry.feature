Feature: Delete Entry

@SmokeTest
Scenario Outline: Verify User Entry
Given Navigate to url
When Login using valid Credentials provided
And Validate you're logged in by verifying Welcome Admin
Then  Click on ADMIN to navigate to the page       
And Search for "<user>" within the table and capture the value
Then Logout

Examples:
|user|
|john.smith|