package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.asserts.SoftAssert;
public class HrmSearchEmployee {
	WebDriver driver= new ChromeDriver();;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Ashok\\chromedriver.exe");
		HrmSearchEmployee search= new HrmSearchEmployee();
		search.HRMLogin();
		search.searchEmployee("Ashok Reddy");
		}
	void HRMLogin() throws InterruptedException
	{
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(1000);
		driver.findElement(By.name("username")).clear();
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).clear();
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	}
	void searchEmployee(String empName) throws InterruptedException
	{
		Thread.sleep(1000);
		SoftAssert softAssert = new SoftAssert();
		Thread.sleep(1000);
		//driver.findElement(By.linkText("PIM")).click();
		driver.findElement(By.xpath("//input[@placeholder='Type for hints...']")).sendKeys(empName);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		String actualResult=driver.findElement(By.cssSelector(".oxd-table-card:nth-child(1).oxd-table-cell:nth-child(3)>div")).getText();
		String expectedResult="Ashok Reddy";
		//Assert.assertEquals(expectedResult, actualResult);
		softAssert.assertEquals(expectedResult, actualResult);
		driver.findElement(By.id("empsearch_supervisor_name")).sendKeys("David Kennedy John");
		driver.findElement(By.id("searchBtn")).click();
		driver.findElement(By.xpath("//table/tbody/tr[5]/td[3]")).click();
		//driver.close();

	}
	void searchEmployee(String empName,String supervisorName)
	{
		//code
	}
	void searchEmployee(String employmentStatus, String incluce,String jobTitle,String subUnit)
	{
		//code
	}
}
