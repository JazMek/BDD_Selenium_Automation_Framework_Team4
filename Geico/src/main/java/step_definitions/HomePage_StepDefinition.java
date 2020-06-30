package step_Definitions;
//package step_definitions;
import common.WebAPI;
import home.GeicoWebElement;
import static home.GeicoWebElement.*;
import home.HomePage;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.PageFactory;
import java.io.IOException;
public class Homepage_StepDefinition  extends WebAPI {
    @Before
    public void openBrowser() throws IOException { setUp(false, "browserstack", "windows", "10", "chrome", "83", "https://www.Geico.com/");
        init();
    }
    @After
    public void closeBrowser() { driver.quit(); }
    static GeicoWebElement geicoWebElement;
    static HomePage_StepDefinition homePage_stepDefinition;
    static HomePage homePage;
    public static void init() {
        homePage_stepDefinition = PageFactory.initElements(driver, HomePage_StepDefinition.class);
        geicoWebElement = PageFactory.initElements(driver, GeicoWebElement.class);
        homePage = PageFactory.initElements(driver, HomePage.class);
    }
    @Given("I am at geico home page")
    public void i_am_at_geico_home_page() {
    }
    @When("I should check broken links")
    public void i_should_check_broken_links() throws IOException {
        init();
        homePage.CheckBrokenLink();
    }
    //senario 03
    @When("I should get all page links")
    public void i_should_get_all_page_links() {
        PageLinksList(driver);
    }
    @Given("i am at geico home page")
    public void i_am_at_geico_home_page() {
        init();
    }
    @Then("i should get the expected url")
    public void i_should_get_the_expected_url() {
        init();
        String expectedUrl = "https://www.geico.com/";
        getUrl(expectedUrl);
    }
    @Then("Then i click on insarance button")
    public void then_i_click_on_insarance_button() {
        init();
        clickByXpath(insaranceXP);
    }

    @Then("with a mouse hover and click on business button")
    public void with_a_mouse_hover_and_click_on_business_button() {
        init();
        HoverMouseAndClickt(driver, businessInsarance);
    }

    @Then("i scroll to professionnel section")
    public void i_scroll_to_professionnel_section() {
        init();
        PageScrollToElement(professionnel);
    }

    @Then("i click on informations button")
    public void i_click_on_informations_button() {
        init();
        clickByXpath(informationsXP);
    }

    @Then("i get list by id")
    public void i_get_list_by_id() {
        init();
        getListOfWebElementsById(informationsXP);
    }

    @Then("i click on covid19 section")
    public void i_click_on_covid19_section() {
        init();
        clickByXpath(covid19UpdateXP);
    }

    @Then("i get a list from the covid19 page")
    public void i_get_a_list_from_the_covid19_page() {
        init();
        getListOfWebElementsByXPath(covid19TextXP);
    }

    @Then("i click on newCostumer button")
    public void i_click_on_newCostumer_button() {
        init();
        clickOnElement(newCostumerCss, driver);
    }

    @Then("i type on the box showing")
    public void i_type_on_the_box_showing() {
        init();
        clickOnElement(sendKeyCss, driver);
    }

    @Then("i should get and write on the case")
    public void i_should_get_and_write_on_the_case() {
        init();
        typeOnInputBox(sendKeyCss, Birth);
    }

    @Then("i click a make peyement")
    public void i_click_a_make_peyement() {
        init();
        clickByXpath(makePaymentXpath);
    }

    @Then("i click on identification")
    public void i_click_on_identification() {
        init();
        clickByXpath(IdentificationXp);
    }

    @Then("i click for second time")
    public void i_click_for_second_time() {
        init();
        clickByXpath(IdentificationXp);
    }

    @Then("i should get case to type my phone number")
    public void i_should_get_case_to_type_my_phone_number() {
        init();
        typeOnInputBox(senkKesphoneCss, phone);
    }

    @Then("i get a field to enter a zipcode")
    public void i_get_a_field_to_enter_a_zipcode() {
        init();
        typeOnInputBox(zipCss, zipcode);
    }

    @Then("i send a valide  zipcode {string}")
    public void i_send_a_valide_zipcode(String ZipCood) {
        init();
        CheckZIPCood.sendKeys(ZipCood, Keys.ENTER);
    }
}
