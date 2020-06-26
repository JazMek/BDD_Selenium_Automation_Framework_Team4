package step_Definitions;

import common.WebAPI;
import home.GeicoWebElement;
import home.HomePage;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
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
    static HomePage homePage;
    public static void init() {

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
}





