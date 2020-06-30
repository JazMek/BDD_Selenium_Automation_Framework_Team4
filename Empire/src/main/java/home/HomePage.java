package home;

import common.WebAPI;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class HomePage extends WebAPI {

    // method for page broken links
    public void CheckBrokenLink() throws IOException {
        driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
        brokenLink();
    }







}
