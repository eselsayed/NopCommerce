 Feature: F01_Register | users could register with new accounts
   @smoke
  Scenario: guest user could register with valid data successfully
    Given     user go to register page
    And       user select gender type "female"
    And       user enter first name "automation" and last name "tester"
    And       user enter date of birth "21" "June" "2000"
    And       user enter email "test1@example.com" field
    And       user fills Password fields "P@ssw0rd"
    When      user clicks on register button
    Then      success message is displayed