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



