package testRunners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/features",
        glue = {"stepDefinitions"},
        //tags = "@activity3",
        //tags = "@SimpleAlert and @SmokeTest",
        tags =  "@ConfirmAlert",
        //tags =  "@PromptAlert",
        plugin = {"html:target/cucumber-reports/report.html"}

)


public class Activity3Runner {

}
