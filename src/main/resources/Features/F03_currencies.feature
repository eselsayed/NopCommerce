@smoke
Feature: Currencies Feature
Scenario: Check products currency when switch currency to Euro
  Given user navigates to home page
  When  user choose "Euro" currency
  Then displayed products with "€" symbol