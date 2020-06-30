package home;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class UnitedWebElements {
    //*******  LAMARAs Book a "One Way" flight *******************
    public static final String checkBoxOneWayCSS ="#bookFlightForm > div.app-components-BookFlightForm-bookFlightForm__formHeader--2Hpvk > fieldset > div > label:nth-child(2) > span.app-components-BookFlightForm-bookFlightForm__checkmark--2DHJD";
    @FindBy(how= How.CSS,using=checkBoxOneWayCSS)
    public static WebElement checkBoxOneWay;
    public static final String clickLinkID="#bookFlightOriginInput";
    @FindBy(how= How.CSS,using=clickLinkID)
    public static WebElement clickLink;
    public static final String clearTextBoxID="#bookFlightForm > div.app-components-BookFlightForm-bookFlightForm__nearbyAirPort--1dCq7 > div > div:nth-child(1) > div > div > div.app-components-BookFlightForm-bookFlightForm__pickupContainer--Gekxg > div > button > svg";
    @FindBy(how= How.CSS,using=clearTextBoxID)
    public static WebElement clearTextBox;
    public static final String enterDestinationFromSCC ="#bookFlightOriginInput";
    @FindBy(how= How.CSS,using=enterDestinationFromSCC )
    public static WebElement enterDestinationFrom;
    public static final String enterDestinationToSCC ="#bookFlightDestinationInput";
    @FindBy(how= How.CSS,using=enterDestinationToSCC )
    public static WebElement enterDestinationTo;
    public static final String clickOnDateBoxSCC ="#DepartDate";
    @FindBy(how= How.CSS,using=clickOnDateBoxSCC)
    public static WebElement clickOnDateBox;
    public static final String selectDepartureDateSCC="//div[@class='CalendarMonthGrid_month__horizontal CalendarMonthGrid_month__horizontal_1']//td[@class='CalendarDay CalendarDay_1 CalendarDay__default CalendarDay__default_2'][contains(text(),'16')]";
    @FindBy(how= How.XPATH,using=selectDepartureDateSCC)
    public static WebElement selectDepartureDate;
    public static final String AdultClickBoxXPATH="//input[@id='bookFlightModel.passengers']";
    @FindBy(how= How.XPATH,using=AdultClickBoxXPATH)
    public static WebElement AdultClickBox;
    public static final String NumOfAdultsSCC="//button[@id='NumOfAdults plusBtn']";
    @FindBy(how= How.XPATH,using=NumOfAdultsSCC)
    public static WebElement NumOfAdults;
    public static final String NumOfSeniorsCSS="//button[@id='NumOfSeniors plusBtn']";
    @FindBy(how= How.XPATH,using=NumOfSeniorsCSS)
    public static WebElement NumOfSeniors;
    //*****  LAMARAs Data base connection for United Account to Book a Round Trip Flight **
    public static final String BookLinkCss="#travelTab > h2 > span";
    @FindBy(how= How.CSS,using =BookLinkCss )
    public static WebElement BookLink;
    public static final String FromTextFieldXP="//input[@id='bookFlightOriginInput']";
    @FindBy(how= How.XPATH,using =FromTextFieldXP )
    public static WebElement FromTextField;
    public static final String FromTextField_ClearButtonXP="//*[@id=\"bookFlightForm\"]";
    @FindBy(how= How.XPATH,using =FromTextField_ClearButtonXP )
    public static WebElement FromTextField_ClearButton;
    public static final String ToTextFieldXP="//input[@id='bookFlightDestinationInput']";
    @FindBy(how= How.XPATH,using =ToTextFieldXP )
    public static WebElement ToTextField;
    public static final String DepartDateLinkXP="//input[@id='DepartDate']";
    @FindBy(how= How.XPATH,using =DepartDateLinkXP )
    public static WebElement DepartDateLink;
    public static final String DepartDateXP="//body//div[@id='passengersSlidingInputContainer']//div//div//div//div//div//div//div//div//div//div//div[2]//div[1]//table[1]//tbody[1]//tr[3]//td[3]";
    @FindBy(how= How.XPATH,using =DepartDateXP )
    public static WebElement DepartDate;
    public static final String TravelersPassengersXP="//input[@id='bookFlightModel.passengers']";
    @FindBy(how= How.XPATH,using =TravelersPassengersXP )
    public static WebElement TravelersPassengers;
    public static final String AdultsXP="//button[@id='NumOfAdults plusBtn']";
    @FindBy(how= How.XPATH,using =AdultsXP)
    public static WebElement Adults;
    public static final String SeniorsXP="//button[@id='NumOfSeniors plusBtn']";
    @FindBy(how= How.XPATH,using =SeniorsXP)
    public static WebElement Seniors;
    public static final String Find_flightsButtonXP="//span[contains(text(),'Find flights')]";
    @FindBy(how= How.XPATH,using =Find_flightsButtonXP)
    public static WebElement Find_flightsButton;
    public static final String exitButtonXP="//*[@id=\"passengersCloseBtn\"]/img";
    @FindBy(how= How.XPATH,using =exitButtonXP)
    public static WebElement exitButton;
    //-----------  LAMARAs my United Search  --------------------
    public static final String UnitedSearchXP ="//*[@id=\"app\"]/div/div/div/div[2]/div[4]/header/div/div/div[2]/nav/ul/li[3]/a/span/span";
    @FindBy(how= How.XPATH,using=UnitedSearchXP)
    public static WebElement UnitedSearch;
    public static final String SearchXP="//input[@id='inputAutosuggestModel']";
    @FindBy(how= How.XPATH,using=SearchXP)
    public static WebElement Search;
    //-----------  LAMARAs my United Flight List  --------------------
    public static final String CloseTravelersPanelCSS ="#passengersCloseBtn > img";
    @FindBy(how= How.CSS,using=CloseTravelersPanelCSS)
    public static WebElement CloseTravelersPanel;
    public static final String ClickFindFlightButtonXPATH = "//span[contains(text(),'Find flights')]";
    @FindBy(how= How.XPATH,using=ClickFindFlightButtonXPATH )
    public static WebElement ClickFindFlightButton;
    
}
