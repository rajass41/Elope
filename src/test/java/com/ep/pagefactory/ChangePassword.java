package com.ep.pagefactory;

import junit.framework.Assert;
import org.openqa.selenium.WebDriver;
import com.ep.datainitialization.DataInt;
import com.ep.pageobjects.ChangePasswordPageObjects;


public class ChangePassword extends ChangePasswordPageObjects{

	public ChangePassword(WebDriver driver) {
		super(driver);
		
	}

	
	public void changepswd(DataInt dataInt) throws Exception {
		try {
			waitForSeconds(6);
			Nameofparent1.click();
			waitForSeconds(1);
			Changepass.click();
			waitForSeconds(4);
			Assert.assertTrue(driver.getTitle().contains("Change Password"));
			LOG.info("Entering Current,New,Confirm Passwords");
			CurrentPassword.sendKeys(dataInt.getCurrentPassword());
			NewPassword.sendKeys(dataInt.getNewPassword());
			ConfirmPassword.sendKeys(dataInt.getNewPassword());
			waitForSeconds(2);
			Changepassword.click();
			LOG.info("Password changed successfully");
		
		} catch (Exception e) {
			excep = e.toString();
			Assert.fail(excep);

		}
	}	
	
}
