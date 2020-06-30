Feature:

  Background:
    Given  I am at empire home page

Scenario: 02- check the Empire links
When I should check broken links

Scenario: 03- get all page links
When I should get all page links

  Scenario:
#    Given  I am at Amazon home page
#    When   I click on the signin button
#    And    I enter my  correct email
#    Then   I click on continue button
#    And    I enter my pass word
#    Then   I click on the login button I should load in the my Amazon account

  Scenario:
    When   I click on the Individual And Family button a Page should dropdown

  Scenario:
    Then the page should scrolldown to view element wich is Language
    When I click on Language button it should dropdown propprly
    And I click on chineese the page should be translated

  Scenario:
    When   I click on the Individual And Family button a Page should dropdown
    And  I click on HealthInsurance the page should display properly
    Then the HealthInsurance page should scrolldown to the end of the page

  Scenario:
    When   I click on the Individual And Family button a Page should dropdown
    And  I click on HealthInsurance the page should display properly
    Then the page should wait for 10 sec for the page to display properly
    When I will enter my user name in the username box it should be entered properly
    Then I will enter my PassWord in the PassWord box it should be entered properly

  Scenario:
    When   I click on the Individual And Family button a Page should dropdown
    And I click on VisionInsurance button the page should display properly
    Then the VisionInsurance page should be refreshed
    And the VisionInsurance page should be scrolled down to the end
    Then the page should be closed

  Scenario:medicaid page
    Given i am at medcaide page
    Then i should get the actual url

  Scenario:medicaid page/ benefits page
    Given i am at medcaide page
    Then  with mouse over and click i should open the benefits page

  Scenario:medicaid page/ enrollement page
    Given i am at medcaide page
    Then  with mouse over and click i should open the enrollement page

  Scenario:medicaid page/ care page
    Given i am at medcaide page
    Then  with mouse over and click i should open the care page

  Scenario:medicaid page/ login page
    Given i am at medcaide page
    Then  i on login button click i should open the login page

  Scenario:medicaid page/ language page
    Given i am at medcaide page
    Then  i on language button click i should open the language page

  Scenario:medicaid page/ contact page
    Given i am at medcaide page
    Then  i on contact button click i should open the contact page

  Scenario:medicaid page/ findADocteur page
    Given i am at medcaide page
    Then  i on findADocteur button click i should open the findADocteur page

  Scenario:medicaid page/ makeApayment page
    Given i am at medcaide page
    Then  i on makeApayment button click i should open the makeApayment page

  Scenario:medicaid page/ Enroll page
    Given i am at medcaide page
    Then  i on Enroll button click i should open the Enroll page

  Scenario:medicaid page/  renew page
    Given i am at medcaide page
    Then  i on renew button click i should open the renew page

  Scenario:medicaid page/ id page
    Given i am at medcaide page
    Then  i on  id button click i should open the  id page


