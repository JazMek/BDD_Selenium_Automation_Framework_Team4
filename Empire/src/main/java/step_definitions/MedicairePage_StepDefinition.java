package step_definitions;
import common.WebAPI;
import home.EmpirePageWebElement;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.support.PageFactory;
import java.io.IOException;

import static home.EmpirePageWebElement.*;

public class MedicairePage_StepDefinition extends WebAPI {
    @Before
    public void openBrowser() throws IOException { setUp(false, "browserstack", "os", "x", "chrome", "83", "https://mss.empireblue.com/ny/home.html");
    }
    @After
    public void closeBrowser() { driver.quit(); }
    static EmpirePageWebElement empirePageWebElement;
    static MedicairePage_StepDefinition medicairePage_stepDefinition;
    public static void init() {
        medicairePage_stepDefinition= PageFactory.initElements(driver,MedicairePage_StepDefinition.class);
        empirePageWebElement= PageFactory.initElements(driver,EmpirePageWebElement.class); }

    @Given("i am at medcaide page")
    public void i_am_at_medcaide_page() {
        init(); }
    @Then("i should get the actual url")
    public void i_should_get_the_actual_url() {
        init();
        String expectedUrl="https://mss.empireblue.com/ny/home.html";
        getUrl( expectedUrl); }

    @Then("with mouse over and click i should open the benefits page")
    public void with_mouse_over_and_click_i_should_open_the_benefits_page() {
        init();
        mouseHoverByXpath(benefitsXP); }
    @Then("with mouse over and click i should open the enrollement page")
    public void with_mouse_over_and_click_i_should_open_the_enrollement_page() {
        init();
        mouseHoverByXpath(enrollementXP); }
    @Then("with mouse over and click i should open the care page")
    public void with_mouse_over_and_click_i_should_open_the_care_page() {
        init();
        mouseHoverByXpath(careXP); }
    @Then("i on login button click i should open the login page")
    public void i_on_login_button_click_i_should_open_the_login_page() {
        init();
        clickByXpath(loginXp); }
    @Then("i on language button click i should open the language page")
    public void i_on_language_button_click_i_should_open_the_language_page() {
        init();
        clickByXpath(languageXp); }
    @Then("i on contact button click i should open the contact page")
    public void i_on_contact_button_click_i_should_open_the_contact_page() {
        init();
        clickByXpath(contactUsXP); }
    @Then("i on findADocteur button click i should open the findADocteur page")
    public void i_on_findADocteur_button_click_i_should_open_the_findADocteur_page() {
        init();
        clickByXpath(findADocteurXp); }
    @Then("i on makeApayment button click i should open the makeApayment page")
    public void i_on_makeApayment_button_click_i_should_open_the_makeApayment_page() {
        init();
        clickByXpath(makeApaymentXP); }
    @Then("i on Enroll button click i should open the Enroll page")
    public void i_on_Enroll_button_click_i_should_open_the_Enroll_page() {
        init();
        clickByXpath(EnrollXP); }
    @Then("i on renew button click i should open the renew page")
    public void i_on_renew_button_click_i_should_open_the_renew_page() {
        init();
        clickByXpath(renewXP); }
    @Then("i on  id button click i should open the  id page")
    public void i_on_id_button_click_i_should_open_the_id_page() {
        init();
        clickByXpath(idXP); }

}
