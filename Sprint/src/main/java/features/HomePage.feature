Feature: Search Multiple product
  Background:
    Given I am at Sprint Home Page
  
  Scenario Outline: Search multiple product
    And i click on Search box button
    And  And I Enter "<productName>" in Search Field
    When I click Keyboard Enter button
    Then I should see "<MySearchProduct>"
    Then the Browser should close
    Examples:
    |productName|MySearchProduct|
    |product    |   "product" |
    |Samsung 8S |"Samsung 8S"|
    |Ipad       |"Ipad"|
    |phone case |"phone case"|
    |  payements  | "payements"  |
    |  device     |   "device" |
    |  Watches    |   "Watches"   |
    |  Tablets  |    "Tablets"   |
    |  Other plans  |  "Other plans"|
    |  Add-on services  |  "Add-on services" |
    |   Network   |    "Network" |
    |     5G     |           " 5G"     |
    |   Express Pay  |      "Express Pay"   |
    |  Check Order Status  |   "Check Order Status" |

  Scenario:
    Then I can check broken links

  Scenario:
    Given  I am at Sprint Home Page
    When   I click on the sign-in button
    And    I enter my correct email
    And    I enter my pass word
    Then   I click on the sign-in button I should log in to my Sprint account
    
      Scenario: search for set of items using MySQl
    When : i enter item in search field i see result

  
  
  
  
