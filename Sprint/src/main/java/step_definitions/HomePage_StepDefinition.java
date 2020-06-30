package step_Definitions;
//package step_definitions;
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
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.Keys;
import static home.SprintWebElement.*;
public class Homepage_StepDefinition extends WebAPI {
    @Before
    public void openBrowser() throws IOException { setUp(false, "browserstack", "os", "x", "chrome", "83", "https://www.sprint.com/");
    }

    @After
    public void closeBrowser() {driver.quit();}
    static HomePage homePage;
    static HomePage_StepDefinition homePage_stepDefinition;
    static SprintWebElements sprintWebElements;
    public static void init() {
        homePage = PageFactory.initElements(driver, HomePage.class);
        sprintWebElements = PageFactory.initElements(driver, SprintWebElements.class);
          homePage_stepDefinition = PageFactory.initElements(driver, HomePage_StepDefinition.class);
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
    
    @Given("I am at Sprint Home Page")
    public void i_am_at_Sprint_Home_Page() throws IOException {
        init();
    }
    @Given("i click on Search box button")
    public void i_click_on_Search_box_button() {
        init();
        searchBox.click();
    }
    @Given("And I Enter {string} in Search Field")
    public void and_I_Enter_in_Search_Field(String string) {
        init();
        enterDataSearchBox.sendKeys(string);
    }
    @When("I click Keyboard Enter button")
    public void i_click_Keyboard_Enter_button() {
        init();
        enterDataSearchBox.sendKeys(Keys.ENTER);
    }
    @Then("I should see \"\"product\"\"")
    public void i_should_see_product() {

    }
    @Then("the Browser should close")
    public void the_Browser_should_close() {
        init();
    }
    @Then("I should see \"\"Samsung 8S\"\"")
    public void i_should_see_Samsung_8S() {
        init();
    }
    @Then("I should see \"\"Ipad\"\"")
    public void i_should_see_Ipad() {
        init();
    }
    @Then("I should see \"\"phone case\"\"")
    public void i_should_see_phone_case() {
        init();
    }
    @Then("I should see \"\"payements\"\"")
    public void i_should_see_payements() {
    }
    @Then("I should see \"\"device\"\"")
    public void i_should_see_device() {
    }
    @Then("I should see \"\"Watches\"\"")
    public void i_should_see_Watches() {
    }
    @Then("I should see \"\"Tablets\"\"")
    public void i_should_see_Tablets() {
    }
    @Then("I should see \"\"Other plans\"\"")
    public void i_should_see_Other_plans() {
    }
    @Then("I should see \"\"Add-on services\"\"")
    public void i_should_see_Add_on_services() {
    }
    @Then("I should see \"\"Network\"\"")
    public void i_should_see_Network() {
    }
    @Then("I should see {string} 5G\"\"")
    public void i_should_see_5G(String string) {
    }
    @Then("I should see \"\"Express Pay\"\"")
    public void i_should_see_Express_Pay() {
    }
    @Then("I should see \"\"Check Order Status\"\"")
    public void i_should_see_Check_Order_Status() {
    }
    @Then("I can check broken links")
    public void i_can_check_broken_links() throws IOException, InterruptedException {
        Check_brokenLink();
    }
    @When("I click on the sign-in button")
    public void i_click_on_the_sign_in_button() {
        
    }

    @When("I enter my correct email")
    public void i_enter_my_correct_email() {
      
    }

    @When("I enter my pass word")
    public void i_enter_my_pass_word() {
      
    }
    @Then("I click on the sign-in button I should log in to my Sprint account")
    public void i_click_on_the_sign_in_button_I_should_log_in_to_my_Sprint_account() {
       
    }
    @When(": i enter item in search field i see result")
    public void i_enter_item_in_search_field_i_see_result() throws InterruptedException, SQLException, ClassNotFoundException, IOException {
        HomePage.enter_item_in_search_field_i_see_result();
    }

}