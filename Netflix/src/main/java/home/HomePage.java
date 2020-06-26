package home;

import common.WebAPI;

import static home.NetflixWebElements.*;

public class HomePage extends WebAPI {
    public static void SignInToNetflixAccount(String username){
        signinButton.click();
        userNameField.sendKeys("team4WDNY2020@gmail.com");
        passWordField.sendKeys("Team42020");
        signinButton2.click();
    }
    
    
    
    
}
