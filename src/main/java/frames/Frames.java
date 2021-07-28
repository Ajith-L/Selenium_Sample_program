package frames;





import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import commonfunction.CommonFunction;

public class Frames  extends CommonFunction{
    @Test
	public void frames() {
		driver.findElement(By.linkText("Frame")).click();
		
		//1. inside a frame
		driver.switchTo().frame(0);
		WebElement InsideFrame = driver.findElement(By.xpath("//*[@id='Click']"));
		InsideFrame.click();
		
		driver.switchTo().defaultContent();
		//2.Nested frame
		driver.switchTo().frame(1);
		driver.switchTo().frame("frame2");
		WebElement Nestedframe= driver.findElement(By.xpath("//*[@id=\"Click1\"]"));
		Nestedframe.click();
		
		driver.switchTo().defaultContent();
		
		//3.Find total number of frames.
		
		List<WebElement> FindFrames=driver.findElements(By.tagName("iframe"));
		int d= FindFrames.size();
		System.out.println(d);
	}
}
