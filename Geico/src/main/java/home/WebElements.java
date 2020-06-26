package home;

import common.WebAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import step_definitions.HomePage_StepDefinition;

public class WebElements extends WebAPI {
    HomePage_StepDefinition homePage_stepDefinition ;
    WebElements webElements;
    HomePage homePage;

    public void init(){
      homePage = PageFactory.initElements(driver,HomePage.class);
      webElements =PageFactory.initElements(driver,WebElements.class);
      homePage_stepDefinition=PageFactory.initElements(driver, HomePage_StepDefinition.class);
  }

    //    WebElements
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
    public static final String TextExpectedCSS ="#section1heading";
    @FindBy(how=How.CSS,using=TextExpectedCSS)
    public static WebElement TextExpected;


}
