package selenium;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandling {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Ashok\\chromedriver.exe");
		  WebDriver driver = new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.get("https://www.irctctourism.com/");
		  String parentWindow=driver.getWindowHandle();
		  System.out.println("Parent window id:" +parentWindow);
		  String title=driver.getTitle();
		  System.out.println("Parent window title is : " +title);
		  Thread.sleep(1000);
		  driver.findElement(By.linkText("Bus Tickets")).click();
		  ArrayList<String> tabs=new ArrayList<>(driver.getWindowHandles());
		  driver.switchTo().window(tabs.get(1));
		  String pTitle=driver.getTitle();
		  System.out.println("Title is : " +pTitle);
		 
	}

}
