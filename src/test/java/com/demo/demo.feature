@smoke
Feature: User Login

  Background:
    Given the user is on the login page
    And the user has valid credentials

  @loginTest
  Scenario: User logs in with valid credentials
    When the user enters their username and password
    And they click the "Login" button
    Then they should be redirected to the homepage
    And they should see a welcome message

  @errorHandling
  Scenario Outline: User logs in with invalid credentials
    Given the user is on the login page
    When the user enters "<username>" and "<password>"
    Then they should see an error message

    Examples:
      | username | password   |
      | user1    | wrongpass  |
      | user2    | 1234       |

  @validation
  Scenario: User cannot login with empty credentials
    Given the user is on the login page
    When the user leaves both username and password fields empty
    Then they should see a validation message that says "Please enter both username and password"
