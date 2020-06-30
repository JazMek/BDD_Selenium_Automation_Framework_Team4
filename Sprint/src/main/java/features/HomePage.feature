

Feature: Search Multiple product

  Background:
    Given I am at Sprint Home Page

 Scenario Outline:01- Search multiple product
    When I click search button
    And I Enter "<product>" in search input field
    When I click search button
    Then I should see "<ExpectedResult>"

    Examples:
      |product|ExpectedResult|
      |galaxy 7| "galaxy 7" |
      |I phone 11 pro|  "I phone 11 pro" |
      |Nokia phone|     "Nokia phone"   |
      |iphone 8 plus|    "iphone 8 plus"  |
      |phone case|  "phone case"   |

 Scenario: 02- check the broken links
  Given I am at sprint home page
  When I should check broken links

 Scenario: 03- get all page links
  Given I am at sprint home page
  When I should get all page links

 Scenario: 04- search for set of items using MySQl
   When : i enter item in search field i see result

Feature:
  Scenario:
#    Given  I am at Amazon home page
#    When   I click on the signin button
#    And    I enter my  correct email
#    Then   I click on continue button
#    And    I enter my pass word
#    Then   I click on the login button I should load in the my Amazon account


