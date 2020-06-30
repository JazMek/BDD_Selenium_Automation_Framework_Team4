package runner;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"C:\\Users\\lamar\\IdeaProjects\\BDD_Selenium_Automation_Framework_Team4\\TD_Bank\\src\\main\\java\\features\\HomePage.feature"},
        glue = {"step_definitions"},
        plugin ={"pretty","json:target/cucumber-reports/cucumber.json","html:target/cucumber-reports"},
        strict=true,
        monochrome=true,
        dryRun=false
        //  tags="@SmokeTest"
//        tags="@Regression"
//        tags="@pending"
// tags = " (@SmokeTest or @Regression) and not @pending"
// tags = "(@SmokeTest or @Regression) and (not @pending)"
// tags = {"@SmokeTest or @Regression and not @pending"}
)
public class TestRunner {


}


