package home;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class BookingWebElement {
    public static final String signinButtonXP = "//*[@id='b_tt_holder_4']/div/span";

    public static final String signinButton2CSS = "#b2indexPage > div.fly-dropdown.fly-dropdown--onload-shower.fly-dropdown_bottom.fly-dropdown_arrow-right > div > div.header-signin-prompt__body > a > span";

    public static final String emailFieldXP = "//input[@id='username']";

    public static final String nextButtonXP = " //span[@class='bui-button__text']";

    public static final String passWordFieldXP = "//input[@id='password']";

    public static final String loginButtonXP = "//span[@class='bui-button__text']";

//******************************************Logo in Home Page ****************************************************


    public static final String BookingLogoClassName = "part_of_priceline_logo";


//******************************************Test get tect from the page ******************************************


    public static final String gettexteXP = "//span[@class='sb-searchbox__title-text']";
    public static final String FlightsXP = "//*[@id=\"cross-product-bar\"]/div/a[1]/span[2]";
    public static final String FlightsPageTextXP = "//*[@id=\"app-container\"]/div/div[1]/div[2]/div/div/div[1]/div/div[1]/div/div[1]";
    public static final String RoundTripButtonXP="//*[@id='flight-search-form']/div[1]/div[1]/label/div/svg";
    public static final String OneWayButtonXP = "//*[@id=\"flight-search-form\"]/div[1]/div[2]/label/div/svg";
    public static final String MultiDestinationButtonXP = "//*[@id=\"flight-search-form\"]/div[1]/div[3]/label/div/svg";
    public static final String DepartingFromXp = "//*[@id=\"flight-departure-airport0\"]";
    public static final String GoingToXP = "//*[@id=\"flight-arrival-airport0\"]";
    public static final String DepartingReturningDateXP = "//*[@id=\"flight-date-range\"]";
    public static final String DepartingDateXP = "//*[@id=\"flight-search-form\"]/div[2]/div[3]/div/div/div/div[2]/div/div/div/div[2]/div/div/div[1]/div[3]/div[31]/div/div";
    public static final String ReturningDateXP = "//*[@id=\"flight-search-form\"]/div[2]/div[3]/div/div/div/div[2]/div/div/div/div[2]/div/div/div[2]/div[3]/div[29]/div/div";


    @FindBy(how = How.XPATH, using = signinButtonXP)
    public static WebElement signinButton;

    @FindBy(how = How.CSS, using = signinButton2CSS)
    public static WebElement signinButton2;


    @FindBy(how = How.XPATH, using = emailFieldXP)

    public static WebElement emailField;

    @FindBy(how = How.XPATH, using = nextButtonXP)
    public static WebElement nextButton;

    @FindBy(how = How.XPATH, using = passWordFieldXP)
    public static WebElement passWordField;

    @FindBy(how = How.XPATH, using = loginButtonXP)
    public static WebElement loginButton;

    @FindBy(how = How.XPATH, using = gettexteXP)
    public static WebElement gettexte;


    @FindBy(how = How.XPATH, using = FlightsXP)
    public static WebElement Flights;

    @FindBy(how = How.XPATH, using = FlightsPageTextXP)
    public static WebElement FlightsPageText;

    @FindBy(how = How.XPATH, using = OneWayButtonXP)
    public static WebElement OneWayButton;

    @FindBy(how = How.XPATH, using = RoundTripButtonXP)
    public static WebElement RoundTripButton;

    @FindBy(how = How.XPATH, using = MultiDestinationButtonXP)
    public static WebElement MultiDestinationButton;

    @FindBy(how = How.XPATH, using = DepartingFromXp)
    public static WebElement DepartingFrom;

    @FindBy(how = How.XPATH, using = DepartingReturningDateXP)
    public static WebElement DepartingReturningDate;

    @FindBy(how = How.XPATH, using = GoingToXP)
    public static WebElement GoingTo;

    @FindBy(how = How.XPATH, using = DepartingDateXP)
    public static WebElement DetartingDate;

    @FindBy(how = How.XPATH, using = ReturningDateXP)
    public static WebElement ReturningDate;



}
