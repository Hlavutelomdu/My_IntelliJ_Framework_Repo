Feature: Testing Login functionality of SalesForce

  Scenario: Login With valid credentials
    When Enter Username
    And Enter Password
    And Click login button
    Then verify successful login