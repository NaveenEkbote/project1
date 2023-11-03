package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.ArrayList;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class NewTabExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Ashok\\chromedriver.exe");
		  WebDriver driver = new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.get("http://openclinic.sourceforge.net/openclinic/home/index.php");
		  String selectLinkOpeninNewTab = Keys.chord(Keys.CONTROL,Keys.ENTER); 
		  driver.findElement(By.linkText("Medical Records")).sendKeys(selectLinkOpeninNewTab);
		  ArrayList<String> tabs=new ArrayList<>(driver.getWindowHandles());
		  driver.switchTo().window(tabs.get(1));
	}

}
