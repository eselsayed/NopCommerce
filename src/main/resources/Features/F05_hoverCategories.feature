Feature:F05_Hover | users hover on one of main categories then click on sub category
  Scenario: user can hover on one of main categories then click on sub category
    Given  user select random one of the three main categories and hover on it
    When   user select random one of the three sub categories
    And    Get the text of sub category page
    Then   verify that sub-category title is the same