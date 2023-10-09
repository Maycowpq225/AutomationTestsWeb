package POs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import utils.Applitools;
import utils.WebDriverConfig;

public class GalpGovernoSocietarioPO extends basePO{

    private WebElement btnAceitarCookies = WebDriverConfig.shared().driver.findElement(By.xpath("//button[text()='Aceitar']"));

    private Applitools applitools;

    public void validateLogoAmazonMusic () {
        applitools = new Applitools();
        applitools.Eyesconfig();
        applitools.getTheLayout(WebDriverConfig.shared().driver);
    }

    public void aceitarCookies(){
        System.out.println(btnAceitarCookies);
        waitVisible(btnAceitarCookies, true);
    }

}
