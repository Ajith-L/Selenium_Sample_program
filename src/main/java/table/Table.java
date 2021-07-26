package table;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import commonfunction.CommonFunction;

public class Table  extends CommonFunction{
    @Test
	public void table() {
		 driver.findElement(By.linkText("Table")).click();
		 
		 //get the count of the column of the number
		 WebElement CountColumn= driver.findElement(By.xpath("//*[@id=\"table_id\"]"));
		 int status=  CountColumn.findElements(By.tagName("tr")).size();
	    System.out.println("No of column in table is " +status);
	    
	    //get count the no of coloum in the table
	    WebElement RowCount=driver.findElement(By.xpath("//*[@id=\"table_id\"]/tbody/tr[1]"));
	    int status2= RowCount.findElements(By.tagName("th")).size();
	    System.out.println("No of the row is "+status2);
	    
	    //getting progess value in the table
	    WebElement value=driver.findElement(By.xpath("//*[@id=\"table_id\"]/tbody/tr[3]/td[2]"));
	    String print= value.getText();
	    System.out.println(print);
	    
	    
	    //check lest element
	    java.util.List<WebElement>  lestelement=    driver.findElements(By.xpath("//td[2]"));
	    java.util.List<Integer> numberlist= new ArrayList<Integer>();
	    
	    for (WebElement webElement : lestelement) {
	    	String IndValElm=webElement.getText().replace("%", "");
	    	numberlist.add(Integer.parseInt(IndValElm));
	    	
		}
	   System.out.println(numberlist);
	   int smallvalue =Collections.min(numberlist);
	   System.out.println("lest value="+smallvalue);
	      
	  String SmallValueStr=Integer.toString(smallvalue)+"%";
	  
	  String finallStr="//td[normalize.space()="+"\""+SmallValueStr +"\"]"+"//following::td[1]";
	  System.out.println(finallStr);
	   
	   WebElement cheek =driver.findElement(By.xpath(finallStr));
	   cheek.click();
	}
}
