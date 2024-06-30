@smoke
Feature: Fo4_Search | Verify search functionality is working
  Scenario Outline:  user could search using product name
    When User enter product name "<ProductName>"
    Then All products contains "<ProductName>" appear in search
    Examples:
      | ProductName |
      | laptop |
      | nike   |


  Scenario Outline:  user could search using product sku
    When User enter product sku "<ProductSku>"
    Then All products contains Sku "<ProductSku>" appear in search
    Examples:
      | ProductSku |
      |  SCI_FAITH |
      |  APPLE_CAM |
      |  SF_PRO_11 |



