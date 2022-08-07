package testRunner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		        features=".//Features/PageFactory.feature",
                glue="stepDefinations",
                dryRun=false,
                monochrome=true
                //tags = "@Smoke"
                //plugin ={"pretty","html:target/HtmlReports/report.html",
                		//"json:target/JSONReports/report.json",
                		//"junit:target/JUnitReports/report.xml"
                		//}
		        
                )
public class Runner {

}


//{"pretty","json:target/JSONReports/report.json"}
//{"pretty","junit:target/JUnitReports/report.xml"}
//{"pretty","html:target/HtmlReports/report.html"}

//tags = {"@Smoke", "@Rgression"} this is for AND
//tags = {"@Smoke, @Rgression"} this is for OR