
Feature:
  Background:
    Given  I am at geico home page

  Scenario:Test homepage Title
    Given  I am at geico home page
    When   I Land on the home page I will check if I land in the correct page


  Scenario: 01- check the Empire links
    Given I am at geico home page
    When I should check broken links

  Scenario: 02- get all page links
    Given I am at geico home page
    When I should get all page links


Feature:
  Scenario:
#    Given  I am at Amazon home page
#    When   I click on the signin button
#    And    I enter my  correct email
#    Then   I click on continue button
#    And    I enter my pass word
#    Then   I click on the login button I should load in the my Amazon account


  Scenario:Test homepage url
    When  I Land on the home page I will check if the link url is derecting me to the right page

  Scenario:Test text is present in the home page
    When I land in the home page I should see the text


