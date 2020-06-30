Feature:
  Background:

    Given I am at Amazon home page
  Scenario: login to the Amazon account
    When I click on the signin button
    And I enter my correct email
    Then I click on continue button
    And I enter my pass word
    Then I click on the login button I should load in the my Amazon account


  Scenario: get to the child page
# Given I am at Amazon home page
    When I click on the New releases link
    Then i should get the New releases page


  Scenario: get to the child page
# Given I am at Amazon home page
    When I click on the New releases link
    Then i should get the New releases page

  Scenario: login to amazon

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



  Scenario: get result on the child page
# Given I am at Amazon home page
    When I click on new release link
    And I click on baby link
    Then I should get the New release in baby page

  Scenario: Search for one product
# Given I am at Amazon home page
    When I enter item name in search box
    And I click on search button
    Then I should get the appropriate result page


  Scenario: Search multiple product using Excel sheet
# Given I am at Amazon home page
    When I enter items in search box i should get result

    Scenario: Find gift page
      Given I am at Amazon home page
      Then I click on Find Gift button I should see the page

  Scenario:
    Given I am at Amazon home page
    When I click on Find Gift button I should see the page
    Then I shoud get the expected text

  Scenario:
    Given I am at Amazon home page
    When I click on Find Gift button I should see the page
    And I click on Egift button i should see the page displayed
    Then I click on the WrapIcon it should be selected
    And I click on the Allprices button should scolldown
    Then I should get the expected title



    Scenario:
      Given I am at Amazon home page
      When I click on Find Gift button I should see the page
      And I click on Women Page i should see the page displayed
      When I click on the Gender button should dropdown the menu
      Then I click on the AgeGroup button should dropdown the menu
      And I click on Allprices button the menu should drop down
      Then the Women page should scrolldown to the end of the page


   Scenario:
      Given I am at Amazon home page
      When I click on Find Gift button I should see the page
      Then I click on Preschooler the page should display properly
      And the Preschooler Page should scrolldown to view FreightTrain
     Then I click on FreightTrain the page should Display properly

   Scenario:
      Given I am at Amazon home page
      When I click on Find Gift button I should see the page
      Then I click on Preschooler the page should display properly
      And I click on Play Dol

  Scenario:
    Given I am at Amazon home page
    When I click on Find Gift button I should see the page
    Then I click on Preschooler the page should display properly
    And I click on Play Dol
    Then I click on the Play Dol Add To The Card should Add it properly

  Scenario: Search multiple product using Excel sheet
# Given I am at Amazon home page
    When I enter items in search box i should get result