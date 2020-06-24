package home;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class NetflixPageWebElement {
    //*****************************30182NY_Achour_locators*********************************************************
//30182NY_Achour testLocators and WebElements#1:
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
    ////30182NY_Achour testLocators and WebElements#2:
    public static final String profileXP ="//*[@id=\"appMountPoint\"]/div/div/div[1]/div[1]/div[2]/div/div/ul/li[1]/div/a/div/div";
    @FindBy(how= How.XPATH,using=profileXP)
    public static  WebElement profile;
    // ////30182NY_Achour testLocators and WebElements#3:
    public static final String movieXP="//*[@id=\"appMountPoint\"]/div/div/div[1]/div[1]/div[1]/div/div/ul/li[4]/a";
    public static final String GenresXP="//*[@id=\"appMountPoint\"]/div/div/div[1]/div[1]/div[1]/div/div[2]/div/div/div/div[2]/div[1]/div/div/div/div";
    public static final String listCss="#appMountPoint > div > div > div:nth-child(1) > div.bd.dark-background > div.pinning-header > div > div.sub-header > div > div > div > div.aro-genre-details > div.subgenres > div > div > div > div.sub-menu.theme-lakira";
    @FindBy(how= How.XPATH,using=listCss)
    public static  WebElement list1;
    // ////30182NY_Achour testLocators and WebElements#4:
    public static final String list2XP="//*[@id=\"appMountPoint\"]/div/div/div[1]/div[1]/div[1]/div/div[2]/div/div/div/div[2]/div[1]/div/div/div/div[2]";
    @FindBy(how= How.XPATH,using=list2XP)
    public static  WebElement list2;
    // ////30182NY_Achour testLocators and WebElements#5:
    public static final String playCss="#appMountPoint > div > div > div:nth-child(1) > div.bd.dark-background > div.mainView > div > div.aro-genre > div > span > div > div > div > div > div > div.fill-container > div > div > div.billboard-links.button-layer.forward-leaning > a.playLink > button";
    // ////30182NY_Achour testLocators and WebElements#6:
    public static final String emailXP="//div//div//div//div//div//div//div//div[2]//form[1]//div[1]//ul[1]//li[1]//div[1]//div[1]//label[1]//input[1]";
    @FindBy(how= How.XPATH,using=emailXP)
    public static  WebElement emailx;
    public static final String SearchButtonXP="//body/div/div/div/div/div/div/div/div/div/div/div/button/span[1]";
    @FindBy(how= How.XPATH,using=SearchButtonXP)
    public static  WebElement SearchButton;
}
