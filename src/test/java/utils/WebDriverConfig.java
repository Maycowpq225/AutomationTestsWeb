package utils;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class WebDriverConfig {

    public WebDriver driver;
    public WebDriverWait wait;

    public WebDriverConfig setUpBrowser(String browser) {
        //System.setProperty("webdriver.gecko.driver", "");
        System.setProperty("webdriver.chrome.driver", "../automation-java-selenium-cucumber/src/test/resources/webdrivers/chromedriver.exe");

        if (browser.equalsIgnoreCase("chrome")) {
            driver = new ChromeDriver();
        } else {
            driver = new FirefoxDriver();
        }
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
