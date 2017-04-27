package com.ep.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import com.ep.pagefactory.CommonBase;

public class MyProfilePageObjects extends CommonBase{
	
	
	protected MyProfilePageObjects(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(how = How.XPATH, using = "/html/body/div/header/div[2]/div/div[1]/ul/li/a/span")
	public static WebElement Nameofparent;
	
	@FindBy(how = How.XPATH, using = "/html/body/div/header/div[2]/div/div[1]/ul/li/ul/li[1]/a")
	public static WebElement MyProfile;
	                                   
	@FindBy(how = How.XPATH, using = "/html/body/div/section[1]/div/div/form/div/div/div/div[2]/div/div[2]/div/a")
	public static WebElement Editprofile;
	                                  
	@FindBy(how = How.XPATH, using = "/html/body/div/section[1]/div/div/form/div/div/div/div[2]/div/div/div[10]/div[1]/input")
	public static WebElement Profilesubmit;
}
