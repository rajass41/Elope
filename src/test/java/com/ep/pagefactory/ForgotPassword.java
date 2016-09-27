package com.ep.pagefactory;

import junit.framework.Assert;

import org.openqa.selenium.WebDriver;

import com.ep.datainitialization.DataInt;
import com.ep.pageobjects.ForgotPasswordObjects;

public class ForgotPassword  extends CommonBase{

	public ForgotPassword(WebDriver driver) {
		super(driver);
	}
	
	
	public void forgottenpassword(DataInt dataInt) throws Exception {
		try {
			Thread.sleep(6000);
			ForgotPasswordObjects.forgotpswd(driver).click();
			Thread.sleep(4000);
			ForgotPasswordObjects.email(driver).sendKeys(dataInt.getMailid());
			Thread.sleep(1000);
			ForgotPasswordObjects.submit(driver).click();
			
			
		} catch (Exception e) {
			excep = e.toString();
			Assert.fail(excep);

		}
    }
}