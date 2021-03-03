package Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
features="src/test/java/features/login.feature",
glue ="stepDefinations",
plugin = { "pretty", "json:Reports/cucumber-reports/Cucumber.json",
		 "junit:Reports/cucumber-reports/Cucumber.xml",
		 "html:Reports/cucumber-reports/cucumber-html-report"},
		 monochrome = true,dryRun=false
		
		)

public class loginRunner {
	
}
