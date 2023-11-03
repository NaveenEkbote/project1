package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.asserts.SoftAssert;

public class TableExample {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Ashok\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.aitsteam.com/Diploma/ViewReport/");
		driver.findElement(By.id("RegNumber")).sendKeys("AITS/A/1236/19");
		Thread.sleep(500);
		driver.findElement(By.id("StudName")).sendKeys("NAINIKA RAJ");
		Thread.sleep(500);
		driver.findElement(By.name("submit")).click();
		String expectedResult="NAINIKA RAJ";
		String actualResult=driver.findElement(By.xpath("//table/tbody/tr[3]/td[2]	")).getText();
		System.out.println("Actual Result" +actualResult);
		System.out.println("Expected Result " +expectedResult);
		SoftAssert sa = new SoftAssert();
		sa.assertEquals(actualResult, expectedResult);
		System.out.println("After assertion");
		driver.close();
		

	}

}
