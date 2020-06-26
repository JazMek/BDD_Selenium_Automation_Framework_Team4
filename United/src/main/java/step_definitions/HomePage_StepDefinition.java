package step_definitions;
import common.WebAPI;
import home.UnitedWebElements;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;

public class HomePage_StepDefinition extends WebAPI {
    @Before
    public void openBrowser() throws IOException { setUp(false, "browserstack", "os", "x", "chrome", "83", "https://www.United.com/");
    }
    @After
    public void closeBrowser() { driver.quit(); }
    public static UnitedWebElements unitedWebElements;
    public static HomePage_StepDefinition homePage_stepDefinition;
    public static void init() {
        unitedWebElements= PageFactory.initElements(driver,UnitedWebElements.class);
        homePage_stepDefinition=PageFactory.initElements(driver,HomePage_StepDefinition.class);
    }
    @Given("I am at United page")
    public void i_am_at_United_page() {
        init();
    }

    @When("I click on the signin button")
    public void i_click_on_the_signin_button() {
        init();
    }

    @When("I enter my  correct email")
    public void i_enter_my_correct_email() {
        
    }

    @Then("I click on continue button")
    public void i_click_on_continue_button() {
     
    }

    @Then("I enter my pass word")
    public void i_enter_my_pass_word() {
        
    }

    @Then("I click on the login button I should log in the my United account")
    public void i_click_on_the_login_button_I_should_log_in_the_my_United_account() {
       
    }


}
