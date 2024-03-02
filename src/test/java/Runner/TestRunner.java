package Runner;

import io.cucumber.plugin.event.Node;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/main/resources/Features",
        glue = {"StepDef"},
        tags = "@smoke",
        plugin = { "pretty",
                "html:target/cucumber-reports/nopCommerceReport.html",
                "json:target/cucumber-reports/Cucumber.json",
                "junit:target/cucumber-reports/Cucumber.xml"
        }
)

public class TestRunner extends AbstractTestNGCucumberTests {

}
