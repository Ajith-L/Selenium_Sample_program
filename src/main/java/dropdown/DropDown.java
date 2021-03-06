
package dropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import commonfunction.CommonFunction;

public class DropDown extends CommonFunction {
	
	@Test
	public void Drop() {
		driver.findElement(By.linkText("Drop down")).click();
		
		//1.selecting pgm using by index
		
		WebElement selindex = driver.findElement(By.xpath("//*[@id='dropdown1']"));
		Select select = new Select(selindex);
		select.selectByIndex(1);
		
		//2.selecting by a  sending text
		
		WebElement  Sendtext =driver.findElement(By.xpath("//*[@id='contentblock']/section/div[2]/select"));
		Select select2 = new Select(Sendtext);
		select2.selectByVisibleText("Appium");
		 
		//3.seecting text by value
		
		WebElement Value= driver.findElement(By.xpath("//*[@id='contentblock']/section/div[3]/select"));
		Select select3 = new Select(Value);
		select3.selectByValue("3");
		
		//4.no of the option
		WebElement numopt= driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[4]/select"));
		List<WebElement> ptn= numopt.findElements(By.tagName("option"));
		System.out.println("No.of.Option are:"+ptn.size());
	
		//5.sending txt in option
		WebElement sendingTxt= driver.findElement(By.xpath("//*[@id='contentblock']/section/div[5]/select"));
		sendingTxt.sendKeys("Loadrunner");
    
		//select a pgm
		WebElement sel = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[6]/select"));
		Select select4 = new Select(sel);
		select4.selectByVisibleText("Selenium");
	}

	 
}
