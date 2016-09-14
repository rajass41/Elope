package com.ep.pagefactory;

import junit.framework.Assert;
import org.openqa.selenium.WebDriver;
import com.ep.datainitialization.DataInt;
import com.ep.pageobjects.LoginObjects;

public class Login extends CommonBase{
	
	public Login(WebDriver driver) {
		super(driver);
	}
	

	
	
	public void accountlogin(DataInt dataInt) throws Exception {
		try {
			Thread.sleep(6000);
			LoginObjects.emailid(driver).sendKeys(dataInt.getUsername());
			Thread.sleep(2000);
			LoginObjects.password(driver).sendKeys(dataInt.getUserpassword());
			Thread.sleep(2000);
			LoginObjects.loginbutton(driver).click();
			
		} catch (Exception e) {
			excep = e.toString();
			Assert.fail(excep);

		}
	}	
	
	
}
