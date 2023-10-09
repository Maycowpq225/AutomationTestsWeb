package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import utils.WebDriverConfig;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/features",
        glue = "steps",
        plugin = { "pretty", "json:target/cucumber-reports/CucumberJson.json"},
        monochrome = true,
        tags = "@prime",
        snippets = CucumberOptions.SnippetType.CAMELCASE, dryRun = false)
public class runner {

    public static WebDriverConfig webDriverConfig = new WebDriverConfig();

    @BeforeClass
    public static void config() {
        webDriverConfig.setUpBrowser("chrome").defaultConfig();
    }

    @AfterClass
    public static void afterMethod(){
        webDriverConfig.closeDriver();
    }
}
