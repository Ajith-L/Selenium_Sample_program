package link;



import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import commonfunction.CommonFunction;

public class Example_Links extends CommonFunction {
	@Test 
	public void link() {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.MINUTES);
		
		driver.findElement(By.linkText("HyperLink")).click();
		
		//1.simple link page
		WebElement link= driver.findElement(By.linkText("Go to Home Page"));
		link.click();
				
		driver.navigate().back();
		
		//2.broken are not 
		WebElement broken= driver.findElement(By.linkText("Verify am I broken?"));
		broken.click();
		
		driver.navigate().back();
		
		//3.where to go?
		WebElement WhereToGo= driver.findElement(By.partialLinkText("where am supposed"));
		String go=  WhereToGo.getAttribute("href");
		System.out.println("This page is going to :"+go);
		
		//4.find how many links in page
		//@SuppressWarnings("unchecked")
		WebElement howmanylink =  (WebElement) driver.findElements(By.tagName("a"));
		Dimension size= howmanylink.getSize();
		System.out.println("Links are:"+size);
		}
	
	

}
