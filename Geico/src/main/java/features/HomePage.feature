
Feature:
  Scenario:
    Given  I am at Geico home page
    When   I click on the signin button
    And    I enter my  correct email
    Then   I click on continue button
    And    I enter my pass word
    Then   I click on the login button I should load in the my Amazon account
  Scenario: Geico home page
    Given i am at geico home page
    Then i should get the expected url
  Scenario: Geico home page/insarance/ business/professionnel
    Given i am at geico home page
    Then Then i click on insarance button
    Then with a mouse hover and click on business button
    Then i scroll to professionnel section
  Scenario: Geico home page/informations/get list
    Given i am at geico home page
    Then i click on informations button
    Then  i get list by id
  Scenario: Geico home page/ covid19/get covid19 list
    Given i am at geico home page
    Then i click on covid19 section
    Then   i get a list from the covid19 page
  Scenario: Geico home page/ newCostumer/type
    Given i am at geico home page
    Then i click on newCostumer button
    Then  i type on the box showing
    Then  i should get and write on the case
  Scenario: Geico home page/ make peyement
    Given i am at geico home page
    Then  i click a make peyement
    Then  i click on identification
    Then   i click for second time
    Then i should get case to type my phone number
    Then i get a field to enter a zipcode
  Scenario Outline: Geico home page/ exel
    Given i am at geico home page
    Then  i send a valide  zipcode "<zipCode>"
    Examples:
    zipCode
      |11202|
      |12332|
      |12214|
      |12221|
      |11205|