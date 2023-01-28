@regression
Feature: Login

  Scenario: successful login feature
    Given user is on login page
    When user is complete the login form with valid data
    Then user should be sign in