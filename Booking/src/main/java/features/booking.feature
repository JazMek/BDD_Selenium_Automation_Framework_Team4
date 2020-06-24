Feature:
  Scenario:login to booking
    Given i am at booking page
    Then I click on signing button
    Then I enter my email on next button
    And I click on continue/next
    Then  i enter my passeword
    Then i click on log in i should log in

  Scenario:get the title
    Given i am at booking page
    Then i should get the title
  Scenario:get the text
     Given i am at booking page
    Then i should get the same text

  Scenario:get the text
    Given i am at booking page
    Then i click on car rental
    And i click on checkbox
    Then i type on it
    Then i should get the page title


  Scenario:test logo
    Given i am at booking page
    Then i should the logo of booking in the page

   Scenario:taxi page
   Given i am at booking page
     Then i click on taxi button a
     Then i should see the page opload

  Scenario:taxi page
      Given i am at booking page
      Then i click on taxi button a
    Then i click on one way button

  Scenario:flights page
    Given i am at booking page
    Then i should click and explore the flights page

  Scenario:flights page/one way
    Given i am at booking page
    Then i should click and explore the flights page
    Then i click on one way flight

  Scenario:flights page/multi destination
    Given i am at booking page
    Then i should click and explore the flights page
    Then i click on multi destination flight

  Scenario:flights page/pick destination
    Given i am at booking page
    Then i should click and explore the flights page
    Then i put the depart from to
