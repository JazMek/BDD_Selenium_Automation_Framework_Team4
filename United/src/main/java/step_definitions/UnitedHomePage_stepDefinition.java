package step_definitions;
import common.WebAPI;
import dataBase.Airlines;
import home.UnitedAirlinesPageWebElement;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.support.PageFactory;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;
import static dataBase.ConnectToSqlDB.*;
import static home.UnitedAirlinesPageWebElement.*;

public class UnitedHomePage_stepDefinition extends WebAPI {
    @Before
    public void openBrowser() throws IOException {
        setUp(false, "browserstack", "os", "x", "chrome", "83", "https://www.united.com/"); }
    @After
    public void closeBrowser() {
        driver.quit(); }
    static UnitedHomePage_stepDefinition   united ;
    static UnitedAirlinesPageWebElement unitedAirlinesPageWebElement;
    public static void init() {
        unitedAirlinesPageWebElement = PageFactory.initElements(driver, UnitedAirlinesPageWebElement.class);
        united = PageFactory.initElements(driver,UnitedHomePage_stepDefinition .class); }
    @Given("i am at united home page")
    public void i_am_at_united_home_page() {
        init(); }
    @Then("i click on travel info section")
    public void i_click_on_travel_info_section() throws SQLException, IOException, ClassNotFoundException, InterruptedException {
        init();
       clickByXpath(travelInfoXP );
        clickOnElement(flightStatusCss); }
    @Then("i send key")
    public void i_send_key() throws SQLException, IOException, ClassNotFoundException, InterruptedException {
        init();
        List<Airlines> list = readUnitedAirLinesProfileFromSqlTable();
        for(Airlines user:list){
            //clickOnElement(flightStatusCss);
            System.out.println(user.getFrom() + " " + user.getTo());
            sleepFor(5);
            typeOnInputField(FlightStatusFromCss,(user.getFrom()));
            typeOnInputField(FlightStatusToCss,(user.getTo()));
            clickOnElement( CheckCss);
            loadProperties();
            connectToSqlDatabase();
            readUnitedAirLinesProfileFromSqlTable();
          //  List<Airlines> list  =readUnitedAirLinesProfileFromSqlTable();
        } }
    @Then("i click on travel info section2")
    public void i_click_on_travel_info_section2() {
       init();
        clickByXpath(travelInfoXP );}
    @Then("i click on Unaccompaniedmino")
    public void i_click_on_Unaccompaniedmino() {
        init();
        clickByXpath(UnaccompaniedminorsXP ); }
    @Then("i navigete back")
    public void i_navigete_back() {
        init();
        navigateBack(); }
    @Then("i click onTravelFAQsXP")
    public void i_click_onTravelFAQsXP() {
        init();
        clickByXpath(TravelFAQsXP); }
    @Then("i click on allTravelInformationXP")
    public void i_click_on_allTravelInformationXP() {
   init();
        clickByXpath(allTravelInformationXP ); }
    @Then("i click on FlexibleBookingXP")
    public void i_click_on_FlexibleBookingXP() {
        init();
        clickByXpath( FlexibleBookingXP ); }

    @Then("i click baggageinfos")
    public void i_click_baggageinfos() {
       init();
        clickOnElement(baggageinfoCss);}
    @Then("in should get text")
    public void in_should_get_text() {
     init();
        getTextFromWebElements( bagageInfosTextBudyXP); }
    @Then("i click on timeTable info section")
    public void i_click_on_timeTable_info_section() {
        init();
        clickByXpath(timeTablePageXP ); }
    @Then("i click on destinationXP info section")
    public void i_click_on_destinationXP_info_section() {
        init();
        clickByXpath(destinationXP); }
    @Then("i click on internationalInfoXP info section")
    public void i_click_on_internationalInfoXP_info_section() {
 init();
        clickByXpath(internationalInfoXP); }
    @Then("i click on travelWithKidsXP info section")
    public void i_click_on_travelWithKidsXP_info_section() {
       init();
        clickByXpath(travelWithKidsXP ); }
}



