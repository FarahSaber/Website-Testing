@smoke
Feature: F03_Currencies | Verify currencies changes to the products in the home page

  Scenario: Verify that Euro currency is existing in all products
    When  User selects Euro Currency
    Then Euro Symbol € should exist on all products
