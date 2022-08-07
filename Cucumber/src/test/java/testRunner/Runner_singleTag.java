package testRunner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		        features=".//FeatureWithTag/Tags.feature",
                glue="stepDefinations",
                monochrome=true,
                tags= {"@MustRun"}
                
                )
public class Runner_singleTag {

}


//{"pretty","json:target/JSONReports/report.json"}
//{"pretty","junit:target/JUnitReports/report.xml"}
//{"pretty","html:target/HtmlReports/report.html"}


////FeatureWithTag
//tags = {"@Smoke", "@Regression"} this is for AND... this is deprecated will not work
//tags = {"@Smoke or @Regression"}this is for AND... this will run all 3
//tags = {"@Smoke, @Rgression"} this is for OR...
//tags = {"@Smoke and @Regression"} this will run  sample 3 only. it has both tags.
//tags = {"@Smoke and not @Regression"} this will run onlt sample 1..it has only smoke
//tags = {"@MustRun"} this will run all 3 because this tag is above the feature 