package step_definition;
import common.WebAPI;
import home.TdBankWebElements;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.support.PageFactory;
import java.io.IOException;
import static home.TdBankWebElements.*;
public class Products_stepdefinition extends WebAPI {
    @Before
    public void openBrowser() throws IOException {
        setUp(false, "browserstack", "os", "x", "chrome", "83", "https://www.td.com/"); }
    @After
    public void closeBrowser() {
        driver.quit(); }
    static Products_stepdefinition  products_stepdefinition;
    static TdBankWebElements tdBankWebElements;
    public static void init() {
        tdBankWebElements = PageFactory.initElements(driver, TdBankWebElements.class);
        products_stepdefinition = PageFactory.initElements(driver, Products_stepdefinition .class); }
    @Given("i am at tdBank home page")
    public void i_am_at_tdBank_home_page() {
        init();
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
