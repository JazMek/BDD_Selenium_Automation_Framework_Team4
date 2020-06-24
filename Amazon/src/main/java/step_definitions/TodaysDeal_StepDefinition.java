package step_definitions;
import common.WebAPI;
import home.AmazonWebElements;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.PageFactory;
import java.io.IOException;
import static home.AmazonWebElements.*;
import static org.apache.xmlbeans.XmlBeans.getTitle;
import static org.apache.xmlbeans.impl.common.XBeanDebug.log;

public class TodaysDeal_StepDefinition extends WebAPI {
    @Before
    public void openBrowser() throws IOException { setUp(false, "browserstack", "os", "x", "chrome", "83", "https://www.amazon.com/");
    }
    @After
    public void closeBrowser() { driver.quit(); }
    static AmazonWebElements amazonWebElements;
    public static void init() {
        amazonWebElements= PageFactory.initElements(driver,AmazonWebElements.class); }

        //login to amazon/01

    @Given("I am at Amazon home page")
    public void i_am_at_Amazon_home_page() {
        init(); }
    @When("I click on the signin button")
    public void i_click_on_the_signin_button() {
        init();
        Asignin.click(); }
    @When("I enter my  correct email")
    public void i_enter_my_correct_email() {
        init();
        AuserNameField.sendKeys("team4WDNY2020@gmail.com"); }
    @Then("I click on continue button")
    public void i_click_on_continue_button() {
        init();
        AcontinueButton.click();}
    @Then("I enter my pass word")
    public void i_enter_my_pass_word() {
        init();
        ApassWordField.sendKeys("Team42020");}
    @Then("I click on the login button I should load in the my Amazon account")
    public void i_click_on_the_login_button_I_should_load_in_the_my_Amazon_account() {
        init();
        AloginButton.click(); }

//get the title/02
    @Then("I should get the page title")
    public void i_should_get_the_page_title() {
        init();
       String message="Amazon is launching";
         log(message);
         // getTitle();
    }
//      //todaysDealPage/03
    @Then("i should click in the todays deals button and get the next page")
    public void ishould_click_in_the_todays_deals_button_and_get_the_next_page() {
      init();
         todaysDealsButton.click();}
    @Then("i should have option to subscribe to todays deals then get back to the main page")
    public void i_should_have_option_to_subscribe_to_todays_deals_then_get_back_to_the_main_page() {
         init();
          SubscribeButton.click();}
//   // todys deal/warehouse/all departements/04
    @Then("i click on warehouse section")
    public void i_click_on_warehouse_section() {
        init();
        warehouseSection.click(); }
    @Then("i want to see all werehouse departements")
    public void i_want_to_see_all_werehouse_departements() {
        init();
        seeAllCategories.click(); }
//    //todys deal/AmazonDevices/aDD toCarte/05
    @Then("i should have a check box to select Amazon devices")
    public void i_should_have_a_check_box_to_select_Amazon_devices() {
        init();
        amazonDevice.click();}
    @Then("i should  want to get option to add to cart")
    public void i_should_want_to_get_option_to_add_to_cart() {
        init();
        AddToCart.click(); }

//scrol left or right

    @Then("i want to explore the next section*\\/")
    public void i_want_to_explore_the_next_section() {
       init();
        PageScrollToElement(rightArow); }
    @Then("i want to get option to scroll left or right")
    public void i_want_to_get_option_to_scroll_left_or_right() {
        PageScrollToElement(leftArow); }
// filter/sortBy
    @Then("i want to get sort by option")
    public void i_want_to_get_sort_by_option() {
        init();
        sortBy.click(); }
 //check all categories
    @Then("i want to check all categories dealOfTheDay page")
    public void i_want_to_check_all_categories_dealOfTheDay_page() {
        init();
        clickByXpath(dealOfTheDayXP);
        navigateBack(); }
    @Then("i want to check lightningDeal page")
    public void i_want_to_check_lightningDeal_page() {
        init();
        clickByXpath( lightningDealXP);
        navigateBack(); }
    @Then("i want to check savingDeal page")
    public void i_want_to_check_savingDeal_page() {
        init();
        clickByXpath(savingDealXP);
        navigateBack(); }
    @Then("i want to check coupons page")
    public void i_want_to_check_coupons_page() {
        init();
        clickByXpath(couponsXP);
        navigateBack(); }
    @Then("i want to check primeAccess page")
    public void i_want_to_check_primeAccess_page() {
        init();
        clickByXpath( primeAccessXP);
        cleanUp(); }

    @Then("i want to check   WootDeal page")
    public void i_want_to_check_WootDeal_page() {
       init();
       clickByXpath(WootDealXP);
        navigateBack(); }
//check all categories
    @Then("i want to check DigitalDeal page")
    public void i_want_to_check_DigitalDeal_page() {
        init();
        clickByXpath(DigitalDealXP);
        navigateBack(); }
    @Then("i want to check outlest page")
    public void i_want_to_check_outlest_page() {
       init();
       clickByXpath(outlestXP);
        navigateBack(); }
    @Then("i want to check  renewedDeals page")
    public void i_want_to_check_renewedDeals_page() {
       init();
       clickByXpath(renewedDealsXP);
        navigateBack(); }
    @Then("i want to check  wareHouseDeal page")
    public void i_want_to_check_wareHouseDeal_page() {
     init();
     clickByXpath(wareHouseDealXp);
    }
    //scroll down and up
    @Then("i scroll down to element")
    public void i_scroll_down_to_element() {
        init();
        Page_Scroll_DownToElement(next); }
    @Then("i should have option to click to get to top of the page")
    public void i_should_have_option_to_click_to_get_to_top_of_the_page() {
        init();
       backtoTop.click(); }
    @Then("I should enter data in search field")
    public void i_should_enter_data_in_search_field() throws InterruptedException {
init();
sleepFor(4);
typeByXpath( searchXP,"iphone xs");
clickByXpath(searchButtonXP);
    }
}



