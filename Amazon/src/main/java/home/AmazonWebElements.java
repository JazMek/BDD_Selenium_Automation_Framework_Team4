package home;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class AmazonWebElements {


    public static final String userNameFieldXP =" //input[@id='ap_email']";
    public static final String continueButtonXP="//input[@id='continue']";
    public static final String passWordFieldXP=" //input[@id='ap_password']";
    public static final String loginButtonID="signInSubmit";
    public static final String signinCSS ="#nav-link-accountList > div > span";

    @FindBy(how=How.XPATH,using=userNameFieldXP)
    public static WebElement userNameField;
    @FindBy(how=How.XPATH,using=continueButtonXP)
    public static WebElement continueButton;
    @FindBy(how=How.XPATH,using=passWordFieldXP)
    public static WebElement passWordField;
    @FindBy(how=How.ID,using=loginButtonID)
    public static WebElement loginButton;
    @FindBy(how=How.CSS,using=signinCSS)
    public static WebElement signin;

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

    //search Dropdown Box webElements
    public static final String searchDropdownBoxXP ="//select[@id='searchDropdownBox']";

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
    @FindBy(how = How.XPATH ,using =AllPricesScrollDownXP) public static WebElement AllPricesScrollDown;
    // test #5:

    @FindBy(how= How.XPATH ,using=searchDropdownBoxXP )
    public static WebElement searchDropdownBox;























}
