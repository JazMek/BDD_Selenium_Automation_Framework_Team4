package Home;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
public class BookingWebElements {
    public static final String signinButtonXP="//*[@id='b_tt_holder_4']/div/span";
    public static final String signinButton2CSS= "#b2indexPage > div.fly-dropdown.fly-dropdown--onload-shower.fly-dropdown_bottom.fly-dropdown_arrow-right > div > div.header-signin-prompt__body > a > span";
    public static final String emailFieldXP ="//input[@id='username']";
    public static final String nextButtonXP=" //span[@class='bui-button__text']";
    public static final String passWordFieldXP="//input[@id='password']";
    public static final String loginButtonXP="//span[@class='bui-button__text']";
    @FindBy(how= How.XPATH,using=signinButtonXP)
    public static WebElement signinButton;
    @FindBy(how= How.CSS,using=signinButton2CSS)
    public static WebElement signinButton2;
    @FindBy(how= How.XPATH,using=emailFieldXP)
    public static WebElement emailField;
    @FindBy(how= How.XPATH,using=nextButtonXP)
    public static WebElement nextButton;
    @FindBy(how= How.XPATH,using=passWordFieldXP)
    public static WebElement passWordField;
    @FindBy(how= How.XPATH,using=loginButtonXP)
    public static WebElement loginButton;
    @FindBy(how= How.XPATH,using=gettexteXP)
    public static WebElement gettexte;

    //click on register
    public static final String registerToBookingCSS="#b_tt_holder_1 > div > span";
    @FindBy(how= How.CSS,using=registerToBookingCSS)
    public static WebElement registerToBooking;
    //click on sign UP button
    public static final String signUpCSS="#root > div > div.access-container.bui_font_body > div > div.access-panel.bui-spacer--large.box-shadow.nw-access-panel > div.transition-container > div > div > div > form > div.u-text-center.bui-spacer--top > a";
    @FindBy(how= How.CSS,using=signUpCSS)
    public static WebElement signUp;
    // enter the email to text box
    public static final String enterEmailCSS ="#login_name_register";
    @FindBy(how= How.CSS,using=enterEmailCSS)
    public static WebElement enterEmail;
    public static final String clickGetStartedCSS="#root > div > div.access-container.bui_font_body > div > div.access-panel.bui-spacer--large.box-shadow.nw-access-panel > div.transition-container > div > div > div > form > button > span";
    @FindBy(how= How.CSS,using=clickGetStartedCSS)
    public static WebElement clickGetStarted;
    // enter password to the text box
    public static final String enterPasswordCSS="#password";
    @FindBy(how= How.CSS,using=enterPasswordCSS)
    public static WebElement enterPassword;
    // reEnter password to the text box
    public static final String reEnterPasswordCSS="#confirmed_password";
    @FindBy(how= How.CSS,using=reEnterPasswordCSS)
    public static WebElement reEnterPassword;

    public static final String clickCreateAccountCSS="#root > div > div.access-container.bui_font_body > div > div.access-panel.bui-spacer--large.box-shadow.nw-access-panel > div.transition-container > div > div > div > form > button > span";
    @FindBy(how= How.CSS,using=clickCreateAccountCSS)
    public static WebElement clickCreateAccount;
    // verify text on booking register page
    public static final String registerPageCheckXPATH="//*[@id='profile-menu-trigger--content']/span/span[1]";
    @FindBy(how= How.XPATH,using=registerPageCheckXPATH)
    public static WebElement registerPageCheck;
    //*30182NY_Achour 2 *Logo in Home Page
    public static final String BookingLogoClassName="part_of_priceline_logo";
    @FindBy(how=How.CLASS_NAME,using =BookingLogoClassName)
    public static WebElement BookingLogo;
    //*30182NY_Achour 3 Test get text from the page
    public static final String gettexteXP="//span[@class='sb-searchbox__title-text']";
    public static final String carrentalXP="//*[@id=\"cross-product-bar\"]/div/a[3]";
    public static final String checkboxXP="//*[@id=\"ss_origin\"]";
    public static final String TypeXP="//*[@id=\"ss_origin\"]";
    @FindBy(how= How.XPATH,using=carrentalXP)
    public static WebElement carrental;
    @FindBy(how= How.XPATH,using=checkboxXP)
    public static WebElement checkbox;
    @FindBy(how= How.XPATH,using=TypeXP)
    public static WebElement Type;
    @FindBy(how= How.XPATH,using=gettexteXP)
    public static WebElement gettexte;
    //30182NY_Achour 4 AirportTaxi
    public static final String airportTaxixp="//*[@id=\"cross-product-bar\"]/div/a[5]/span[2]";
    ////30182NY_Achour 5 AirportTaxi
    public static final String oneWayXP="//*[@id='booking-taxi-searchbar__container']/div/div/div/form/div[1]/fieldset/div/div[1]/label/span";
    // public static final String
    public static final String FlightsXP = "//span[contains(text(),'Flights')]";
    public static final String RoundTripButtonXP="//*[@id='flight-search-form']/div[1]/div[1]/label/div/svg";
    public static final String OneWayButtonXP = "//label[text()='One-way']//*[local-name()='svg']";
    public static final String MultiDestinationButtonCss = "#__next > div > div.sc-kUaPvJ.kicIIN > div.sc-ePZHVD.iTMarq.sc-kUaPvJ.kicIIN > div.sc-ePZHVD.iTMarq.sc-kUaPvJ.kicIIN > div > div > div.sc-kUaPvJ.iHCTyE > div > div.sc-kUaPvJ.etRPwA > form > div.sc-fONwsr.hSekvy.sc-kUaPvJ.cPSJgi > div:nth-child(3) > label > div > svg";
    public static final String DepartingFromXp = "//input[@name='flights.0.startLocation']";
    public static final String GoingToXP = "//*[@id=\"flight-arrival-airport0\"]";
    //*************** Login to https://www.booking.com/ ***********************************************
    public static final String signinButtonXP="//*[@id=\"username\"]";
    @FindBy(how= How.XPATH,using=signinButtonXP)
    public static WebElement signinButton;

    public static final String signinButton2CSS= "#b2indexPage > div.fly-dropdown.fly-dropdown--onload-shower.fly-dropdown_bottom.fly-dropdown_arrow-right > div > div.header-signin-prompt__body > a > span";
    @FindBy(how= How.CSS,using=signinButton2CSS)
    public static WebElement signinButton2;

    public static final String emailFieldXP ="//input[@id='username']";
    @FindBy(how= How.XPATH,using=emailFieldXP)
    public static WebElement emailField;

    public static final String nextButtonXP=" //span[@class='bui-button__text']";
    @FindBy(how= How.XPATH,using=nextButtonXP)
    public static WebElement nextButton;

    public static final String passWordFieldXP="//input[@id='password']";
    @FindBy(how= How.XPATH,using=passWordFieldXP)
    public static WebElement passWordField;
    
    public static final String loginButtonXP="//span[@class='bui-button__text']";
    @FindBy(how= How.XPATH,using=loginButtonXP)
    public static WebElement loginButton;
}
