package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class HRMResetPassword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Ashok\\chromedriver.exe");
		String expectedResult="Forgot your password?";
		WebDriver driver;
		driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/dashboard");
		driver.findElement(By.linkText("Forgot your password?")).click();
		driver.findElement(By.id("btnCancel")).click();
		String actualResult=driver.findElement(By.linkText("Forgot your password?")).getText();
		Assert.assertEquals(actualResult, expectedResult);
		

	}

}
