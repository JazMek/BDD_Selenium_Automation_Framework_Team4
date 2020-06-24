package step_definitions;

import common.WebAPI;
import home.NetflixPageWebElement;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.support.PageFactory;
import java.io.IOException;

import static home.NetflixPageWebElement.*;

public class Netflix_stepDefinion extends WebAPI {
    @Before
    public void openBrowser() throws IOException {
        setUp(false, "browserstack", "os", "x", "chrome", "83", "https://www.netflix.com/"); }
    @After
    public void closeBrowser() {
        driver.quit(); }
    static Netflix_stepDefinion netflix_stepDefinion;
    static NetflixPageWebElement netflixPageWebElement;

    public static void init() {
        netflixPageWebElement = PageFactory.initElements(driver, NetflixPageWebElement.class);
        netflix_stepDefinion = PageFactory.initElements(driver, Netflix_stepDefinion.class); }
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






}
