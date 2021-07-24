package cheekbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import commonfunction.CommonFunction;

public class CheekBox extends CommonFunction {
	@Test
	public void cheekbox() {
		driver.findElement(By.linkText("Checkbox")).click();// opening check box page
		
		//1.select a languages
		WebElement sel= driver.findElement(By.xpath("//*[@id='contentblock']/section/div[1]/div[1]/input"));
		sel.click();
		
		//2.checked weather  box is selected are not!
		WebElement sel2= driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[2]/div/input"));
	    boolean status=	sel2.isSelected(); 
	    System.out.println("The box is selcted are not  "+status);
	    
	    //3.deselected the elements
	    WebElement desel= driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[3]/div[2]/input"));
	    desel.click();
	    
	    //selected all checkbox
	    WebElement  SelAll1 = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[4]/div[1]/input"));
	    SelAll1.click();
	    WebElement  SelAll2 = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[4]/div[2]/input"));
	    SelAll2.click();
	    WebElement  SelAll3 = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[4]/div[3]/input"));
	    SelAll3.click();
	    WebElement  SelAll4 = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[4]/div[4]/input"));
	    SelAll4.click();
	    WebElement  SelAll5 = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[4]/div[5]/input"));
	    SelAll5.click();
	}

}
