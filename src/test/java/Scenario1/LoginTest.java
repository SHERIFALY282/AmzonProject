package Scenario1;

import Base.BaseTest;
import org.testng.annotations.*;
import static org.testng.Assert.assertTrue;

public class LoginTest extends BaseTest {
    @Test
    public void InvalidLogin(){
        var loginPage=homePage.SignIn();
        loginPage.setEmail("sherif.aly543@gmail.com");
        var invalidPage=loginPage.clickLoginButton();
        assertTrue(invalidPage.getText().contains("Looks like you're new to Amazon"),"This message is incorrect");

    }

}
