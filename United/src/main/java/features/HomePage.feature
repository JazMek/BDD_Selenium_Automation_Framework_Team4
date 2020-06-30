

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
    Given  I am at United home page
    When   I click on the BookLink
    And    I click on the checkBoxOneWay
    And    I click on the FromTextField
    And    I click on the FromTextField_ClearButton
    And    I enter the value "user1" on FromTextField
    And    I enter the value "user1" on ToTextField
    And    I click on DepartDateLink
    And    I click on Month_ClickBtn1
    And    I click on DepartDate
    And    I click on TravelersPassengers
    And    I click on Adults
    And    I click on Seniors
    And    I click on Children
    And    I click on Children
    And    I click on exitButton
    And    I click on Find_flightsButton
    Then   navigate bacward




