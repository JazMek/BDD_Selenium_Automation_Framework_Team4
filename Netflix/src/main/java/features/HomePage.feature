

Feature:

  Background:
    Given  I am at netflix home page

  Scenario: 01- check the Netflix links
    When I should check broken links

  Scenario: 02- get all Netflix page links
    When I should get all page links

  Scenario: 03- login to netflix account
    Then I click on sign in Button
     And I enter user name in userNameField
     And I enter password in the  passWordField
  When i click on signin button i login my account

  Scenario:
    When   I click on the signin button
    And    I enter my  correct email "email"
    And    I enter my pass word "password"
    Then   I click on the scond signin button
  Scenario: loginToAmazonAccount
    When   I enter my  correct email
    And    I enter my pass word
    Then   I click on the login button I should load in the my netflix account

  Scenario: setDVD
    When   I enter my  correct email
    And    I enter my pass word
    Then   I click on the login button I should load in the my netflix account
    And    I click on Team4 profile the page should display properly
    Then   I click Dvd button the page should land properly

  Scenario: DVD Page Title
    When   I enter my  correct email
    And    I enter my pass word
    Then   I click on the login button I should load in the my netflix account
    And    I click on Team4 profile the page should display properly
    Then   I click Dvd button the page should land properly
    Then   I should get the expected Text

  Scenario: Kids Page Title
    When   I enter my  correct email
    And    I enter my pass word
    Then   I click on the login button I should load in the my netflix account
    And    I click on Team4 profile the page should display properly
    Then   I click kids button the page should land properly
    Then   I should get the Kids Page expected Title

  Scenario: Kids Page Title
    When   I enter my  correct email
    And    I enter my pass word
    Then   I click on the login button I should load in the my netflix account
    And    I click on Team4 profile the page should display properly
    Then   I click kids button the page should land properly
    And    I click on Pokemon Play button the video should display properly
    Then   I click on the return arrow the video should be closed

  Scenario Outline:sign in to netflix
    Then i click on sign in button
    Then i enter username "<username>"
    Then i enter passeword "<passeword>"
    Then i click on signin button
    Examples:
      |username                    |passeword |
      | team4WDNY2020@gmail.com    | Team42020|


  Scenario Outline:select profile
    Given iam at netflix home page
    Then i click on sign in button
    Then i enter username "<username>"
    Then i enter passeword "<passeword>"
    Then i click on signin button
    Then i click on profile
    Examples:
      |username                    |passeword |
      | team4WDNY2020@gmail.com    | Team42020|

  Scenario Outline:sign in to netflix
    Given iam at netflix home page
    Then i click on sign in button
    Then i enter username "<username>"
    Then i enter passeword "<passeword>"
    Then i click on signin button
    Then i click on profile
    And i click on movie button
    Then i click on Genres of novies
    And I should get the list
    Examples:

      |username                    |passeword |
      | team4WDNY2020@gmail.com    | Team42020|

  Scenario Outline:sign in to netflix
    Given iam at netflix home page
    Then i click on sign in button
    Then i enter username "<username>"
    Then i enter passeword "<passeword>"
    Then i click on signin button
    Then i click on profile
    And i click on movie button
    Then i click on play button
    Examples:

      |username                    |passeword |
      | team4WDNY2020@gmail.com    | Team42020|

  Scenario Outline:sign in to netflix
    Given iam at netflix home page
    And i should enter my email "<email>"
    Examples:
      |email|
      |achour@gmail.fr|
      |gmail@Gnail.com|
      |piit.us@gmail.com|
      |us@gmail.com     |

  Scenario Outline:sign in to netflix
    Given iam at netflix home page
    Then i click on sign in button
    Then i enter username "<username>"
    Then i enter passeword "<passeword>"
    Then i click on signin button
    Then i click on profile
    And i click on movie button
    Then i click on search button

    Examples:
      |username                    |passeword |
      | team4WDNY2020@gmail.com    | Team42020|

  Scenario:
    When   I click on the sign-in button
    And    I enter my correct email
    And    I enter my pass word
    Then   I click on the sign-in button I should log in to my Netflix account
