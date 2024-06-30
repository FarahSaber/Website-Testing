@smoke
Feature: F05_HoverCategories | Verify Hover functionality

  Scenario: Verify hover functionality and select sub-category randomly of three main categories
    When User selects randomly from three main category
    And  User hovers and select randomly from sub main categories
    Then User should be redirected to new sub-category page
