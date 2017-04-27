package com.ep.pagefactory;

import junit.framework.Assert;
import org.openqa.selenium.WebDriver;
import com.ep.datainitialization.DataInt;
import com.ep.pageobjects.LoginPageObjects;



public class Login extends LoginPageObjects{
	
	public Login(WebDriver driver) {
		super(driver);
	}

	public void accountlogin(DataInt dataInt) throws Exception {
		try {
			Assert.assertTrue(driver.getTitle().contains("Parent :: Login"));
			waitForSeconds(5);
			LOG.info("Getting Values of email and password");
			Emailid.sendKeys(dataInt.getEmail());
			waitForSeconds(2);
			Password.sendKeys(dataInt.getPassword());
			waitForSeconds(3);
			Loginbutton.click();
			LOG.info("Parent Successfully Log In in to their account");
			
		 
		     

			}catch (Exception e) {
			excep = e.toString();
			Assert.fail(excep);
			}
	  }	
	
	
}
