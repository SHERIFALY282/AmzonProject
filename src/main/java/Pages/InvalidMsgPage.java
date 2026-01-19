package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class InvalidMsgPage {
    private WebDriver driver;
    private By ErrorMsg = By.xpath("//*[@id=\"intent-confirmation-container\"]/h1");
    public InvalidMsgPage(WebDriver driver){
        this.driver=driver;
    }
    public String getText(){
        return driver.findElement(ErrorMsg).getText();

    }
}
