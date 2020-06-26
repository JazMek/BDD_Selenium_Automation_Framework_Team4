Feature:
  Background:
    Given  I am at geico home page

  Scenario: 01- check the Empire links
    Given I am at geico home page
    When I should check broken links

  Scenario: 02- get all page links
    Given I am at geico home page
    When I should get all page links