Feature:
  Scenario: LAMARAs Amazon Log In
    Given  I am at Amazon home page
    When   I click on the signin button
    And    I enter my  correct email
    Then   I click on continue button
    And    I enter my pass word
    Then   I click on the login button I should load in the my Amazon account
  
Scenario: LAMARAs Automate 'Amazon Best Sellers' Functionality
  Given  I am at Amazon home page
  When   I click on the Best Sellers button
  Then   I can verify Best Sellers Url
#  
#Scenario: LAMARAs Automates 'Books' Functionality
#  Given  I am at Amazon home page
#  When   I click on the Best Sellers button
#  And i Click on Books
#  Then I Verify Books Url
#  
#  Scenario: LAMARAs choose the best Book in 'Best Sellers in Books'
#  Given  I am at Amazon home page
#  When   I click on the Best Sellers button
#  Then   I can verify Best Sellers Url
#  When   I click on the Best Sellers button
#  And i Click on Books
#    Then I can chose the best book
#  
#  Scenario: LAMARAs Select PaperBack Format for the best book
#    Given  I am at Amazon home page
#    When   I click on the Best Sellers button
#    Then   I can verify Best Sellers Url
#    When   I click on the Best Sellers button
#    And i Click on Books
#    And I can chose the best book
#    Then I can Select PaperBack Format for the best book
#
#  Scenario:LAMARAs test 'Add To Cart' Functionality
#    Given  I am at Amazon home page
#    When   I click on the Best Sellers button
#    Then   I can verify Best Sellers Url
#    When   I click on the Best Sellers button
#    And i Click on Books
#    And I can chose the best book
#    And I can Select PaperBack Format for the best book
#    Then I can Add my Book To the shopping Cart
#
#  Scenario:LAMARAs 'Create List'
#    Given  I am at Amazon home page
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