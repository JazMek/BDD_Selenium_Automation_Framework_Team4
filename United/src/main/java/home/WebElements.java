package home;

import common.WebAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import utility.DataReader;

public class WebElements {


    //Book
    public static final String BookLinkCss="#travelTab > h2 > span";
    @FindBy(how= How.CSS,using =BookLinkCss )
    public static WebElement BookLink;
    public static final String RoundtripCheckBoxXP="//label[1]//span[2]";
    @FindBy(how= How.XPATH,using =RoundtripCheckBoxXP )
    public static WebElement RoundtripCheckBox;
    public static final String FromTextFieldXP="//input[@id='bookFlightOriginInput']";
    @FindBy(how= How.XPATH,using =FromTextFieldXP )
    public static WebElement FromTextField;
    public static final String FromTextField_ClearButtonXP="//button[@class='atm-c-btn app-components-AutoComplete-Legacy-styles__clearButton--1eVH2 atm-c-btn--bare']//*[local-name()='svg']";
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
    public static final String ReturnDateLinkXP="//input[@id='ReturnDate']";
    @FindBy(how= How.XPATH,using =ReturnDateLinkXP )
    public static WebElement ReturnDateLink;
    public static final String ReturnDateXP="//body//div[@id='passengersSlidingInputContainer']//div//div//div//div//div//div//div//div//div//div//div[2]//div[1]//table[1]//tbody[1]//tr[5]//td[7]";
    @FindBy(how= How.XPATH,using =ReturnDateXP )
    public static WebElement ReturnDate;
    public static final String TravelersPassengersXP="//input[@id='bookFlightModel.passengers']";
    @FindBy(how= How.XPATH,using =TravelersPassengersXP )
    public static WebElement TravelersPassengers;
    public static final String AdultsXP="//button[@id='NumOfAdults plusBtn']";
    @FindBy(how= How.XPATH,using =AdultsXP)
    public static WebElement Adults;
    public static final String SeniorsXP="//button[@id='NumOfSeniors plusBtn']";
    @FindBy(how= How.XPATH,using =SeniorsXP)
    public static WebElement Seniors;
    public static final String InfantsXP="//button[@id='NumOfInfants plusBtn']";
    @FindBy(how= How.XPATH,using =InfantsXP)
    public static WebElement Infants;
    public static final String InfantslapXP="//button[@id='NumOfLapInfants plusBtn']";
    @FindBy(how= How.XPATH,using =InfantslapXP)
    public static WebElement Infantslap;
    public static final String Children_15_17XP="//button[@id='NumOfChildren04 plusBtn']";
    @FindBy(how= How.XPATH,using =Children_15_17XP)
    public static WebElement Children_15_17;
    public static final String Children_12_14XP="//button[@id='NumOfChildren03 plusBtn']";
    @FindBy(how= How.XPATH,using =Children_12_14XP)
    public static WebElement Children_12_14;
    public static final String Children_5_11XP="//button[@id='NumOfChildren02 plusBtn']";
    @FindBy(how= How.XPATH,using =Children_5_11XP)
    public static WebElement Children_5_11;
    public static final String Children_2_4XP="//button[@id='NumOfChildren01 plusBtn']";
    @FindBy(how= How.XPATH,using =Children_2_4XP)
    public static WebElement Children_2_4;
    public static final String Find_flights_ClickBtnXP="//span[contains(text(),'Find flights')]";
    @FindBy(how= How.XPATH,using =Find_flights_ClickBtnXP)
    public static WebElement Find_flights_ClickBtn;
    public static final String Month_ClickBtnXP="//section[@id='travelTab-panel']//button[2]//span[1]";
    @FindBy(how= How.XPATH,using =Month_ClickBtnXP)
    public static WebElement Month_ClickBtn;
    public static final String checkBoxOneWayCSS ="#bookFlightForm > div.app-components-BookFlightForm-bookFlightForm__formHeader--2Hpvk > fieldset > div > label:nth-child(2) > span.app-components-BookFlightForm-bookFlightForm__checkmark--2DHJD";
    @FindBy(how= How.CSS,using=checkBoxOneWayCSS)
    public static WebElement checkBoxOneWay;
    public static final String Find_flightsButtonXP="//span[contains(text(),'Find flights')]";
    @FindBy(how= How.XPATH,using =Find_flightsButtonXP)
    public static WebElement Find_flightsButton;
    public static final String exitButtonXP="//*[@id=\"passengersCloseBtn\"]/img";
    @FindBy(how= How.XPATH,using =exitButtonXP)
    public static WebElement exitButton;
    public static final String Month_ClickBtn1XP="//section[@id='travelTab-panel']//button[2]//img[1]";
    @FindBy(how= How.XPATH,using =Month_ClickBtn1XP)
    public static WebElement Month_ClickBtn1;
    // United book flights WebElements*********************************
    public static final String clickLinkID="#bookFlightOriginInput";
    @FindBy(how= How.CSS,using=clickLinkID)
    public static WebElement clickLink;
    public static final String clearTextBoxID="#bookFlightForm > div.app-components-BookFlightForm-bookFlightForm__nearbyAirPort--1dCq7 > div > div:nth-child(1) > div > div > div.app-components-BookFlightForm-bookFlightForm__pickupContainer--Gekxg > div > button > svg";
    @FindBy(how= How.CSS,using=clearTextBoxID)
    public static WebElement clearTextBox;
    // enter destination
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
    public static final String AdultClickBoxXPATH="//*[@id='bookFlightModel.passengers']";
    @FindBy(how= How.XPATH,using=AdultClickBoxXPATH)
    public static WebElement AdultClickBox;
    // United book flights WebElements*********************************
    public static final String NumOfSeniorsCSS="//*[@id='NumOfSeniors plusBtn']";
    @FindBy(how= How.XPATH,using=NumOfSeniorsCSS)
    public static WebElement NumOfSeniors;
    public static final String CloseTravelersPanelCSS ="#passengersCloseBtn > img";
    @FindBy(how= How.CSS,using=CloseTravelersPanelCSS)
    public static WebElement CloseTravelersPanel;
    public static final String ClickFindFlightButtonXPATH = "//span[contains(text(),'Find flights')]";
    @FindBy(how= How.XPATH,using=ClickFindFlightButtonXPATH )
    public static WebElement ClickFindFlightButton;
    public static final String NumOfAdultsSCC="//*[@id='NumOfAdults plusBtn']";
    @FindBy(how= How.XPATH,using=NumOfAdultsSCC)
    public static WebElement NumOfAdults;


}
