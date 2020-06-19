package home;

import common.WebAPI;
import org.junit.Before;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;

import static home.AmazonWebElements.*;

public class HomePage extends WebAPI {

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

    public static void SetSignIn(){
        signin.click();
    }
    public static void setUserNameField(){
        userNameField.sendKeys("team4WDNY2020@gmail.com");
    }
    public static void setContinueButton(){
        continueButton.click();
    }
    public static void setPassWordField(){
        passWordField.sendKeys("Team42020");
    }
    public static void setLoginButton(){
        loginButton.click();
    }




}
