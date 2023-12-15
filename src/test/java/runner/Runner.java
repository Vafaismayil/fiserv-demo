package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin={"html:target/html-report/cucumber-reports.html","json:target/json-reports/json-report"},
        glue = "step_definitions",
        features = "src/test/resources/features",
        dryRun =false,
        tags = "@smoke",
        monochrome = true
)
public class Runner {
}
