package stepdefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class Facebook {
	WebDriver driver;
	@Given("enter facebook url in chromebrowser")
	public void Enter_facebook_url_in_chromebrowser() throws InterruptedException{
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
	}
	@Then("click on create new account")
	public void click_on_create_new_account() {
		driver.findElement(By.linkText("Create new account")).click();
	}
	@Then("Enter the required details in the field")
	public void Enter_the_required_details_in_the_field() throws InterruptedException{
		Thread.sleep(1000);
		driver.findElement(By.name("firstname")).sendKeys("Naveen");
		driver.findElement(By.name("lastname")).sendKeys("Ekbote");
		driver.findElement(By.name("reg_email__")).sendKeys("ekbote.naveen156@gmail.com");
		driver.findElement(By.id("password_step_input")).sendKeys("Naveen@10023");
		Thread.sleep(1000);
		driver.findElement(By.id("day")).sendKeys("03");
		driver.findElement(By.id("month")).sendKeys("February");
		driver.findElement(By.id("year")).sendKeys("2003");
		driver.findElement(By.name("reg_email_confirmation__")).sendKeys("ekbote.naveen156@gmail.com");
		driver.findElement(By.xpath("(//input[@name='sex'])[2]")).click();
		driver.findElement(By.name("websubmit")).click();
	}
	
}
