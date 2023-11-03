package selenium;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		  WebDriver driver = new ChromeDriver();
		  driver.get("D:\\Training\\Selenium//WebTable.html");
		 // Thread.sleep(500);
		//  driver.findElement(By.xpath("//table/tbody/tr[1]")).click();
		  String value=driver.findElement(By.xpath("//table/tbody/tr[3]/td[2]")).getText();
		  System.out.println("Value is " +value);
		  driver.close();
		}
		

	}

