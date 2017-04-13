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
		try {
			waitForSeconds(6);
			Forgotpswd.click();
			waitForSeconds(4);
			Emailforgetpassword.sendKeys(dataInt.getEmail());
			Submitforforget.click();
			
		} catch (Exception e) {
			excep = e.toString();
			Assert.fail(excep);

		}
    }
}