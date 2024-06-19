package StepDefination;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class Datadriverntesingonfacebook {

	WebDriver driver;
	@Given("^user navigate to login page$")
	public void user_navigate_to_login_page() {
	    System.setProperty("webdrive.chrome.driver", ".//Drivers//chromedriver.exe");
	    driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	    driver.get("https://facebook.com");
	}
	@When("^check the title of the page$")
	public void check_the_title_of_the_page() {
	    String title=driver.getTitle();
	    System.out.println(title);
	    Assert.assertEquals("Facebook – log in or sign up", title);
	}
	@Then("^user credincails \"(.*)\" and \"(.*)\"$")
	public void user_credincails_and(String username, String password) {
	    driver.findElement(By.id("email")).sendKeys(username);
	    driver.findElement(By.id("pass")).sendKeys(password);
	}
	@Then("^click on the loging button$")
	public void click_on_the_loging_button() {
		driver.findElement(By.name("login")).click();
	}
	@Then("^close the browser$")
	public void close_the_browser() {
	   driver.close();
	}
}
