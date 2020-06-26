package step_definitions;
import common.WebAPI;
import home.BookingWebElements;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;

import static home.BookingWebElements.*;

public class HomePage_StepDefinition extends WebAPI {
    @Before
    public void openBrowser() throws IOException { setUp(false, "browserstack", "os", "x", "chrome", "83", "https://www.booking.com/");
    }
    @After
    public void closeBrowser() { driver.quit(); }
    static HomePage_StepDefinition homePage_stepDefinition;
    static BookingWebElements bookingWebElements;
    public static void init() {
        homePage_stepDefinition= PageFactory.initElements(driver, HomePage_StepDefinition.class);
        bookingWebElements = PageFactory.initElements(driver, BookingWebElements.class);
    }
    @Given("I am at booking.com home page")
    public void i_am_at_booking_com_home_page() {
        init();
        signinButton2.click();
       
    }
    @When("I click on the sign in button")
    public void i_click_on_the_sign_in_button() {
        // Write code here that turns the phrase above into concrete actions
        init();
        signinButton.click();
        //throw new io.cucumber.java.PendingException();
    }
    @When("I enter my correct email")
    public void i_enter_my_correct_email() {
        // Write code here that turns the phrase above into concrete actions
        init();
        //throw new io.cucumber.java.PendingException();
        emailField.sendKeys("team4WDNY2020@gmail.com");
    }

    @Then("I click on continue button")
    public void i_click_on_continue_button() {
        // Write code here that turns the phrase above into concrete actions
        init();
        //throw new io.cucumber.java.PendingException();
        nextButton.click();
    }
    @Then("I enter my pass word")
    public void i_enter_my_pass_word() {
        // Write code here that turns the phrase above into concrete actions
        init();
        //throw new io.cucumber.java.PendingException();
        passWordField.sendKeys("Team42020");
    }
    @Then("I click on the login button I should log in to my Booking.com account")
    public void i_click_on_the_login_button_I_should_log_in_to_my_Booking_com_account() {
        // Write code here that turns the phrase above into concrete actions
        init();
        //throw new io.cucumber.java.PendingException();
        loginButton.click();
    }







}

