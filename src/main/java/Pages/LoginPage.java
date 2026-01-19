package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    private WebDriver driver;
    private By EmailField = By.name("email");
    private By ContinueBtn = By.cssSelector(".a-button-input");
    public LoginPage(WebDriver driver){
        this.driver=driver;
    }
    public void setEmail(String Email){
        driver.findElement(EmailField).sendKeys(Email);
    }
    public InvalidPage clickLoginButton(){
        driver.findElement(ContinueBtn).click();
        return new InvalidPage(driver);
    }
}
