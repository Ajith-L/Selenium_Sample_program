package window;

import java.util.Set;

import org.apache.log4j.lf5.viewer.categoryexplorer.TreeModelAdapter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import commonfunction.CommonFunction;

public class Window extends CommonFunction{
    @Test
	public void window() {
     	driver.findElement(By.linkText("Window")).click();
		//1.click window page and action new page
		 String OldWindow=	driver.getWindowHandle();
		 
		WebElement click = driver.findElement(By.xpath("//*[@id='home']"));
		click.click();
		
	    Set<String> NewWindow=	driver.getWindowHandles();
	    
	    for (String string : NewWindow) {
			driver.switchTo().window(string);
		}
		
	    WebElement edit = driver.findElement(By.linkText("Edit"));
	    	edit.click();
	    	
	    	driver.close();
	    	
	    	driver.switchTo().window(OldWindow);
	    	
		//2.Find the number of opened windows

		WebElement NoOpenWindow = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[2]/div/div/button"));
		NoOpenWindow.click();
		
		int getSize= driver.getWindowHandles().size();
		System.out.println("No of opened Windows is:"+getSize);
		
		driver.switchTo().window(OldWindow);
		//3.Close all except this window
		
		WebElement CloseWindow= driver.findElement(By.xpath("//*[@id=\"color\"]"));
		CloseWindow.click();
		
	    Set<String> NCClose= driver.getWindowHandles();
			for (String new1 : NCClose) {
				if(!new1.equals(OldWindow)){
				driver.switchTo().window(new1);
				driver.close();
				
			    }
		     }
		
	}
}
