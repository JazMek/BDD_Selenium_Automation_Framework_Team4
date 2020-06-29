Feature:01
    Scenario:login to Amazon
          Given  I am at Amazon home page
          When   I click on the signin button
          And    I enter my  correct email
          Then   I click on continue button
          And    I enter my pass word
          Then   I click on the login button I should load in the my Amazon account
    Scenario:02 login to Amazon and get text
         Given   I am at Amazon home page
         Then  I should get the page title
    Scenario:03 login to Amazon and open todays deal page
          Given  I am at Amazon home page
          Then i should click in the todays deals button and get the next page
           And i should have option to subscribe to todays deals then get back to the main page
    Scenario:04 todays deal page/ warehouse section/all departements
           Given I am at Amazon home page
           Then i should click in the todays deals button and get the next page
           Then  i click on warehouse section
           Then   i want to see all werehouse departements
    Scenario:05 login to Amazon/todays dealpage/Amazon devices/AddtoCart
           Given  I am at Amazon home page
           Then i should click in the todays deals button and get the next page
           Then i should have a check box to select Amazon devices
           And i should  want to get option to add to cart
    Scenario:06  i navigated to amazon home page/todaysdeal/explore the next section
           Given  I am at Amazon home page
           Then i should click in the todays deals button and get the next page
           Then  i want to get option to scroll left or right
    Scenario:07  i navigated to amazon home page/todaysdeal/explore the next section
         Given  I am at Amazon home page
         Then i should click in the todays deals button and get the next page
         Then  i want to get sort by option
    Scenario: 08 i navigated to amazon home page/todaysdeal/explore all categories
        Given  I am at Amazon home page
        Then i should click in the todays deals button and get the next page
        Then  i want to check all categories dealOfTheDay page
        Then i want to check lightningDeal page
        Then i want to check savingDeal page
        Then i want to check coupons page
        And  i want to check primeAccess page
    Scenario:09 i navigated to amazon home page/todaysdeal/explore all categories
        Given  I am at Amazon home page
        Then i should click in the todays deals button and get the next page
        Then  i want to check   WootDeal page
        Then i want to check DigitalDeal page
        Then i want to check outlest page
        Then i want to check  renewedDeals page
        And  i want to check  wareHouseDeal page
    Scenario:10 i navigated to amazon home page/todaysdeal/explore all categories
        Given  I am at Amazon home page
        Then i should click in the todays deals button and get the next page
        Then i scroll down to element
        Then i should have option to click to get to top of the page
    Scenario:11 i navigated to amazon home page/todaysdeal/explore all categories
        Given  I am at Amazon home page
        Then i should click in the todays deals button and get the next page
        Then I should enter data in search field
    Scenario:
        Given  I am at Amazon home page
        Then i should click in the todays deals button and get the next page
