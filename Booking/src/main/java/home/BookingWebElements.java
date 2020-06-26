package home;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class BookingWebElements {
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
