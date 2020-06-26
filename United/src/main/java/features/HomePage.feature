

Feature: Search Multiple flight

  Background:
    Given I am at United airlines Home Page

  Scenario Outline:01- Search for flights
    When I click one way check box
    And I click link
    And I clear text box
    Then I Enter "<from>" in search input field
    And I enter "<destinationTo>"
    When I click Find Flight Button
    Then I should see result

    Examples:
      |from|destinationTo|
      |New York/Newark EWR | Algiers A |
      |Miami MFL           |    Paris CDG|

  Scenario: 02- check the broken links
    Given I am at United airlines Home Page
    When I should check broken links

  Scenario: 03- get all page links
    Given I am at United airlines Home Page
    When I should get all page links

Feature:
  Scenario:
#    Given  I am at Amazon home page
#    When   I click on the signin button
#    And    I enter my  correct email
#    Then   I click on continue button
#    And    I enter my pass word
#    Then   I click on the login button I should load in the my Amazon account



