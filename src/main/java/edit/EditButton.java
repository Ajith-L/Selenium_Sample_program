package edit;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EditButton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     System.setProperty("webdriver.chrome.driver", "C:\\chrome drive\\driver_90\\90.exe");
     WebDriver driver = new ChromeDriver();
     driver.get("http://www.leafground.com/");
     
      driver.findElement(By.linkText("Edit")).click();
      
      //1.Enter the email address in editbox
      
      WebElement Enter = driver.findElement(By.id("email"));
      Enter.sendKeys("ahu");
      
      // 2.Append the text
      
      WebElement Append = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[2]/div/div/input"));
      Append.sendKeys("text");
      
      //3.get default text enter
      
      WebElement dt= driver.findElement(By.xpath("//*[@name='username']"));
      String txt= dt.getAttribute("value"); 
      System.out.println(txt);
      
      //4.clear the text
      
      WebElement clr= driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[4]/div/div/input"));
      clr.clear();
      
      //Disable or not
      
      WebElement dis= driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[5]/div/div/input"));
      boolean bd= dis.isDisplayed();
      System.out.println(bd);
	}
}
