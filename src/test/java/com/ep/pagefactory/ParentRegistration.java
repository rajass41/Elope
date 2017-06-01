package com.ep.pagefactory;

import junit.framework.Assert;
import org.openqa.selenium.WebDriver;
import com.ep.datainitialization.DataInt;
import com.ep.pageobjects.SignupPageObjects;



public class ParentRegistration extends SignupPageObjects{
	
	public ParentRegistration(WebDriver driver) {
		super(driver);
	}

	public void accountregisteristration(DataInt dataInt) throws Exception {
		
			Assert.assertTrue(driver.getTitle().contains("Parent :: Login"));
			waitForSeconds(5);
			Parentregister.click();
			LOG.info("Parent Registration Starts");
			waitForSeconds(4);
			Assert.assertTrue(driver.getTitle().contains("Parent Registration"));
			Firstname.sendKeys(dataInt.getFirstName());
			Lastname.sendKeys(dataInt.getLastName());
			Address1.sendKeys(dataInt.getAddress1());
			Address2.sendKeys(dataInt.getAddress2());
			Phonenumber.sendKeys(dataInt.getPhonenumber());
			Signupemail.sendKeys(gettingEmailrandomly());
		    Password.sendKeys(dataInt.getPassword());
			Confirmpassword.sendKeys(dataInt.getPassword());
			City.sendKeys(dataInt.getCity());
			Zipcode.sendKeys(dataInt.getZipcode());
			waitForSeconds(1);
			Pictures.click();
			waitForSeconds(3);
			Register.click();
			LOG.info("Successfully Parent Registered");
			
		
	}

}
