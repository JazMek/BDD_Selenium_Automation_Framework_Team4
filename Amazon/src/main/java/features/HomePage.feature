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
    When I click on the New releases link
    Then i should get the New releases page


  Scenario: get to the child page
    When I click on the New releases link
    Then i should get the New releases page

    Scenario: LAMARAs Amazon Log In
    When   I click on the signin button
    And    I enter my  correct email
    Then   I click on continue button
    And    I enter my pass word
    Then   I click on the login button I should load in the my Amazon account
  Scenario: 02-get to the child page
    When   I click on the New releases link
    Then  i should get the New releases page

  Scenario: 03-get result on the child page
    When   I click on new release link
    And    I click on baby link
    Then   I should get the New release in baby page

  Scenario: 04-Search for one product
    When   I enter item name in search box
    And    I click on search button
    Then   I should get the appropriate result page

  Scenario: 05- Search multiple product using Excel sheet
    When   I enter items in search box i should get result

  Scenario: get result on the child page
    When I click on new release link
    And I click on baby link
    Then I should get the New release in baby page

  Scenario: Search for one product
    When I enter item name in search box
    And I click on search button
    Then I should get the appropriate result page

  Scenario: Search multiple product using Excel sheet
    When I enter items in search box i should get result

    Scenario: Find gift page
      Then I click on Find Gift button I should see the page

  Scenario:
    When I click on Find Gift button I should see the page
    Then I shoud get the expected text

  Scenario:
    When I click on Find Gift button I should see the page
    And I click on Egift button i should see the page displayed
    Then I click on the WrapIcon it should be selected
    And I click on the Allprices button should scolldown
    Then I should get the expected title

    Scenario:
      When I click on Find Gift button I should see the page
      And I click on Women Page i should see the page displayed
      When I click on the Gender button should dropdown the menu
      Then I click on the AgeGroup button should dropdown the menu
      And I click on Allprices button the menu should drop down
      Then the Women page should scrolldown to the end of the page

   Scenario:
      When I click on Find Gift button I should see the page
      Then I click on Preschooler the page should display properly
      And the Preschooler Page should scrolldown to view FreightTrain
     Then I click on FreightTrain the page should Display properly

   Scenario:
      When I click on Find Gift button I should see the page
      Then I click on Preschooler the page should display properly
      And I click on Play Dol

  Scenario:
    When I click on Find Gift button I should see the page
    Then I click on Preschooler the page should display properly
    And I click on Play Dol
    Then I click on the Play Dol Add To The Card should Add it properly

  Scenario: Search multiple product using Excel sheet
    When I enter items in search box i should get result
Scenario: LAMARAs Automate 'Amazon Best Sellers' Functionality
  When   I click on the Best Sellers button
  Then   I can verify Best Sellers Url

#Scenario: LAMARAs Automates 'Books' Functionality
#  When   I click on the Best Sellers button
#  And i Click on Books
#  Then I Verify Books Url
#  
#  Scenario: LAMARAs choose the best Book in 'Best Sellers in Books'
#  When   I click on the Best Sellers button
#  Then   I can verify Best Sellers Url
#  When   I click on the Best Sellers button
#  And i Click on Books
#    Then I can chose the best book
#  
#  Scenario: LAMARAs Select PaperBack Format for the best book
#    When   I click on the Best Sellers button
#    Then   I can verify Best Sellers Url
#    When   I click on the Best Sellers button
#    And i Click on Books
#    And I can chose the best book
#    Then I can Select PaperBack Format for the best book
#
#  Scenario:LAMARAs test 'Add To Cart' Functionality
#    When   I click on the Best Sellers button
#    Then   I can verify Best Sellers Url
#    When   I click on the Best Sellers button
#    And i Click on Books
#    And I can chose the best book
#    And I can Select PaperBack Format for the best book
#    Then I can Add my Book To the shopping Cart
#
#  Scenario:LAMARAs 'Create List'
#Feature: Product Search on Amazon searchBox
#  As a customer i want to search product on Amazon site to purchase.
#  
#  @smokeTest
#  Scenario:LAMARAs
#    And I Enter Hand sanitizer in search input field
#    When I click search button
#    Then I should see Hand sanitizer
#
##  @smokeTest
#  Scenario: LAMARAs
#    And I Enter Hand sanitizer in search input field
#    When I click search button
#    Then I should see Hand sanitizer
#
#  @Regression
#  Scenario: LAMARAs
#    And I Enter Hand sanitizer in search input field
#    When I click search button
#    Then I should see Hand sanitizer
#
#  #@pending
#  Scenario: LAMARAs
#    And I Enter Hand sanitizer in search input field
#    When I click search button
#    Then I should see Hand sanitizer
#
#
#  @smokeTest
#  Scenario: LAMARAs
#    And I Enter <product> in search input field
#    When I click search button
#    Then I should see Hand sanitizer