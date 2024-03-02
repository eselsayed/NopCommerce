Feature: F02_Login | users could use login functionality to use their accounts
  @smoke
  Scenario: user could login with valid email and password
  Given     user go to login page
  And       user login with valid email "test1@example.com" and "P@ssw0rd"
  When      user press on login button
  Then      user login to the system successfully

  @smoke
  Scenario: user could login with invalid email and password
  Given     user go to login page
  And       user login with invalid "wrong@example.com" and "P@ssw0rd"
  When      user press on login button
  Then      user could not login to the system