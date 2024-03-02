@smoke
Feature:
  Scenario: Wishlist a product
    Given user navigates to home page
    When  user clicks on the product wishlist icon
    And   user waits until msg disappear
    Then  success message displayed with green background color


  Scenario: Get Qty Value of product Wishlist
    Given user navigates to home page
    When  user clicks on the product wishlist icon
    And   user waits until msg disappear
    And   user goes to wishlist page
    Then  Verify that Qty value is bigger than one
