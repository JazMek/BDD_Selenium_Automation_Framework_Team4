package home;

import common.WebAPI;
import org.junit.Assert;
import org.junit.Before;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import utility.DataReader;

import java.io.IOException;
import java.util.List;

import static home.AmazonWebElements.*;

public class HomePage extends WebAPI {
    public static void SetSignIn(){
        signin.click();
    }
    public static void setUserNameField(){
        userNameField.sendKeys("team4WDNY2020@gmail.com");
    }
    public static void setContinueButton(){
        continueButton.click();
    }
    public static void setPassWordField(){
        passWordField.sendKeys("Team42020");
    }
    public static void setLoginButton(){
        loginButton.click();
    }
public void getNewReleasePage() {
    // step 1- click on the new releases linck
        clickNewReleasePage.click();
    }
    // method to verify the New releases page
    public void checkReleasePageText() {
        String actuelResult = checkReleasesPageTextX.getText();
        Assert.assertEquals("the test field",actuelResult,expectedResult);
    }
    public void getNewReleasesInBabyPage() {

        clickBabylinck.click();
}
    public void checkNewReleasesInBabyPageText() {

//        String actuelResult = checkNewReleasesInBabyPage.getText();
//        Assert.assertEquals(actuelResult,Expected,"the test doesn't match");
        String actuelResult = checkNewReleasesInBabyPage.getText();
        Assert.assertEquals("the test field",actuelResult,Expected);
}



    public void enter_item_name_in_search_box() {
        SearchBox.sendKeys("iphone");

    }

    public void click_on_search_button() {

        clickSearchButton.click();

    }

    public void should_get_the_appropriate_result_page() {

        String actuelResult = getText.getText();
        Assert.assertEquals("the test field","\"iphone\"",actuelResult);
    }

        public void enterDataToSearchBox() throws InterruptedException {
            List<String> list = DataReader.readExcelFile( "C:\\Users\\ssbra\\Desktop\\Excel_files_Project\\Amazon_items_list_search.xlsx") ;
            System.out.println("the size of array is "+list.size());
for (int i=1; i<list.size();i++) {
    sleepFor(2);
    SearchBox.sendKeys(list.get(i));
    clickSearchButton.click();
    String actuelResult = getText.getText().replaceAll("\"", "");
    String expected = list.get(i);
    Assert.assertEquals("the test field",expected,actuelResult);
    sleepFor(5);
    navigateBack();

    }




}
   }











