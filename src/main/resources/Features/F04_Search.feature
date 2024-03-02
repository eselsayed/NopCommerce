@smoke
Feature: F014_Search | users could search for a product

 Scenario Outline: User could search by the product name
    Given user go to search box and enter "<productName>"
    And User click on search Button
    When Go to search page
    Then Count number of search and verify each result contains the "<productName>"

    Examples:
      |     productName         |
      |     laptop              |
      |      book               |
      |       nike              |


  Scenario Outline: User could search by the product Serial Number
    Given user go to search box and enter "<productSerialNumber>"
    And User click on search Button
    When Go to search page
    Then User click on product Result
    Then make sure That product result contains the same "<productSerialNumber>"

    Examples:
      |    productSerialNumber  |
      |    SCI_FAITH            |
      |    APPLE_CAM            |
      |    SF_PRO_11            |


