package com.ep.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.ep.pagefactory.CommonBase;

public class SignupPageObjects extends CommonBase{

	protected SignupPageObjects(WebDriver driver) {
		super(driver);
	}

	
	@FindBy(how = How.XPATH, using = "/html/body/div/section/div/div/form/div/div/a[2]")
	public static WebElement Parentregister;

	@FindBy(how = How.ID, using = "FirstName")
	public static WebElement Firstname;

	@FindBy(how = How.ID, using = "LastName")
	public static WebElement Lastname;

	@FindBy(how = How.ID, using = "Address1")
	public static WebElement Address1;
	
	@FindBy(how = How.ID, using = "Address2")
	public static WebElement Address2;
	
	@FindBy(how = How.ID, using = "PhoneNumber")
	public static WebElement Phonenumber;

	@FindBy(how = How.ID, using = "EmailId")
	public static WebElement Signupemail;

	@FindBy(how = How.ID, using = "PassWord")
	public static WebElement Password;

	@FindBy(how = How.ID, using = "ConfirmPassword")
	public static WebElement Confirmpassword;

	@FindBy(how = How.ID, using = "City")
	public static WebElement City;

	@FindBy(how = How.ID, using = "ZipCode")
	public static WebElement Zipcode;

	@FindBy(how = How.ID, using = "IsPictures")
	public static WebElement Pictures;
	
	@FindBy(how = How.ID, using = "btn-submit")
	public static WebElement Register;
	
	@FindBy(how = How.XPATH, using = "/html/body/div/section[1]/div/div/form/div/div/div/div[2]/div/div/div/div/div[13]/div/a")
	public static WebElement Signupcancel;
}
