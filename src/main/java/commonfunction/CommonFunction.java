package commonfunction;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
 
public class CommonFunction {
	
	public static WebDriver driver=null;
   @BeforeTest
	public void Common() {
		 System.setProperty("webdriver.chrome.driver", "C:\\chrome drive\\driver_90\\90.exe");
         driver = new ChromeDriver();
         driver.navigate().to("http://www.leafground.com/");
         driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
}
