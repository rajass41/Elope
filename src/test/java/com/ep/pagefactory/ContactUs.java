package com.ep.pagefactory;

import junit.framework.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import com.ep.datainitialization.DataInt;
import com.ep.pageobjects.ContactUsObjects;


public class ContactUs extends CommonBase{

	public ContactUs(WebDriver driver) {
		super(driver);
	}

	
	public void contactformfilling(DataInt dataInt) throws Exception {
		try {
			Thread.sleep(4000);
			ContactUsObjects.contact(driver).click();
			Thread.sleep(3000);
			ContactUsObjects.Firstname(driver).sendKeys(dataInt.getFname());
			ContactUsObjects.Lastname(driver).sendKeys(dataInt.getLname());
			ContactUsObjects.emailid(driver).sendKeys(dataInt.getMailid());
			ContactUsObjects.ph(driver).sendKeys(dataInt.getPh());
			ContactUsObjects.Company(driver).sendKeys(dataInt.getCompany());
			ContactUsObjects.City(driver).sendKeys(dataInt.getCity());
			new Select(ContactUsObjects.State(driver)).selectByVisibleText("TN");
			Thread.sleep(1000);
			ContactUsObjects.Zip(driver).sendKeys(dataInt.getZipCode());
			Thread.sleep(1000);
			ContactUsObjects.comments(driver).sendKeys(dataInt.getComments());
			Thread.sleep(2000);
			ContactUsObjects.submit(driver).click();
			Thread.sleep(4000);
			super.checkAlert();
			
		
		} catch (Exception e) {
			excep = e.toString();
			Assert.fail(excep);

		}
	}	
	
	
	
}
