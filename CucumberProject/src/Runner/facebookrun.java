package Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features= {"C:\\Users\\HP\\eclipse-workspace\\CucumberProject\\src\\Features\\facebook.feature"},
		glue="StepDefination",
		plugin= {"pretty", "html:target/Cucumber-Reports/report.html"}
		)
public class facebookrun {

}
