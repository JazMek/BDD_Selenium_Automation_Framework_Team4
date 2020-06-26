package step_definitions;

import common.WebAPI;
import home.SprintWebElement;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;

import static home.SprintWebElement.*;

public class HomePage_StepDefinition extends WebAPI {
    @Before
    public void openBrowser() throws IOException {
        setUp(false, "browserstack", "os", "x", "chrome", "83", "https://www.sprint.com/");
    }

    @After
    public void closeBrowser() {
        driver.quit();
    }

    static HomePage_StepDefinition homePage_stepDefinition;
    static SprintWebElement sprintWebElement;

    public static void init() {
        homePage_stepDefinition = PageFactory.initElements(driver, HomePage_StepDefinition.class);
        sprintWebElement = PageFactory.initElements(driver, SprintWebElement.class);
    }

    @Given("I am at Sprint home page")
    public void i_am_at_Sprint_home_page() {
        init();
    }

    @When("I hover mouse on the Plans button The Page should dropdown properly")
    public void i_hover_mouse_on_the_Plans_button_The_Page_should_dropdown_properly() {
        init();
        HoverMouseAndClickt(driver, Plans);
    }

    @Then("I click on  UnlimitedPlans the page sould land properly")
    public void i_click_on_UnlimitedPlans_the_page_sould_land_properly() {
        UnlimitedPlans.click();
    }

    @Then("I hover mouse on the OurUnlimitedPlan")
    public void i_hover_mouse_on_the_OurUnlimitedPlan() {
        init();
        HoverMouseAndClickt(driver,OurUnlimitedPlan);
    }

    @Then("The OurUnlimitedPlan Page should scrolldown to the end of the page")
    public void the_OurUnlimitedPlan_Page_should_scrolldown_to_the_end_of_the_page() {
        init();
        scrollPageDown(driver);
    }
    @Then("I hover mouse on the UsVsThemPlan")
    public void i_hover_mouse_on_the_UsVsThemPlan() {
        init();
        HoverMouseAndClickt(driver,UsVsThemPlan);

    }

    @When("I click on UsVsThemPlan button the page should land properly")
    public void i_click_on_UsVsThemPlan_button_the_page_should_land_properly() {
       init();
        UsVsThemPlan.click();
    }

    @When("I click four times on the next Icon button the numbers should go from {int}-{int}")
    public void i_click_four_times_on_the_next_Icon_button_the_numbers_should_go_from(Integer int1, Integer int2) {
       init();
        for(int i=0;i<4;i++){
            UsVsNextIcon.click();}
    }

    @Then("I click four times on Previous Icon button the numbers should go back fom {int}-{int}")
    public void i_click_four_times_on_Previous_Icon_button_the_numbers_should_go_back_fom(Integer int1, Integer int2) {
       init();
        for(int i=4;i>0;i--){
            UsVsPreviousIcon.click();}
    }

    @Then("I the page should scrolldown to the end of the page")
    public void i_the_page_should_scrolldown_to_the_end_of_the_page() {
       init();
        scrollPageDown(driver);
    }
    @Then("I click on  OtherPlansPlan the page sould land properly")
    public void i_click_on_OtherPlansPlan_the_page_sould_land_properly() {
        HoverMouseAndClickt(driver,OtherPlansPlan);
        OtherPlansPlan.click();
    }

    @Then("The OtherPlansLearnMore scrolldown to view")
    public void the_OtherPlansLearnMore_scrolldown_to_view() {
   init();
        scrollIntoView(OtherPlansLearnMore,driver);
    }

    @Then("I click on OtherPlansLearnMore the page should land properly")
    public void i_click_on_OtherPlansLearnMore_the_page_should_land_properly() {
   init();
        OtherPlansLearnMore.click();
    }
    @Then("I should get get The page title")
    public void i_should_get_get_The_page_title() {
        init();
        String title = driver.getTitle();
        String  expectedTitle="Other Plans From Sprint";
        Assert.assertEquals(title, expectedTitle, "title doesn't match");
    }
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





