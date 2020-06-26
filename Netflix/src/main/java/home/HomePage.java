package home;

import common.WebAPI;
import org.openqa.selenium.support.PageFactory;
import utility.DataReader;

import static home.WebElements.*;

public class HomePage  extends WebAPI{

    public  static HomePage homePage;
    public  static WebAPI webAPI;
    public static DataReader dataReader;
    public static WebElements webElements;
    public static void init(){
        WebAPI webAPI= PageFactory.initElements(driver, WebAPI.class);
        homePage= PageFactory.initElements(driver, HomePage.class);
        webElements = PageFactory.initElements(driver,WebElements.class);
        dataReader=PageFactory.initElements(driver, DataReader.class); }

    public void click_on_the_signin_button() {
        signinButton.click();
    }
    public void enter_my_correct_email(String email) {
        userNameField.sendKeys(email);
    }
    public void enter_my_pass_word(String password) {
        passWordField.sendKeys(password);
    }
    public void click_on_the_scond_signin_button() {
        signinButton2.click();
    }


}
