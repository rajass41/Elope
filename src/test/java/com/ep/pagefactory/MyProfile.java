package com.ep.pagefactory;

import junit.framework.Assert;
import org.openqa.selenium.WebDriver;
import com.ep.pageobjects.MyProfilePageObjects;

public class MyProfile extends MyProfilePageObjects {

	public MyProfile(WebDriver driver) {
		super(driver);
	}
	
	
	
	public void updateprofile() throws Exception {
		try {
			waitForSeconds(6);
			Nameofparent.click();
			waitForSeconds(1);
			MyProfile.click();
			waitForSeconds(4);
			Assert.assertTrue(driver.getTitle().contains("My Profile"));
			Editprofile.click();
			LOG.info("Updateing profile details");
			waitForSeconds(4);
			Profilesubmit.click();
			LOG.info("Profile details has been updated successfully");
		} catch (Exception e) {
			excep = e.toString();
			Assert.fail(excep);

		}
	}	

}
