@smoke
Feature: F03_currencies | users could choose their desired currency successfully
  Scenario: users could choose their currency successfully
    Given user is on homepage
    When user select Euro currency from dropdown list
    Then Euro Symbol is shown on the products displayed in Home page successfully