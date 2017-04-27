package com.ep.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import com.ep.pagefactory.CommonBase;

public class ForgotPasswordPageObjects extends CommonBase{

	protected ForgotPasswordPageObjects(WebDriver driver) {
		super(driver);
	}
	
	
	@FindBy(how = How.XPATH, using = "/html/body/div/section/div/div/form/div/div/a[1]")
	public static WebElement Forgotpswd;
	
	@FindBy(how = How.ID, using = "Email")
	public static WebElement Emailforgetpassword;
	
	@FindBy(how = How.ID, using = "btnsubmit")
	public static WebElement Submitforforget;
}
