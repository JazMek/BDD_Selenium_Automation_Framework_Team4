package step_definitions;
import common.WebAPI;
import home.TD_BankWebElement;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.PageFactory;
import java.io.IOException;
import static home.TD_BankWebElement.*;
public class HomePage_StepDefinition extends WebAPI {
    @Before
    public void openBrowser() throws IOException {
        setUp(false, "browserstack", "os", "x", "chrome", "83", "https://www.tdbank.com/");
    }

    @After
    public void closeBrowser() {
        driver.quit();
    }

    static HomePage_StepDefinition homePage_stepDefinition;
    static TD_BankWebElement td_bankWebElement;

    public static void init() {
        homePage_stepDefinition = PageFactory.initElements(driver, HomePage_StepDefinition.class);
        td_bankWebElement = PageFactory.initElements(driver, TD_BankWebElement.class);
    }
    @Given("I am at TD_Bank home page")
    public void i_am_at_TD_Bank_home_page() {
       init();
    }

    @When("I click on the InvestingAndWealth button the page should land properly")
    public void i_click_on_the_InvestingAndWealth_button_the_page_should_land_properly() {
    init();
        InvestingAndWealth.click();
    }

    @Then("The InvestingAndWealth Page should scrolldown to the end")
    public void the_InvestingAndWealth_Page_should_scrolldown_to_the_end() {
       init();
        scrollPageDown(driver);
    }@Then("I hover mouse on IndividualsAndFamilies button it should change a color")
    public void i_hover_mouse_on_IndividualsAndFamilies_button_it_should_change_a_color() {
     init();
        HoverMouseAndClickt(driver,IndividualsAndFamilies);

    }

    @Then("I click on IndividualsAndFamilies button the page should land properly")
    public void i_click_on_IndividualsAndFamilies_button_the_page_should_land_properly() {
       init();
        IndividualsAndFamilies.click();

    }

    @Then("I will type on the question {string} it should be typeable")
    public void i_will_type_on_the_question_it_should_be_typeable(String string) {
       init();
        IndividualsAndFamiliesSearchBox.sendKeys("one million dollar");
    }

    @When("I clear up the box it should clear")
    public void i_clear_up_the_box_it_should_clear() {
      init();
        clearInputBox(IndividualsAndFamiliesSearchBox);
    }

    @When("I will type again a other work it should be typeable")
    public void i_will_type_again_a_other_work_it_should_be_typeable() {
     init();
        IndividualsAndFamiliesSearchBox.sendKeys("how to open a saving account");

    }

    @Then("I will click on the search button it should activate the search")
    public void i_will_click_on_the_search_button_it_should_activate_the_search() throws InterruptedException {
      init();
      SearchButton.click();
        sleepFor(5);
    }
    @Then("I hover mouse on BusinessOwners button it should change a color")
    public void i_hover_mouse_on_BusinessOwners_button_it_should_change_a_color() {
        init();
        HoverMouseAndClickt(driver,BusinessOwners);
    }

    @Then("I click on BusinessOwners button the page should land properly")
    public void i_click_on_BusinessOwners_button_the_page_should_land_properly() {
       init();
        BusinessOwners.click();
    }

    @Then("I the BusinessOwners page should scrolldown to view element {string} Button")
    public void i_the_BusinessOwners_page_should_scrolldown_to_view_element_Button(String string) {
    init();
        scrollIntoView(TopButton,driver);
    }

    @When("I click on Top button the page should scrollUp")
    public void i_click_on_Top_button_the_page_should_scrollUp() {
     init();
     TopButton.click();
    }
    @When("I hover mouse on RetirementPlanning button it should change a color")
    public void i_hover_mouse_on_RetirementPlanning_button_it_should_change_a_color() {
        init();
        HoverMouseAndClickt(driver,RetirementPlanning);
    }

    @Then("I click on RetirementPlanning The page should land properly")
    public void i_click_on_RetirementPlanning_The_page_should_land_properly() {
      init();
        RetirementPlanning.click();
    }
    @Then("I click on the Video should display properly")
    public void i_click_on_the_Video_should_display_properly() throws InterruptedException {
      init();
      RetirementPlanningVideo.click();
        sleepFor(5);
    }

    @Then("I cklick on video close button should close")
    public void i_cklick_on_video_close_button_should_close() {
      init();
        RetirementPlanningVideoClosebutton.click();
    }
    @When("I hover mouse on TdAmeritrade button it should change a color")
    public void i_hover_mouse_on_TdAmeritrade_button_it_should_change_a_color() {
  init();
        HoverMouseAndClickt(driver,TdAmeritrade);
    }

    @When("I click on TdAmeritrade button the page should land properly")
    public void i_click_on_TdAmeritrade_button_the_page_should_land_properly() {
      init();
        TdAmeritrade.click();
    }

    @When("The page should scroll To view element Special Offer Details Display Button")
    public void the_page_should_scroll_To_view_element_Special_Offer_Details_Display_Button() {
       init();
        scrollIntoView(SpecialOfferDetailsDisplayButton1,driver);
    }

    @Then("I click on Special Offer Details DisplayButton the page should land properly")
    public void i_click_on_Special_Offer_Details_DisplayButton_the_page_should_land_properly() {
       init();
        SpecialOfferDetailsDisplayButton.click();
    }
    @Then("with mouse hover i should explore the products page")
    public void with_mouse_hover_i_should_explore_the_products_page() {
        init();
        HoverMouseAndClickt( driver,products );
    }

    @Then("i click on Checking i should see the page")
    public void i_click_on_Checking_i_should_see_the_page() {
        init();
        clickByXpath(CheckingXp );
    }

    @Then("i click on Savings i should see the page")
    public void i_click_on_Savings_i_should_see_the_page() {
        init();
        clickByXpath(SavingsXP );
    }

    @Then("i click on CDs i should see the page")
    public void i_click_on_CDs_i_should_see_the_page() {
        init();
        clickByXpath(CDsXP );
    }

    @Then("i click on CreditCards i should see the page")
    public void i_click_on_CreditCards_i_should_see_the_page() {
        init();
        clickByXpath(CreditCardsXP );
    }

    @Then("i click on HomeEquityLoansLines i should see the page")
    public void i_click_on_HomeEquityLoansLines_i_should_see_the_page() {
        init();
        clickByXpath(HomeEquityLoansLinesXP);
    }

    @Then("i click on Mortgage i should see the page")
    public void i_click_on_Mortgage_i_should_see_the_page() {
        init();
        clickByXpath( MortgageXP );
    }

    @Then("i click on PersonalLoans i should see the page")
    public void i_click_on_PersonalLoans_i_should_see_the_page(){
        init();
        clickByXpath(PersonalLoansXP );
    }

    @Then("i click on IRAsXP i should see the page")
    public void i_click_on_IRAsXP_i_should_see_the_page() {
        init();
        clickByXpath(IRAsXP );
    }

    @Then("i click on PrepaidCards i should see the page")
    public void i_click_on_PrepaidCards_i_should_see_the_page() {
        init();
        clickByXpath(PrepaidCardsXP );
    }

    @Then("i click on SpecialOffers i should see the page")
    public void i_click_on_SpecialOffers_i_should_see_the_page() {
        init();
        clickByXpath(SpecialOffersXP );
    }

}