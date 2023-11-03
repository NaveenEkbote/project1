package stepdefination;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.asserts.SoftAssert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class PasswordRR {
    WebDriver Driver;
    @Given ("enduser navigate to application")
    public void Enduser_navigate_to_application()throws InterruptedException{
    Driver =new ChromeDriver();
    Driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
    Thread.sleep(1000);
    }
    @When("user entres invalid credentials")
    public void User_entres_invalid_credentials()throws InterruptedException{
    	Driver.findElement(By.name("username")).sendKeys("Admin");
		Driver.findElement(By.xpath("//input[@type='password']")).sendKeys("admin12");
		Driver.findElement(By.xpath("//button[@type='submit']")).click();
    }
	@Then("checking error msg entering wrong password") 
	  public void Checking_error_msg_entering_wrong_password()throws InterruptedException{
	Thread.sleep(2000);
	String actual=Driver.findElement(By.xpath("//*[@id='app']/div[1]/div/div/div/div/div/div/div[1]")).getText();
	String expected="Invalid credentials";
	SoftAssert Assert=new SoftAssert();
	Assert.assertEquals(actual, expected);
	Assert.assertAll();
	}
}
