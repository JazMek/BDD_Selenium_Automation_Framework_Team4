
Feature:
  Scenario:
#    Given  I am at Amazon home page
#    When   I click on the signin button
#    And    I enter my  correct email
#    Then   I click on continue button
#    And    I enter my pass word
#    Then   I click on the login button I should load in the my Amazon account
    Given  I am at TD_Bank home page
    When   I click on the InvestingAndWealth button the page should land properly
    Then   The InvestingAndWealth Page should scrolldown to the end

  Scenario:
    Given  I am at TD_Bank home page
    When   I click on the InvestingAndWealth button the page should land properly
    Then   I hover mouse on IndividualsAndFamilies button it should change a color
    And    I click on IndividualsAndFamilies button the page should land properly
    Then   I will type on the question "one million dollar" it should be typeable
    When   I clear up the box it should clear
    And    I will type again a other work it should be typeable
    Then   I will click on the search button it should activate the search

  Scenario:
    Given  I am at TD_Bank home page
    When   I click on the InvestingAndWealth button the page should land properly
    Then   I hover mouse on BusinessOwners button it should change a color
    And    I click on BusinessOwners button the page should land properly
    Then   I the BusinessOwners page should scrolldown to view element "Top" Button
    When   I click on Top button the page should scrollUp

  Scenario:
    Given  I am at TD_Bank home page
    When   I click on the InvestingAndWealth button the page should land properly
    And    I hover mouse on RetirementPlanning button it should change a color
    Then   I click on RetirementPlanning The page should land properly

  Scenario:
    Given  I am at TD_Bank home page
    When   I click on the InvestingAndWealth button the page should land properly
    And    I hover mouse on RetirementPlanning button it should change a color
    Then   I click on RetirementPlanning The page should land properly
    And    I click on the Video should display properly
    Then   I cklick on video close button should close

  Scenario:
    Given  I am at TD_Bank home page
    When   I click on the InvestingAndWealth button the page should land properly
    And    I hover mouse on TdAmeritrade button it should change a color
    When   I click on TdAmeritrade button the page should land properly
    And    The page should scroll To view element Special Offer Details Display Button
    Then   I click on Special Offer Details DisplayButton the page should land properly


  Scenario: tdbank/products
    Given i am at tdBank home page
    Then  with mouse hover i should explore the products page

  Scenario: tdbank/products/Checking
    Given i am at tdBank home page
    Then  with mouse hover i should explore the products page
    Then i click on Checking i should see the page

  Scenario: tdbank/products/Savings
    Given i am at tdBank home page
    Then  with mouse hover i should explore the products page
    Then i click on Savings i should see the page

  Scenario: tdbank/products/CDs
    Given i am at tdBank home page
    Then  with mouse hover i should explore the products page
    Then i click on CDs i should see the page

  Scenario: tdbank/products/CreditCards
    Given i am at tdBank home page
    Then  with mouse hover i should explore the products page
    Then i click on CreditCards i should see the page

  Scenario: tdbank/products/HomeEquityLoansLines
    Given i am at tdBank home page
    Then  with mouse hover i should explore the products page
    Then i click on HomeEquityLoansLines i should see the page

  Scenario: tdbank/products/Mortgage
    Given i am at tdBank home page
    Then  with mouse hover i should explore the products page
    Then i click on Mortgage i should see the page

  Scenario: tdbank/products/PersonalLoans()
    Given i am at tdBank home page
    Then  with mouse hover i should explore the products page
    Then i click on PersonalLoans i should see the page

  Scenario: tdbank/products/IRAsXP
    Given i am at tdBank home page
    Then  with mouse hover i should explore the products page
    Then i click on IRAsXP i should see the page

  Scenario: tdbank/products/PrepaidCards
    Given i am at tdBank home page
    Then  with mouse hover i should explore the products page
    Then i click on PrepaidCards i should see the page

  Scenario: tdbank/products/SpecialOffers
    Given i am at tdBank home page
    Then  with mouse hover i should explore the products page
    Then i click on SpecialOffers i should see the page