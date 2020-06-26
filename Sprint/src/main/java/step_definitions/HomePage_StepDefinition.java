package step_definitions;
import common.WebAPI;
import home.HomePage;
import home.SprintWebElements;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.PageFactory;
import java.io.IOException;
import java.sql.SQLException;
import static home.SprintWebElements.*;
public class HomePage_StepDefinition extends WebAPI {
    @Before
    public void openBrowser() throws IOException { setUp(false, "browserstack", "os", "x", "chrome", "83", "https://www.sprint.com/");
    }
    @After
    public void closeBrowser() { driver.close(); driver.quit(); }
    public static  SprintWebElements sprintWebElements;
    public static HomePage_StepDefinition homePage_stepDefinition;
    public static HomePage homePage;
    public static void init() {
        sprintWebElements = PageFactory.initElements(driver, SprintWebElements.class);
        homePage_stepDefinition = PageFactory.initElements(driver, HomePage_StepDefinition.class);
        homePage = PageFactory.initElements(driver, HomePage.class);
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