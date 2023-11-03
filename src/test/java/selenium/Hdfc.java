package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.asserts.SoftAssert;

public class Hdfc {

	public static void main(String[] args)throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://netbanking.hdfcbank.com/netbanking");
		driver.manage().timeouts().implicitlyWait(3000,TimeUnit.MICROSECONDS);
		driver.switchTo().frame("login_page");
		driver.findElement(By.xpath("//a[@class='btn btn-primary login-btn']")).click();
		Alert Hdfcalert=driver.switchTo().alert();
		String actualvalue= Hdfcalert.getText();
		String expectedvalue="Customer ID  cannot be left blank.";
		SoftAssert softAssert=new SoftAssert();
		softAssert.assertEquals(actualvalue, expectedvalue);
		softAssert.assertAll();
	}
}
