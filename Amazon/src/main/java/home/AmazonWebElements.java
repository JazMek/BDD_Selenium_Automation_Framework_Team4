package home;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
public class AmazonWebElements {
    //---- LAMARAs Amazon Log In ------------
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
  //----LAMARAs; Check Best sellers Page Url-------
  public static final String ClickBestSellersCSS="#nav-xshop > a:nth-child(2)";
    @FindBy(how= How.CSS ,using=ClickBestSellersCSS)
    public static WebElement ClickBestSellers;
    public static String ExpectedUrl="https://www.amazon.com/gp/bestsellers/?ref_=nav_cs_bestsellers";
    //----LAMARAs; Check Books Page Url--------
    public static final String ClickBooksCSS ="#zg_browseRoot > ul > li:nth-child(11) > a";
    @FindBy(how= How.CSS, using=ClickBooksCSS)
    public static WebElement ClickBooks;
    public static String ExpectedUrl1="https://www.amazon.com/best-sellers-books-Amazon/zgbs/books/ref=zg_bs_nav_0";
    //----LAMARAs; choose the best Book in 'Best Sellers in Books'--------
    public static final String ChooseTheBestBookXP ="//*[@id=\"zg-ordered-list\"]/li[1]/span/div/span/a/span/div/img";
    @FindBy (how= How.XPATH, using=ChooseTheBestBookXP)
    public static WebElement ChooseTheBestBook;
    //----------LAMARAs; Select PaperBack Format for the best book--------------
    public static final String SelectPaperBackFormatXP="//a[@class='a-button-text']//span[contains(text(),'Hardcover')]";
    @FindBy(how= How.XPATH, using=SelectPaperBackFormatXP)
    public static WebElement SelectPaperBackFormat;
    //--------- LAMARAs; test 'Add To Cart' Functionality----
    public static final String AddToCartXP="//*[@id=\"buy-now-button\"]";
    @FindBy(how= How.XPATH, using=AddToCartXP)
    public static WebElement AddToCart;
    //------- LAMARAs; Test Mouse Hover  ---------
    public static final String HoverMouseCSS="#nav-link-accountList > span.nav-line-2";
    @FindBy(how= How.CSS, using=HoverMouseCSS)
    public static WebElement HoverMouse;
    //--------- LAMARAs; click On 'Create List'  --------
    public static final String ClickCreateListXP="//span[contains(text(),'Create a List')]";
    @FindBy(how= How.XPATH, using=ClickCreateListXP)
    public static WebElement ClickCreateList;
    //-----LAMARAs; My Amazon shopping list with Excel read file-------------------
    public static final String SearchBoxXP="//input[@id='twotabsearchtextbox']";
    @FindBy(how= How.XPATH, using=SearchBoxXP)
    public static WebElement SearchBox;
    //----- LAMARAs; compare "Amazon ALL Product" drop down list with my EXCEL sheet-------
    public static final String searchDropdownBoxXP ="//select[@id='searchDropdownBox']";
    @FindBy(how= How.XPATH ,using=searchDropdownBoxXP )
    public static WebElement searchDropdownBox;
}
