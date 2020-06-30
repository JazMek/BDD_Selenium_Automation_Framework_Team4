package runner;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src\\main\\java\\features\\HomePage.feature"},
        glue = "step_Definitions",
        plugin ={"pretty","json:target/cucumber-reports/cucumber.json","html:target/cucumber-reports"},
        strict=true,
        monochrome=true,
        dryRun=false,
        tags=""
// tags = " (@SmokeTest or @Regression) and not @pending"
// tags = "(@SmokeTest or @Regression) and (not @pending)"
// tags = {"@SmokeTest or @Regression and not @pending"}
)
public class TestRunner {

}

