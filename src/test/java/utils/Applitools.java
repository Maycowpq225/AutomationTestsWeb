package utils;

import com.applitools.eyes.EyesRunner;
import com.applitools.eyes.MatchLevel;
import com.applitools.eyes.RectangleSize;
import com.applitools.eyes.selenium.ClassicRunner;
import com.applitools.eyes.selenium.Eyes;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class Applitools {

    private Eyes eyes;
    private static EyesRunner runner;

    public void Eyesconfig() {
        runner = new ClassicRunner();
        eyes = new Eyes(runner);
        eyes.setApiKey("l0ztT102WadslxwUx47E051MpC106mBXn9awiFolovXQQKc110");
        eyes.setMatchLevel(MatchLevel.LAYOUT2);
    }

    public void getTheLayout(WebDriver driver) {
        driver = eyes.open(driver,
                "galp.com",
                "Validate screen Galp Governo societario",
                new RectangleSize(1000,600));
        driver.get("https://www.galp.com/corp/pt/governo-societario");
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("$('#flash').removeClass('success').addClass('error');");
        eyes.checkWindow("Amazon Governo-societario");
        eyes.close();
    }
}
