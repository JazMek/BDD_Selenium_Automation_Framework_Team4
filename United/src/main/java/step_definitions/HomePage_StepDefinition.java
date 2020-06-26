package step_definitions;
import common.WebAPI;

import dataBase.UnitedList;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.io.IOException;

import static home.HomePage.*;



public class HomePage_StepDefinition extends WebAPI {

    @Before

    public void openBrowser() throws IOException { setUp(false, "browserstack", "ox", "catalina", "chrome", "83", "https://www.united.com/");
        init();

    }
    @After
    public void closeBrowser() { driver.quit(); }

//    You can implement missing steps with the snippets below:
    public UnitedList user1;
    @Given("I am at United home page")
    public void i_am_at_United_home_page() {
      homePage.am_at_United_home_page();
    }

    @When("I click on the BookLink")
    public void i_click_on_the_BookLink() {
      homePage.click_on_the_BookLink();
    }

    @When("I click on the checkBoxOneWay")
    public void i_click_on_the_checkBoxOneWay() {
     homePage.click_on_the_checkBoxOneWay();
    }

    @When("I click on the FromTextField")
    public void i_click_on_the_FromTextField() {
     homePage.click_on_the_FromTextField();
    }

    @When("I click on the FromTextField_ClearButton")
    public void i_click_on_the_FromTextField_ClearButton() {
     homePage.click_on_the_FromTextField_ClearButton();
    }
   @When("I enter the value {string} on FromTextField")
    public void i_enter_the_value_on_FromTextField(UnitedList user1) {
       homePage.enter_the_value_on_FromTextField(user1);
   }

   @When("I enter the value {string} on ToTextField")
    public void i_enter_the_value_on_ToTextField(UnitedList user1) {
      homePage.enter_the_value_on_ToTextField(user1);
  }

    @When("I click on DepartDateLink")
    public void i_click_on_DepartDateLink() {
     homePage.click_on_DepartDateLink();
    }

    @When("I click on Month_ClickBtn1")
    public void i_click_on_Month_ClickBtn1() {
     homePage.click_on_Month_ClickBtn1(user1);
    }

    @When("I click on DepartDate")
    public void i_click_on_DepartDate() {
     homePage.click_on_DepartDate();
    }

    @When("I click on TravelersPassengers")
    public void i_click_on_TravelersPassengers() {
     homePage.click_on_TravelersPassengers();
    }

    @When("I click on Adults")
    public void i_click_on_Adults() {
     homePage.click_on_Adults(user1);
    }

    @When("I click on Seniors")
    public void i_click_on_Seniors() {
    homePage.click_on_Seniors(user1);
    }

    @When("I click on Children")
    public void i_click_on_Children() {
    homePage.click_on_Children(user1);
    }

    @When("I click on exitButton")
    public void i_click_on_exitButton() {
     homePage.click_on_exitButton();
    }

    @When("I click on Find_flightsButton")
    public void i_click_on_Find_flightsButton() {
    homePage.click_on_Find_flightsButton();
    }

    @Then("navigate bacward")
    public void navigate_bacward() {
    homePage.navigatebacward();
    }




}

