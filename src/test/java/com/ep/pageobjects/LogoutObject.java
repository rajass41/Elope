package com.ep.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import com.ep.pagefactory.CommonBase;

public class LogoutObject extends CommonBase {
	
	protected LogoutObject(WebDriver driver) {
		super(driver);
		
	}
	@FindBy(how = How.XPATH, using = "/html/body/div/header/div[2]/div/div[1]/ul/li/a/span")
	public static WebElement Nameofparent;
	
	@FindBy(how = How.XPATH, using = "/html/body/div/header/div[2]/div/div[1]/ul/li/ul/li[5]/a")
	public static WebElement Logout;
	
}
