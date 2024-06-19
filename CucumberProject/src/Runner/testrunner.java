package Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features= "C:\\Users\\HP\\eclipse-workspace\\CucumberProject\\src\\Features\\login.feature",// the path of the features file where we exactly is it.
		glue= {"StepDefination"},  //the pate of the stepdefiniation where we excatly save it.
		//monochrome=true,  // display the console output in a proper readable formate 
		//dryRun=true, // it will check the all the faeature files are not implement or not into the setpdefination
	    plugin={"pretty","html:target/Cucumber-Reports/loginreport.html"}// which type of report we will generate
		)

// HTML report -> html:target/Cucumber-Reports/report.html
// JSON report -> json:target/Cucumber-Reports/report2.json
// XML report -> json:target/Cucumber-Reports/cucmber.xml
public class testrunner {

}
