package home;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class UnitedAirlinesPageWebElement {
    /*30182NY_Achour/Locators #1************************ */
    public static final String travelInfoXP="//*[@id=\"headerNav2\"]/span";
    public static final String timeTablePageXP="//*[@id=\"L3dlYi9lbi1VUy9hcHBzL3RyYXZlbC90aW1ldGFibGUvZGVmYXVsdC5hc3B4Mg\"]/span";
    public static final String destinationXP="//*[@id=\"headerNav2-panel\"]/div/div[1]/ul/li[3]/a/span";
    public static final String internationalInfoXP="//*[@id=\"headerNav2-panel\"]/div/div[1]/ul/li[4]/a/span";
    public static final String travelWithKidsXP="//*[@id='headerNav2-panel']/div/div[1]/ul/li[5]/a/span";
    @FindBy(how= How.XPATH,using =travelInfoXP )
    public static WebElement travelInfo;
    @FindBy(how= How.XPATH,using =timeTablePageXP )
    public static WebElement timeTablePage;
    @FindBy(how= How.XPATH,using =destinationXP )
    public static WebElement destination;
    @FindBy(how= How.XPATH,using =internationalInfoXP )
    public static WebElement internationalInfo;
    @FindBy(how= How.XPATH,using =travelWithKidsXP )
    public static WebElement travelWithKids;
    /*30182NY_Achour/Locators #2************************ */
    public static final String UnaccompaniedminorsXP="//*[@id=\"headerNav2-panel\"]/div/div[1]/ul/li[6]/a/span";
    public static final String TravelFAQsXP="//*[@id=\"headerNav2-panel\"]/div/div[1]/ul/li[7]/a/span";
    public static final String allTravelInformationXP="//*[@id=\"headerNav2-panel\"]/div/div[1]/ul/li[8]/a/span";
    public static final String FlexibleBookingXP="//*[@id=\"headerNav2-panel\"]/div/div[1]/ul/li[9]/a/span";
    @FindBy(how= How.XPATH,using =UnaccompaniedminorsXP )
    public static WebElement Unaccompaniedminors;
    @FindBy(how= How.XPATH,using =  TravelFAQsXP)
    public static WebElement TravelFAQs;
    @FindBy(how= How.XPATH,using = allTravelInformationXP)
    public static WebElement allTravelInformation;
    @FindBy(how= How.XPATH,using = FlexibleBookingXP)
    public static WebElement FlexibleBooking;
    /*30182NY_Achour/Locators #3 */
    public static final String baggageinfoCss="#headerNav2-panel > div > div:nth-child(2) > ul > li:nth-child(1) > a > span";
    public static final String flightStatusCss="#headerNav2-panel > div > div:nth-child(2) > ul > li:nth-child(2) > a > span";
    public static final String airportAircraftInfoCss="#headerNav2-panel > div > div:nth-child(2) > ul > li:nth-child(3) > a > span";
    public static final String onboardServiceCss="#headerNav2-panel > div > div:nth-child(2) > ul > li:nth-child(4) > a > span";
    public static final String travelAlertsCss="#headerNav2-panel > div > div:nth-child(2) > ul > li:nth-child(5) > a > span";
    /*30182NY_Achour/Locators #4 */
    public static final String TravelingWhilePregnantCss ="#headerNav2-panel > div > div:nth-child(3) > ul > li:nth-child(1) > a > span";
    public static final String  TravelforPetsCss="#headerNav2-panel > div > div:nth-child(3) > ul > li:nth-child(2) > a > span";
    public static final String  ServiceAnimalsCss="#headerNav2-panel > div > div:nth-child(3) > ul > li:nth-child(3) > a > span";
    /*30182NY_Achour/Locators #5 */
    public static final String  TravelersWithDisabilitiesCss="#headerNav2-panel > div > div:nth-child(3) > ul > li:nth-child(4) > a > span";
    public static final String  SpecialMealsAndfoodAllergiesCss="#headerNav2-panel > div > div:nth-child(3) > ul > li:nth-child(5) > a > span";
    public static final String  TravelforSeniorsCss="#headerNav2-panel > div > div:nth-child(3) > ul > li:nth-child(6) > a > span";
    public static final String ExtraSeatingCss="#L3VhbC9lbi91cy9mbHkvdHJhdmVsL3NwZWNpYWwtbmVlZHMvZXh0cmEtc2VhdGluZy5odG1sMg > span";
    /*30182NY_Achour/Locators #6 */
    public static final String bagageInfosTextBudyXP="right-rail div.region-main:nth-child(4) div.gridspan24 div.linkblocks > div.linkblocks__colwrapper";
    @FindBy(how= How.XPATH,using =  bagageInfosTextBudyXP)
    public static WebElement  bagageInfosTextBudy;
    public static final String cleanFieldXP="//*[@id=\"bookFlightOriginInput\"]";
    @FindBy(how =How.XPATH,using = cleanFieldXP)
    public static WebElement cleanField;
    /*30182NY_Achour/Locators #7 dataBaseConnection */
    public static final String fromCss="#bookFlightOriginInput";
    public static final String toCss="#bookFlightDestinationInput";
    /*30182NY_Achour/Locators #8 dataBaseConnection */
    public static final String timeFromCss="#ctl00_ContentInfo_OandD_Origin_txtOrigin";
    public static final String timeToCss="#ctl00_ContentInfo_OandD_Destination_txtDestination";
    public static final String timeSearchCss="#ctl00_ContentInfo_searchbutton";
    /*30182NY_Achour/Locators #9 dataBaseConnection */
    public static final String FlightStatusFromCss="#originInput";
    public static final String FlightStatusToCss="#destinationInput";
    public static final String CheckCss="body.body:nth-child(2) div.page:nth-child(2) div.relativePosition:nth-child(3) div.app-components-flifo-FlightInfoContent-flightInfoContent__container--2AO6M:nth-child(2) section.app-components-flifo-FlightInfoContent-flightInfoContent__flightInfoContent--2aeyc div.app-components-flifo-FlightInfoContent-flightInfoContent__flightInfoLayout--1vpc- div.app-components-flifo-FlightInfoContent-flightInfoContent__formContainer--16aE4 form.app-components-flifo-FlightInfoForm-flightInfoForm__flightInfoForm--3u0Lx div.app-components-flifo-FlightInfoForm-flightInfoForm__formElement--3wBVt.app-components-flifo-FlightInfoForm-flightInfoForm__submitBtnContainer--1xF3Z:nth-child(6) button.app-components-flifo-FlightInfoForm-flightInfoForm__checkStatusBtn--1UWEQ.app-components-flifo-FlightInfoForm-flightInfoForm__btnDefault--2tXXL > span:nth-child(1)";

}
