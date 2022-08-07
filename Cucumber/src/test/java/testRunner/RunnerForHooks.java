package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		        features="C:\\Users\\mS\\Documents\\Mona_Practice_QA\\Cucumber\\FeatureHooks\\Hoos.feature",
                glue="stepsforHooks",
                monochrome=true
                   
                )
public class RunnerForHooks {

}
