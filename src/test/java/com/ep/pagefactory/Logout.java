package com.ep.pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;


public class Logout extends CommonBase {

	public Logout(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(how = How.CSS, using = "span.username")
	public static WebElement Nameofparent;
	
	@FindBy(how = How.XPATH, using = "//ul[@class='dropdown-menu']/li[5]/a")
	public static WebElement Logout;
	
	public void accountlogout() throws Exception {
		
			implicitWait();
			Nameofparent.click();
			Logout.click();
			LOG.info("Logged Out Successfully");
		
	 }	

}
