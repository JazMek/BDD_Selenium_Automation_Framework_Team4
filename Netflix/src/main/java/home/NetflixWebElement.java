package home;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class NetflixWebElement {

    public static final String signinButtonXP="//a[@class='authLinks redButton']";
    public static final String userNameFieldXP ="//input[@id='id_userLoginId']";
    public static final String passWordFieldXP="//input[@id='id_password']";
    public static final String signinButton2XP="//button[@class='btn login-button btn-submit btn-small']";


    @FindBy(how= How.XPATH,using=signinButtonXP)
    public static WebElement signinButton;
    @FindBy(how= How.XPATH,using=userNameFieldXP)
    public static WebElement userNameField;
    @FindBy(how= How.XPATH,using=passWordFieldXP)
    public static WebElement passWordField;
    @FindBy(how= How.XPATH,using=signinButton2XP)
    public static  WebElement signinButton2;

    public static final String teamAccountClickCSS="#appMountPoint > div > div > div:nth-child(1) > div.bd.dark-background > div.profiles-gate-container > div > div > ul > li:nth-child(1) > div > a > div > div";

    @FindBy(how= How.CSS,using=teamAccountClickCSS)
    public static WebElement teamAccountClick;

    public static final String moushoverCSS="#appMountPoint > div > div > div:nth-child(1) > div.bd.dark-background > div.pinning-header > div > div > div > div:nth-child(6) > div > div";
    @FindBy(how= How.CSS,using= moushoverCSS)
    public static WebElement  moushover;
    public static final String logOutclickCSS="#appMountPoint > div > div > div:nth-child(1) > div.bd.dark-background > div.pinning-header > div > div > div > div:nth-child(6) > div > div.account-drop-down.sub-menu.theme-lakira > div > ul.account-links.sub-menu-list > li:nth-child(3) > a";
    @FindBy(how= How.CSS,using= logOutclickCSS)
    public static WebElement logOutclick;
    public static final String clickBackCSS="#appMountPoint > div > div.login-body > div > a";
    @FindBy(how= How.CSS,using= clickBackCSS)
    public static WebElement clickBack;

    public static final String enterSearchXPATH ="//div[@class='our-story-card hero-card vlv']//input[@name='email']";
    @FindBy(how= How.XPATH,using= enterSearchXPATH)
    public static WebElement enterSearch;




}
