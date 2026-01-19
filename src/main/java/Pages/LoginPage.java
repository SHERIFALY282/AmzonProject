package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    private WebDriver driver;
    private By EmailField =By.xpath("//*[@id='ap_email_login']");
    private By ContinueBtn = By.xpath("//*[@id=\"continue\"]/span/input");
    public LoginPage(WebDriver driver){
        this.driver=driver;
    }
    public void setEmail(String Email){
        driver.findElement(EmailField).sendKeys(Email);
    }
    public InvalidMsgPage clickLoginButton(){
        driver.findElement(ContinueBtn).click();
        return new InvalidMsgPage(driver);
    }
}
