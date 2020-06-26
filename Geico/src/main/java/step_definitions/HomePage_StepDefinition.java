package step_definitions;


import common.WebAPI;
import home.HomePage;
import home.WebElements;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;

public class HomePage_StepDefinition extends WebAPI {

    HomePage_StepDefinition homePage_stepDefinition ;
    WebElements webElements;
    HomePage homePage;

    public void init(){
        homePage = PageFactory.initElements(driver,HomePage.class);
        webElements =PageFactory.initElements(driver,WebElements.class);
        homePage_stepDefinition=PageFactory.initElements(driver, HomePage_StepDefinition.class);
    }
    @Before
    public void openBrowser() throws IOException { setUp(false, "browserstack", "ox", "catalina", "chrome", "83", "https://www.geico.com/");
        init();
    }
    @After
    public void closeBrowser() { driver.quit(); }



    @Given("I am at geico home page")
    public void i_am_at_geico_home_page() {

    }

    @When("I Land on the home page I will check if I land in the correct page")
    public void i_Land_on_the_home_page_I_will_check_if_I_land_in_the_correct_page() {
     homePage.Land_on_the_home_page_I_will_check_if_I_land_in_the_correct_page();
    }
    @When("I Land on the home page I will check if the link url is derecting me to the right page")
    public void i_Land_on_the_home_page_I_will_check_if_the_link_url_is_derecting_me_to_the_right_page() {
     homePage.Land_on_the_home_page_I_will_check_if_the_link_url_is_derecting_me_to_the_right_page();
    }
    @When("I land in the home page I should see the text")
    public void i_land_in_the_home_page_I_should_see_the_text() {
     homePage.land_in_the_home_page_I_should_see_the_text();
    }



}