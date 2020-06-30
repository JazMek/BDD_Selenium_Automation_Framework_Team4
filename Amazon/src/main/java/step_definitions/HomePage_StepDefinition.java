package step_definitions;


import common.WebAPI;
import home.AmazonWebElements;
import home.HomePage;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.io.IOException;


import static home.AmazonWebElements.*;


import static home.AmazonWebElements.*;






public class HomePage_StepDefinition extends WebAPI {
    @Before


    public void openBrowser() throws IOException { setUp(false, "browserstack", "ox", "catalina ", "chrome", "83", "https://www.amazon.com/");
        init();
    }


    public void openBrowser() throws IOException { setUp(false, "browserstack", "ox", "catalina", "chrome", "83", "https://www.amazon.com/");
        init();
    }


    @After
    public void closeBrowser() { driver.quit(); }

    static HomePage homePage;
    static AmazonWebElements amazonWebElements;
    public static void init() {
        homePage = PageFactory.initElements(driver, HomePage.class);
        amazonWebElements= PageFactory.initElements(driver,AmazonWebElements.class);
    }

    // You can implement missing steps with the snippets below:
    @Given("I am at Amazon home page")
    public void i_am_at_Amazon_home_page() {

    }
    @When("I click on the signin button")
    public void i_click_on_the_signin_button() {


    // You can implement missing steps with the snippets below:
    @Given("I am at Amazon home page")
    public void i_am_at_Amazon_home_page() {


//    You can implement missing steps with the snippets below:
    @Given("I am at Amazon home page")
    public void i_am_at_Amazon_home_page() {


    }
    @When("I click on the signin button")
    public void i_click_on_the_signin_button() {
        //init();
      //  homePage.SetSignIn();
        signin.click(); }
    @When("I enter my  correct email")
    public void i_enter_my_correct_email() {
        //init();
       //homePage.setUserNameField();
        userNameField.sendKeys("team4WDNY2020@gmail.com");


    }
    @When("I click on the signin button")
    public void i_click_on_the_signin_button() {

//init();
// homePage.SetSignIn();
        signin.click(); }
    @When("I enter my correct email")
    public void i_enter_my_correct_email() {

//init();
//homePage.setUserNameField();
        userNameField.sendKeys("team4WDNY2020@gmail.com");


//init();
//homePage.setUserNameField();
        userNameField.sendKeys("team4WDNY2020@gmail.com");


        homePage.setUserNameField();


    }

    @Then("I click on continue button")
    public void i_click_on_continue_button() {
// init();


// homePage.setContinueButton();



// homePage.setContinueButton();

       // init();




      //  homePage.setContinueButton();


        continueButton.click();
    }

    @Then("I enter my pass word")
    public void i_enter_my_pass_word() {
// init();


//homePage.setPassWordField();

  


//homePage.setPassWordField();

       // init();



        //homePage.setPassWordField();


        passWordField.sendKeys("Team42020");
    }

    @Then("I click on the login button I should load in the my Amazon account")
    public void i_click_on_the_login_button_I_should_load_in_the_my_Amazon_account() {

//init();
// homePage.setLoginButton();
        loginButton.click();
    }
// scenario number 2


//init();
// homePage.setLoginButton();


        //init();
       // homePage.setLoginButton();

        loginButton.click();
    }
    // scenario number 2

    @When("I click on the New releases link")
    public void i_click_on_the_New_releases_link() {
        homePage.getNewReleasePage();
    }
    @Then("i should get the New releases page")
    public void i_should_get_the_New_releases_page() {
        homePage.checkReleasePageText();
    }

    // // step 01- click on new releases link


    //***********************************************************
// // step 01- click on new releases link

// homePage.getNewReleasePage();
// //step 02- click on baby link
// homePage.getNewReleasesInBabyPage();
// homePage.checkNewReleasesInBabyPageText();
//scenario number 3
    @When("I click on new release link")
    public void i_click_on_new_release_link() {
        homePage.getNewReleasePage();
    }
    @When("I click on baby link")
    public void i_click_on_baby_link () {
        homePage.getNewReleasesInBabyPage();


    }

    @Then("I should get the New release in baby page")
    public void i_should_get_the_New_release_in_baby_page () {
        homePage.checkNewReleasesInBabyPageText();


    }
    @Then("I should get the New release in baby page")
    public void i_should_get_the_New_release_in_baby_page () {
        homePage.checkNewReleasesInBabyPageText();

    }
    // scenario number 4
    @When("I enter item name in search box")
    public void i_enter_item_name_in_search_box() {
        homePage.enter_item_name_in_search_box();


    }
    @When("I click on search button")
    public void i_click_on_search_button() {
        homePage.click_on_search_button();
    }
    @Then("I should get the appropriate result page")
    public void i_should_get_the_appropriate_result_page() {
        homePage.should_get_the_appropriate_result_page();
    }
//Scenario number 5
    @When("I enter items in search box i should get result")
    public void i_enter_items_in_search_box_i_should_get_result() throws InterruptedException {
        homePage.enterDataToSearchBox();
    }

//***********************************************************
//    // step 01- click on new releases link
//        homePage.getNewReleasePage();
//    //step 02- click on baby link
//      homePage.getNewReleasesInBabyPage();
//      homePage.checkNewReleasesInBabyPageText();
 //scenario number 3
 @When("I click on new release link")
 public void i_click_on_new_release_link() {
     homePage.getNewReleasePage();
 }
     @When("I click on baby link")
     public void i_click_on_baby_link () {
         homePage.getNewReleasesInBabyPage();

     }

     @Then("I should get the New release in baby page")
     public void i_should_get_the_New_release_in_baby_page () {
         homePage.checkNewReleasesInBabyPageText();

     }
// scenario number 4
@When("I enter item name in search box")
public void i_enter_item_name_in_search_box() {
     homePage.enter_item_name_in_search_box();
}

    @When("I click on search button")
    public void i_click_on_search_button() {

homePage.click_on_search_button();

    }

    @Then("I should get the appropriate result page")
    public void i_should_get_the_appropriate_result_page() {
        homePage.should_get_the_appropriate_result_page();

    }
//Scenario number 5

    @When("I enter items in search box i should get result")
    public void i_enter_items_in_search_box_i_should_get_result() throws InterruptedException {

        homePage.enterDataToSearchBox();



        homePage.setLoginButton();


    }

    @When("I click on search button")
    public void i_click_on_search_button() {


        homePage.click_on_search_button();

    }

    @Then("I should get the appropriate result page")
    public void i_should_get_the_appropriate_result_page() {
        homePage.should_get_the_appropriate_result_page();

    }
//Scenario number 5

    @When("I enter items in search box i should get result")
    public void i_enter_items_in_search_box_i_should_get_result() throws InterruptedException {

        homePage.enterDataToSearchBox();

    }
}

}



