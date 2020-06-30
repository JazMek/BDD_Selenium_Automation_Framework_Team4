package Home;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class GeicoPageWebElement {
    public static final String insaranceXP="//*[@id=\"header-left-links\"]/ul[1]/li[1]/a";
    public static final String businessInsaranceXP="//*[@id=\"primary-navigation\"]/div[2]/ul/li[3]/a/span[2]";
    public static final String professionnelXp="//*[@id=\"primary-navigation\"]/div[2]/ul/li[3]/div/ul/li[3]/a/span";
    /*30182NY_Achour locators#2 ********************************* */
    public static final String informationsXP= "//*[@id=\"header-left-links\"]/ul[1]/li[2]/a";
    /* 30182NY_Achour WebElements 01**************************** */
    @FindBy(how= How.XPATH,using =businessInsaranceXP )
    public static WebElement businessInsarance;
    @FindBy(how= How.XPATH,using =professionnelXp )
    public static WebElement professionnel;
    /*30182NY_Achour locators#3 ********************************* */
    public static final String covid19UpdateXP="//*[@id=\"covid-19-panel\"]/a";
    public static final String covid19TextXP="//*[@id=\"form-contents\"]/div";
    /*30182NY_Achour locators#4 ********************************* */
    public static final String newCostumerCss="#sidebar > div.extra-info > div > ul > li > a";
    public static final String sendKeyCss="#TextInputDateComponent-2";
    public static final String Birth="03-03-1990";
    /*30182NY_Achour locators#5 ********************************* */
    public static final String makePaymentXpath="//*[@id=\"accessibility-main-content\"]/div[3]/div/div[1]/div/div/ul/li[1]/a";
    public static final String IdentificationXp="//*[@id=\"SelectComponent-1\"]";
    public static final String senkKesphoneCss="#TextInputTelComponent-1";
    public static final String phone="555 555 5555";
    public static final String zipCss= "#TextInputZipComponent-1";
    public static final String zipcode="12212";
    /*30182NY_Achour locators#5 ********************************* */
    public static final String CheckZIPCoodXP ="//input[@name='POL_ratedZip5']";
    @FindBy(how= How.XPATH,using = CheckZIPCoodXP )
    public static WebElement CheckZIPCood;
}
