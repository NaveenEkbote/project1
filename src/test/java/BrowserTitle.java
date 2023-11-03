import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserTitle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Ashok\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		String title=driver.getTitle();
		System.out.println("Title of the browser is " +title);
		driver.findElement(By.name("q")).sendKeys("download chromedriver for selenium");;
		driver.findElement(By.name("btnK")).click();
		driver.close();
		//driver.quit();
	}

}
