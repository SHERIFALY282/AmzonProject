package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TodaysDeal {
    private WebDriver driver;
    private By SecondCategory = By.xpath("//*[@id=\"DealsGridScrollAnchor\"]/div[2]/div[1]/div/span[2]/div/label/span/span");
    private By FirstProduct = By.xpath("//*[@id=\"DealsGridScrollAnchor\"]/div[3]/div/div/div[2]/div/div/div/div[1]/div[2]/a/div[1]/span/div");

    public TodaysDeal(WebDriver driver) {
        this.driver = driver;
    }
    public ProductPage ClickToProduct(){
        driver.findElement(SecondCategory).click();
        driver.findElement(FirstProduct).click();
        return new ProductPage(driver);
    }
}

