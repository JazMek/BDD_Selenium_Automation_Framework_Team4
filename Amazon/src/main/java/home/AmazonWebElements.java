package home;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
public class AmazonWebElements {
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







}
