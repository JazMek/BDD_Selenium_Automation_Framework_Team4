package home;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class TdBankWebElements {
    /*30182NY_Achour 01 locators ******************************************************* */
    public static final String productsXP="//*[@id=\"td-desktop-nav-dropdown-link-2\"]";
    /* 30182NY_WebElements 01***** */
    @FindBy(how = How.XPATH,using =productsXP )
    public static WebElement products;
    /*30182NY_Achour 02 locators*/
    public static final String CheckingXp="/html/body/div[2]/div[2]/header[1]/div[3]/div/div[1]/nav/ul/li[1]/ul/li[1]/a";
    /*30182NY_Achour 03 locators */
    public static final String  SavingsXP="/html/body/div[2]/div[2]/header[1]/div[3]/div/div[1]/nav/ul/li[1]/ul/li[2]/a";
    /*30182NY_Achour 04 locators*/
    public static final String   CDsXP="/html/body/div[2]/div[2]/header[1]/div[3]/div/div[1]/nav/ul/li[1]/ul/li[3]/a";
    /*30182NY_Achour 05 locators */
    public static final String  CreditCardsXP="/html/body/div[2]/div[2]/header[1]/div[3]/div/div[1]/nav/ul/li[1]/ul/li[4]/a";
    /*30182NY_Achour 06 locators */
    public static final String HomeEquityLoansLinesXP="/html/body/div[2]/div[2]/header[1]/div[3]/div/div[1]/nav/ul/li[1]/ul/li[5]/a";
    /*30182NY_Achour 07 locators */
    public static final String  MortgageXP="/html/body/div[2]/div[2]/header[1]/div[3]/div/div[1]/nav/ul/li[1]/ul/li[6]/a";
    /*30182NY_Achour 08 locators */
    public static final String PersonalLoansXP="/html/body/div[2]/div[2]/header[1]/div[3]/div/div[1]/nav/ul/li[1]/ul/li[7]/a";
    /*30182NY_Achour 09 locators */
    public static final String  IRAsXP="/html/body/div[2]/div[2]/header[1]/div[3]/div/div[1]/nav/ul/li[1]/ul/li[8]/a";
    /*30182NY_Achour 10 locators */
    public static final String   PrepaidCardsXP="/html/body/div[2]/div[2]/header[1]/div[3]/div/div[1]/nav/ul/li[1]/ul/li[9]/a";
    /*30182NY_Achour 11 locators */
    public static final String    SpecialOffersXP="/html/body/div[2]/div[2]/header[1]/div[3]/div/div[1]/nav/ul/li[1]/ul/li[10]/a";
}
