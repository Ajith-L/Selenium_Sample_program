package calander;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import commonfunction.CommonFunction;

public class Calander  extends CommonFunction{
	//
	@Test
	public void cal() {
		driver.findElement(By.linkText("Calendar")).click();
		
		WebElement CalClick= driver.findElement(By.xpath("//*[@id=\"datepicker\"]"));
		CalClick.sendKeys("07/21/2021");
	}

}
