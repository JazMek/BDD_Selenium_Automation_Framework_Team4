package step_definitions;
import Home.BookingWebElements;
import common.WebAPI;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.support.PageFactory;
import java.io.IOException;
import static Home.BookingWebElements.*;
public class Booking_StepDefinition extends WebAPI {
    @Before
    public void openBrowser() throws IOException { setUp(false, "browserstack", "os", "x", "chrome", "83", "https://www.Booking.com/");
    }
    @After
    public void closeBrowser() { driver.quit(); }
    public  static Booking_StepDefinition booking_stepDefinition;
    public  static BookingWebElements bookingPageWebElement;
    public static void init(){
        bookingPageWebElement= PageFactory.initElements(driver, BookingWebElements.class);
        booking_stepDefinition=PageFactory.initElements(driver, Booking_StepDefinition.class);
}
    @Given("i am at booking page")
    public void i_am_at_booking_page() {
        init();
    }
    @Then("I click on signing button")
    public void i_click_on_signing_button() {
        init();
        signinButton2.click(); }
    @Then("I enter my email on next button")
    public void i_enter_my_email_on_next_button() {
        init();
        emailField.sendKeys("team4WDNY2020@gmail.com"); }
    @Then("I click on continue\\/next")
    public void i_click_on_continue_next() {
        init();
        nextButton.click(); }
    @Then("i enter my passeword")
    public void i_enter_my_passeword() {
        init();
        passWordField.sendKeys("Team42020"); }
    @Then("i click on log in i should log in")
    public void i_click_on_log_in_i_should_log_in() {
        init();
        clickByXpath(loginButtonXP); }
    @Then("i should get the title")
    public void i_should_get_the_title() {
        init();
        String ExpectTitle="Booking.com | Official site | The best hotels & accommodations";
        String ActualTitle= driver.getTitle();
        Assert.assertEquals(ExpectTitle,ActualTitle); }
    @Then("i should get the same text")
   public void i_should_get_the_same_text() {
        init();
            String expectTexte ="Find deals for any season";
                   Assert.assertEquals(expectTexte,gettexte.getText());}
    @Then("i click on car rental")
    public void i_click_on_car_rental() {
        init();
        clickByXpath(carrentalXP); }
    @Then("i click on checkbox")
    public void i_click_on_checkbox() {
        init();
        clickByXpath(checkboxXP); }
    @Then("i type on it")
    public void i_type_on_it() {
        init();
        clickCleaType(Type,"manhatan"); }
    @Then("i should get the page title")
    public void i_should_get_the_page_title() {
        init();
        String expectedTitle="Cheap car rentals: Find best car deals & worldwide locations";
        getTitle(expectedTitle); }
    @Then("i should the logo of booking in the page")
    public void i_should_the_logo_of_booking_in_the_page() {
        init();
            BookingLogo.isDisplayed();}
    @Then("i click on taxi button a")
    public void i_click_on_taxi_button_a() {
        init();
        clickByXpath(airportTaxixp); }
    @Then("i should see the page opload")
    public void i_should_see_the_page_opload() {
        init();
        String expectedTitle="";
        getTitle(expectedTitle); }
    @Then("i click on one way button")
    public void i_click_on_one_way_button() {
       init();
        clickByXpath(oneWayXP);}
    @Then("i should click and explore the flights page")
    public void i_should_click_and_explore_the_flights_page() {
        init();
        clickByXpath(FlightsXP); }
    @Then("i click on one way flight")
    public void i_click_on_one_way_flight() throws InterruptedException {
       init();
       sleepFor(5);
      // clickByXpath(OneWayButtonXP);
    }
    @Then("i click on multi destination flight")
    public void i_click_on_multi_destination_flight() throws InterruptedException {
        init();
        sleepFor(5);
       // clickByCss(MultiDestinationButtonCss);
    }
    @Then("i put the depart from to")
    public void i_put_the_depart_from_to() throws InterruptedException {
        init();
        // DepartingFrom.sendKeys("JFK");
        //clickByXpath();
      /*clickByXpath sleepFor(15);
       typeOnInputField(DepartingFromXp,"JFK");*/

    }





























}