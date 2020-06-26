
Feature:
#  Scenario:
#    Given  I am at united home page
#    When   I click on the Book button the Page should land properly
#    And    I click on Route Map button the Map page should land properly
#    Then   I click on Maximise button the Map page should maximise
#    When   I click 5 times on zoom in button is should zoom
#    And    I click on the Zoom out button it should zoom out
#    Then   I click again on maximise button the page should minimise


  Scenario:
    Given  I am at united home page
    When   I click on the Book button the Page should land properly
    And    I click on Route Map button the Map page should land properly
    Then   I Type "NY" destination in a search box the it should show it out in the map
    When   I Click on the search button should look for the destination
    And    I select the second destination "chicago" it should link it to the first one


