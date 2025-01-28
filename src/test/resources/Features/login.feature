Feature: Login page automation of saucedemo app

Scenario Outline: Check login is successful with valid creds
Given User is on the login page
When User enters valid "<username>" and "<password>"
And Clicks on the login button
Then User should be navigated to home page
And Close the browser

Examples:
| username | password |
| standard_user | secret_sauce |
| locked_out_user | secret_sauce |
| problem_user | secret_sauce |
| performance_glitch_user | secret_sauce|

#website: https://www.saucedemo.com/v1/