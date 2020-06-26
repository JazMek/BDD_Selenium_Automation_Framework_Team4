package home;

import common.WebAPI;
import dataBase.UnitedList;
import org.openqa.selenium.support.PageFactory;
import utility.DataReader;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import static dataBase.ConnectToSqlDB.*;
import static home.WebElements.*;

public class HomePage extends WebAPI{

    public  static HomePage homePage;
    public  static WebAPI webAPI;
    public static DataReader dataReader;
    public static WebElements webElements;
    public static void init(){
        WebAPI webAPI= PageFactory.initElements(driver, WebAPI.class);
        homePage= PageFactory.initElements(driver, HomePage.class);
        webElements = PageFactory.initElements(driver,WebElements.class);
        dataReader=PageFactory.initElements(driver, DataReader.class); }

    public void am_at_United_home_page() {}


        public void click_on_the_BookLink () {
            BookLink.click();
        }

        public void click_on_the_checkBoxOneWay () {
            checkBoxOneWay.click();

        }

        public void click_on_the_FromTextField () {
            FromTextField.click();

        }

        public void click_on_the_FromTextField_ClearButton () {
            FromTextField_ClearButton.click();
        }

        public void enter_the_value_on_FromTextField (UnitedList user1 ) {
            FromTextField.sendKeys(user1.getFrom1());
        }

        public void enter_the_value_on_ToTextField (UnitedList user1 ) {
            ToTextField.sendKeys(user1.getTo1());
        }

        public void click_on_DepartDateLink () {
            DepartDateLink.click();
        }

        public void click_on_Month_ClickBtn1 (UnitedList user1 ) {
            for (int i = 0; i < user1.getMonth1(); i++) {
                Month_ClickBtn1.click();

            }
        }

        public void click_on_DepartDate () {
            DepartDate.click();
        }

        public void click_on_TravelersPassengers () {
            TravelersPassengers.click();
        }

        public void click_on_Adults (UnitedList user1 ) {
            for (int i = 0; i < user1.getAdults1(); i++) {
                Adults.click();
            }
        }

        public void click_on_Seniors (UnitedList user1 ) {
            for (int i = 0; i < user1.getSeniors1(); i++) {
                Seniors.click();
            }
        }

        public void click_on_Children (UnitedList user1 ) {
            for (int i = 0; i < user1.getChildren11(); i++) {
                Children_15_17.click();
            }

        }

        public void click_on_exitButton () {
            exitButton.click();
        }

        public void click_on_Find_flightsButton () {
            Find_flightsButton.click();
        }

        public void navigatebacward () {
            navigatebacward();
        }

    public void Book_a_RoundtripDB1() throws IOException, SQLException, ClassNotFoundException, InterruptedException {
        List<UnitedList> list = getUnitedListFromSqlTableArry();
        loadProperties();
        for (UnitedList user1 : list) {
            click_on_the_BookLink ();
            click_on_the_checkBoxOneWay ();
            click_on_the_FromTextField ();
            click_on_the_FromTextField_ClearButton ();
            enter_the_value_on_FromTextField (user1 );
            enter_the_value_on_ToTextField (user1);
            click_on_DepartDateLink ();
            click_on_Month_ClickBtn1 (user1);
            click_on_DepartDate ();
            click_on_TravelersPassengers ();
            click_on_Adults (user1);
            click_on_Seniors (user1);
            click_on_Children (user1);
            click_on_exitButton ();
            click_on_Find_flightsButton ();
            navigatebacward ();
           }
        }

//
//    public void Book_a_RoundtripDB1() throws IOException, SQLException, ClassNotFoundException, InterruptedException {
//        List<UnitedList> list = getUnitedListFromSqlTableArry();
//        loadProperties();
//        for(UnitedList user1 :list){
//            BookLink.click();
//            checkBoxOneWay.click();
//            FromTextField.click();
//            FromTextField_ClearButton.click();
//            FromTextField.sendKeys(user1.getFrom1());
//            ToTextField.sendKeys(user1.getTo1());
//            DepartDateLink.click();
//            for (int i=0;i<user1.getMonth1() ;i++){Month_ClickBtn1.click();waitForSeconds(1);}
//            DepartDate.click();
//            waitForSeconds(1);
//            TravelersPassengers.click();
//            for (int i=0;i<user1.getAdults1() ;i++){Adults.click();}
//            waitForSeconds(1);
//            for (int i=0;i<user1.getSeniors1() ;i++){Seniors.click();}
//            waitForSeconds(1);
//            for (int i=0;i<user1.getChildren11() ;i++){Children_15_17.click();}
//            waitForSeconds(1);
//            for (int i=0;i<user1.getChildren21() ;i++){Children_12_14.click();}
//            waitForSeconds(1);
//            exitButton.click();
//            Find_flightsButton.click();
//            navigatebacward();
//            waitForSeconds(1);
//        }
//    }


    }
