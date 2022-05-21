package testRunners;
import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

    @RunWith(Cucumber.class)
    @CucumberOptions(
            features = "src/test/java/features",
            glue = {"stepDefinitions"},
            tags = "@activity1",
            plugin = {"html:target/cucumber-reports/report.html"}

    )


    public class Activity1Runner {

}
