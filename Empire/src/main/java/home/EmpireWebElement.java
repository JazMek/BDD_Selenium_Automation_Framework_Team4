package home;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class EmpireWebElement {
    public static final String IndividualAndFamilyXP ="//*[@id=\"mbr-page-wrapper\"]/div[1]/div/div[1]/div/div/div[4]/div/div[1]/div[2]/ul/li[1]/a";
    public static final String HealthInsuranceXP ="//*[@id=\"individualfamily-topmenu-1439337551017\"]";
    public static final String VisionInsuranceXP="//*[@id=\"individualfamily-topmenu-1439337940998\"]";
    public static final String DentalInsuranceXP="//*[@id=\"individualfamily-topmenu-1439339586522\"]";
    public static final String SelectLanguageXP ="//*[@id=\"psButtonlng-ddl\"]/span[1]";
    public static final String SelectChineeseLanguageXP="//*[@id=\"psDropdownlng-ddl\"]/ul/li[2]/a/span[1]";
    public static final String LoginXP="//*[@id=\"individualfamily-topmenu-1439339362269\"]";
    public static final String UserNameXP="//*[@id=\"txtUsername\"]";
    public static final String PassWordXP ="//*[@id=\"txtPassword\"]";


    @FindBy(how = How.XPATH,using = IndividualAndFamilyXP)
    public static WebElement IndividualAndFamily;
    @FindBy(how = How.XPATH,using = HealthInsuranceXP)
    public static WebElement HealthInsurance;
    @FindBy(how = How.XPATH,using = VisionInsuranceXP)
    public static WebElement VisionInsurance;
    @FindBy(how = How.XPATH,using = DentalInsuranceXP)
    public static WebElement DentalInsurance;
    @FindBy(how = How.XPATH,using = SelectLanguageXP)
    public static WebElement selectLanguage;
    @FindBy(how = How.XPATH,using = SelectChineeseLanguageXP)
    public static WebElement selectChineeseLanguage;
    @FindBy(how = How.XPATH,using = LoginXP)
    public static WebElement Login;
    @FindBy(how = How.XPATH,using = UserNameXP)
    public static WebElement UserName;
    @FindBy(how = How.XPATH,using = PassWordXP)
    public static WebElement PassWord;

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
    public static final String idXP="//span[contains(text(),'Get your ID Card')]";


}

