package TestLayer;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import BaseLayer.BaseClass;
import PageLayer.LoginPage;
import PageLayer.RegisterPage;
import PageLayer.SignInPage;

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
	   
	   @Test
	   public void validateSignInFuctionality()
	   {
		   SignInPage sign = new SignInPage();
		   sign.signInFuctionality();   
		   
		   
	   }
	   
	   @Test
	   public void validateLoginInPageFuctionality()
	   {
		   LoginPage login = new LoginPage();
		   login.loginInPageFuctionality();  
		   
		   
	   }
	   
	   @AfterTest
	   public void closePage() throws Exception
	   {   
		   Thread.sleep(4000);
		   driver.quit();
	   }
	
	
}
