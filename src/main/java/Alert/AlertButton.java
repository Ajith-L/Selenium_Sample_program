package Alert;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import commonfunction.CommonFunction;

public class AlertButton extends CommonFunction {
	
	@Test
	public void alert() {
		driver.findElement(By.linkText("Alert")).click();
		
		//1.click alert button
		
		WebElement AlertButton = driver.findElement(By.xpath("//*[@id='contentblock']/section/div[1]/div/div/button"));
		AlertButton.click();
	    driver.switchTo().alert().accept();
	    
	    //2.Click the button to display a confirm box.
	    
	    WebElement ConfirmBox = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[2]/div/div/button"));
	    ConfirmBox.click();
	    driver.switchTo().alert().accept();
	    
	    //3.Click the button to display a prompt box.
	    
	    WebElement promtBox = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[3]/div/div/button"));
	    promtBox.click();
	    driver.switchTo().alert().sendKeys("Tst");
	    driver.switchTo().alert().accept();
	    
	    //4.Click the button to learn line-breaks in an alert.
	    WebElement LineBreak = driver.findElement(By.xpath("//*[@id='contentblock']/section/div[4]/div/div/button"));
	    LineBreak.click();
	    driver.switchTo().alert().accept();
	    
	    //5.Click the below button and click OK.
	    WebElement BelowBtns = driver.findElement(By.xpath("//*[@id='contentblock']/section/div[5]/div/div/button"));
	    BelowBtns.click();
	     driver.switchTo().alert().accept();
	}

}
