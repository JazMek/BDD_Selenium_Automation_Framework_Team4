package step_definitions;
import common.WebAPI;
import home.HomePage;
import home.NetflixWebElements;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.PageFactory;
import java.io.IOException;

import static home.NetflixWebElements.*;

public class HomePage_StepDefinition extends WebAPI {
    @Before
    public void openBrowser() throws IOException { setUp(false, "browserstack", "os", "x", "chrome", "83", "https://www.Netflix.com/");
    }
    @After
    public void closeBrowser() { driver.quit(); driver.close(); }
    static HomePage homePage;
    static NetflixWebElements netflixWebElements;
    public static void init() {
        homePage = PageFactory.initElements(driver, HomePage.class);
        netflixWebElements = PageFactory.initElements(driver, NetflixWebElements.class);
    }
    @Given("I am at Netflix.com home page")
    public void i_am_at_Netflix_com_home_page() {
        init();
    }
    @When("I click on the sign-in button")
    public void i_click_on_the_sign_in_button() {
        init();
        signinButton.click();
        
    }
    @When("I enter my correct email")
    public void i_enter_my_correct_email() {
        init();
        userNameField.sendKeys("team4WDNY2020@gmail.com");
    }
    @When("I enter my pass word")
    public void i_enter_my_pass_word() {
        init();
        passWordField.sendKeys("Team42020");
    }
    @Then("I click on the sign-in button I should log in to my Netflix account")
    public void i_click_on_the_sign_in_button_I_should_log_in_to_my_Netflix_account() {
        init();
        signinButton2.click();
    }
    


}
