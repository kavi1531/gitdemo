import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.Assert;
import org.testng.annotations.Test;

import Commonelements.BaseClass;
import PageObjectModel.facebookpageelements;
import PageObjectModel.TestData;

public class FBSignup extends BaseClass {
	@Test
	public void loginrighttest()
	{
		facebookpageelements.finduserelements(driver).sendKeys("6085729230");
		facebookpageelements.findpasswelements(driver).sendKeys("Vishukavi@4127");
		facebookpageelements.loginbutton(driver).click();
		String expected = driver.getCurrentUrl();
		try {
			 Assert.assertEquals(expected, "https://www.facebook.com/");
			 System.out.println("positive testing");
	            
	        }catch(AssertionError e)
	        {
	        	System.out.println("login error");
	        }
		
		
		
		
	    
	        
		
	}
	
	@Test(dataProvider = "loginData", dataProviderClass = TestData.class)
	public void loginwrongtest(String username, String password)
	{
		facebookpageelements.finduserelements(driver).sendKeys(username);
		facebookpageelements.findpasswelements(driver).sendKeys(password);
		facebookpageelements.loginbutton(driver).click();
		String expected = driver.getCurrentUrl();
		 try {
			 Assert.assertEquals(expected, "www.facebook.com");
			 System.out.println("Negative testing");
	            
	        }catch(AssertionError e)
	        {
	        	System.out.println("login error");
	        
		
		
		
	

}
