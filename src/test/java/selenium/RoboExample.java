package selenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class RoboExample {

	public static void main(String[] args) throws AWTException, InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Ashok\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");	
        driver.findElement(By.name("email")).clear();
        driver.findElement(By.name("email")).sendKeys("ashok_teaching@yahoo.com");
        driver.findElement(By.name("pass")).clear();
        driver.findElement(By.name("pass")).sendKeys("Password");
        Robot robot = new Robot();  // Robot class throws AWT Exception	
       // Thread.sleep(2000); // Thread.sleep throws InterruptedException	
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
       // Keys keys=new Keys();// Keys class from Selenium to perform actions on keyboard
      //  keys.ENTER();
    // press enter key of keyboard to perform above selected action

	}

}
