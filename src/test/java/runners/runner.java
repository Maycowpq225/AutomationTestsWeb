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
        tags = "@primeTest",
        snippets = CucumberOptions.SnippetType.CAMELCASE, dryRun = false)
public class runner {

    @BeforeClass
    public static void config() {
        WebDriverConfig.shared().setUpBrowser().defaultConfig();
    }

    @AfterClass
    public static void afterMethod(){
        WebDriverConfig.shared().closeDriver();
    }
}
