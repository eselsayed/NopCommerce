@smoke
Feature:
  Scenario:   user opens facebook link
    Given  user navigates to home page
    And    user clicks on facebook icon
    When   user goes to the expected url "https://www.facebook.com/nopCommerce"
    Then   user close current tab and get back to homePage

  Scenario:   user opens twitter link
    Given  user navigates to home page
    And    user clicks on twitter icon
    When   user goes to the expected url "https://twitter.com/nopCommerce"
    Then   user close current tab and get back to homePage


  Scenario:   user opens Rss link
    Given  user navigates to home page
    And    user clicks on rss icon
    When   user goes to the expected url "https://demo.nopcommerce.com/new-online-store-is-open"
    Then   user close current tab and get return to homePage


  Scenario:   user opens Youtube link
    Given  user navigates to home page
    And    user clicks on youtube icon
    When   user goes to the expected url "https://www.youtube.com/user/nopCommerce"
    Then   user close current tab and get back to homePage