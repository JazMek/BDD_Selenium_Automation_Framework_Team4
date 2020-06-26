package home;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class NetflixWebElements {
    public static final String signinButtonXP="//a[@class='authLinks redButton']";
    @FindBy(how= How.XPATH,using=signinButtonXP)
    public static WebElement signinButton;
    public static final String userNameFieldXP ="//input[@id='id_userLoginId']";
    @FindBy(how= How.XPATH,using=userNameFieldXP)
    public static WebElement userNameField;
    public static final String passWordFieldXP="//input[@id='id_password']";
    @FindBy(how= How.XPATH,using=passWordFieldXP)
    public static WebElement passWordField;
    public static final String signinButton2XP="//button[@class='btn login-button btn-submit btn-small']";
    @FindBy(how= How.XPATH,using=signinButton2XP)
    public static  WebElement signinButton2;




}
