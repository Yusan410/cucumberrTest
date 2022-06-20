package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.junit.CucumberOptions;



@RunWith(Cucumber.class)
@CucumberOptions(
		
		plugin ={"pretty", "json:target/JSON_Reports/Cucumber.json",
				"junit:target/Cucumber_Reports/Cucumber.xml",
		"html:target/HTML_Reports/index.html"},
	 	monochrome = true,
		features = "src/test/resources/features/dentalHomepage.feature",
		glue = {"stepdef"}, 
		dryRun = false, 
		tags = "@SmokeTest"
		)

	
		 
		

public class cukesRunner extends AbstractTestNGCucumberTests  {

}

//monochrome = true,





//{ "pretty","html:target/cucumber-reports" }, 