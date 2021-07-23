package radio_Button;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import commonfunction.CommonFunction;

public class RadioButton extends CommonFunction {
   @Test      
   
   
	public void radio() {
		
	 driver.findElement(By.linkText("Radio Button")).click();
	 
	 //1.selecting radio btn
	 WebElement radiobtn = driver.findElement(By.xpath("//*[@id='yes']"));
	 radiobtn.click();
	 
	 //2.finding default selected radio button
	 WebElement defaultSelBtn1=driver.findElement(By.xpath("//*[@id='contentblock']/section/div[2]/div/div/label[2]/input"));
	 WebElement defaultSelBtn2=driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[2]/div/div/label[3]/input"));
	 boolean print1= defaultSelBtn1.isSelected();
	 boolean print2=defaultSelBtn2.isSelected();
	 System.out.println("Is this Unchekeed button is clicked "+print1);
	 System.out.println("Is this Cheked button is clicked "+print2);
	 
	 //3.selcted
	 WebElement selbtn=driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[3]/div/div/input[1]"));
	 selbtn.click();
	}
}
