package home;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
public class GeicoWebElement {
    public static final String insaranceXP="//*[@id=\"header-left-links\"]/ul[1]/li[1]/a";
    public static final String BusinessInsuranceXP = "//*[@id=\"primary-navigation\"]/div[2]/ul/li[3]/a/span[2]";
    public static final String BusinessOwnerXP = "//*[@id='primary-navigation']/div[2]/ul/li[3]/div/ul/li[1]/a/span";
    public static final String GeneralLiabilityXP = "//*[@id=\"primary-navigation\"]/div[2]/ul/li[3]/div/ul/li[2]/a/span";
    public static final String ProfessionalLiabilityXP = "//*[@id=\"primary-navigation\"]/div[2]/ul/li[3]/div/ul/li[3]/a/span";
    public static final String WorkersCompensationsXP = "//*[@id=\"primary-navigation\"]/div[2]/ul/li[3]/div/ul/li[4]/a/span";
    public static final String MedicalMalpracticeXP = "//*[@id=\"primary-navigation\"]/div[2]/ul/li[3]/div/ul/li[5]/a/span";
    public static final String WellnessAndFitnessXP= "//*[@id=\"primary-navigation\"]/div[2]/ul/li[3]/div/ul/li[6]/a/span";
    public static final String CommercialAutoXP = "//*[@id=\"primary-navigation\"]/div[2]/ul/li[3]/div/ul/li[7]/a/span";
    public static final String RideShareXP = "//*[@id=\"primary-navigation\"]/div[2]/ul/li[3]/div/ul/li[8]/a/span";
    public static final String ansaranceXP="//*[@id=\"header-left-links\"]/ul[1]/li[1]/a";
    public static final String businessInsaranceXP="//*[@id=\"primary-navigation\"]/div[2]/ul/li[3]/a/span[2]";
    public static final String informationsXP= "//*[@id=\"header-left-links\"]/ul[1]/li[2]/a";
    public static final String covid19UpdateXP="//*[@id=\"covid-19-panel\"]/a";
    public static final String covid19TextXP="//*[@id=\"form-contents\"]/div";
    public static final String newCostumerCss="#sidebar > div.extra-info > div > ul > li > a";
    public static final String sendKeyCss="#TextInputDateComponent-2";
    public static final String Birth="03-03-1990";
    public static final String makePaymentXpath="//*[@id=\"accessibility-main-content\"]/div[3]/div/div[1]/div/div/ul/li[1]/a";
    public static final String IdentificationXp="//*[@id=\"SelectComponent-1\"]";
    public static final String senkKesphoneCss="#TextInputTelComponent-1";
    public static final String phone="555 555 5555";
    public static final String zipCss= "#TextInputZipComponent-1";
    public static final String zipcode="12212";
    //    public static final String InsuranceXP = "//*[@id='header-left-links']/ul[1]/li[1]/a";
    @FindBy(how = How.XPATH,using =insaranceXP)
    public static WebElement Insurance;
    @FindBy(how = How.XPATH,using = BusinessInsuranceXP)
    public static WebElement BusinessInsurance;
    @FindBy(how = How.XPATH,using = BusinessOwnerXP)
    public static WebElement BusinessOwner;
    @FindBy(how = How.XPATH,using = GeneralLiabilityXP)
    public static WebElement GeneralLiability;
    @FindBy(how = How.XPATH,using = ProfessionalLiabilityXP)
    public static WebElement ProfessionalLiability;
    @FindBy(how = How.XPATH,using = WorkersCompensationsXP)
    public static WebElement WorkersCompensations;
    @FindBy(how = How.XPATH,using = MedicalMalpracticeXP)
    public static WebElement MedicalMalpractice;
    @FindBy(how = How.XPATH,using = WellnessAndFitnessXP)
    public static WebElement WellnessAndFitness;
    @FindBy(how = How.XPATH,using = CommercialAutoXP)
    public static WebElement CommercialAuto;
    @FindBy(how = How.XPATH,using = RideShareXP)
    public static WebElement RideShare;
    public static final String professionnelXp="//*[@id=\"primary-navigation\"]/div[2]/ul/li[3]/div/ul/li[3]/a/span";
    @FindBy(how= How.XPATH,using =BusinessInsuranceXP )
    public static WebElement businessInsarance;
    @FindBy(how= How.XPATH,using =professionnelXp )
    public static WebElement professionnel;
    public static final String CheckZIPCoodXP ="//input[@name='POL_ratedZip5']";
    @FindBy(how= How.XPATH,using = CheckZIPCoodXP )
    public static WebElement CheckZIPCood;
}
