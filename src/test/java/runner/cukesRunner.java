package runner;

import org.junit.runner.RunWith;
import org.testng.annotations.Test;
import io.cucumber.junit.Cucumber;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;



@RunWith(Cucumber.class)
@CucumberOptions(
		
		plugin ={"pretty", "json:target/JSON_Reports/Cucumber.json",
				"junit:target/Cucumber_Reports/Cucumber.xml",
		"html:target/HTML_Reports/index.html"},
	 	monochrome = true,
		features = "src/test/resources/features/",
		glue = {"stepdef"}, 
		dryRun = true, 
		tags = "@Yusan"
		)

	
		 
		

public class cukesRunner extends AbstractTestNGCucumberTests  {

}

//monochrome = true,





//{ "pretty","html:target/cucumber-reports" }, 