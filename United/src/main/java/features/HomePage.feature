
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

