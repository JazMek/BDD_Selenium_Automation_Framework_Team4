package step_Definitions;

import common.WebAPI;
import home.HomePage;
import home.NetflixWebElement;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;

public class Homepage_StepDefinition extends WebAPI {



    @Before
    public void openBrowser() throws IOException { setUp(false, "browserstack", "windows", "10", "chrome", "83", "https://www.netflix.com/");
        init();
    }
    @After
    public void closeBrowser() { driver.quit(); }
    static NetflixWebElement netflixWebElement;
    static HomePage homePage;
    public static void init() {

        netflixWebElement = PageFactory.initElements(driver, NetflixWebElement.class);
        homePage = PageFactory.initElements(driver, HomePage.class);
    }


    @Given("I am at netflix home page")
    public void i_am_at_geico_home_page() {

    }

    @When("I should check broken links")
    public void i_should_check_broken_links() throws IOException {
        init();
        homePage.CheckBrokenLink();
    }

    //senario 03
    @When("I should get all page links")
    public void i_should_get_all_page_links() {
        PageLinksList(driver);
    }

   // scenario 03
   @Then("I click on sign in Button")
   public void i_click_on_sign_in_Button() {
homePage.click_on_sign_in_Button();
   }

    @Then("I enter user name in userNameField")
    public void i_enter_user_name_in_userNameField() {
        homePage.enter_user_name_in_userNameField();
    }

    @Then("I enter password in the  passWordField")
    public void i_enter_password_in_the_passWordField() {
        homePage.enter_password_in_the_passWordField();
    }

    @When("i click on signin button i login my account")
    public void i_click_on_signin_button_i_login_my_account() {
homePage.click_on_signin_button_i_login_my_account();
    }



}

