package home;

import common.WebAPI;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import static home.NetflixWebElement.*;

public class HomePage  extends WebAPI {


    // method for page broken links
    public void CheckBrokenLink() throws IOException {
        driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
        brokenLink();
    }

    public void click_on_sign_in_Button() {
        signinButton.click();

    }

    public void enter_user_name_in_userNameField() {
        userNameField.sendKeys("team4WDNY2020@gmail.com");


    }

    public void enter_password_in_the_passWordField() {

        passWordField.sendKeys("Team42020");
    }

    public void click_on_signin_button_i_login_my_account() {


          signinButton2.click();
    }





}
