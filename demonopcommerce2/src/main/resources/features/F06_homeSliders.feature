@smoke
Feature: F06_HomeSliders| Verify HomeSliders are clickable on home page

  Scenario: Verify that First slider "Galaxy" is clickable and navigate to the product
    When User select on First Slider home page
    And  User click on First selected slider
    Then User should be directed to First product link

  Scenario: Verify that Second slider "Iphone" is clickable and navigate to the product
    When User select on Second Slider home page
    And  User click on Second selected slider
    Then User should be directed to Second product link