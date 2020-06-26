Feature:
  Background:
    Given I am at Booking home page
  Scenario: 01- login to the Booking account
    When I click on the signin button
    And I enter my correct email
    Then I click on next button button
    And I enter my pass word
    Then I click on the login button I should load in my booking account

  Scenario: 02- check the brooken links
    Given I am at Booking home page
    When I should check broken links

  Scenario: 03- get all page links
    Given I am at Booking home page
    When I should get all page links

  Scenario: 04- register to booking account
    When I click on the register button
    Then I click on signUp button
    And I put my correct email
    Then I click on next button
    And I enter password data in text box
    Then I reenter password data in text box
    When i should create a new account by clicking enter button


