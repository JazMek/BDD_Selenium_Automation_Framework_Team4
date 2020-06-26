package step_definitions;


import common.WebAPI;
import home.BookingWebElements;
import home.HomePage;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;


public class HomePage_StepDefinition extends WebAPI {


    @Before
    public void openBrowser() throws IOException { setUp(false, "browserstack", "windows", "10", "chrome", "83", "https://www.booking.com/");
        init();
    }
    @After
    public void closeBrowser() { driver.quit(); }
    static BookingWebElements bookingWebElements;
    static HomePage homePage;
    public static void init() {

        bookingWebElements = PageFactory.initElements(driver, BookingWebElements.class);
        homePage = PageFactory.initElements(driver, HomePage.class);
    }
    // Scenario 01 login
    @Given("I am at Booking home page")
    public void i_am_at_Booking_home_page() throws IOException {
    }
    @When("I click on the signin button")
    public void i_click_on_the_signin_button() {
// init();
//        homePage.click_on_the_signin_button();
    }
    @When("I enter my correct email")
    public void i_enter_my_correct_email() {
// init();
//        homePage.enter_my_correct_email();
    }
    @Then("I click on next button button")
    public void i_click_on_next_button_button() {
// init();
//        homePage.click_on_next_button_button();
    }
    @Then("I enter my pass word")
    public void i_enter_my_pass_word() {
// init();
//        homePage.enter_my_pass_word();
    }
    @Then("I click on the login button I should load in my booking account")
    public void i_click_on_the_login_button_I_should_load_in_my_booking_account() {
// init();
//        homePage.click_on_the_login_button_I_should_load_in_my_booking_account();
    }
// scenario 02
@When("I should check broken links")
public void i_should_check_broken_links() throws IOException {
    init();
    homePage.CheckBrokenLink();
}
    // scenario 03
    @When("I should get all page links")
    public void i_should_get_all_page_links() {
//        PageLinksList(driver);
    }
    // Scenario 04-
    @When("I click on the register button")
    public void i_click_on_the_register_button() {
        homePage.click_on_the_register_button();
    }

    @Then("I click on signUp button")
    public void i_click_on_signUp_button() {
        homePage.click_on_signUp_button();
    }

    @Then("I put my correct email")
    public void i_put_my_correct_email() {
        homePage.put_my_correct_email();
    }

    @Then("I click on next button")
    public void i_click_on_next_button() {
        homePage.click_on_next_button();
    }

    @Then("I enter password data in text box")
    public void i_enter_password_data_in_text_box() {
        homePage.enter_password_data_in_text_box();
    }

    @Then("I reenter password data in text box")
    public void i_reenter_password_data_in_text_box() {
        homePage.reenter_password_data_in_text_box();
    }

    @When("i should create a new account by clicking enter button")
    public void i_should_create_a_new_account_by_clicking_enter_button() {
        homePage.should_create_a_new_account_by_clicking_enter_button();
    }



}