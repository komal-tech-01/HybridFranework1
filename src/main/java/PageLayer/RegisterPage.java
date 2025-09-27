package PageLayer;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import BaseLayer.BaseClass;

public class RegisterPage extends BaseClass{

	      public void registerPageFunctionality(String fname, String lname, String date, String month, String year, String username, String password) 
	      {
	    	  
	    	 driver.findElement(By.name("firstname")).sendKeys(fname);
	    	  
	    	 driver.findElement(By.name("lastname")).sendKeys(lname);
	    	  
	    	 WebElement w1 = driver.findElement(By.name("birthday_day"));
	    	 Select s1 = new Select(w1);
	    	 s1.selectByVisibleText(date);
	    	 
	    	 
	    	 WebElement w2= driver.findElement(By.name("birthday_month"));
	    	 Select s2 = new Select(w2);
	    	 s2.selectByVisibleText(month);
	    	 
	    	 
	    	 WebElement w3 = driver.findElement(By.name("birthday_year"));
	    	  Select s3 = new Select(w3);
	    	  s3.selectByVisibleText(year);
	    	  
	    	
	    	  
	    	 driver.findElement(By.name("reg_email__")).sendKeys(username);
	    	  
	    	 driver.findElement(By.name("reg_passwd__")).sendKeys(password);
	    	  
	      }
	
	
	
}
