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

import java.io.IOException;

public class HomePage_StepDefinition extends WebAPI {


    @Before
    public void openBrowser() throws IOException { setUp(false, "browserstack", "os", "x", "chrome", "83", "https://www.amazon.com/");
        init();}
    @After
    public void closeBrowser() { driver.quit(); }
    static HomePage homePage;
    static  AmazonWebElements amazonWebElements;
    public static void init() {
        homePage = PageFactory.initElements(driver, HomePage.class);
         amazonWebElements= PageFactory.initElements(driver,AmazonWebElements.class);
    }
//    You can implement missing steps with the snippets below:

    @Given("I am at Amazon home page")
    public void i_am_at_Amazon_home_page() {
    }
    @When("I click on the signin button")
    public void i_click_on_the_signin_button() {

        homePage.SetSignIn();
    }

    @When("I enter my  correct email")
    public void i_enter_my_correct_email() {

        homePage.setUserNameField();
    }

    @Then("I click on continue button")
    public void i_click_on_continue_button() {


        homePage.setContinueButton();
    }

    @Then("I enter my pass word")
    public void i_enter_my_pass_word() {

        homePage.setPassWordField();
    }

    @Then("I click on the login button I should load in the my Amazon account")
    public void i_click_on_the_login_button_I_should_load_in_the_my_Amazon_account() {

        homePage.setLoginButton();
    }



}