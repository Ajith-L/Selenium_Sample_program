package image;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import commonfunction.CommonFunction;

public class Image extends CommonFunction {
	@Test
	public void img() {
		driver.findElement(By.linkText("Image")).click();
		
		//1.click image
		 WebElement ClickImage= driver.findElement(By.xpath("//*[@id='contentblock']/section/div[1]/div/div/img"));
		 ClickImage.click();
		
		 driver.findElement(By.linkText("Image")).click();
		
		//2.broken image
		WebElement broken = driver.findElement(By.xpath("//*[@id='contentblock']/section/div[2]/div/div/img"));
		if(broken.getAttribute("naturalWidth").equals("0")) {
			System.out.println("The image is broken");
		}
		else {
		System.out.println(" The image is not broken");
		}
		
		//3.//click using keyboard/mouse
		
		WebElement UsingMouse= driver.findElement(By.xpath("//*[@id='contentblock']/section/div[3]/div/div/img"));
		Actions actions = new Actions(driver);
		actions.click(UsingMouse).build().perform();
	}

}
