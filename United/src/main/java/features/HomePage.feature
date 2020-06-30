
Feature: 

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
    When I should check broken links

  Scenario: 03- get all page links
    When I should get all page links

  Scenario:
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
#  Scenario:
#    When   I click on the Book button the Page should land properly
#    And    I click on Route Map button the Map page should land properly
#    Then   I click on Maximise button the Map page should maximise
#    When   I click 5 times on zoom in button is should zoom
#    And    I click on the Zoom out button it should zoom out
#    Then   I click again on maximise button the page should minimise

  Scenario:
    When   I click on the Book button the Page should land properly
    And    I click on Route Map button the Map page should land properly
    Then   I Type "NY" destination in a search box the it should show it out in the map
    When   I Click on the search button should look for the destination
    And    I select the second destination "chicago" it should link it to the first one

  Scenario:
    Given  I am at United page
    When   I click on the signin button
    And    I enter my  correct email
    Then   I click on continue button
    And    I enter my pass word
    Then   I click on the login button I should log in the my United account
