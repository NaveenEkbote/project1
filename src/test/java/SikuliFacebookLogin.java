import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

public class SikuliFacebookLogin {

	public static void main(String[] args) throws InterruptedException, FindFailed {
		// TODO Auto-generated method stub
		Screen s=new Screen();
      //	s.wait(1000);
		Pattern userId = new Pattern("C:\\Ashok\\UserId.PNG");
		Pattern passWord = new Pattern("C:\\Ashok\\Password.PNG");
		Pattern login = new Pattern("C:\\Ashok\\Login.PNG");
		System.setProperty("webdriver.chrome.driver", "C:\\Ashok\\chromedriver.exe");
		WebDriver driver;
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
       // s.wait(userId,10);
		s.type(userId, "ashok_teaching@yahoo.com");
		s.type(passWord, "ashok");
		s.click(login);

	}

}
