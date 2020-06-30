package home;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class SprintWebElement {
    public static final String dealCss="body > div.sprint-app > div > div.aem-Grid.aem-Grid--12.aem-Grid--default--12 > div > header > div > div.spcmp-header-primay-nav > div > div.spcmp-header-meta > nav > div.menu-container > ul > li:nth-child(3) > a > span";
    public static final String hotDealsCss="body > div.sprint-app > div > div.aem-Grid.aem-Grid--12.aem-Grid--default--12 > div > div.responsivegrid.aem-GridColumn.aem-GridColumn--default--12 > div > div:nth-child(4) > div > div > div.text.aem-GridColumn--default--none.aem-GridColumn.aem-GridColumn--default--12.aem-GridColumn--offset--default--0 > p > span > b > span";
    public static final String showNowXP="//body/div/div/div/div/div/div/div[4]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[3]/div[1]/div[1]/div[3]/div[1]/div[1]/a[1]/span[1]";
    public static final String StorageCss="//div[contains(text(),'128')]";
    public static final String ClrCss="#main > div.device-page.device-page--detail.device-page--zoom-in.device-page--thumbnails.device-page--with-sticky > div > div.row > div.col-xs-12.col-md-6.device-detail-col.position-relative > div.device-selection-swatches > div.color-selection-swatches.ml-5.ml-md-0 > div > div > div > div:nth-child(1) > div > div > label:nth-child(3) > span > div > div";
    public static final String imageCss="#main > div.device-page.device-page--detail.device-page--zoom-in.device-page--thumbnails.device-page--with-sticky > div > div.row > div.col-xs-12.col-md-6.mb-20.mb-md-0 > div.imagegallery-container > div:nth-child(2) > div.imagegallery.active-gallery.slick-initialized.slick-slider > div > div > div.imagegallery__slide.slick-slide.slick-current.slick-active > div > div > a > img";
    public static final String featureCss="/html[1]/body[1]/div[1]/article[1]/div[4]/div[1]/div[1]/div[7]/div[1]/div[1]/div[1]/div[3]/button[1]";
    public static final String AllPhonesXp="//div[2]//div[1]//div[1]//div[1]//a[1]//strong[1]";
    public static final String filterCss="//*[@id=\"main\"]/div[7]/div[2]/div[1]/form/div[1]/div/div[1]/div[2]/div/div/div";
    public static final String samsungCss="#filter-by-device > div:nth-child(2) > label";
    public static final String listCss="#main > div.devicetilewall > div.bgc--ash-light > div:nth-child(1) > form > div.container-xl.mx-neg-sm-20.py-md-10 > div > div.col-xs-12.col-md-4.col-xl-3.hide-xs > div > select";
    public static final String signInXP="//span[contains(text(),'Sign In')]";
    public static final String checkStatusCss="#spcmp-auth-modal > div > div.spcmp-header-global-middle > div > ul > li:nth-child(2) > a";
    public static final String PlansXP="/html/body/div[1]/div/div[1]/div/header/div/div[2]/div/div[1]/nav/div[2]/ul/li[1]/a/span";
    @FindBy(how = How.XPATH,using =PlansXP )
    public static WebElement Plans;
    public static final String UnlimitedPlansXP="/html/body/div[1]/div/div[1]/div/header/div/div[2]/div/div[1]/nav/div[2]/ul/li[1]/div/div/ul/li[1]/ul/li[1]/a";
    @FindBy(how = How.XPATH,using =UnlimitedPlansXP)
    public static WebElement UnlimitedPlans;
    public static final String OtherPlansXP="/html/body/div[1]/div/div[1]/div/header/div/div[2]/div/div[1]/nav/div[2]/ul/li[1]/div/div/ul/li[1]/ul/li[3]/a";
    @FindBy(how = How.XPATH,using =OtherPlansXP)
    public static WebElement OtherPlans;
    public static final String AddOnServicesXP="//li[@class='all']//a[contains(text(),'Add-on services')]";
    @FindBy(how = How.XPATH,using =AddOnServicesXP)
    public static WebElement AddOnServices;
    public static final String OurNetWorkXP="/html/body/div[1]/div/div[1]/div/header/div/div[2]/div/div[1]/nav/div[2]/ul/li[1]/div/div/ul/li[2]/ul/li[1]/a";
    @FindBy(how = How.XPATH,using =OurNetWorkXP)
    public static WebElement OurNetWork;
    public static final String OurUnlimitedPlanXP="//*[@id=\"main\"]/div[6]/nav/ul/li[1]/a";
    @FindBy(how = How.XPATH,using =OurUnlimitedPlanXP)
    public static WebElement OurUnlimitedPlan;
    public static final String UsVsThemPlanXP="//*[@id=\"main\"]/div[6]/nav/ul/li[2]/a";
    @FindBy(how = How.XPATH,using =UsVsThemPlanXP)
    public static WebElement UsVsThemPlan;
    public static final String OtherPlansPlanXP="//*[@id=\"main\"]/div[6]/nav/ul/li[3]/a";
    @FindBy(how = How.XPATH,using =OtherPlansPlanXP)
    public static WebElement OtherPlansPlan;
    public static final String UsVsNextIconXP="//*[@id=\"main\"]/div[6]/div/div/div/div/div/div/div/div/div/div[3]/div/a/figure/img";
    @FindBy(how = How.XPATH,using =UsVsNextIconXP)
    public static WebElement UsVsNextIcon;
    public static final String UsVsPreviousIconXP="//*[@id=\"main\"]/div[6]/div/div/div/div/div/div/div/div/div/div[1]/div/a/figure/img";
    @FindBy(how = How.XPATH,using =UsVsPreviousIconXP)
    public static WebElement UsVsPreviousIcon;
    public static final String OtherPlansLearnMoreXP="//*[@id=\"main\"]/div[6]/div/div/div[2]/div/div[2]/div/div/div/div/div/div/div/div[4]/a/span";
    @FindBy(how = How.XPATH,using =OtherPlansLearnMoreXP)
    public static WebElement OtherPlansLearnMore;


}
