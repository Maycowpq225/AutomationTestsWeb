package utils;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class WebDriverConfig {

    private static WebDriverConfig sharedInstance;
    public WebDriver driver;
    public WebDriverWait wait;

    public static synchronized WebDriverConfig shared() {
        if (sharedInstance == null) {
            sharedInstance = new WebDriverConfig();
        }

        return sharedInstance;
    }

    public WebDriverConfig setUpBrowser() {
        System.setProperty("webdriver.chrome.driver", "C:/projetos/AutomationTestsWeb/src/test/resources/webdrivers/chromedriver.exe");

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        this.driver = new ChromeDriver(options);

        return this;
    }

    public void defaultConfig() {
        PageFactory.initElements(this.driver, this);
        this.wait = new WebDriverWait(this.driver, Duration.ofSeconds(15));
        this.driver.manage().window().fullscreen();
        this.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
    }

    public void closeDriver() {
        this.driver.close();
    }
}
