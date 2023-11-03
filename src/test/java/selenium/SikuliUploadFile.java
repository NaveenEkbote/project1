package selenium;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

public class SikuliUploadFile {

	public static void main(String args[]) throws FindFailed, InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Ashok\\chromedriver.exe");
		WebDriver driver;
		driver=new ChromeDriver();
		driver.get("https://www.naukri.com/registration/createAccount?othersrcp=22636");
		driver.manage().window().maximize();
        Thread.sleep(500);
        driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/div/div[1]/form/div[2]/div[5]/div[1]/div[1]/button")).click();
       // driver.findElement(By.xpath("//*[@id=\\\"root\\\"]/div/div/div[2]/div/div/div[1]/form/div[2]/div[5]/div[1]/div[1]/button")).sendKeys("C:\\Users\\Admin\\Desktop\\.Student.java");
        //form/div[2]"
        System.out.println("after register");
      	Screen s=new Screen();
      //	s.wait(1000);
		Pattern fileInputTextBox = new Pattern("C:\\Ashok\\FileOpenInput.PNG");
        Pattern fileoutput = new Pattern("C:\\Ashok\\OpbenButton.PNG");
        s.type(fileInputTextBox, "C:\\Ashok\\chromedriver.exe");
        s.click(fileoutput);
		
	}
	

}
