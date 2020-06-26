Feature:
  Background:
    Given  I am at Amazon home page

  Scenario: 01-login to the Amazon account
    When   I click on the signin button
    And    I enter my  correct email
    Then   I click on continue button
    And    I enter my pass word
    Then   I click on the login button I should load in the my Amazon account

  Scenario: 02-get to the child page
   # Given  I am at Amazon home page
    When   I click on the New releases link
    Then  i should get the New releases page

  Scenario: 03-get result on the child page
   # Given  I am at Amazon home page
    When   I click on new release link
    And    I click on baby link
    Then   I should get the New release in baby page

  Scenario: 04-Search for one product
   # Given  I am at Amazon home page
    When   I enter item name in search box
    And    I click on search button
    Then   I should get the appropriate result page

  Scenario: 05- Search multiple product using Excel sheet
   # Given  I am at Amazon home page
    When   I enter items in search box i should get result

