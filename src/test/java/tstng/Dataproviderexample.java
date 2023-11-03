package tstng;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.*;

public class Dataproviderexample {

	private WebDriver driver;
	
	@DataProvider(name="MyTest")
	 public Object [][] createdata1(){
		 return new Object[][] {
			    { "India"},
	            { "Brazil"},
	            { "Canada"},
	            { "Sri Lanka"},
	            { "England"},
	            { "UK"},
	            { "United States"},
		 };
	}
	
	@Test(dataProvider="MyTest")
		public void testSearchCountry(String country) throws Exception {
		
		//System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		driver = new ChromeDriver();
	    driver.get("http://www.wikipedia.org/wiki/Main_Page");
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	  //  driver.findElement(By.id("p-search")).clear();
	    //driver.findElement(By.xpath("//span[@class='vector-icon mw-ui-icon-search mw-ui-icon-wikimedia-search']")).click();
	    Thread.sleep(1000);
	    driver.findElement(By.name("search")).sendKeys(country);
	    //driver.findElement(By.xpath("//*[@id=\"searchform\"]/div/div/div[1]/input"));
	    Thread.sleep(1000);
	    //driver.findElement(By.id("searchform")).click();
	    driver.findElement(By.xpath("//*[@id=\"searchform\"]/div/button")).click();
	  //*[@id="searchform"]/div/div/div[1]/span/svg
	    Thread.sleep(2000);
	    String actualResult = driver.findElement(By.xpath("//*[@id=\"firstHeading\"]/span")).getText();
	    System.out.println("Actual result Value is : "+actualResult);
	    Assert.assertTrue(country.equals(actualResult.trim()));
	  }
	 
	@AfterMethod
	  public void tearDown() throws Exception {
	    driver.quit();
	}
}

	
	

