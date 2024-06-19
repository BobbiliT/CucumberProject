package Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features= {"C:\\Users\\HP\\eclipse-workspace\\CucumberProject\\src\\Features\\car.feature"},
		glue={"StepDefination"},
		tags="@All",
		plugin= {"pretty","html:target/Cucumber-Reports/carbooking-report.html"}
		)

public class Carrunning {

}
