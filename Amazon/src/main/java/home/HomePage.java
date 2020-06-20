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


//    Test login to Amazon
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
