package home;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class TD_BankWebElement {
    public static final String InvestingAndWealthXP ="/html/body/div[2]/div[2]/header[1]/div[2]/div/div[1]/div/ul/li[4]/a";
    public static final String IndividualsAndFamiliesXP ="//*[@id=\"drag-id-tabsCarousel0\"]/div/li[1]/div[1]/span/span";
    public static final String BusinessOwnersXP="//*[@id=\"drag-id-tabsCarousel0\"]/div/li[2]/div[1]/span/span";
    public static final String RetirementPlanningXP="//*[@id=\"drag-id-tabsCarousel0\"]/div/li[3]/div[1]/span/span";
    public static final String TdAmeritradeXP ="//*[@id=\"drag-id-tabsCarousel0\"]/div/li[4]/div[1]/span/span";

    public static final String IndividualsAndFamiliesSearchBoxXP="//*[@id=\"question\"]";
    public static final String SearchButtonXP="//*[@id=\"main\"]/question/div/question-input/section/div/div/div/div[1]/form/div[2]/button";
    public static final String TopButtonXP="//*[@id=\"main\"]/a";
    public static final String RetirementPlanningVideoXP="//*[@id=\"main\"]/section[3]/div/div[2]/div[1]/div/div/a/img";
    public static final String RetirementPlanningVideoClosebuttonXP="//*[@id=\"wealthVideo1\"]/div/div/div[1]/button/span";
    public static final String SpecialOfferDetailsDisplayButtonXP="//*[@id=\"terms01_expandId\"]";
    public static final String SpecialOfferDetailsDisplayButton1XP="//*[@id=\"TDAGettingStarted\"]";





    @FindBy(how = How.XPATH,using = InvestingAndWealthXP)
    public static WebElement InvestingAndWealth;

    @FindBy(how = How.XPATH,using = IndividualsAndFamiliesXP)
    public static WebElement IndividualsAndFamilies;

    @FindBy(how = How.XPATH,using = BusinessOwnersXP)
    public static WebElement BusinessOwners;

    @FindBy(how = How.XPATH,using = RetirementPlanningXP)
    public static WebElement RetirementPlanning;

    @FindBy(how = How.XPATH,using = TdAmeritradeXP)
    public static WebElement TdAmeritrade;

    @FindBy(how = How.XPATH,using = IndividualsAndFamiliesSearchBoxXP)
    public static WebElement IndividualsAndFamiliesSearchBox;

    @FindBy(how = How.XPATH,using = SearchButtonXP)
    public static WebElement SearchButton;

    @FindBy(how = How.XPATH,using = TopButtonXP)
    public static WebElement TopButton;

    @FindBy(how = How.XPATH,using = RetirementPlanningVideoXP)
    public static WebElement RetirementPlanningVideo;

    @FindBy(how = How.XPATH,using = RetirementPlanningVideoClosebuttonXP)
    public static WebElement RetirementPlanningVideoClosebutton;

    @FindBy(how = How.XPATH,using = SpecialOfferDetailsDisplayButtonXP)
    public static WebElement SpecialOfferDetailsDisplayButton;

    @FindBy(how = How.XPATH,using = SpecialOfferDetailsDisplayButton1XP)
    public static WebElement SpecialOfferDetailsDisplayButton1;
    /*30182NY_Achour 01 locators ******************************************************* */
    public static final String productsXP="//*[@id=\"td-desktop-nav-dropdown-link-2\"]";
    /* 30182NY_WebElements 01***** */
    @FindBy(how = How.XPATH,using =productsXP )
    public static WebElement products;
    /*30182NY_Achour 02 locators*/
    public static final String CheckingXp="/html/body/div[2]/div[2]/header[1]/div[3]/div/div[1]/nav/ul/li[1]/ul/li[1]/a";
    /*30182NY_Achour 03 locators */
    public static final String  SavingsXP="/html/body/div[2]/div[2]/header[1]/div[3]/div/div[1]/nav/ul/li[1]/ul/li[2]/a";
    /*30182NY_Achour 04 locators*/
    public static final String   CDsXP="/html/body/div[2]/div[2]/header[1]/div[3]/div/div[1]/nav/ul/li[1]/ul/li[3]/a";
    /*30182NY_Achour 05 locators */
    public static final String  CreditCardsXP="/html/body/div[2]/div[2]/header[1]/div[3]/div/div[1]/nav/ul/li[1]/ul/li[4]/a";
    /*30182NY_Achour 06 locators */
    public static final String HomeEquityLoansLinesXP="/html/body/div[2]/div[2]/header[1]/div[3]/div/div[1]/nav/ul/li[1]/ul/li[5]/a";
    /*30182NY_Achour 07 locators */
    public static final String  MortgageXP="/html/body/div[2]/div[2]/header[1]/div[3]/div/div[1]/nav/ul/li[1]/ul/li[6]/a";
    /*30182NY_Achour 08 locators */
    public static final String PersonalLoansXP="/html/body/div[2]/div[2]/header[1]/div[3]/div/div[1]/nav/ul/li[1]/ul/li[7]/a";
    /*30182NY_Achour 09 locators */
    public static final String  IRAsXP="/html/body/div[2]/div[2]/header[1]/div[3]/div/div[1]/nav/ul/li[1]/ul/li[8]/a";
    /*30182NY_Achour 10 locators */
    public static final String   PrepaidCardsXP="/html/body/div[2]/div[2]/header[1]/div[3]/div/div[1]/nav/ul/li[1]/ul/li[9]/a";
    /*30182NY_Achour 11 locators */
    public static final String    SpecialOffersXP="/html/body/div[2]/div[2]/header[1]/div[3]/div/div[1]/nav/ul/li[1]/ul/li[10]/a";
}
