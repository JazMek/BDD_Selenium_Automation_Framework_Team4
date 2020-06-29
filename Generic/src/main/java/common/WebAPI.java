package common;
import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.StringUtils;
import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.io.File;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.junit.After;
import org.junit.Before;
public class WebAPI {
    //Browser SetUp
    public static WebDriver driver = null;
    public String browserstack_username = "Team4";
    public String browserstack_accesskey = "";
    public String saucelabs_username = "";
    public String saucelabs_accesskey = "";
    @Before
    public  void openBrowser() throws IOException {

        setUp(false,"browserstack","os","x","chrome","83","https://www.amazon.com/");
    }
    public void setUp( boolean useCloudEnv,  String cloudEnvName,
                       String os,  String os_version,  String browserName,
                       String browserVersion,  String url) throws IOException {
        if (useCloudEnv == true) {
            if (cloudEnvName.equalsIgnoreCase("browserstack")) {
                getCloudDriver(cloudEnvName, browserstack_username, browserstack_accesskey, os, os_version, browserName, browserVersion);
            } else if (cloudEnvName.equalsIgnoreCase("saucelabs")) {
                getCloudDriver(cloudEnvName, saucelabs_username, saucelabs_accesskey, os, os_version, browserName, browserVersion);
            }
        } else {
            getLocalDriver(os, browserName);
        }
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //driver.manage().timeouts().pageLoadTimeout(25, TimeUnit.SECONDS);
        driver.get(url);
        //driver.manage().window().maximize();
    }
    public WebDriver getLocalDriver( String OS, String browserName) {

        if (browserName.equalsIgnoreCase("chrome")) {
            if (OS.equalsIgnoreCase("OS X")) {
                System.setProperty("webdriver.chrome.driver", "../Generic/BrowserDriver/mac/chromedriver");
            } else if (OS.equalsIgnoreCase("Windows")) {
                System.setProperty("webdriver.chrome.driver", "../Generic/BrowserDriver/windows/chromedriver.exe");
            }
            driver = new ChromeDriver();
        } else if (browserName.equalsIgnoreCase("chrome-options")) {
            ChromeOptions options = new ChromeOptions();
            options.addArguments("--disable-notifications");
            if (OS.equalsIgnoreCase("OS X")) {
                System.setProperty("webdriver.chrome.driver", "../Generic/BrowserDriver/mac/chromedriver");
            } else if (OS.equalsIgnoreCase("Windows")) {
                System.setProperty("webdriver.chrome.driver", "../Generic/BrowserDriver/windows/chromedriver.exe");
            }
            driver = new ChromeDriver(options);
        } else if (browserName.equalsIgnoreCase("firefox")) {
            if (OS.equalsIgnoreCase("OS X")) {
                System.setProperty("webdriver.gecko.driver", "../Generic/BrowserDriver/mac/chromedriver");
            } else if (OS.equalsIgnoreCase("Windows")) {
                System.setProperty("webdriver.gecko.driver", "../Generic/BrowserDriver/windows/geckodriver.exe");
            }
            driver = new FirefoxDriver();

        } else if (browserName.equalsIgnoreCase("ie")) {
            System.setProperty("webdriver.ie.driver", "../Generic/BrowserDriver/windows/IEDriverServer.exe");
            driver = new InternetExplorerDriver();
        }
        return driver;
    }
    public WebDriver getCloudDriver(String envName, String envUsername, String envAccessKey, String os, String os_version, String browserName,
                                    String browserVersion) throws IOException {
        DesiredCapabilities cap = new DesiredCapabilities();
        cap.setCapability("browser", browserName);
        cap.setCapability("browser_version", browserVersion);
        cap.setCapability("os", os);
        cap.setCapability("os_version", os_version);
        if (envName.equalsIgnoreCase("Saucelabs")) {
            //resolution for Saucelabs
            driver = new RemoteWebDriver(new URL("http://" + envUsername + ":" + envAccessKey +
                    "@ondemand.saucelabs.com:80/wd/hub"), cap);
        } else if (envName.equalsIgnoreCase("Browserstack")) {
            cap.setCapability("resolution", "1024x768");
            driver = new RemoteWebDriver(new URL("http://" + envUsername + ":" + envAccessKey +
                    "@hub-cloud.browserstack.com/wd/hub"), cap);
        }
        return driver;
    }
    @After
    public void cleanUp() {
        driver.close();
        // driver.quit();
    }

    //helper methods
    public void clickOnElement(String locator) {


    public void navigateBack() {
        driver.navigate().back(); }

    public static String convertToString(String st) {
        String splitString = "";
        splitString = StringUtils.join(StringUtils.splitByCharacterTypeCamelCase(st), ' ');
        return splitString; }

    public static void sleepFor(int sec) throws InterruptedException {
        Thread.sleep(sec * 1000); }

    public void goBackToHomeWindow() {
        driver.switchTo().defaultContent(); }

    public void keysInput(String locator) {
        driver.findElement(By.cssSelector(locator)).sendKeys(Keys.ENTER);
    }
    //************************************scroll methodes***********************************************
    //method  Scroll Up
    public static void Page_Scroll_Up(WebDriver driver) {
        Actions actions = new Actions(driver);
        // Scroll Up using Actions class
        actions.keyDown(Keys.CONTROL).sendKeys(Keys.HOME).perform(); }

    //method  Scroll Down
    public static void Page_Scroll_Down(WebDriver driver) {
        Actions actions = new Actions(driver);
        // Scroll Down using Actions class
        actions.keyDown(Keys.CONTROL).sendKeys(Keys.END).perform(); }

    //method  Scroll Down
    public static void PageScrollDown(WebDriver driver) {
        Actions actions = new Actions(driver);
        // Scroll Down using Actions class
        actions.keyDown(Keys.CONTROL).sendKeys(Keys.END).perform(); }

    //method  Scroll Down to The webElement
    public static void Page_Scroll_DownToElement(WebElement element) {
        Actions actions = new Actions(driver);
        // Scroll Down using Actions class
        actions.keyDown(Keys.CONTROL).moveToElement(element).click(); }



    //method  Scroll left Or Right to The webElement
    public static void PageScrollToElement(WebElement element) {
        Actions actions = new Actions(driver);
        // Scroll Down using Actions class
        actions.moveToElement(element).click(); }

    //******************************** Assertation to get(text/title/compare/url **************************

    //Assert method to get title
    public static void getTitle(String expectedTitle) {
        String title = driver.getTitle();
        Assert.assertEquals(expectedTitle, title);
        System.out.println(title); }

    //Assert method to compare Text
    public static void compare_Text(String expectedText, WebElement element) {
        String actualText = element.getText();
        Assert.assertEquals(actualText, expectedText, actualText);
        System.out.println(actualText); }

    //Assert method to get url
    public static void getUrl(String expectedUrl) {
        String url = driver.getCurrentUrl();
        Assert.assertEquals( expectedUrl, url);
        System.out.println(url); }

//***************************************** Mouse hover**************************************************

    // method to hover mouse and click*
    public static void HoverMouseAndClickt(WebDriver driver, WebElement element) {
        Actions action = new Actions(driver);
        action.moveToElement(element).perform(); }

    //mouse hover by xpath and perform*
    public void mouseHoverByXpath(String locator) {

        try {
            WebElement element = driver.findElement(By.xpath(locator));
            Actions action = new Actions(driver);
            Actions hover = action.moveToElement(element);
        } catch (Exception ex) {
            System.out.println("First attempt has been done, This is second try");
            WebElement element = driver.findElement(By.xpath(locator));
            Actions action = new Actions(driver);
            action.moveToElement(element).perform(); }}

    //mouse hover by css and perform*
    public void mouseHoverByCSS(String locator) {
        try {
            WebElement element = driver.findElement(By.cssSelector(locator));
            Actions action = new Actions(driver);
            Actions hover = action.moveToElement(element);
        } catch (Exception ex) {
            System.out.println("First attempt has been done, This is second try");
            WebElement element = driver.findElement(By.cssSelector(locator));
            Actions action = new Actions(driver);
            action.moveToElement(element).perform(); } }

//*************************************  typing methodes ********************************************
//type locator(css/id/xpath/tagName) value.driver
    public static void typeOnElementNEnter(String locator, String value, WebDriver driver1) {
        try {
            driver1.findElement(By.cssSelector(locator)).sendKeys(value, Keys.ENTER);
        } catch (Exception ex1) {
            try {
                System.out.println("First Attempt was not successful");
                driver1.findElement(By.id(locator)).sendKeys(value, Keys.ENTER);
            } catch (Exception ex2) {
                try {
                    System.out.println("Second Attempt was not successful");
                    driver1.findElement(By.name(locator)).sendKeys(value, Keys.ENTER);
                } catch (Exception ex3) {
