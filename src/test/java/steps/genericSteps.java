package steps;

import io.cucumber.java.en.Given;
import utils.WebDriverConfig;

public class genericSteps {

    @Given("that i am on the website {string}")
    public void test(String website) {
        WebDriverConfig.shared().driver.get(website);
    }
}
