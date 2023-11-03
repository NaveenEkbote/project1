package stepdefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.asserts.SoftAssert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class Hrmlogin {
	WebDriver driver;
	@Given("user navigate to application")
	public  void User_navigate_to_application() throws InterruptedException {
	driver = new ChromeDriver();
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	Thread.sleep(1000);
	}
	@When("user enters valid credentials")
	public void User_enters_valid_credentials() {
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("admin123");
	}
	@When("user clicks on login button")
	public void User_clicks_on_login_button() {
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	}
	@Then("checking your in homepage")
	public void Checking_your_in_homepage() throws Throwable{
		Thread.sleep(2000);
		String actualresult= driver.findElement(By.xpath("//*[@id='app']/div[1]/div[1]/header/div[1]/div[1]/span/h6")).getText();
		String expectedresult="Dashboard";
		SoftAssert Kind=new SoftAssert();
		Kind.assertEquals(actualresult, expectedresult);
		Kind.assertAll();
	}
}
 