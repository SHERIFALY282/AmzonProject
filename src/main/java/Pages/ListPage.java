package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ListPage {
    private WebDriver driver;
    private By YourLists= By.xpath("//*[@id=\"wishlist-page\"]/div[1]/div[1]/div/span[2]");
    public ListPage(WebDriver driver){
        this.driver=driver;
    }

    public String getText(){
        return driver.findElement(YourLists).getText();

    }

}
