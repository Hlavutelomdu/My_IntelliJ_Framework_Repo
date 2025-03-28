Feature: Testing Login functionality of SalesForce

  Scenario: Login With valid credentials
    When Navigate to Service territory
    When Click New button
    And Enter Name
    And select operating hours
    And click active field
    And Enter State
    And Enter Country
    And Enter Postal Zip Code
    And Click save button
    Then Verify if the territory is created