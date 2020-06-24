Feature:

    Scenario: deal page
      Given i am at sprint home page
      Then i click on deal button
      Scenario: build your phone page
        Given i am at sprint home page
        Then i click on deal button
        Then i click on show now button
        Then i click on storage button
        Then i click to chose the colour
        Scenario: sprint phone
          Given i am at sprint home page
          Then i click on deal button
          Then i click on show now button
          Then in should get text
          Then i take a screen shot
  Scenario: sprint phone/features
    Given i am at sprint home page
    Then i click on deal button
    Then i click on show now button

  Scenario: sprint phone/all phones
    Given i am at sprint home page
    Then i click on deal button
    Then i click on show now button
    Then i click to get back to all phones
  Scenario: sprint phone/all phones
    Given i am at sprint home page
    Then i click on deal button
    Then i click on show now button
    Then i click to get back to all phones
    Then i click on filter section
    Then i click to select samsung
    Scenario:get list
  Scenario: sprint phone/all phones
    Given i am at sprint home page
    Then i click on deal button
    Then i click on show now button
    Then i click to get back to all phones
    Then i should get list of devices
    Scenario: check status
      Given i am at sprint home page
      Then i click on sign in
      Then i click to check the status
      Then i get title

