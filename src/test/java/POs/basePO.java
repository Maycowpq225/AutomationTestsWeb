package POs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.WebDriverConfig;

public class basePO {

    public void waitVisible(WebElement element, boolean click) {
        if (click) {
            WebDriverConfig.shared().wait.until(ExpectedConditions.visibilityOf(element)).click();
        } else {
            WebDriverConfig.shared().wait.until(ExpectedConditions.visibilityOf(element));
        }
    }
}
