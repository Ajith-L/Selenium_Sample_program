package button;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Button {
    @Test
	public void btn() {
    	 System.setProperty("webdriver.chrome.driver", "C:\\chrome drive\\driver_90\\90.exe");
         WebDriver driver = new ChromeDriver();
         driver.navigate().to("http://www.leafground.com/");
         
         driver.findElement(By.linkText("Button")).click();
         
         // 1.click button
         
         WebElement btn=driver.findElement(By.xpath("//button[@id='home']"));
         btn.click();
           
         driver.navigate().back();
         
         //2. find x and y posiion
         
         WebElement xypostion= driver.findElement(By.xpath("//*[@id='position']"));
         Dimension xy=  xypostion.getSize();
         int height=xy.height;
         System.out.println("Height="+height);
         int wdith=xy.width;
         System.out.println("Width="+wdith);
         
         //3.find colur of the button
         
         WebElement cbtn=driver.findElement(By.xpath("//*[@id=\"color\"]"));
         String  txt=  cbtn.getCssValue("background-color");
         System.out.println("colour of the button:"+txt);
	}
}
