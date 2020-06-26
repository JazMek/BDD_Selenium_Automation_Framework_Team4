package step_definitions;
import common.WebAPI;
import home.GeicoWebElements;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;

public class HomePage_StepDefinition extends WebAPI {
    @Before
    public void openBrowser() throws IOException { setUp(false, "browserstack", "os", "x", "chrome", "83", "https://www.Geico.com/");
    }
    @After
    public void closeBrowser() { driver.quit(); }
    public static GeicoWebElements geicoWebElements;
    public static HomePage_StepDefinition homePage_stepDefinition;
    public static void init() {
        geicoWebElements= PageFactory.initElements(driver,GeicoWebElements .class);
        homePage_stepDefinition=PageFactory.initElements(driver,HomePage_StepDefinition.class);
    }
    @Given("I am at Geico.com home page")
    public void i_am_at_Geico_com_home_page() {
  
    }

    @When("I click on the sign in button")
    public void i_click_on_the_sign_in_button() {
      
    }

    @When("I enter my correct email")
    public void i_enter_my_correct_email() {
    
    }

    @Then("I click on continue button")
    public void i_click_on_continue_button() {
       
    }

    @Then("I enter my pass word")
    public void i_enter_my_pass_word() {
      
    }

    @Then("I click on the login button I should log in to my Geico account")
    public void i_click_on_the_login_button_I_should_log_in_to_my_Geico_account() {
        
    }
    
}
