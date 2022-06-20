package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(
		
		plugin ={"pretty", "json:target/JSON_Reports/Cucumber.json",
				"junit:target/Cucumber_Reports/Cucumber.xml",
		"html:target/HTML_Reports/index.html"},
	 	monochrome = true,
		features = "src/test/resources/features/loginFuncion.feature",
		glue = {"StedpDef1"}, 
		dryRun = true, 
		tags ="@Smoke"
		)





public class LoginRunner {

}
