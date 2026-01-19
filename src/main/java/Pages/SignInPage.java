package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SignInPage {
    private WebDriver driver;
    private By YourOrderError = By.xpath("//*[@id=\"authportal-main-section\"]/div[2]/div[2]/div[1]/form/div/div/div/h1");
    private By YourAddressesError = By.xpath("//*[@id=\"claim-collection-container\"]/h1");

    public SignInPage(WebDriver driver){
        this.driver=driver;
    }

    public String YourOrdergetText(){
        return driver.findElement(YourOrderError).getText();
    }
    public String YourAddressesText(){
        return driver.findElement(YourAddressesError).getText();
    }

}
