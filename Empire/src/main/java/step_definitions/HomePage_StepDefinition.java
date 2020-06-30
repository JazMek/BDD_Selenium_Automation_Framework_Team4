package step_Definitions;
import common.WebAPI;
import home.EmpireWebElements;
import home.HomePage;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.PageFactory;
import java.io.IOException;
public class Homepage_StepDefinition extends WebAPI {
    @Before
    public void openBrowser() throws IOException { setUp(false, "browserstack", "windows", "10", "chrome", "83", "https://www.empire.com/");
        init();
    }
    @After
    public void closeBrowser() { driver.quit(); }
    static EmpireWebElements empireWebElements;
    static HomePage homePage;
    public static void init() {

        empireWebElements = PageFactory.initElements(driver, EmpireWebElements.class);
        homePage = PageFactory.initElements(driver, HomePage.class);
    }
    @Given("I am at empire home page")
    public void i_am_at_empire_home_page() {
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
}
// package step_definitions;
// import common.WebAPI;
// import home.EmpireWebElement;
// import io.cucumber.java.After;
// import io.cucumber.java.Before;
// import io.cucumber.java.en.Given;
// import io.cucumber.java.en.Then;
// import io.cucumber.java.en.When;
// import org.openqa.selenium.By;
// import org.openqa.selenium.WebElement;
// import org.openqa.selenium.support.PageFactory;

// import java.io.IOException;

// import static home.EmpireWebElement.*;

// public class HomePage_StepDefinition extends WebAPI {
//     @Before
//     public void openBrowser() throws IOException { setUp(false, "browserstack", "os", "x", "chrome", "83", "https://www.empireblue.com/");
//     }
//     @After
//     public void closeBrowser() { driver.quit(); }

//     static  HomePage_StepDefinition homePage_stepDefinition;
//     static EmpireWebElement empireWebElement;
//     public static void init() {
//         homePage_stepDefinition= PageFactory.initElements(driver,HomePage_StepDefinition.class);
//         empireWebElement= PageFactory.initElements(driver, EmpireWebElement.class);
//     }


//     @Given("I am at Empire home page")
//     public void i_am_at_Empire_home_page() {

//     }

//     @When("I click on the Individual And Family button a Page should dropdown")
//     public void i_click_on_the_Individual_And_Family_button_a_Page_should_dropdown() {
//       init();
//         IndividualAndFamily.click();
//     }
//     @Then("the page should scrolldown to view element wich is Language")
//     public void the_page_should_scrolldown_to_view_element_wich_is_Language() {
//         init();
//         WebElement SelectLanguage = driver.findElement(By.xpath("//*[@id=\"mbr-page-wrapper\"]/div[2]/div[2]/div[2]/main/div[16]/div/div/div/div/div/div/div[2]/p[2]/a"));
//         scrollIntoView(SelectLanguage,driver);
//     }

//     @When("I click on Language button it should dropdown propprly")
//     public void i_click_on_Language_button_it_should_dropdown_propprly() {
//        init();
//         selectLanguage.click();
//     }

//     @When("I click on chineese the page should translate")
//     public void i_click_on_chineese_the_page_should_translate() {
//      init();
//         selectChineeseLanguage.click();
//     }
//     @When("I click on HealthInsurance the page should display properly")
//     public void i_click_on_HealthInsurance_the_page_should_display_properly() {
//         init();
//         HealthInsurance.click();
//     }

//     @Then("the HealthInsurance page should scrolldown to the end of the page")
//     public void the_HealthInsurance_page_should_scrolldown_to_the_end_of_the_page() {
//        init();
//         scrollPageDown(driver);
//     }

//     @Then("the page should wait for {int} sec for the page to display properly")
//     public void the_page_should_wait_for_sec_for_the_page_to_display_properly(Integer int1) throws InterruptedException {
//        init();
//         sleepFor(10);
//     }
//     @When("I will enter my user name in the username box it should be entered properly")
//     public void i_will_enter_my_user_name_in_the_username_box_it_should_be_entered_properly() {
//        init();
//         UserName.sendKeys("msalah89");
//     }

//     @Then("I will enter my PassWord in the PassWord box it should be entered properly")
//     public void i_will_enter_my_PassWord_in_the_PassWord_box_it_should_be_entered_properly() {
//         init();
//         PassWord.sendKeys("JSK Matoub lounes Milles feuilles frittes omlettes");
//     }
//     @When("I click on VisionInsurance button the page should display properly")
//     public void i_click_on_VisionInsurance_button_the_page_should_display_properly() {
//         init();
//         VisionInsurance.click();
//     }

//     @Then("the VisionInsurance page should be refreshed")
//     public void the_VisionInsurance_page_should_be_refreshed() {
//        init();
//         driver.navigate().refresh();
//     }

//     @Then("the VisionInsurance page should be scrolled down to the end")
//     public void the_VisionInsurance_page_should_be_scrolled_down_to_the_end() {
//        init();
//         scrollPageDown(driver);
//     }

//     @Then("the page should be closed")
//     public void the_page_should_be_closed() {
//         init();
//         driver.close();
//     }
//     @Given("i am at medcaide page")
//     public void i_am_at_medcaide_page() {
//         init(); }
//     @Then("i should get the actual url")
//     public void i_should_get_the_actual_url() {
//         init();
//         String expectedUrl="https://mss.empireblue.com/ny/home.html";
//         getUrl( expectedUrl); }

//     @Then("with mouse over and click i should open the benefits page")
//     public void with_mouse_over_and_click_i_should_open_the_benefits_page() {
//         init();
//         mouseHoverByXpath(benefitsXP); }
//     @Then("with mouse over and click i should open the enrollement page")
//     public void with_mouse_over_and_click_i_should_open_the_enrollement_page() {
//         init();
//         mouseHoverByXpath(enrollementXP); }
//     @Then("with mouse over and click i should open the care page")
//     public void with_mouse_over_and_click_i_should_open_the_care_page() {
//         init();
//         mouseHoverByXpath(careXP); }
//     @Then("i on login button click i should open the login page")
//     public void i_on_login_button_click_i_should_open_the_login_page() {
//         init();
//         clickByXpath(loginXp); }
//     @Then("i on language button click i should open the language page")
//     public void i_on_language_button_click_i_should_open_the_language_page() {
//         init();
//         clickByXpath(languageXp); }
//     @Then("i on contact button click i should open the contact page")
//     public void i_on_contact_button_click_i_should_open_the_contact_page() {
//         init();
//         clickByXpath(contactUsXP); }
//     @Then("i on findADocteur button click i should open the findADocteur page")
//     public void i_on_findADocteur_button_click_i_should_open_the_findADocteur_page() {
//         init();
//         clickByXpath(findADocteurXp); }
//     @Then("i on makeApayment button click i should open the makeApayment page")
//     public void i_on_makeApayment_button_click_i_should_open_the_makeApayment_page() {
//         init();
//         clickByXpath(makeApaymentXP); }
//     @Then("i on Enroll button click i should open the Enroll page")
//     public void i_on_Enroll_button_click_i_should_open_the_Enroll_page() {
//         init();
//         clickByXpath(EnrollXP); }
//     @Then("i on renew button click i should open the renew page")
//     public void i_on_renew_button_click_i_should_open_the_renew_page() {
//         init();
//         clickByXpath(renewXP); }
//     @Then("i on  id button click i should open the  id page")
//     public void i_on_id_button_click_i_should_open_the_id_page() {
//         init();
//         clickByXpath(idXP); }
// }
