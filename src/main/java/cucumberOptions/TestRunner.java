package cucumberOptions;

import org.junit.runner.RunWith;
import com.github.mkolisnyk.cucumber.runner.ExtendedCucumberOptions;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;



@RunWith(Cucumber.class)

//@ExtendedCucumberOptions(
//        jsonReport = "target/cucumber-reports/CucumberTestReport.json",
//        retryCount = 3,
//        detailedReport = true,
//        detailedAggregatedReport = true,
//        overviewReport = true,
//        coverageReport = true,
//        jsonUsageReport = "target/cucumber-reports/cucumber-usage.json",
//        usageReport = false,
//        toPDF = true,
//        outputFolder = "target/cucumber-reports/extended-report")

@CucumberOptions(features = "src/test/java/feature", 
				glue = "stepDef", 
				dryRun = false, 
				tags = { "@SmokeTest" })
//				plugin = { "html:target/cucumber-reports/cucumber-html-report",
//						"json:target/cucumber-reports/CucumberTestReport.json", "pretty:target/cucumber-reports/cucumber-pretty",
//        "usage:target/cucumber-reports/cucumber-usage.json", "junit:target/cucumber-reports/cucumber-results.xml", "rerun:target/cucumber-reports/rerun.txt" } )

public class TestRunner {

	
	
}
