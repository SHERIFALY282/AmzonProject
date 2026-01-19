
package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class AddedToCartPage {

    private WebDriver driver;
    private WebDriverWait wait;

    private By subTotal = By.cssSelector("#sc-subtotal-amount-activecart span");
    private By price = By.cssSelector(".sc-product-price");
    private By cartIcon = By.xpath("//a[@id='nav-cart']");

    public AddedToCartPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public String getExpectedSubTotal() {
        WebElement subtotalElement = wait.until(
                ExpectedConditions.visibilityOfElementLocated(subTotal)
        );
        System.out.println(subtotalElement);
        return subtotalElement.getText();

    }

    public String getExpectedPrice() {
        WebElement priceElement = wait.until(
                ExpectedConditions.visibilityOfElementLocated(price)
        );
        return priceElement.getText();
    }

    public CartPage goToCartPage() {
        wait.until(ExpectedConditions.elementToBeClickable(cartIcon)).click();
        return new CartPage(driver);
    }
}
