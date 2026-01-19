package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class HomePage {
    private WebDriver driver;
    private String HOME_URL = "https://www.amazon.eg/";
    private By SignIn = By.xpath("//*[@id=\"nav-link-accountList-nav-line-1\"]");
    private By TodaysDeals = By.xpath("//*[@id=\"nav-xshop\"]/ul/li[2]/div/a");
    private By AccountList = By.cssSelector(".nav-line-1-container");
    private By YourOrderBtn = By.xpath("//*[@id=\"nav_prefetch_yourorders\"]/span");
    private By YourAddressesBtn = By.xpath("//*[@id=\"nav_prefetch_youraddresses\"]/span");
    private By YourListBtn = By.xpath("//*[@id=\"nav-al-your-account\"]/ul/li[4]/a/span");


    public HomePage(WebDriver driver){
        this.driver=driver;
    }
    public LoginPage SignIn(){
        driver.findElement(SignIn).click();
        return new LoginPage(driver);
        }
    public TodaysDeal clickTodaysDeal(){
        driver.findElement(TodaysDeals).click();
        return new TodaysDeal(driver);
    }
    public void goToHomePage() {
        if (!driver.getCurrentUrl().equals(HOME_URL)) {
            driver.get(HOME_URL);
        }
    }

    public void hoverOnAccountLists() {

        WebElement accountLists = driver.findElement(AccountList);

        Actions actions = new Actions(driver);
        actions.moveToElement(accountLists).perform();
        
    }

    public SignInPage clickOnYourOrders(){
        hoverOnAccountLists();
        driver.findElement(YourOrderBtn).click();
        return new SignInPage (driver);
    }

    public SignInPage clickOnYourAddresses(){
        goToHomePage();
        hoverOnAccountLists();
        driver.findElement(YourAddressesBtn).click();
        return new SignInPage(driver);
    }

    public ListPage clickOnYourList(){
        goToHomePage();
        hoverOnAccountLists();
        driver.findElement(YourListBtn).click();
        return new ListPage(driver);

    }


}
