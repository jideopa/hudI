@regression
Feature: Login

  Background:
    Given user is on login page

  Scenario: successful login
    When user complete the login form with "valid credential"
    Then user should be sign in

  Scenario: unsuccessful login
    When user complete the login form with "invalid credential"
    Then user should see "We didn't recognize that email and/or password.Need help?" error