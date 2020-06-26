package step_Definitions;

import common.WebAPI;
import home.HomePage;
import home.UnitedWebElement;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;

public class Homepage_StepDefinition extends WebAPI {

    @Before

    public void openBrowser() throws IOException {
        setUp(false, "browserstack", "windows", "10", "chrome", "83", "https://www.United.com/");
        init();
    }

    @After
    public void closeBrowser() {
        driver.quit();
    }

    static HomePage homePage;
    static UnitedWebElement unitedWebElement;

    public static void init() {
        homePage = PageFactory.initElements(driver, HomePage.class);
        unitedWebElement = PageFactory.initElements(driver, UnitedWebElement.class);
    }
// Scenario 01
@Given("I am at United airlines Home Page")
public void i_am_at_United_airlines_Home_Page() {

}
 @When("I click one way check box")
    public void i_click_one_way_check_box() {
        homePage.click_one_way_check_box();
    }
    @When("I click link")
    public void i_click_link() throws InterruptedException {
        homePage.click_link();
    }
    @When("I clear text box")
    public void i_clear_text_box() {
      homePage.clear_text_box();
    }
    @Then("I Enter {string} in search input field")
    public void i_Enter_in_search_input_field(String string) {
     homePage.Enter_in_search_input_field(string);
    }
    @Then("I enter {string}")
    public void i_enter(String string) {
      homePage.enter( string);
    }
    @When("I click Find Flight Button")
    public void i_click_Find_Flight_Button() {
   homePage.click_Find_Flight_Button();
    }
    @Then("I should see result")
    public void i_should_see_result() {
    }
// Scenario 03
@When("I should check broken links")
public void i_should_check_broken_links() throws IOException {
    homePage.CheckBrokenLink();
}
    //senario 03
    @When("I should get all page links")
    public void i_should_get_all_page_links() {
        PageLinksList(driver);
    }
}
