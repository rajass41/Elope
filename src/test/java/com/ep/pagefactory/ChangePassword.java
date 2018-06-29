package com.ep.pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.ep.datainitialization.DataInt;


public class ChangePassword extends CommonBase{

	public ChangePassword(WebDriver driver) {
		super(driver); 	
	}

	@FindBy(how = How.XPATH, using = "//div[@class='top-nav']/a[3]")
	public static WebElement btnlogIn;
	
	@FindBy(how = How.CSS, using = "span.username")
	public static WebElement Nameofparent;
	
	@FindBy(how = How.LINK_TEXT, using = "Change Password")
	public static WebElement Changepass;
	
	@FindBy(how = How.ID, using = "Password")
	public static WebElement CurrentPassword;
	
	@FindBy(how = How.ID, using = "NewPassword")
	public static WebElement NewPassword;
	
	@FindBy(how = How.ID, using = "ConfirmPassword")
	public static WebElement ConfirmPassword;
	                                  
	@FindBy(how = How.XPATH, using = "//input[@class='btn-submit fleft']")
	public static WebElement Changepassword;
	
	public Login login;
	
	public void changepswd(DataInt dataInt) throws Exception {
		try {
			Nameofparent.click();
			Changepass.click();
			Assert.assertTrue(driver.getTitle().contains("Change Password"));
			//LOG.info("Entering Current,New,Confirm Passwords");
			CurrentPassword.sendKeys(dataInt.getCurrentPassword());
			NewPassword.sendKeys(dataInt.getNewPassword());
			ConfirmPassword.sendKeys(dataInt.getNewPassword());
			//Changepassword.click();
			//LOG.info("Password changed successfully");
		} catch (Exception e) {
		e.printStackTrace();
		}

			
		
		
	   }	
	
	
	public void checkLogintochnagepswd(DataInt dataInt) throws Exception {

				login=PageFactory.initElements(driver, Login.class);
				login.checkLogin(dataInt);
				if(dataInt.getNewPassword() != "")
				{
					changepswd(dataInt);
				}
		} 
	
	
}
