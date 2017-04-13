package com.ep.pagefactory;

import junit.framework.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import com.ep.datainitialization.DataInt;
import com.ep.pageobjects.ContactUsPageObjects;


public class ContactUs extends ContactUsPageObjects{

	public ContactUs(WebDriver driver) {
		super(driver);
	}

	
	public void contactformfilling(DataInt dataInt) throws Exception {
		try {
			waitForSeconds(4);
			Contact.click();
			waitForSeconds(5);
			ContactFirstName.sendKeys(dataInt.getContactFirstName());
			browsername();
			if (browserName.equalsIgnoreCase("internet explorer")) {
				((JavascriptExecutor) driver).executeScript("window.scrollBy(0,-200)","");
				waitForSeconds(3);}
			ContactLastName.sendKeys(dataInt.getContactLastName());
			Contactemail.sendKeys(dataInt.getContactemail());
			Contactphone.sendKeys(dataInt.getContactphone());
			Schoolname.sendKeys(dataInt.getSchoolname());
			Chlidname.sendKeys(dataInt.getChlidname());
			waitForSeconds(1);
			Comments.sendKeys(dataInt.getComments());
			waitForSeconds(3);
			browsername();
			if (browserName.equalsIgnoreCase("firefox")) {
				((JavascriptExecutor) driver).executeScript("window.scrollBy(0,100)","");
				waitForSeconds(3);}
			submitbtn.click();
			waitForSeconds(5);
			super.checkAlert();
			
		
		} catch (Exception e) {
			excep = e.toString();
			Assert.fail(excep);

		}
	}		
}
