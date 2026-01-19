
package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class CartPage {

    private WebDriver driver;
    private WebDriverWait wait;

    private By price = By.cssSelector(".sc-product-price");
    private By qtyLabel = By.id("sc-subtotal-label-activecart");
    private By subTotal = By.cssSelector("#sc-subtotal-amount-activecart span");

    public CartPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }



    public String getPrice() {
        WebElement priceElement = wait.until(
                ExpectedConditions.visibilityOfElementLocated(price)
        );
        return priceElement.getText();
    }

    public String getQty() {
        WebElement qtyElement = wait.until(
                ExpectedConditions.visibilityOfElementLocated(qtyLabel)
        );
        return qtyElement.getText();
    }

    public String getSubTotal() {
        WebElement subTotalElement = wait.until(
                ExpectedConditions.visibilityOfElementLocated(subTotal)
        );
        return subTotalElement.getText();
    }
}

