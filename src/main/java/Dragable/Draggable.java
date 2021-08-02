package Dragable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.Mouse;
import org.openqa.selenium.interactions.internal.MouseAction;
import org.testng.annotations.Test;

import commonfunction.CommonFunction;

public class Draggable  extends CommonFunction{
	@Test
	public void drag() {
		// TODO Auto-generated method stub
     driver.findElement(By.linkText("Draggable")).click();
     
     
     WebElement  MoDrag= driver.findElement(By.xpath("//*[@id='draggable']"));
     
     WebElement to =driver.findElement(By.xpath("//*[@id=\"mydiv\"]"));
      Actions action = new Actions(driver);
      action.clickAndHold(MoDrag).moveToElement(to).build().perform();
	}
}
