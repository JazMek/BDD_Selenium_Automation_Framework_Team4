package step_Definitions;

import common.WebAPI;
import home.HomePage;
import home.SprintWebElements;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.PageFactory;


import java.io.IOException;
import java.sql.SQLException;

public class Homepage_StepDefinition extends WebAPI {

    @Before

    public void openBrowser() throws IOException {
        setUp(false, "browserstack", "windows", "10", "chrome", "83", "https://www.sprint.com/");
      init();
    }

    @After
    public void closeBrowser() {
        driver.quit();
    }

    static HomePage homePage;
    static SprintWebElements sprintWebElements;

    public static void init() {
        homePage = PageFactory.initElements(driver, HomePage.class);
        sprintWebElements = PageFactory.initElements(driver, SprintWebElements.class);
    }

//Scenario : 1


    @Given("I am at Sprint Home Page")
    public void i_am_at_Sprint_Home_Page() {

    }

    @When("I click search button")
    public void i_click_search_button() {
       homePage.click_search_button();
    }

    @When("I Enter {string} in search input field")
    public void i_Enter_in_search_input_field(String string) {
       homePage.Enter_in_search_input_field( string);
    }

    @Then("I should see \"\"galaxy {int}\"\"")
    public void i_should_see_galaxy(Integer int1) {

    }

    @Then("I should see \"\"I phone {int} pro\"\"")
    public void i_should_see_I_phone_pro(Integer int1) {

    }

    @Then("I should see \"\"Nokia phone\"\"")
    public void i_should_see_Nokia_phone() {

    }

    @Then("I should see \"\"iphone {int} plus\"\"")
    public void i_should_see_iphone_plus(Integer int1) {

    }

    @Then("I should see \"\"phone case\"\"")
    public void i_should_see_phone_case() {

    }
//scenario 02
@Given("I am at sprint home page")
public void i_am_at_sprint_home_page() {

}

    @When("I should check broken links")
    public void i_should_check_broken_links() throws IOException {
        homePage.CheckBrokenLink();
    }
    //senario 03
    @When("I should get all page links")
    public void i_should_get_all_page_links() {
        PageLinksList(driver);
    }
    // scenario 04
    @When(": i enter item in search field i see result")
    public void i_enter_item_in_search_field_i_see_result() throws InterruptedException, SQLException, IOException, ClassNotFoundException {
      init();
       homePage.enter_item_in_search_field_i_see_result();
    }
}













