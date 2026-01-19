package Base;


import Pages.HomePage;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.ITestResult;
import org.testng.annotations.*;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.time.Duration;

public class BaseTest {
    private WebDriver driver;
    protected HomePage homePage;


    @BeforeClass
    public void setup(){
        ChromeOptions options= new ChromeOptions();
        //options.addArguments("--headless");
       // options.addArguments("--start-maximized");
        driver= new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.navigate().to("https://www.amazon.eg/");
        homePage = new HomePage(driver);
    }

    @AfterMethod
    public void recordFailure(ITestResult result){
        if (ITestResult.FAILURE==result.getStatus()){
        var camera = (TakesScreenshot) driver;
        File screenshot = camera.getScreenshotAs(OutputType.FILE);

            String timeStamp = java.time.LocalDateTime.now()
                    .toString()
                    .replace(":", "-");

            String filePath = "D:/bgrb/TestProject/src/main/resources/screenshots/"
                    + result.getName() + "_" + timeStamp + ".png";
        try {
            Files.move(screenshot.toPath(), new File(filePath).toPath());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println("ScreenShot taken at Path" + screenshot.getAbsolutePath());
    }
}

    @AfterClass
    public void tearDown(){
        driver.quit();
    }

}
