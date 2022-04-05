package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		plugin = { "pretty","html:target/cucumber-reports" }, 
	 	monochrome = true,
		features = "src/test/resources/features/",
		glue = "stepdef", 
		dryRun = false, 
		tags = "@Yusan1"
		)

	
		 
		

public class cukesRunner {

}

//monochrome = true,