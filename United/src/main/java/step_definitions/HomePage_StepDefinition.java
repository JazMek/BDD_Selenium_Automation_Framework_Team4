package step_definitions;

import common.WebAPI;
import home.UnitedWebElement;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;

import static home.UnitedWebElement.*;

public class HomePage_StepDefinition extends WebAPI {
    @Before
    public void openBrowser() throws IOException {
        setUp(false, "browserstack", "os", "x", "chrome", "83", "https://www.United.com/");
    }

    @After
    public void closeBrowser() {
        driver.quit();
    }

    static HomePage_StepDefinition homePage_stepDefinition;
    static UnitedWebElement unitedWebElement;

    public static void init() {
        homePage_stepDefinition = PageFactory.initElements(driver, HomePage_StepDefinition.class);
        unitedWebElement = PageFactory.initElements(driver, UnitedWebElement.class);
    }
    @Given("I am at united home page")
    public void i_am_at_united_home_page() {
       init();
    }

    @When("I click on the Book button the Page should land properly")
    public void i_click_on_the_Book_button_the_Page_should_land_properly() {
       init();
        BookButton.click();
    }

    @When("I click on Route Map button the Map page should land properly")
    public void i_click_on_Route_Map_button_the_Map_page_should_land_properly() throws InterruptedException {
    init();
        RouteMapButton.click();
        sleepFor(10);
    }

    @Then("I click on Maximise button the Map page should maximise")
    public void i_click_on_Maximise_button_the_Map_page_should_maximise() {
     init();
        MaxiMiniizeMapButton.click();
    }

    @When("I click {int} times on zoom in button is should zoom")
    public void i_click_times_on_zoom_in_button_is_should_zoom(Integer int1) {
       init();
        for (int i = 0; i < 5; i++) {ZoomInMButton.click(); }
    }

    @When("I click on the Zoom out button it should zoom out")
    public void i_click_on_the_Zoom_out_button_it_should_zoom_out() {
      init();
        for (int i = 0; i < 5; i++) {ZoomOutMButton.click(); }
    }

    @Then("I click again on maximise button the page should minimise")
    public void i_click_again_on_maximise_button_the_page_should_minimise() {
     init();
        MaxiMiniizeMapButton.click();
    }
    @Then("I Type {string} destination in a search box the it should show it out in the map")
    public void i_Type_destination_in_a_search_box_the_it_should_show_it_out_in_the_map(String string) {
      init();
        SearchBox.sendKeys("New York, NY (LGA - LaGuardia)");

    }

    @When("I Click on the search button should look for the destination")
    public void i_Click_on_the_search_button_should_look_for_the_destination() {
    init();
        SearchBoxButton.click();
    }

    @When("I select the second destination {string} it should link it to the first one")
    public void i_select_the_second_destination_it_should_link_it_to_the_first_one(String string) throws InterruptedException {
    init();
        ChicagoRouteFrom.click();
        sleepFor(5);
    }






}
