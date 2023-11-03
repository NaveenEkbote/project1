package testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class HRMLogin {

	@Test()
	void hrmLogin() throws InterruptedException
	{
		 // System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		  WebDriver driver = new ChromeDriver();
		  driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		  Thread.sleep(1000);
		  driver.findElement(By.name("username")).sendKeys("Admin");
		  driver.findElement(By.name("password")).sendKeys("admin123");
		  driver.findElement(By.xpath("//button[@type='submit']")).click();
		  String expectedResult="https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index";
	      String actualResult=driver.getCurrentUrl();
	      SoftAssert softAssert = new SoftAssert();
		  softAssert.assertEquals(actualResult, expectedResult);
		  softAssert.assertAll();
	}

}
