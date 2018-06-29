package com.ep.pagefactory;

import junit.framework.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.ep.datainitialization.DataInt;

public class Login extends CommonBase{
	
	public Login(WebDriver driver) {
		super(driver);
	}
	
	
	
	@FindBy(how = How.XPATH, using = "//div[@class='top-nav']/a[3]")
	public static WebElement btnlogIn;
	
	@FindBy(how = How.ID, using = "EmailId")
	public static WebElement Emailid;
	
	@FindBy(how = How.ID, using = "PassWord")	
	public static WebElement Password;
	
	@FindBy(how = How.XPATH, using = "//input[@type='submit']")			  
	public  static WebElement Loginbutton;

	public void accountlogin(DataInt dataInt) throws Exception {
		
			Assert.assertTrue(driver.getTitle().contains("Parent :: Login"));
			LOG.info("Retriving Values of email and password from Test data file");
			implicitWait();
			Emailid.sendKeys(dataInt.getEmail());
			Password.sendKeys(dataInt.getPassword());
			HighLightElement(Loginbutton);
			Loginbutton.click();
			if (driver.getTitle().contains("Parent Dashboard")) {
				LOG.info("Parent Successfully Logged in to their account");
				
			}
			
		
	  }	
	
	

	public void checkLogin(DataInt dataInt) throws Exception {

		if (driver.getPageSource().contains("Registration / Login")) {
			LOG.info("Need to Login");
			HighLightElement(btnlogIn);
			btnlogIn.click();
			accountlogin(dataInt);
		} 
	}
}
