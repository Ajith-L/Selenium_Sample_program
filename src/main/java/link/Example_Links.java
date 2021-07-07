package link;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import commonfunction.CommonFunction;

public class Example_Links extends CommonFunction {
	@Test 
	public void link() {
		driver.findElement(By.linkText("HyperLink")).click();
		
		//1.simple link page
		WebElement link= driver.findElement(By.linkText("Go to Home Page"));
		link.click();
				
		driver.navigate().back();
	}
	
	

}
