package step_definitions;
import common.WebAPI;
import home.AmazonWebElements;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.PageFactory;
import java.io.IOException;
import static home.AmazonWebElements.*;
public class HomePage_StepDefinition extends WebAPI {
    @Before
    public void openBrowser() throws IOException { setUp(false, "browserstack", "os", "x", "chrome", "83", "https://www.amazon.com/");
    }
    @After
    public void closeBrowser() { driver.quit(); }
    public static  AmazonWebElements amazonWebElements;
    public static HomePage_StepDefinition homePage_stepDefinition;
    public static void init() {
         amazonWebElements= PageFactory.initElements(driver,AmazonWebElements.class);
        homePage_stepDefinition=PageFactory.initElements(driver,HomePage_StepDefinition.class); 
    }
    @Given("I am at Amazon home page")
    public void i_am_at_Amazon_home_page() {
      init();
    }
    @When("I click on the signin button")
    public void i_click_on_the_signin_button() {
        init();
        signin.click();
    }
    @When("I enter my  correct email")
    public void i_enter_my_correct_email() {
        init();
        userNameField.sendKeys("team4WDNY2020@gmail.com");
    }
    @Then("I click on continue button")
    public void i_click_on_continue_button() {
        init();
        continueButton.click();
    }
    @Then("I enter my pass word")
    public void i_enter_my_pass_word() {
        init();
        passWordField.sendKeys("Team42020");
    }
    @Then("I click on the login button I should load in the my Amazon account")
    public void i_click_on_the_login_button_I_should_load_in_the_my_Amazon_account() {
        init();
        loginButton.click();
    }
    @When("I click on the Best Sellers button")
    public void i_click_on_the_Best_Sellers_button() {
        init();
        ClickBestSellers.click();
    }
    @Then("I can verify Best Sellers Url")
    public void i_can_verify_Best_Sellers_Url() {
        init();
        driver.getCurrentUrl();
        Assert.assertEquals(ExpectedUrl,driver.getCurrentUrl()); 
    }
    @When("i Click on Books")
    public void i_Click_on_Books() {
        ClickBooks.click();
    }
    @Then("I Verify Books Url")
    public void i_Verify_Books_Url() {
        Assert.assertEquals(ExpectedUrl1,driver.getCurrentUrl());
    }
    @Then("I can chose the best book")
    public void i_can_chose_the_best_book() {
        ChooseTheBestBook.click();
    }
    @Then("I can Select PaperBack Format for the best book")
    public void i_can_Select_PaperBack_Format_for_the_best_book() {
        SelectPaperBackFormat.click();
    }
    @Then("I can Add my Book To the shopping Cart")
    public void i_can_Add_my_Book_To_the_shopping_Cart() {
        AddToCart.click();
    }
    @Given("I Enter Hand sanitizer in search input field")
    public void i_Enter_Hand_sanitizer_in_search_input_field() {
   
    }
    @When("I click search button")
    public void i_click_search_button() {
        SearchBox.click();
    }
    @Then("I should see Hand sanitizer")
    public void i_should_see_Hand_sanitizer() {
    }
    
    @Given("I Enter <product> in search input field")
    public void i_Enter_product_in_search_input_field() {
       
    }



}