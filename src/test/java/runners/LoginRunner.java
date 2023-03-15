package runners;


import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		// the path below means it will collect the path of features no matter the path should be 
		features="classpath:features",
		glue="steps",
		tags="@Smoke",
		monochrome=true,
		dryRun=false,
		plugin= {
			"pretty",
			"html:target/reports/cucumber.html",
			"json:target/reports/cucumber.json"
		}
		
		
		)
public class LoginRunner {

}
