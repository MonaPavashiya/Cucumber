package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		        features="C:\\Users\\mS\\Documents\\Mona_Practice_QA\\Cucumber\\FeatureBackground\\Background.feature",
                glue="stepsForBackground",
                monochrome=true,
                plugin = {"pretty","html:target/HtmlReports"}
                   
                )
public class RunnerForBackground {

}
