package home;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class AmazonWebElements {

    public static final String userNameFieldXP =" //input[@id='ap_email']";
    @FindBy(how=How.XPATH,using=userNameFieldXP)
    public static WebElement userNameField;
    public static final String continueButtonXP="//input[@id='continue']";
    @FindBy(how=How.XPATH,using=continueButtonXP)
    public static WebElement continueButton;
    public static final String passWordFieldXP=" //input[@id='ap_password']";
    @FindBy(how=How.XPATH,using=passWordFieldXP)
    public static WebElement passWordField;
    public static final String loginButtonID="signInSubmit";
    @FindBy(how=How.ID,using=loginButtonID)
    public static WebElement loginButton;
    public static final String signinCSS ="#nav-link-accountList > div > span";
    @FindBy(how=How.CSS,using=signinCSS)
    public static WebElement signin;
    //***********************Ibrahim Web Element ***************************
    // navigate to new releases page web elements
    public static String expectedResult = "Amazon Hot New Releases";
    // specify the object location strategy for new releases page WebElements
    public static final String clickNewReleasePageCss = "#nav-xshop > a:nth-child(4)";
    @FindBy(how = How.CSS, using = clickNewReleasePageCss)
    public static WebElement clickNewReleasePage;
    public static final String checkReleasesPageTextXPATH = "//*[@id='zg_banner_text_wrapper']";
    @FindBy(how = How.XPATH, using = checkReleasesPageTextXPATH)
    public static WebElement checkReleasesPageTextX;
    //specify the object location strategy for New Releases in Baby page WebElements
    public static final String clickBabylinckCSS = "#zg_browseRoot > ul > li:nth-child(9) > a";
    @FindBy(how = How.CSS, using = clickBabylinckCSS)
    public static WebElement clickBabylinck;
    public static final String checkNewReleasesInBabyPageCSS = "#zg-right-col > h1";
    @FindBy(how = How.CSS, using = checkNewReleasesInBabyPageCSS)
    public static WebElement checkNewReleasesInBabyPage;
    public static String Expected = "New Releases in Baby";
    //specify the object location strategy for next page WebElements
    public static final String clickNextPageCSS = "#zg-center-div > div.a-row.a-spacing-top-mini > div > ul > li.a-last > a";
    @FindBy(how = How.CSS, using = clickNextPageCSS)
    public static WebElement clickNextPage;
    public static final String checkPagelinkXPATH = "//*[@id=\"zg-center-div\"]/div[2]/div/ul/li[1]/a";
    @FindBy(how = How.XPATH, using = checkPagelinkXPATH)
    public static WebElement checkPagelink;
    public static String expectedNextpageResult = "←Previous page";
    //specify the object location strategy for mouse hover Web elements
    public static final String hoverMouseCSS = "#nav-subnav > a:nth-child(5) > span.nav-a-content";
    @FindBy(how = How.CSS, using = hoverMouseCSS)
    public static WebElement hoverMouse;
    public static final String clickUnderMenuItemXPATH ="//*[@id='nav-flyout-aj:https://m.media-amazon.com/images/G/01/verticalstores/megamenu/us_baby_megamenu_test_2019_2.json:subnav-sl-megamenu-1:0']/div[2]/div/div[2]/ul/li[4]/a";
    @FindBy(how = How.XPATH, using = clickUnderMenuItemXPATH)
    public static WebElement clickUnderMenuItemX;
    // click check box option
    //specify the object location strategy for check box
    public static final String CheckBoxXPATH = "//*[@id=\"leftNav\"]/ul[2]/div/li/span/span/div/label/input";
    @FindBy(how = How.XPATH, using = CheckBoxXPATH)
    public static WebElement CheckBox1;
    //search Dropdown Box webElements
    public static final String searchDropdownBoxXP ="//select[@id='searchDropdownBox']";
    @FindBy(how= How.XPATH ,using=searchDropdownBoxXP )
    public static WebElement searchDropdownBox;
    //search box items
    public static final String SearchBoxCSS="#twotabsearchtextbox";
    @FindBy(how= How.CSS, using=SearchBoxCSS)
    public static WebElement SearchBox;
    // click search button
    public static final String clickSearchButtonCSS ="#nav-search > form > div.nav-right > div > input";
    @FindBy(how= How.CSS, using=clickSearchButtonCSS)
    public static WebElement clickSearchButton;
    public static final String getTextXPATH ="//*[@id='search']/span/div/span/h1/div/div[1]/div/div/span[3]";
    @FindBy(how= How.XPATH, using=getTextXPATH)
    public static WebElement getText;

}
