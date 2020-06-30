package home;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
public class AmazonWebElements {
    
    public static final String continueButtonXP="//input[@id='continue']";
    public static final String passWordFieldXP=" //input[@id='ap_password']";
    public static final String loginButtonID="signInSubmit";
    public static final String signinCSS ="#nav-link-accountList > div > span";
    @FindBy(how=How.XPATH,using=userNameFieldXP)
    public static WebElement userNameField;

    @FindBy(how=How.XPATH,using=continueButtonXP)
    public static WebElement continueButton;

    //    WebElements for Amazon login

    public static final String userNameFieldXP =" //input[@id='ap_email']";
    @FindBy(how=How.XPATH,using=userNameFieldXP)

    public static final String HamburgerMenuXP ="//*[@id='nav-hamburger-menu']/i";
    @FindBy(how= How.XPATH ,using=HamburgerMenuXP)
    public static WebElement HamburgerMenu;
    public static final String hmenuCustomerNameID ="hmenu-customer-name";
    @FindBy(how= How.ID ,using=hmenuCustomerNameID)
    public static WebElement hmenuCustomerName;
    public static final String ApEmailXP ="//*[@id='ap_email']";
    @FindBy(how= How.XPATH ,using=ApEmailXP)
    public static WebElement ApEmail;
    public static final String ApPasswordXP ="//*[@id='ap_password']";
    @FindBy(how= How.XPATH ,using=ApPasswordXP)
    public static WebElement ApPassword;

//*************************************************************************
//loginToAmazon ACHOUR
    public static final String searchBoxCSS ="#twotabsearchtextbox";
    public static final String searchButtonCSS ="#nav-search > form > div.nav-right > div > input";
    
    public static final String signinButtonXP="//span[contains(text(),'Hello, Sign in')]";
    @FindBy(how= How.XPATH,using=signinButtonXP)
    public static WebElement signinButton;

    public static final String signinButton2CSS="#nav-flyout-ya-signin > a > span";
    @FindBy(how=How.CSS,using= signinButton2CSS)
    public static WebElement signinButton2;
    public static final String userNameFieldCss ="#ap_email";
    @FindBy(how=How.CSS,using=userNameFieldCss)

    

    //***********************Ibrahim Web Element ***************************
// navigate to new releases page web elements
    public static final String clickNewReleasePageCss = "#nav-xshop > a:nth-child(4)";
    public static final String checkReleasesPageTextXPATH = "//*[@id='zg_banner_text_wrapper']";
    public static String expectedResult = "Amazon Hot New Releases";
    // New Releases in Baby page Web Elements
    public static final String clickBabylinckCSS = "#zg_browseRoot > ul > li:nth-child(9) > a";
    public static final String checkNewReleasesInBabyPageCSS = "#zg-right-col > h1";
    public static final String clickNextPageCSS = "#zg-center-div > div.a-row.a-spacing-top-mini > div > ul > li.a-last > a";
    public static final String checkPagelinkXPATH = "//*[@id=\"zg-center-div\"]/div[2]/div/ul/li[1]/a";
    // mouse hover and click in Baby page Web Elements
    public static final String hoverMouseCSS = "#nav-subnav > a:nth-child(5) > span.nav-a-content";
    //public static final String hoverMouseCSS="#nav-link-accountList > div > span";
    public static final String clickUnderMenuItemXPATH ="//*[@id='nav-flyout-aj:https://m.media-amazon.com/images/G/01/verticalstores/megamenu/us_baby_megamenu_test_2019_2.json:subnav-sl-megamenu-1:0']/div[2]/div/div[2]/ul/li[4]/a";

    // specify the object location strategy for new releases page WebElements
    @FindBy(how = How.CSS, using = clickNewReleasePageCss)
    public static WebElement clickNewReleasePage;
    @FindBy(how = How.XPATH, using = checkReleasesPageTextXPATH)
    public static WebElement checkReleasesPageTextX;
    //specify the object location strategy for New Releases in Baby page WebElements
    @FindBy(how = How.CSS, using = clickBabylinckCSS)
    public static WebElement clickBabylinck;
    @FindBy(how = How.CSS, using = checkNewReleasesInBabyPageCSS)
    public static WebElement checkNewReleasesInBabyPage;
    public static String Expected = "New Releases in Baby";
    //specify the object location strategy for next page WebElements
    @FindBy(how = How.CSS, using = clickNextPageCSS)
    public static WebElement clickNextPage;
    @FindBy(how = How.XPATH, using = checkPagelinkXPATH)
    public static WebElement checkPagelink;
    public static String expectedNextpageResult = "←Previous page";
    //specify the object location strategy for mouse hover Web elements
    @FindBy(how = How.CSS, using = hoverMouseCSS)
    public static WebElement hoverMouse;
    @FindBy(how = How.XPATH, using = clickUnderMenuItemXPATH)
    public static WebElement clickUnderMenuItemX;
    // click check box option
    public static final String CheckBoxXPATH = "//*[@id=\"leftNav\"]/ul[2]/div/li/span/span/div/label/input";
    //specify the object location strategy for check box
    @FindBy(how = How.XPATH, using = CheckBoxXPATH)
    public static WebElement CheckBox1;
    //search Dropdown Box webElements
    public static final String searchDropdownBoxXP ="//select[@id='searchDropdownBox']";
    @FindBy(how= How.XPATH ,using=searchDropdownBoxXP )
    public static WebElement searchDropdownBox;
    //search box items
    public static final String SearchBoxCSS="#twotabsearchtextbox";
    @FindBy(how= How.CSS, using=SearchBoxCSS)
    public static WebElement SearchBox;


    // click search button
    public static final String clickSearchButtonCSS ="#nav-search > form > div.nav-right > div > input";
    @FindBy(how= How.CSS, using=clickSearchButtonCSS)
    public static WebElement clickSearchButton;
    public static final String getTextXPATH ="//*[@id='search']/span/div/span/h1/div/div[1]/div/div/span[3]";
    @FindBy(how= How.XPATH, using=getTextXPATH)
    public static WebElement getText;

    //***********************Ibrahim Web Element ***************************
    // navigate to new releases page web elements
    public static String expectedResult = "Amazon Hot New Releases";
    // specify the object location strategy for new releases page WebElements
    public static final String clickNewReleasePageCss = "#nav-xshop > a:nth-child(4)";
    @FindBy(how = How.CSS, using = clickNewReleasePageCss)
    public static WebElement clickNewReleasePage;
    public static final String checkReleasesPageTextXPATH = "//*[@id='zg_banner_text_wrapper']";
    @FindBy(how = How.XPATH, using = checkReleasesPageTextXPATH)
    public static WebElement checkReleasesPageTextX;
    //specify the object location strategy for New Releases in Baby page WebElements
    public static final String clickBabylinckCSS = "#zg_browseRoot > ul > li:nth-child(9) > a";
    @FindBy(how = How.CSS, using = clickBabylinckCSS)
    public static WebElement clickBabylinck;
    public static final String checkNewReleasesInBabyPageCSS = "#zg-right-col > h1";


    //***********************Ibrahim Web Element ***************************
// navigate to new releases page web elements
    public static final String clickNewReleasePageCss = "#nav-xshop > a:nth-child(4)";
    public static final String checkReleasesPageTextXPATH = "//*[@id='zg_banner_text_wrapper']";
    public static String expectedResult = "Amazon Hot New Releases";
    // New Releases in Baby page Web Elements
    public static final String clickBabylinckCSS = "#zg_browseRoot > ul > li:nth-child(9) > a";
    public static final String checkNewReleasesInBabyPageCSS = "#zg-right-col > h1";
    public static final String clickNextPageCSS = "#zg-center-div > div.a-row.a-spacing-top-mini > div > ul > li.a-last > a";
    public static final String checkPagelinkXPATH = "//*[@id=\"zg-center-div\"]/div[2]/div/ul/li[1]/a";
    // mouse hover and click in Baby page Web Elements
    public static final String hoverMouseCSS = "#nav-subnav > a:nth-child(5) > span.nav-a-content";
    //public static final String hoverMouseCSS="#nav-link-accountList > div > span";
    public static final String clickUnderMenuItemXPATH = "//*[@id='nav-flyout-aj:https://m.media-amazon.com/images/G/01/verticalstores/megamenu/us_baby_megamenu_test_2019_2.json:subnav-sl-megamenu-1:0']/div[2]/div/div[2]/ul/li[4]/a";

    //  specify the object location strategy for new releases page WebElements
    @FindBy(how = How.CSS, using = clickNewReleasePageCss)
    public static WebElement clickNewReleasePage;
    @FindBy(how = How.XPATH, using = checkReleasesPageTextXPATH)
    public static WebElement checkReleasesPageTextX;
    //specify the object location strategy for New Releases in Baby page WebElements
    @FindBy(how = How.CSS, using = clickBabylinckCSS)
    public static WebElement clickBabylinck;

    @FindBy(how = How.CSS, using = checkNewReleasesInBabyPageCSS)
    public static WebElement checkNewReleasesInBabyPage;
    public static String Expected = "New Releases in Baby";
    //specify the object location strategy for next page WebElements

    public static final String clickNextPageCSS = "#zg-center-div > div.a-row.a-spacing-top-mini > div > ul > li.a-last > a";
    @FindBy(how = How.CSS, using = clickNextPageCSS)
    public static WebElement clickNextPage;
    public static final String checkPagelinkXPATH = "//*[@id=\"zg-center-div\"]/div[2]/div/ul/li[1]/a";

    @FindBy(how = How.CSS, using = clickNextPageCSS)
    public static WebElement clickNextPage;

    @FindBy(how = How.XPATH, using = checkPagelinkXPATH)
    public static WebElement checkPagelink;
    public static String expectedNextpageResult = "←Previous page";
    //specify the object location strategy for mouse hover Web elements

    public static final String hoverMouseCSS = "#nav-subnav > a:nth-child(5) > span.nav-a-content";
    @FindBy(how = How.CSS, using = hoverMouseCSS)
    public static WebElement hoverMouse;
    public static final String clickUnderMenuItemXPATH ="//*[@id='nav-flyout-aj:https://m.media-amazon.com/images/G/01/verticalstores/megamenu/us_baby_megamenu_test_2019_2.json:subnav-sl-megamenu-1:0']/div[2]/div/div[2]/ul/li[4]/a";
    @FindBy(how = How.XPATH, using = clickUnderMenuItemXPATH)
    public static WebElement clickUnderMenuItemX;
    // click check box option
    //specify the object location strategy for check box
    public static final String CheckBoxXPATH = "//*[@id=\"leftNav\"]/ul[2]/div/li/span/span/div/label/input";

    @FindBy(how = How.CSS, using = hoverMouseCSS)
    public static WebElement hoverMouse;
    @FindBy(how = How.XPATH, using = clickUnderMenuItemXPATH)
    public static WebElement clickUnderMenuItemX;
    // click check box option
    public static final String CheckBoxXPATH = "//*[@id=\"leftNav\"]/ul[2]/div/li/span/span/div/label/input";
    //specify the object location strategy for check box

    @FindBy(how = How.XPATH, using = CheckBoxXPATH)
    public static WebElement CheckBox1;
    //search Dropdown Box webElements
    public static final String searchDropdownBoxXP ="//select[@id='searchDropdownBox']";
    @FindBy(how= How.XPATH ,using=searchDropdownBoxXP )
    public static WebElement searchDropdownBox;
    //search box items
    public static final String SearchBoxCSS="#twotabsearchtextbox";
    @FindBy(how= How.CSS, using=SearchBoxCSS)
    public static WebElement SearchBox;
    // click search button
    public static final String clickSearchButtonCSS ="#nav-search > form > div.nav-right > div > input";
    @FindBy(how= How.CSS, using=clickSearchButtonCSS)
    public static WebElement clickSearchButton;
    public static final String getTextXPATH ="//*[@id='search']/span/div/span/h1/div/div[1]/div/div/span[3]";
    @FindBy(how= How.XPATH, using=getTextXPATH)
    public static WebElement getText;


    //30182NY_Achour testLocators/Webelements#1:
    public static final String AuserNameFieldXP =" //input[@id='ap_email']";
    @FindBy(how=How.XPATH,using=AuserNameFieldXP)
    public static WebElement AuserNameField;
     public static final String AcontinueButtonXP="//input[@id='continue']";
    @FindBy(how=How.XPATH,using=AcontinueButtonXP)
    public static WebElement AcontinueButton;
     public static final String ApassWordFieldXP=" //input[@id='ap_password']";
    @FindBy(how=How.XPATH,using=ApassWordFieldXP)
    public static WebElement ApassWordField;
     public static final String AloginButtonID="signInSubmit";
    @FindBy(how=How.ID,using=AloginButtonID)
    public static WebElement AloginButton;
     public static final String AsigninCSS ="#nav-link-accountList > div > span";
    @FindBy(how=How.CSS,using=AsigninCSS)
    public static WebElement Asignin;
    //30182NY_Achour testLocators/Webelements#2:
    public static final String todaysDealsButtonXP ="//*[@id=\"nav-xshop\"]/a[5]";
    @FindBy(how= How.XPATH ,using = todaysDealsButtonXP)
    public static WebElement todaysDealsButton;
    public static final String SubscribeButtonXP ="//*[@id=\"gbox-item-0.0.0\"]/div/div/div[2]/a";
    @FindBy(how= How.XPATH ,using=SubscribeButtonXP)
    public static WebElement SubscribeButton;
    //30182NY_Achour testLocators/Webelements#3:
    public static final String warehouseSectionXP ="//*[@id=\"nav-subnav\"]/a[5]/span";
    @FindBy(how= How.XPATH ,using=warehouseSectionXP)
    public static WebElement warehouseSection;
    public static final String seeAllCategoriesXP="//*[@id=\"leftNav\"]/ul/div/li[8]/span/a/span";
    @FindBy(how= How.XPATH ,using=seeAllCategoriesXP)
    public static WebElement seeAllCategories;
    //30182NY_Achour testLocators/Webelements#4:
    public static final String amazonDeviceXP ="//*[@id=\"widgetFilters\"]/div[1]/div[2]/span[1]/div/label/input";
    @FindBy(how= How.XPATH ,using=amazonDeviceXP)
    public static WebElement amazonDevice;
     public static final String AddToCartXP="//*[@id=\"101 03a6bf18-announce\"]";
    @FindBy(how= How.XPATH ,using=AddToCartXP)
    public static WebElement AddToCart;
//30182NY_Achour testLocators/Webelements#5:
public static final String rightArowXP="//*[@id=\"nextButtonDisableArrow\"]/a/i";
    @FindBy(how= How.XPATH ,using=rightArowXP)
    public static WebElement rightArow;
    public static final String leftArowXP="//*[@id=\"prevButton\"]/a/i";
    @FindBy(how= How.XPATH ,using=leftArowXP)
    public static WebElement leftArow;
    //30182NY_Achour testLocators/Webelements#6:
    public static final String sortByXP="//*[@id=\"a-autoid-0-announce\"]/span";
    @FindBy(how= How.XPATH ,using=sortByXP)
    public static WebElement sortBy;
    //30182NY_Achour testLocators/Webelements#7:
    public static final String dealOfTheDayXP="//*[@id=\"widgetFilters\"]/div[2]/span[2]/div/a";
    public static final String lightningDealXP="//*[@id=\"widgetFilters\"]/div[2]/span[3]/div/a";
    public static final String savingDealXP="//*[@id=\"widgetFilters\"]/div[2]/span[4]/div/a";
    public static final String couponsXP="//*[@id=\"widgetFilters\"]/div[2]/span[5]/div/a";
    public static final String primeAccessXP="//*[@id=\"widgetFilters\"]/div[2]/span[6]/div/a";
    //30182NY_Achour testLocators/Webelements#8:
    public static final String WootDealXP="//*[@id=\"nav-subnav\"]/a[7]/span";
    @FindBy(how= How.XPATH ,using=WootDealXP)
    public static WebElement WootDeal;
    public static final String DigitalDealXP="//*[@id=\"nav-subnav\"]/a[6]/span";
    @FindBy(how= How.XPATH ,using=DigitalDealXP)
    public static WebElement DigitalDeal;
    public static final String outlestXP="//*[@id=\"nav-subnav\"]/a[4]/span";
    @FindBy(how= How.XPATH ,using=outlestXP)
    public static WebElement  outlest;
    public static final String renewedDealsXP="//*[@id=\"nav-subnav\"]/a[3]/span";
    @FindBy(how= How.XPATH ,using= renewedDealsXP)
    public static WebElement renewedDeals;
    public static final String wareHouseDealXp="//*[@id=\"nav-subnav\"]/a[5]/span";
    @FindBy(how= How.XPATH ,using=wareHouseDealXp)
    public static WebElement wareHouseDeal;
    //30182NY_Achour testLocators/Webelements#9:
    public static final String nextXP="//*[@id=\"navFooter\"]/div[4]/table/tbody/tr[1]/td[1]/a";
    public static final String backtoTopXP="//*[@id=\"navBackToTop\"]/div/span";
    @FindBy(how= How.XPATH ,using= nextXP)
    public static WebElement next;
    @FindBy(how= How.XPATH ,using=backtoTopXP)
    public static WebElement backtoTop;
    //30182NY_Achour testLocators/Webelements#10:
    public static final String searchXP="//input[@name='field-keywords']";
    @FindBy(how= How.XPATH ,using=searchXP)
    public static WebElement search;
public static final String searchButtonXP="//header//div//div//div[2]//div[1]//input[1]";
    //30181NY_salah test case1:
    public static final String FindAGiftXP ="//*[@id=\"nav-xshop\"]/a[4]";
    //30181NY_salah test case2:
    public static final String FindAGiftPageTextXP = "//*[@id=\"notification-provider\"]/div/div/div[1]/h2";
    //30181NY_salah test case3:
    public static final String EGIFTSXP="//span[contains(text(),'e-Gifts')]";
    //30181NY_salah test case4:
    public static final String EGiftWrapIconXP="//*[@id=\"notification-provider\"]/div/div[2]/div/div/div[3]/div[2]/div/div/label/i";
    //30181NY_salah test case5:
    public static final String AllPricesScrollDownXP="//*[@id=\"notification-provider\"]/div/div[2]/div/div/div[3]/div[1]/div/div/span[2]";
    //30181NY_salah test case6:
    @FindBy(how = How.XPATH ,using =AllPricesScrollDownXP) public static WebElement AllPricesScrollDown;
 
    public static final String amazonWomenPageXP ="//*[@id=\"notification-provider\"]/div/div/div[1]/div/a[3]/div/div[2]/span";
    @FindBy(how = How.XPATH,using = amazonWomenPageXP)
    public static WebElement amazonWomenPage;
    public static final String AgeGroupXP ="//*[@id=\"notification-provider\"]/div/div[3]/div/div/div[1]/div/div/div[1]/div/span[2]";
    @FindBy(how = How.XPATH,using = AgeGroupXP)
    public static WebElement AgeGroup;
    public static final String GenderXP ="//*[@id=\"notification-provider\"]/div/div[3]/div/div/div[1]/div/div/div[2]/div/span[2]";
    @FindBy(how = How.XPATH,using = GenderXP)
    public static WebElement Gender;
    public static final String AllPricesXP ="//*[@id=\"notification-provider\"]/div/div[3]/div/div/div[3]/div[1]/div/div/span[2]";
    @FindBy(how = How.XPATH,using = AllPricesXP)
    public static WebElement AllPrices;
    public static final String GiftWrapCheckBoxXP ="//*[@id=\"notification-provider\"]/div/div[3]/div/div/div[3]/div[2]/div/div/label/i";
    @FindBy(how = How.XPATH,using = GiftWrapCheckBoxXP)
    public static WebElement GiftWrapCheckBox;


    public static final String PreschoolerXP ="//*[@id=\"notification-provider\"]/div/div/div[1]/div/a[7]";
    @FindBy(how = How.XPATH,using = PreschoolerXP)
    public static WebElement Preschooler;

    public static final String PlayDohXP ="//*[@id=\"gcx-gf-section-0\"]/div/section/div[3]/figure/div/a/div/div";
    @FindBy(how = How.XPATH,using = PlayDohXP)
    public static WebElement PlayDoh;

    public static final String PlayDohAddToCardXP ="//*[@id=\"add-to-cart-button\"]";
    @FindBy(how = How.XPATH,using = PlayDohAddToCardXP)
    public static WebElement PlayDohAddToCard;

    // Find a Gift Webelement (salah):
    // test #1 :
    @FindBy(how= How.XPATH ,using=FindAGiftXP) public static WebElement FindAGift;
    @FindBy(how= How.XPATH ,using=FindAGiftPageTextXP) public static WebElement FindAGiftPageText;
    // test #2 :
    @FindBy(how = How.XPATH ,using = EGIFTSXP) public static WebElement EGIFTS;
    // test #3 :
    @FindBy(how = How.XPATH ,using =EGiftWrapIconXP ) public static WebElement EGiftWrapIcon;
    // test #4 :
  


}
