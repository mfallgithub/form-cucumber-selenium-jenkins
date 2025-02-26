package stepdefs;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/main/resources"},
        glue = {"stepdefs"},
        plugin = {
                "pretty", "html:target/site/cucumber-pretty",
                "json:target/cucumber-reports/CucumberTestReport.json"},
        monochrome = true

)
public class RunMyFirstFeatureTest {
}
