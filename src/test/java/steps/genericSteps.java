package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utils.WebDriverConfig;

public class genericSteps {

    @Given("that i am on the website {string}")
    public void test(String website) {
        WebDriverConfig.shared().driver.get(website);
    }

}
