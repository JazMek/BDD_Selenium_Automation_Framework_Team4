Feature: Search Multiple product

  Background:
    Given I am at Sprint Home Page

 Scenario Outline:01- Search multiple product
    When I click search button
    And I Enter "<product>" in search input field
    When I click search button
    Then I should see "<ExpectedResult>"

    Examples:
      |product|ExpectedResult|
      |galaxy 7| "galaxy 7" |
      |I phone 11 pro|  "I phone 11 pro" |
      |Nokia phone|     "Nokia phone"   |
      |iphone 8 plus|    "iphone 8 plus"  |
      |phone case|  "phone case"   |

 Scenario: 02- check the broken links
  When I should check broken links

 Scenario: 03- get all page links
  When I should get all page links

 Scenario: 04- search for set of items using MySQl
   When : i enter item in search field i see result
  Scenario:
#    Given  I am at Amazon home page
#    When   I click on the signin button
#    And    I enter my  correct email
#    Then   I click on continue button
#    And    I enter my pass word
#    Then   I click on the login button I should load in the my Amazon account

  Scenario:
    When   I hover mouse on the Plans button The Page should dropdown properly
    Then   I click on  UnlimitedPlans the page sould land properly

  Scenario:
    When   I hover mouse on the Plans button The Page should dropdown properly
    Then   I click on  UnlimitedPlans the page sould land properly
    And    I hover mouse on the OurUnlimitedPlan
    Then   The OurUnlimitedPlan Page should scrolldown to the end of the page

  Scenario:
    When   I hover mouse on the Plans button The Page should dropdown properly
    Then   I click on  UnlimitedPlans the page sould land properly
    And    I hover mouse on the UsVsThemPlan
    When   I click on UsVsThemPlan button the page should land properly
    And    I click four times on the next Icon button the numbers should go from 1-4
    Then   I click four times on Previous Icon button the numbers should go back fom 4-1
    And    I the page should scrolldown to the end of the page

    Scenario:
    When   I hover mouse on the Plans button The Page should dropdown properly
    Then   I click on  OtherPlansPlan the page sould land properly
    And    The OtherPlansLearnMore scrolldown to view
    Then   I click on OtherPlansLearnMore the page should land properly

  Scenario:
    When   I hover mouse on the Plans button The Page should dropdown properly
    Then   I click on  OtherPlansPlan the page sould land properly
    Then   I should get get The page title

  Scenario: deal page
    Then i click on deal button
  Scenario: build your phone page
    Then i click on deal button
    Then i click on show now button
    Then i click on storage button
    Then i click to chose the colour
  Scenario: sprint phone
    Then i click on deal button
    Then i click on show now button
    Then in should get text
    Then i take a screen shot
  Scenario: sprint phone/features
    Then i click on deal button
    Then i click on show now button

  Scenario: sprint phone/all phones
    Then i click on deal button
    Then i click on show now button
    Then i click to get back to all phones
  Scenario: sprint phone/all phones
    Then i click on deal button
    Then i click on show now button
    Then i click to get back to all phones
    Then i click on filter section
    Then i click to select samsung
  Scenario:get list
  Scenario: sprint phone/all phones
    Then i click on deal button
    Then i click on show now button
    Then i click to get back to all phones
    Then i should get list of devices
  Scenario: check status
    Then i click on sign in
    Then i click to check the status
    Then i get title