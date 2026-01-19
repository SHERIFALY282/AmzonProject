package Pages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;


public class ProductPage {

    private WebDriver driver;
    private By lastItem = By.xpath("//*[@id=\"cr-pagination-footer-0\"]/a");
    private By SecondItem = By.xpath("//*[@id=\"anonCarousel2\"]/ol/li[2]/span/div/div/div/a/span/div");
    private By Dropdown= By.xpath("//*[@id=\"a-autoid-0-announce\"]");
    private By quantity2= By.xpath("//*[@id=\"quantity_1\"]");
    private By AddToCartButton =By.xpath("//*[@id=\"add-to-cart-button\"]");
    private WebDriverWait wait;


    public ProductPage(WebDriver driver) {
        this.driver=driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public void ScrollDown(){
        WebElement Table=driver.findElement(lastItem);
        JavascriptExecutor js= (JavascriptExecutor) driver;
        String script ="arguments[0].scrollIntoView()";
        js.executeScript(script,Table);
    }



    public AddedToCartPage  AddedToCartPage(){
        ScrollDown();

        wait.until(ExpectedConditions.elementToBeClickable(SecondItem)).click();

        wait.until(ExpectedConditions.elementToBeClickable(Dropdown)).click();

        WebElement qty = wait.until(ExpectedConditions.visibilityOfElementLocated(quantity2));

        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true); arguments[0].click();",qty);

        wait.until(ExpectedConditions.elementToBeClickable(AddToCartButton)).click();
        return new AddedToCartPage(driver);
    }
}
