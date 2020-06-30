package home;

import common.WebAPI;
import dataBase.User;
import org.openqa.selenium.Keys;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import static dataBase.ConnectToSqlDB.*;
import static home.SprintWebElements.*;


public class HomePage extends WebAPI  {

    public void click_search_button() {
        clickSearchBox.click();
    }

    public void Enter_in_search_input_field(String string) {

        enterDataSearchBox.sendKeys(string);
        enterDataSearchBox.sendKeys(Keys.ENTER);

}
    // method for page broken links
    public void CheckBrokenLink() throws IOException {
        driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
        brokenLink();
    }
    public void enter_item_in_search_field_i_see_result() throws InterruptedException, SQLException, IOException, ClassNotFoundException {

        loadProperties();
        connectToSqlDatabase();
        readUserProfileFromSqlTable();
        List<User> list = readUserProfileFromSqlTable();

        sleepFor(3);
        for(User user:list) {
            clickSearchBox.click();
            enterDataSearchBox.sendKeys(user.getItem());
            sleepFor(3);
            enterDataSearchBox.sendKeys(Keys.ENTER);
            sleepFor(3);
            navigatebackWindow();
            sleepFor(3);

        }

    }
}



