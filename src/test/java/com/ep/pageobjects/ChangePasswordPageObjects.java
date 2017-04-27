package com.ep.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.ep.pagefactory.CommonBase;

public class ChangePasswordPageObjects extends CommonBase {
	
	
	protected ChangePasswordPageObjects(WebDriver driver) {
		super(driver);
	}

	@FindBy(how = How.CSS, using = "span.username")
	public static WebElement Nameofparent1;
	
	@FindBy(how = How.LINK_TEXT, using = "Change Password")
	public static WebElement Changepass;
	
	@FindBy(how = How.ID, using = "Password")
	public static WebElement CurrentPassword;
	
	@FindBy(how = How.ID, using = "NewPassword")
	public static WebElement NewPassword;
	
	@FindBy(how = How.ID, using = "ConfirmPassword")
	public static WebElement ConfirmPassword;
	                                  
	@FindBy(how = How.XPATH, using = "/html/body/div/section[1]/div/div/form/div/div/div/div[2]/div/div/div/div/input[4]")
	public static WebElement Changepassword;
	
}
