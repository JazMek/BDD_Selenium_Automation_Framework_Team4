package home;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class UnitedWebElement {


    //  United book flights WebElements*********************************
    public static final String checkBoxOneWayCSS ="#bookFlightForm > div.app-components-BookFlightForm-bookFlightForm__formHeader--2Hpvk > fieldset > div > label:nth-child(2) > span.app-components-BookFlightForm-bookFlightForm__checkmark--2DHJD";
    @FindBy(how= How.CSS,using=checkBoxOneWayCSS)
    public static WebElement checkBoxOneWay;
    public static final String clickLinkID="#bookFlightOriginInput";
    @FindBy(how= How.CSS,using=clickLinkID)
    public static WebElement clickLink;
    public static final String clearTextBoxID="#bookFlightForm > div.app-components-BookFlightForm-bookFlightForm__nearbyAirPort--1dCq7 > div > div:nth-child(1) > div > div > div.app-components-BookFlightForm-bookFlightForm__pickupContainer--Gekxg > div > button > svg";
    @FindBy(how= How.CSS,using=clearTextBoxID)
    public static WebElement clearTextBox;
    // enter destination
    public static final String enterDestinationFromSCC  ="#bookFlightOriginInput";
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
    public static final String NumOfAdultsSCC="//*[@id='NumOfAdults plusBtn']";
    @FindBy(how= How.XPATH,using=NumOfAdultsSCC)
    public static WebElement NumOfAdults;
    public static final String NumOfSeniorsCSS="//*[@id='NumOfSeniors plusBtn']";
    @FindBy(how= How.XPATH,using=NumOfSeniorsCSS)
    public static WebElement NumOfSeniors;
    public static final String CloseTravelersPanelCSS ="#passengersCloseBtn > img";
    @FindBy(how= How.CSS,using=CloseTravelersPanelCSS)
    public static WebElement CloseTravelersPanel;
    public static final String ClickFindFlightButtonXPATH  = "//span[contains(text(),'Find flights')]";
    @FindBy(how= How.XPATH,using=ClickFindFlightButtonXPATH )
    public static WebElement ClickFindFlightButton;
    // web element for search
//----------- my United Search --------------------
    public static final String UnitedSearchXP ="//*[@id=\"app\"]/div/div/div/div[2]/div[4]/header/div/div/div[2]/nav/ul/li[3]/a/span/span";
    @FindBy(how= How.XPATH,using=UnitedSearchXP)
    public static WebElement UnitedSearch;

    public static final String SearchXP="//input[@id='inputAutosuggestModel']";
    @FindBy(how= How.XPATH,using=SearchXP)
    public static WebElement Search;


}
