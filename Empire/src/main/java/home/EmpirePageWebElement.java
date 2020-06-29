package home;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
public class EmpirePageWebElement {
    //30182NY_Achour
    public static final String mdcaidXp="//html//body//div//div//div//div//div//div//div//div//div//div//ul//li//a[contains(text(),'Medicaid')]";
    public static final String overviewCss="#medicaid-topmenu-1439462442536";
    public static final String popUpClose="#fsrFocusFirst > svg";
    public static final String benefitsXP="//span[contains(text(),'Benefits')]";
    @FindBy(how= How.XPATH,using =benefitsXP )
    public static WebElement benefits;
    public static final String enrollementXP="//span[contains(text(),'Enrollment')]";
    @FindBy(how= How.XPATH,using =enrollementXP )
    public static WebElement enrollement;
    public static final String careXP="//span[contains(text(),'Care')]";
    @FindBy(how= How.XPATH,using =careXP )
    public static WebElement care;
    public static final String loginXp="//html//body//div//div//div//div//ul//li//a[contains(text(),'Login')]";
    @FindBy(how= How.XPATH,using = loginXp)
    public static WebElement login ;
    public static final String languageXp="//html//body//div//div//div//div//ul//li//a[contains(text(),'Español')]";
    @FindBy(how= How.XPATH,using = languageXp)
    public static WebElement language;
    public static final String contactUsXP="//body/div/div/div/div/ul/li[3]/a[1]";
    @FindBy(how= How.XPATH,using = contactUsXP)
    public static WebElement contactUs;
    public static final String findADocteurXp="//span[contains(text(),'Find a Doctor')]";
    public static final String makeApaymentXP="//span[contains(text(),'Make a Payment')]";
    public static final String EnrollXP="//span[contains(text(),'How to Enroll')]";
    public static final String renewXP="//span[contains(text(),'How to Renew')]";
    public static final String idXP="//span[contains(text(),'Get your ID Card')]";}
