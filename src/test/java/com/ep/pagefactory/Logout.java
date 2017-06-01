package com.ep.pagefactory;

import org.openqa.selenium.WebDriver;
import com.ep.pageobjects.LogoutObject;

public class Logout extends LogoutObject {

	public Logout(WebDriver driver) {
		super(driver);
	}
	
	public void accountlogout() throws Exception {
		
			waitForSeconds(6);
			Nameofparent.click();
			waitForSeconds(2);
			Logout.click();
			LOG.info("Log Out Successfully");
		
	 }	

}
