package home;

import common.WebAPI;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import static home.UnitedWebElement.*;

public class HomePage  extends WebAPI {
    public void click_one_way_check_box() {
        checkBoxOneWay.click();


    }

    public void click_link() throws InterruptedException {
        sleepFor(2);
        clickLink.click();

    }

    public void clear_text_box() {
        clearTextBox.click();


    }

    public void Enter_in_search_input_field(String string) {
        enterDestinationFrom.sendKeys(string);


    }

    public void enter(String string) {
        enterDestinationTo.sendKeys(string);

    }

    public void click_Find_Flight_Button() {
        ClickFindFlightButton.click();
    }
    // method for page broken links
    public void CheckBrokenLink() throws IOException {
        driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
        brokenLink();
    }


}
