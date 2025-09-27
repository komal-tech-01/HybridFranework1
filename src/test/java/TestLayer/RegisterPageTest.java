package TestLayer;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import BaseLayer.BaseClass;
import PageLayer.RegisterPage;

public class RegisterPageTest extends BaseClass {

	
	   @BeforeTest
	   public void setUp()
	   {
		   BaseClass.initialization();  
	   }
	   
	   @Test
	   public void registerPageFunctionalityTest() 
	   {
		     RegisterPage obj = new RegisterPage();
		     obj.registerPageFunctionality("Komal","Dhole","11","May","2001","komal@gmail.com","komal@123");
		   
	   }
	   
	   @AfterTest
	   public void closePage() throws Exception
	   {   
		   Thread.sleep(4000);
		   driver.quit();
	   }
	
	
}
