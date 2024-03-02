@smoke
Feature: homeSliders
  Scenario: first slider is clickable on home page
    Given  user navigates to home page
    When   user clicks on first slider
    Then   user goes to the expected url "https://demo.nopcommerce.com/nokia-lumia-1020"

  Scenario: Second slider is clickable on home page
    Given  user navigates to home page
    When   user clicks on Second slider
    Then   user goes to the expected url "https://demo.nopcommerce.com/iphone-6"