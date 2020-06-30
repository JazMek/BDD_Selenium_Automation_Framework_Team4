package step_Definitions;
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
public class Homepage_StepDefinition extends WebAPI {
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
        homePage.click_on_the_signin_button();
    }
    @When("I enter my  correct email")
    public void i_enter_my_correct_email() {
      //  init();
        homePage.enter_my_correct_email();
    }
    @Then("I click on next button button")
    public void i_click_on_next_button_button() {
      //  init();
       homePage.click_on_next_button_button();
    }
    @Then("I enter my pass word")
    public void i_enter_my_pass_word() {
       // init();
        homePage.enter_my_pass_word();
    }
    @Then("I click on the login button I should load in my booking account")
    public void i_click_on_the_login_button_I_should_load_in_my_booking_account() {
      //  init();
        homePage.click_on_the_login_button_I_should_load_in_my_booking_account();
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
        PageLinksList(driver);
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
    @Then("I put my  correct email")
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
// package step_definitions;
// import common.WebAPI;
// import home.BookingWebElement;
// import io.cucumber.java.After;
// import io.cucumber.java.Before;
// import io.cucumber.java.en.And;
// import io.cucumber.java.en.Given;
// import io.cucumber.java.en.Then;
// import io.cucumber.java.en.When;
// import org.junit.Assert;
// import org.openqa.selenium.support.PageFactory;
// import java.io.IOException;
// import java.util.concurrent.TimeUnit;
// import static home.BookingWebElement.*;
// public class HomePage_StepDefinition extends WebAPI{
//     @Before
//     public void openBrowser() throws IOException { setUp(false, "browserstack", "os", "x", "chrome", "83", "https://www.booking.com/");
//     }
//     @After
//     public void closeBrowser() { driver.quit(); }
//     static  HomePage_StepDefinition homePage_stepDefinition;
//     static BookingWebElement bookingWebElement;
//     public static void init() {
//         homePage_stepDefinition= PageFactory.initElements(driver,HomePage_StepDefinition.class);
//         bookingWebElement= PageFactory.initElements(driver,BookingWebElement.class);
//     }
//     @Given("I am at Booking home page")
//     public void i_am_at_Booking_home_page() {
//         init();
//         driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
//     }
//  @When("I click on the signin button")
//     public void i_click_on_the_signin_button() {
//         init();
//         loginButton.click();
//     }
//     @When("I enter my  correct email")
//     public void i_enter_my_correct_email() {
//         init();
//         emailField.sendKeys("team4WDNY2020@gmail.com");
//     }
//     @Then("I click on continue button")
//     public void i_click_on_continue_button() {
//        init();
//         nextButton.click();
//     }
//     @Then("I enter my pass word")
//     public void i_enter_my_pass_word() {
//        init();
//         passWordField.sendKeys("Team42020");
//     }

//     @Then("I click on the login button I should load in the my booking")
//     public void i_click_on_the_login_button_I_should_load_in_the_my_booking() {
//       init();
//         signinButton2.click();
//     }
//     @Then("I should get the expected title")
//     public void i_should_get_the_expected_title() {
//       init();
//         String ExpectTitle="Booking.com | Official site | The best hotels & accommodations";
//         String ActualTitle= driver.getTitle();
//         Assert.assertEquals(ExpectTitle,ActualTitle);
//     }
//     @Then("I should get the expected text")
//     public void i_should_get_the_expected_text() {
//         init();    goBackToHomeWindow();
//         String expectTexte ="Find deals for any season";
//         Assert.assertEquals(expectTexte,gettexte.getText());
//     }

//     @When("I click on Flights button the page should display properly")
//     public void i_click_on_Flights_button_the_page_should_display_properly() {
//       init();
//         Flights.click();
//     }

//     @When("the page should wait for {int} seconds")
//     public void the_page_should_wait_for_seconds(Integer int1) throws InterruptedException {
//       init();
//         sleepFor(5);
//     }

//     @Then("it should get clean up")
//     public void it_should_get_clean_up() {
//         cleanUp();
//     }
//     @When("I click on round trip button it should get selected")
//     public void i_click_on_round_trip_button_it_should_get_selected() {
//         init();
//         RoundTripButton.click();
//     }
//     @When("I click on One Way Button it should get selected")
//     public void i_click_on_One_Way_Button_it_should_get_selected() {
//        init();
//         OneWayButton.click();
//     }
}