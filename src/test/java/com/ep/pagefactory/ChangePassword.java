package com.ep.pagefactory;

import junit.framework.Assert;

import org.openqa.selenium.WebDriver;
import com.ep.datainitialization.DataInt;
import com.ep.pageobjects.ChangePasswordObjects;

public class ChangePassword extends CommonBase{

	public ChangePassword(WebDriver driver) {
		super(driver);
		
	}

	
	public void changepswd(DataInt dataInt) throws Exception {
		try {
			Thread.sleep(9000);
			ChangePasswordObjects.nameofparent(driver).click();
			Thread.sleep(1000);
			ChangePasswordObjects.changepass(driver).click();
			Thread.sleep(4000);
			ChangePasswordObjects.CurrentPassword(driver).sendKeys(dataInt.getCurrentPassword());
			ChangePasswordObjects.NewPassword(driver).sendKeys(dataInt.getNewPassword());
			ChangePasswordObjects.ConfirmPassword(driver).sendKeys(dataInt.getNewPassword());
			Thread.sleep(2000);
			//ChangePasswordObjects.changepass(driver).click();
			
			
			
		} catch (Exception e) {
			excep = e.toString();
			Assert.fail(excep);

		}
	}	
	
}
