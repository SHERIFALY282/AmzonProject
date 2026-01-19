package Scenario3;

import Base.BaseTest;
import org.testng.annotations.Test;

import static org.testng.Assert.*;


public class AccountList extends BaseTest {

    @Test
    public void VerifyPages(){
        var Test1= homePage.clickOnYourOrders();

        assertTrue(Test1.YourOrdergetText().contains("Sign in"),"This message is incorrect");

        var Test2=homePage.clickOnYourAddresses();
        assertTrue(Test2.YourAddressesText().contains("Sign in"),"This message is incorrect");

        var Test3=homePage.clickOnYourList();
        assertTrue(Test3.getText().contains("for all your shopping need"),"This message is incorrect");



    }

}
