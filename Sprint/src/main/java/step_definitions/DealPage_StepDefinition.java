package step_definitions;
import common.WebAPI;
import home.SprintPageWebElement;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.support.PageFactory;
import java.io.IOException;

import static home.SprintPageWebElement.*;

public class DealPage_StepDefinition extends WebAPI {
    @Before
    public void openBrowser() throws IOException {
        setUp(false, "browserstack", "os", "x", "chrome", "83", "https://www.sprint.com/"); }
    @After
    public void closeBrowser() {
        driver.quit(); }
    static DealPage_StepDefinition  dealPage_stepDefinition;
    static SprintPageWebElement sprintPageWebElement;
    public static void init() {
        sprintPageWebElement = PageFactory.initElements(driver, SprintPageWebElement.class);
        dealPage_stepDefinition = PageFactory.initElements(driver, DealPage_StepDefinition .class); }
    @Given("i am at sprint home page")
    public void i_am_at_sprint_home_page() {
        init(); }
    @Then("i click on deal button")
    public void i_click_on_deal_button() {
       init();
        clickOnElement( dealCss);
    }

    @Then("i click on show now button")
    public void i_click_on_show_now_button() {
      init();
        clickByXpath(showNowXP);
    }

    @Then("i click on storage button")
    public void i_click_on_storage_button() {
       init();
        clickByXpath(StorageCss);
    }

    @Then("i click to chose the colour")
    public void i_click_to_chose_the_colour() {
       init();
        clickOnElement(ClrCss);
    }

    @Then("i click to get back to all phones")
    public void i_click_to_get_back_to_all_phones() {
      init();
        clickByXpath(AllPhonesXp);
    }

    @Then("i click on filter section")
    public void i_click_on_filter_section() {
       init();
        clickOnElement(filterCss);
    }

    @Then("i click to select samsung")
    public void i_click_to_select_samsung() {
        init();
        clickOnElement(samsungCss);
    }

    @Then("i should get list of devices")
    public void i_should_get_list_of_devices() {
       init();
        getTextFromWebElements(listCss,driver);
    }

    @Then("i click on sign in")
    public void i_click_on_sign_in() {
        init();
        clickByXpath(signInXP);
    }

    @Then("i click to check the status")
    public void i_click_to_check_the_status() {
        init();
        clickOnElement(checkStatusCss);
    }

    @Then("i get title")
    public void i_get_title() {
        init();
        String expected="OM Dashboard";
        getTitle(expected);
    }
    @Then("in should get text")
    public void in_should_get_text() {
        init();
        getTextByCss(imageCss);
    }

    @Then("i take a screen shot")
    public void i_take_a_screen_shot() {
       init();
        String iphone="iphone";

        captureScreenshot(driver,iphone);
    }


}
