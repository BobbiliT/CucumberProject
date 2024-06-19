package StepDefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class amazonordercheck {

	WebDriver driver;
	@Given("user click on the amazon page")
	public void user_click_on_the_amazon_page() {
		System.setProperty("webdriver.chrome.driver", ".//Drivers//chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
	}
	@Given("user on amazon login page")
	public void user_on_amazon_login_page() {
	   Actions a = new Actions(driver);
	   a.moveToElement(driver.findElement(By.xpath("//span[text()='Hello, sign in']"))).build().perform();
	   driver.findElement(By.xpath("//span[text()='Sign in'][1]")).click();
	}
	@When("^user enter username and password$")
	public void user_enter_username_and_password() {
		driver.findElement(By.name("email")).sendKeys("+917036060404");
		driver.findElement(By.id("continue")).click();
		driver.findElement(By.name("password")).sendKeys("7036060404");
	}
	@Then("user click on the login button")
	public void user_click_on_the_login_button() {
		driver.findElement(By.xpath("//input[@type='submit'][1]")).submit();
	}
	@Then("user navigate to order page")
	public void user_navigate_to_order_page() {
	    Actions aa = new Actions(driver);
	    aa.moveToElement(driver.findElement(By.id("nav-link-accountList"))).build().perform();
	    driver.findElement(By.xpath("//span[text()='Your Orders'][1]")).click();
	}
	@When("user click on the previous order link")
	public void user_click_on_the_previous_order_link() {
	    driver.findElement(By.id("a-autoid-4-announce")).click();
	}
	@Then("user check the previous order details")
	public void user_check_the_previous_order_details() {
	  boolean b=driver.findElement(By.xpath("//a[normalize-space(text())='Finearts Full Body Laptop Skin...']")).isDisplayed();
	  System.out.println("user in previous order page :"+b);
	}
	@When("user click on the buyagain order link")
	public void user_click_on_the_buyagain_order_link() {
		driver.findElement(By.xpath("//a[text()='Buy Again']/..//a[@class='a-link-normal']")).click();
	}
	@Then("user check buyagain order details")
	public void user_check_buyagain_order_details() {
		boolean bb=driver.findElement(By.xpath("//span[text()='175'][1]")).isDisplayed();
		System.out.println("user in buyagain page :"+bb);
	}
	@When("user click on the cancle order link")
	public void user_click_on_the_cancle_order_link() {
		driver.findElement(By.xpath("//a[text()='Cancelled Orders']")).click();
	}
	@Then("user check the cancle order details")
	public void user_check_the_cancle_order_details() {
		boolean bbb=driver.findElement(By.xpath("//a[normalize-space(text())='SADHGURU']")).isDisplayed();
		System.out.println("user in cancle order page :"+bbb);
	}
}
