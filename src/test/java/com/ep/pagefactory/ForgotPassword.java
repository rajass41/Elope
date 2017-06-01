package com.ep.pagefactory;

import junit.framework.Assert;
import org.openqa.selenium.WebDriver;
import com.ep.datainitialization.DataInt;
import com.ep.pageobjects.ForgotPasswordPageObjects;

public class ForgotPassword  extends ForgotPasswordPageObjects{

	public ForgotPassword(WebDriver driver) {
		super(driver);
	}
	
	
	public void forgottenpassword(DataInt dataInt) throws Exception {
		
			waitForSeconds(7);
			Forgotpswd.click();
			waitForSeconds(4);
			Assert.assertTrue(driver.getTitle().contains("Forgot Password"));
			Emailforgetpassword.sendKeys("mani6747@gmail.com");
			LOG.info("Entering registerd email address");
			Submitforforget.click();
			LOG.info("Forgot password link has been sent successfully to registered email address");
			
		
       }
}