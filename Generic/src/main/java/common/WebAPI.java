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
        Assert.assertEquals(title, expectedTitle, title);
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
                    System.out.println("Third Attempt was not successful");
                    driver1.findElement(By.xpath(locator)).sendKeys(value, Keys.ENTER); } } } }

    //type by xpath locator and value
    public void typeByXpath(String locator, String value) {
        driver.findElement(By.xpath(locator)).sendKeys(value);
    }
    //type on element css or idd locator and the key value(locator,value)

    public void typeOnInputField(String locator, String value) {
        try {
            driver.findElement(By.cssSelector(locator)).sendKeys(value);
        } catch (Exception ex) {
            driver.findElement(By.id(locator)).sendKeys(value); } }

    //type by css
    public void typeByCss(String locator, String value) {
        driver.findElement(By.cssSelector(locator)).sendKeys(value); }
    //type by css end enter value
    public void typeByCssNEnter(String locator, String value) {
        driver.findElement(By.cssSelector(locator)).sendKeys(value, Keys.ENTER); }
    //type by clicking clear and send key
    public void clickCleaType(WebElement element, String value) {
        element.click();
        element.clear();
        element.sendKeys(value); }
    //type on element by webelemrnts
    public void keysInput(WebElement element, String value) {
        element.sendKeys(value,Keys.ENTER); }
    //type on element (webelement,value)
    public void inputValueInTextBoxByWebElement(WebElement webElement, String value) {
        webElement.sendKeys(value + Keys.ENTER); }
    //type on element by xpath or css and sendkey value
    public void typeOnElement(String locator, String value) {
        try {
            driver.findElement(By.cssSelector(locator)).sendKeys(value);
        } catch (Exception ex) {
            driver.findElement(By.xpath(locator)).sendKeys(value); } }
    //type on element css locator ,sendkey value
    public static void typeOnElementNEnter(String locator, String value) {
        try {
            driver.findElement(By.cssSelector(locator)).sendKeys(value, Keys.ENTER);
        } catch (Exception ex1) {
            try {
                System.out.println("First Attempt was not successful");
                driver.findElement(By.name(locator)).sendKeys(value, Keys.ENTER);
            } catch (Exception ex2) {
                try {
                    System.out.println("Second Attempt was not successful");
                    driver.findElement(By.xpath(locator)).sendKeys(value, Keys.ENTER);
                } catch (Exception ex3) {
                    System.out.println("Third Attempt was not successful");
                    driver.findElement(By.id(locator)).sendKeys(value, Keys.ENTER); } } } }

    public void typeOnInputBox(String locator, String value) {
        try {
            driver.findElement(By.id(locator)).sendKeys(value, Keys.ENTER);
        } catch (Exception ex1) {
            System.out.println("ID locator didn't work");
        }
        try {
            driver.findElement(By.name(locator)).sendKeys(value, Keys.ENTER);
        } catch (Exception ex2) {
            System.out.println("Name locator didn't work");
        }
        try {
            driver.findElement(By.cssSelector(locator)).sendKeys(value, Keys.ENTER);
        } catch (Exception ex3) {
            System.out.println("CSS locator didn't work");
        } }
    //*************************************** clear field ********************************
    //clear input field
    public void clearInputField(String locator) {
        driver.findElement(By.cssSelector(locator)).clear(); }
    public void clearInput(String locator) {
        driver.findElement(By.cssSelector(locator)).clear();
    }
    public void clearField(String locator) {
        driver.findElement(By.id(locator)).clear(); }public void clearInputBox(WebElement webElement) {
        webElement.clear();
    }
    public String getTextByWebElement(WebElement webElement) {
        String text = webElement.getText();
        return text; }

//**************************   Synchronization   **********************************************************

    public void waitUntilClickAble(By locator) {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(locator));
    }

    public void waitUntilSelectable(By locator) {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        boolean element = wait.until(ExpectedConditions.elementToBeSelected(locator));
    }

    public void upLoadFile(String locator, String path) {
        driver.findElement(By.cssSelector(locator)).sendKeys(path);
        /* path example to upload a file/image
           path= "C:\\Users\\rrt\\Pictures\\ds1.png";
         */
    }

    public void selectOptionByVisibleText(WebElement element, String value) {
        Select select = new Select(element);
        select.selectByVisibleText(value);
    }

    public void selectOptionByIndex(WebElement element, int value) {
        Select select = new Select(element);
        select.selectByIndex(value);
    }

    //wait the page until the locator section will be vissible
    public void waitUntilVisible(By locator) {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(locator)); }
    //**************************** Handling New Tabs and screenshot *******************************************************

    public static WebDriver handleNewTab(WebDriver driver1) {
        String oldTab = driver1.getWindowHandle();
        List<String> newTabs = new ArrayList<String>(driver1.getWindowHandles());
        newTabs.remove(oldTab);
        driver1.switchTo().window(newTabs.get(0));
        return driver1; }
    public static  boolean isPopUpWindowDisplayed(WebDriver driver1, String locator) {
        boolean value = driver1.findElement(By.cssSelector(locator)).isDisplayed();
        return value; }

    public static void closePopUpWindowDisplayed(WebDriver driver1, String locator) {
        driver1.findElement(By.cssSelector(locator)).isDisplayed();
    }

    // Customer Made Helper Methods for Amex.com
    public void brokenLink() throws IOException {
        //Step:1-->Get the list of all the links and images
        List<WebElement> linkslist = driver.findElements(By.tagName("a"));
        linkslist.addAll(driver.findElements(By.tagName("img")));

        System.out.println("Total number of links and images--------->>> " + linkslist.size());

        List<WebElement> activeLinks = new ArrayList<WebElement>();
        //Step:2-->Iterate linksList: exclude all links/images which does not have any href attribute
        for (int i = 0; i < linkslist.size(); i++) {
            //System.out.println(linkslist.get(i).getAttribute("href"));
            if (linkslist.get(i).getAttribute("href") != null && (!linkslist.get(i).getAttribute("href").contains("javascript") && (!linkslist.get(i).getAttribute("href").contains("mailto")))) {
                activeLinks.add(linkslist.get(i));
            }
        }
        System.out.println("Total number of active links and images-------->>> " + activeLinks.size());

        //Step:3--> Check the href url, with http connection api
        for (int j = 0; j < activeLinks.size(); j++) {

            HttpURLConnection connection = (HttpURLConnection) new URL(activeLinks.get(j).getAttribute("href")).openConnection();

            connection.connect();
            String response = connection.getResponseMessage();
            connection.disconnect();
            System.out.println(activeLinks.get(j).getAttribute("href") + "--------->>> " + response); } }
    //handling Alert
    public void okAlert() {
        Alert alert = driver.switchTo().alert();
        alert.accept();
    }

    public void cancelAlert() {
        Alert alert = driver.switchTo().alert();
        alert.dismiss();
    }

    //iFrame Handle
    public void iframeHandle(WebElement element) {
        driver.switchTo().frame(element);
    }

    //get Links
    public void getLinks(String locator) {
        driver.findElement(By.linkText(locator)).findElement(By.tagName("a")).getText();
    }

    //Taking Screen shots
    public void takeScreenShot() throws IOException {
        File file = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        //FileUtils.copyFile(file, new File("screenShots.png"));
    }

    public static void captureScreenshot(WebDriver driver, String screenshotName) {
        DateFormat df = new SimpleDateFormat("M-d-y");
        Date date = new Date();
        df.format(date);
        System.setProperty("current.date", date.toString().replace(" ", "_").replace(":", "_"));
        Date d = new Date();
        File file = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        try {
            FileUtils.copyFile(file,
                    new File(System.getProperty("user.dir") + "/Screenshots/" + screenshotName + " " + df.format(date) + ".png"));
            System.out.println("Screenshot captured");
        } catch (Exception e) {
            System.out.println("Exception while taking screenshot " + e.getMessage()); } }

    //************************************Get text list url title*************************************
    //get list by id locator
    public List<WebElement> getListOfWebElementsById(String locator) {
        List<WebElement> list = new ArrayList<WebElement>();
        list = driver.findElements(By.id(locator));
        System.out.println(list);
        return list; }

    //get text by css
    public static List<String> getTextFromWebElements(String locator) {
        List<WebElement> element = new ArrayList<WebElement>();
        List<String> text = new ArrayList<String>();
        element = driver.findElements(By.cssSelector(locator));
        for (WebElement web : element) {
            String st = web.getText();
            text.add(st);
            System.out.println(text);
        }

        return text;
    }

    //get textby locator ,driver
    public static List<String> getTextFromWebElements(String locator, WebDriver driver1) {
        List<WebElement> element = new ArrayList<WebElement>();
        List<String> text = new ArrayList<String>();
        element = driver1.findElements(By.cssSelector(locator));
        for (WebElement web : element) {
            String st = web.getText();
            text.add(st);
        }
        System.out.println(text);
        return text;
    }

    //get list text
    public static List<WebElement> getListOfWebElementsByXPath(String locator) {
        List<WebElement> text = new ArrayList<WebElement>();
        text = driver.findElements(By.xpath(locator));
        System.out.println(text);
        return text;
    }

    //get list
    public static List<WebElement> getListOfWebElementsByCss(String locator, WebDriver driver1) {
        List<WebElement> list = new ArrayList<WebElement>();
        list = driver1.findElements(By.cssSelector(locator));
        System.out.println(list);
        return list;
    }

    //get list
    public List<WebElement> getListOfWebElementsByXpath(String locator) {
        List<WebElement> list = new ArrayList<WebElement>();
        list = driver.findElements(By.xpath(locator));
        System.out.println(list);
        return list;
    }

    //get current url
    public String getCurrentPageUrl() {
        String url = driver.getCurrentUrl();
        return url;
    }

    //get text by css
    public String getTextByCss(String locator) {
        String st = driver.findElement(By.cssSelector(locator)).getText();
        return st;
    }

    // get text by xpath
    public String getTextByXpath(String locator) {
        String st = driver.findElement(By.xpath(locator)).getText();
        return st;
    }

    //get text by id
    public String getTextById(String locator) {
        return driver.findElement(By.id(locator)).getText();
    }

    //get text by name
    public String getTextByName(String locator) {
        String st = driver.findElement(By.name(locator)).getText();
        return st;
    }

    //get list of string
    public List<String> getListOfString(List<WebElement> list) {
        List<String> items = new ArrayList<String>();
        for (WebElement element : list) {
            items.add(element.getText());
        }
        return items;
    }

    public static void getTitle1(String expectedTitle) {
        String title1 = driver.getTitle();
        Assert.assertEquals(expectedTitle, title1);
        System.out.println(title1); }
    //--------------------------------------Clicking methodes---------------------------------------------------------
    //click on element by locator(css,or class name,or id ,or xpath)
    public void clickOnElement(String locator) {
        try {
            driver.findElement(By.cssSelector(locator)).click();
        } catch (Exception ex) {
            try {
                driver.findElement(By.className(locator)).click();
            } catch (Exception ex2) {
                try {
                    driver.findElement(By.id(locator)).click();
                } catch (Exception ex3) {
                    driver.findElement(By.xpath(locator)).click();
                } } } }

    //click on element css.xpath,or id and driver(locator,driver)
    public static void clickOnElement(String locator, WebDriver driver1) {
        try {
            driver1.findElement(By.cssSelector(locator)).click();
        } catch (Exception ex1) {
            try {
                driver1.findElement(By.xpath(locator)).click();
            } catch (Exception ex2) {
                driver1.findElement(By.id(locator)).click(); } } }
    // click by xpath
    public void clickByXpath(String locator) {
        driver.findElement(By.xpath(locator)).click(); }
    // click by css
    public void clickByCss(String locator) {
        driver.findElement(By.cssSelector(locator)).click(); }

    //click and find by css and give the value at the page it will continue by it self
    public void takeEnterKeys(String locator) {
        driver.findElement(By.cssSelector(locator)).sendKeys(Keys.ENTER); 
    //scroll Page down to the end
    public static void scrollPageDown(WebDriver driver){
        JavascriptExecutor js=((JavascriptExecutor) driver);
        js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
    }
    //WebElement element = driver.findElement(By.xpath());
    public static void scrollIntoView(WebElement element, WebDriver driver){
        JavascriptExecutor js=((JavascriptExecutor) driver);
        js.executeScript("arguments[0].scrollIntoView(true)",element);
    }
    //*************    team's new methods   ************************************************************8
    // method to hover mouse and click
    public static void HoverMouseAndClick(WebDriver driver, WebElement element) {
        Actions action= new Actions(driver);
        action.moveToElement(element).perform();
    }
    //Assert method to get title
    public static void getTitle(String expectedTitle){
        String title=driver.getTitle();
        Assert.assertEquals(title ,expectedTitle,"title doesn't match");
        System.out.println(title);
    }
    //Assert method to get url
    public static void getUrl(String expectedUrl){
        String url=driver.getCurrentUrl();
        Assert.assertEquals(url,expectedUrl,"Url doesn't match");
        System.out.println(url);
    }
    //windows setup
    public static void setUpWindow(){
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
    }
    // Minimize the browser
    //driver.manage().window().setPosition(new Point(0, -1000));
    //Set Size of browser
    //driver.manage().window().setSize(new Dimension(1920, 1080));

    // Get Page Source: This command is used to get the source code of the web page. It returns a string.
    public static void GetPageSource(){
        //driver.getPageSource();  or
        String sourceCode = driver.getPageSource();
    }
    // Navigate Forward
    public static void NavigateForward(){
        driver.navigate().forward();
    }
    //Refresh Page
    public static void RefreshPage(){
        driver.navigate().refresh();
    }
    //Navigate Directly To a specific URL
    public static void NavigateDirectlyToURL(){
        driver.navigate().to("https://www.netflix.com");
        //driver.navigate().to("https://www.amazon.com");
    }
//scroll Page down to the end
public static void scrollPageDown(WebDriver driver){
    JavascriptExecutor js=((JavascriptExecutor) driver);
    js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
}
    //scroll Page down to the view element
//WebElement element = driver.findElement(By.xpath());
    public static void scrollIntoView(WebElement element, WebDriver driver){
        JavascriptExecutor js=((JavascriptExecutor) driver);
        js.executeScript("arguments[0].scrollIntoView(true)",element);
    }
    //method Scroll Up
    public static void Page_Scroll_Up(WebDriver driver) {
        Actions actions = new Actions(driver);
// Scroll Up using Actions class
        actions.keyDown(Keys.CONTROL).sendKeys(Keys.HOME).perform(); }

    //method Scroll Down
    public static void Page_Scroll_Down(WebDriver driver) {
        Actions actions = new Actions(driver);
// Scroll Down using Actions class
        actions.keyDown(Keys.CONTROL).sendKeys(Keys.END).perform(); }

    //method Scroll Down
    public static void PageScrollDown(WebDriver driver) {
        Actions actions = new Actions(driver);
// Scroll Down using Actions class
        actions.keyDown(Keys.CONTROL).sendKeys(Keys.END).perform(); }

    //method Scroll Down to The webElement
    public static void Page_Scroll_DownToElement(WebElement element) {
        Actions actions = new Actions(driver);
// Scroll Down using Actions class
        actions.keyDown(Keys.CONTROL).moveToElement(element).click(); }

    //method Scroll left Or Right to The webElement
    public static void PageScrollToElement(WebElement element) {
        Actions actions = new Actions(driver);
// Scroll Down using Actions class
        actions.moveToElement(element).click(); }
    //**** LAMARAs Check Broken Links  ******************
    public void Check_brokenLink() throws IOException, InterruptedException {
        brokenLink();
    }
    //***** Method to get PageLinksList ***************
    public static List<WebElement> PageLinksList(WebDriver driver){
        List<WebElement> linkslist = driver.findElements(By.tagName("a"));
        linkslist.addAll(driver.findElements(By.tagName("img")));
        System.out.println("Total number of links and images---->>> " + "links list size is"+"  " + linkslist.size());
        for (int i = 0; i < linkslist.size(); i++) {
            System.out.println(linkslist.get(i).getText());
            System.out.println(linkslist.get(i).getAttribute("href"));
        }
        return linkslist;
    }
    // navigatBackWindow
    public static void navigatebackWindow() {
        driver.navigate().back();
    }

}