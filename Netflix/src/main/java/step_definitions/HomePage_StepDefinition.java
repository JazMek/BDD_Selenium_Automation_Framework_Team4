package step_Definitions;
//package step_definitions;
import common.WebAPI;
import home.HomePage;
import home.NetflixWebElement;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.PageFactory;
import java.io.IOException;
import static home.NetflixWebElement.*;
public class HomePage_StepDefinition extends WebAPI {
    @Before
    public void openBrowser() throws IOException { setUp(false, "browserstack", "os", "x", "chrome", "83", "https://www.Netflix.com/");
    }
    @After
    public void closeBrowser() { driver.quit(); }
    static NetflixWebElements netflixWebElements;
    static  HomePage_StepDefinition homePage_stepDefinition;
    static HomePage homePage;
    public static void init() {
         homePage_stepDefinition= PageFactory.initElements(driver,HomePage_StepDefinition.class);
        netflixWebElement = PageFactory.initElements(driver, NetflixWebElement.class);
        homePage = PageFactory.initElements(driver, HomePage.class);
    }
    @Given("I am at netflix home page")
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

   // scenario 03
   @Then("I click on sign in Button")
   public void i_click_on_sign_in_Button() {
homePage.click_on_sign_in_Button();
   }

    @Then("I enter user name in userNameField")
    public void i_enter_user_name_in_userNameField() {
        homePage.enter_user_name_in_userNameField();
    }

    @Then("I enter password in the  passWordField")
    public void i_enter_password_in_the_passWordField() {
        homePage.enter_password_in_the_passWordField();
    }

    @When("i click on signin button i login my account")
    public void i_click_on_signin_button_i_login_my_account() {
homePage.click_on_signin_button_i_login_my_account();
    }

@Given("I am at Netflix home page")
    public void i_am_at_Netflix_home_page() {
       init();
        signinButton.click();
    }

    @When("I enter my  correct email")
    public void i_enter_my_correct_email() {
       init();
        userNameField.sendKeys("team4WDNY2020@gmail.com");
    }

    @When("I enter my pass word")
    public void i_enter_my_pass_word() {
      init();
        passWordField.sendKeys("Team42020");
    }

    @Then("I click on the login button I should load in the my netflix account")
    public void i_click_on_the_login_button_I_should_load_in_the_my_netflix_account() {
       init();
        signinButton2.click();
    }
    @Then("I click on Team4 profile the page should display properly")
    public void i_click_on_Team4_profile_the_page_should_display_properly() {
    init();
        clickByXpath(Team4ProfileXP);
    }
    @Then("I click Dvd button the page should land properly")
    public void i_click_Dvd_button_the_page_should_land_properly() {
        init();
        clickByXpath(DVDButtonXP);
    }

    @Then("I should get the expected Text")
    public void i_should_get_the_expected_Text() {
       init();
        String expectedTitle="Rent Movies and TV Shows on DVD and Blu-ray - DVD Netflix";
        getTitle(expectedTitle);
    }

    @Then("I click kids button the page should land properly")
    public void i_click_kids_button_the_page_should_land_properly() {
      init();
        clickByXpath(KidsXP);
    }

    @Then("I should get the Kids Page expected Title")
    public void i_should_get_the_Kids_Page_expected_Title() {
        init();
        String expectedTitle="Netflix";
        getTitle(expectedTitle);
    }

    @Then("I click on Pokemon Play button the video should display properly")
    public void i_click_on_Pokemon_Play_button_the_video_should_display_properly() {
       init();
        clickByXpath(PokemonSeriesXP);
    }

    @Then("I click on the return arrow the video should be closed")
    public void i_click_on_the_return_arrow_the_video_should_be_closed() {
      init();
        clickByXpath(ReturnArrowXP);
    }
//***********************************************************************
    @Given("iam at netflix home page")
    public void iam_at_netflix_home_page() {
        init(); }
    @Then("i click on sign in button")
    public void i_click_on_sign_in_button() {
        init();
        signinButton.click(); }
    @Then("i enter username {string}")
    public void i_enter_username(String username) {
        init();
        userNameField.sendKeys(username);}
    @Then("i enter passeword {string}")
    public void i_enter_passeword(String passeword) {
        init();
        passWordField.sendKeys(passeword); }
    @Then("i click on signin button")
    public void i_click_on_signin_button() {
        init();
        signinButton2.click(); }
    @Then("i click on profile")
    public void i_click_on_profile() {
        init();
        profile.click(); }
    @Then("i should get title expected {string}")
    public void i_should_get_title_expected(String expectedTitle) {
        init();
        getTitle(expectedTitle); }

    @Then("i click on movie button")
    public void i_click_on_movie_button() {
        init();
        clickByXpath(movieXP); }

    @Then("i click on Genres of novies")
    public void i_click_on_Genres_of_novies() {
        init();
        clickByXpath(GenresXP); }
    @Then("I should get the list")
    public void i_should_get_the_list() {
        init();
        getTextFromWebElements(listCss); }
    @Then("i click on play button")
    public void i_click_on_play_button() {
        init();
        clickOnElement(playCss);}
    @Then("i click on search button")
    public void i_click_on_search_button() {
        init();
        clickByXpath(SearchButtonXP);}
    @Given("i should enter my email {string}")
    public void i_should_enter_my_email(String email) {
        init();
        emailx.click();
        emailx.sendKeys(email);
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

