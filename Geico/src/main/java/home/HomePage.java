package home;

import common.WebAPI;

import org.junit.Assert;
import org.openqa.selenium.WebElement;

import static home.WebElements.*;

public class HomePage extends WebAPI {
    public void Land_on_the_home_page_I_will_check_if_I_land_in_the_correct_page() {
        String ExpectedTitle="An Insurance Company For Your Car And More | GEICO";
        String ActuaalTitle=getPageTitle(driver);
        Assert.assertEquals(ExpectedTitle,ActuaalTitle);
    }

    public void Land_on_the_home_page_I_will_check_if_the_link_url_is_derecting_me_to_the_right_page() {
        String ExpectedUrl="https://www.geico.com/";
        String ActuaalUrl=getPageUrl(driver);
        Assert.assertEquals(ExpectedUrl,ActuaalUrl);
    }

    public void land_in_the_home_page_I_should_see_the_text() {
        String ExpectedUrl="More than just car insurance";
        String ActuaalUrl=getTextByWebElement(TextExpected);
        Assert.assertEquals(ExpectedUrl,ActuaalUrl);
    }


import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class HomePage extends WebAPI {


    // method for page broken links
    public void CheckBrokenLink() throws IOException {
        driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
        brokenLink();
    }







}
