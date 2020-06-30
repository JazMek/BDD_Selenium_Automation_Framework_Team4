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
    When I should get all page links

  Scenario: 04- register to booking account
    When I click on the register button
    Then I click on signUp button
    And I put my correct email
    Then I click on next button
    And I enter password data in text box
    Then I reenter password data in text box
    When i should create a new account by clicking enter button

 Background:
  Scenario: 01- login to the Booking account
    When   I click on the signin button
    And    I enter my  correct email
    Then   I click on next button button
    And    I enter my pass word
    Then   I click on the login button I should load in my booking account

Scenario: 02- check the brooken links
   When I should check broken links

Scenario: 03- get all page links
  When I should get all page links

Scenario: 04- register to booking account
    When   I click on the register button
    Then    I click on signUp button
    And    I put my  correct email
    Then   I click on next button
    And    I enter password data in text box
    Then  I reenter password data in text box
    When i should create a new account by clicking enter button

  Scenario:
#    Given  I am at Amazon home page
#    When   I click on the signin button
#    And    I enter my  correct email
#    Then   I click on continue button
#    And    I enter my pass word
#    Then   I click on the login button I should load in the my Amazon account
  Scenario:
    When   I click on the signin button
    And    I enter my  correct email
    Then   I click on continue button
    And    I enter my pass word
    Then   I click on the login button I should load in the my Amazon account

  Scenario:
    Then I should get the expected title

  Scenario:
    Then I should get the expected text

  Scenario:
    When  I click on Flights button the page should display properly
    And the page should wait for 5 seconds
    Then it should get clean up

  Scenario:
    When  I click on Flights button the page should display properly
    And I click on round trip button it should get selected
    And the page should wait for 5 seconds
    Then it should get clean up

  Scenario:
    When  I click on Flights button the page should display properly
    And I click on One Way Button it should get selected
    And the page should wait for 5 seconds
    Then it should get clean up