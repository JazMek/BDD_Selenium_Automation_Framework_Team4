
Feature:
  Background:
    Given  I am at netflix home page

  Scenario: 01- check the Netflix links
    Given I am at netflix home page
    When I should check broken links

  Scenario: 02- get all Netflix page links
    Given I am at netflix home page
    When I should get all page links

  Scenario: 03- login to netflix account
   # Given  I am at netflix home page
    Then I click on sign in Button
     And I enter user name in userNameField
     And I enter password in the  passWordField
  When i click on signin button i login my account


Feature:
  Scenario:
    Given  I am at netflix home page
    When   I click on the signin button
    And    I enter my  correct email "email"
    And    I enter my pass word "password"
    Then   I click on the scond signin button




