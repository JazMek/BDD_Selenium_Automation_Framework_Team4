package home;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class AmazonWebElements {


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

    public static WebElement userNameField;
    public static final String continueButtonXP="//input[@id='continue']";
    @FindBy(how=How.XPATH,using=continueButtonXP)
    public static WebElement continueButton;
    public static final String passWordFieldXP=" //input[@id='ap_password']";
    @FindBy(how=How.XPATH,using=passWordFieldXP)
    public static WebElement passWordField;
    public static final String loginButtonID="signInSubmit";
    @FindBy(how=How.ID,using=loginButtonID)
    public static WebElement loginButton;
    public static final String signinCSS ="#nav-link-accountList > div > span";
    @FindBy(how=How.CSS,using=signinCSS)
    public static WebElement signin;


}
