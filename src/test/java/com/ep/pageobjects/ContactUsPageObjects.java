package com.ep.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.ep.pagefactory.CommonBase;

public class ContactUsPageObjects extends CommonBase {

	protected ContactUsPageObjects(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(how = How.XPATH, using = "/html/body/div/header/div[2]/div/div[1]/a[2]")
	public static WebElement Contact;
	
	@FindBy(how = How.ID, using = "Firstname")
	public static WebElement ContactFirstName;
	
	@FindBy(how = How.ID, using = "Lastname")
	public static WebElement ContactLastName;
	
	@FindBy(how = How.ID, using = "Email")
	public static WebElement Contactemail;
	
	@FindBy(how = How.ID, using = "Phone")
	public static WebElement Contactphone;
	
	@FindBy(how = How.ID, using = "Company")
	public static WebElement Schoolname;
	
	@FindBy(how = How.ID, using = "City")
	public static WebElement Chlidname;
	
	@FindBy(how = How.ID, using = "Message")
	public static WebElement Comments;
	
	@FindBy(how = How.ID, using = "submit")
	public static WebElement submitbtn;
	
}
