package utils;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class WebDriverConfig {

    private static WebDriverConfig sharedInstance;
    public WebDriver driver;
    public WebDriverWait wait;

    public static synchronized WebDriverConfig shared() {
        if(sharedInstance == null){
            sharedInstance = new WebDriverConfig();
        }

        return sharedInstance;
    }

    public WebDriverConfig setUpBrowser() {
        System.setProperty("webdriver.chrome.driver", "../AutomationTestsWeb/src/test/resources/webdrivers/chromedriver.exe");

            ChromeOptions options = new ChromeOptions();
            options.addArguments("--remote-allow-origins=*");
            driver = new ChromeDriver(options);

        return this;
    }

    public void defaultConfig() {
        wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        driver.manage().window().fullscreen();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
    }

    public void closeDriver() {
        driver.close();
    }
}
