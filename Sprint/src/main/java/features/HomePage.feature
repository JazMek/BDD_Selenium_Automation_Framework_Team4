
Feature:
  Scenario:
    Given  I am at Sprint home page
    When   I hover mouse on the Plans button The Page should dropdown properly
    Then   I click on  UnlimitedPlans the page sould land properly

  Scenario:
    Given  I am at Sprint home page
    When   I hover mouse on the Plans button The Page should dropdown properly
    Then   I click on  UnlimitedPlans the page sould land properly
    And    I hover mouse on the OurUnlimitedPlan
    Then   The OurUnlimitedPlan Page should scrolldown to the end of the page

  Scenario:
    Given  I am at Sprint home page
    When   I hover mouse on the Plans button The Page should dropdown properly
    Then   I click on  UnlimitedPlans the page sould land properly
    And    I hover mouse on the UsVsThemPlan
    When   I click on UsVsThemPlan button the page should land properly
    And    I click four times on the next Icon button the numbers should go from 1-4
    Then   I click four times on Previous Icon button the numbers should go back fom 4-1
    And    I the page should scrolldown to the end of the page

    Scenario:
    Given  I am at Sprint home page
    When   I hover mouse on the Plans button The Page should dropdown properly
    Then   I click on  OtherPlansPlan the page sould land properly
    And    The OtherPlansLearnMore scrolldown to view
    Then   I click on OtherPlansLearnMore the page should land properly


  Scenario:
    Given  I am at Sprint home page
    When   I hover mouse on the Plans button The Page should dropdown properly
    Then   I click on  OtherPlansPlan the page sould land properly
    Then   I should get get The page title

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







