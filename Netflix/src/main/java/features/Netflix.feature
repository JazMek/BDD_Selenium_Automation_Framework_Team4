Feature:

  Scenario Outline:sign in to netflix
    Given iam at netflix home page
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




