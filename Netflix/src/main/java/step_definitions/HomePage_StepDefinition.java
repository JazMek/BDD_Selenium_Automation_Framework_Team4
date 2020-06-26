package step_definitions;


import common.WebAPI;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.io.IOException;

import static home.HomePage.homePage;
import static home.HomePage.init;


public class HomePage_StepDefinition extends WebAPI {
    @Before

    public void openBrowser() throws IOException { setUp(false, "browserstack", "ox", "catalina", "chrome", "83", "https://www.netflix.com/");
        init();

    }
    @After
    public void closeBrowser() { driver.quit(); }

    @Given("I am at netflix home page")
    public void i_am_at_netflix_home_page() {

    }
    @When("I click on the signin button")
    public void i_click_on_the_signin_button() {
        homePage.click_on_the_signin_button();
    }
    @When("I enter my  correct email {string}")
    public void i_enter_my_correct_email(String string) {
        homePage.enter_my_correct_email(string);
    }

    @When("I enter my pass word {string}")
    public void i_enter_my_pass_word(String string) {
        homePage.enter_my_pass_word(string);
    }

    @Then("I click on the scond signin button")
    public void i_click_on_the_scond_signin_button() {
        homePage.click_on_the_scond_signin_button();
    }




}