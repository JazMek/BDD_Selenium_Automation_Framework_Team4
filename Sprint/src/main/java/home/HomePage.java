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

public class HomePage extends WebAPI {
    public static void enter_item_in_search_field_i_see_result() throws InterruptedException, SQLException, IOException, ClassNotFoundException {
        loadProperties();
        connectToSqlDatabase();
        readUserProfileFromSqlTable();
        List<User> list = readUserProfileFromSqlTable();
        for (User user : list) {
            clickSearchBox.click();
            enterDataSearchBox.sendKeys(user.getItem());
            enterDataSearchBox.sendKeys(Keys.ENTER);
            navigatebackWindow();
            driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);

        }
    }

    }