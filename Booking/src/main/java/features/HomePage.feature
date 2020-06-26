
Feature:
  Scenario:
    Given  I am at Booking home page
    When   I click on the signin button
    And    I enter my  correct email
    Then   I click on continue button
    And    I enter my pass word
    Then   I click on the login button I should load in the my Amazon account

  Scenario:
    Given  I am at Booking home page
    Then I should get the expected title

  Scenario:
    Given  I am at Booking home page
    Then I should get the expected text

  Scenario:
    Given  I am at Booking home page
    When  I click on Flights button the page should display properly
    And the page should wait for 5 seconds
    Then it should get clean up


  Scenario:
    Given  I am at Booking home page
    When  I click on Flights button the page should display properly
    And I click on round trip button it should get selected
    And the page should wait for 5 seconds
    Then it should get clean up

  Scenario:
    Given  I am at Booking home page
    When  I click on Flights button the page should display properly
    And I click on One Way Button it should get selected
    And the page should wait for 5 seconds
    Then it should get clean up





