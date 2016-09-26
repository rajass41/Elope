package com.ep.pagefactory;

import junit.framework.Assert;

import org.openqa.selenium.WebDriver;

import com.ep.datainitialization.DataInt;
import com.ep.pageobjects.RegistrationObjects;


public class ParentRegistration extends CommonBase{

	public ParentRegistration(WebDriver driver) {
		super(driver);
	}

	public void accountregister(DataInt dataInt) throws Exception {
		try {
			Thread.sleep(6000);
			RegistrationObjects.btnregister(driver).click();
			Thread.sleep(4000);
			RegistrationObjects.Firstname(driver).sendKeys(dataInt.getFirstName());
			RegistrationObjects.Lastname(driver).sendKeys(dataInt.getLastName());
			RegistrationObjects.address(driver).sendKeys(dataInt.getAddress1());
			RegistrationObjects.phone(driver).sendKeys(dataInt.getPhonenumber());
			RegistrationObjects.email(driver).sendKeys(dataInt.getEmailAddress());
			RegistrationObjects.Password(driver).sendKeys(dataInt.getPassword());
			RegistrationObjects.Confirmpassword(driver).sendKeys(dataInt.getPassword());
			RegistrationObjects.City(driver).sendKeys(dataInt.getCity());
			RegistrationObjects.Zipcode(driver).sendKeys(dataInt.getZipCode());
			//RegistrationObjects.register(driver).click();
		} catch (Exception e) {
			excep = e.toString();
			Assert.fail(excep);

		}
	}		
}
