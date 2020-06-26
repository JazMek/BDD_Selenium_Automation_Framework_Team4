package home;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class SprintWebElements {

    // -brahim-sprint search box
    public static final String searchBoxXPATH="/html/body/div[1]/div/div[1]/div/header/div/div[2]/div/div[2]/div[1]/div/div[2]/a/span";
    @FindBy(how= How.XPATH,using=searchBoxXPATH)
    public static WebElement clickSearchBox;

    public static final String enterDataSearchBoxCSS="#globalSearch";
    @FindBy(how= How.CSS,using=enterDataSearchBoxCSS)
    public static WebElement enterDataSearchBox;
    public static final String CheckZIPCoodXP ="//input[@placeholder='Enter ZIP Code']";
    @FindBy(how= How.XPATH,using = CheckZIPCoodXP )
    public static WebElement CheckZIPCood;







public class SprintWebElements {

}