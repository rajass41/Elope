package com.ep.pagefactory;

import junit.framework.Assert;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.ep.datainitialization.DataInt;



public class ParentRegistration extends CommonBase{
	
	public ParentRegistration(WebDriver driver) {
		super(driver);
	}
	
	
	@FindBy(how = How.XPATH, using = "//div[@class='top-nav']/a[3]")
	public static WebElement btnlogIn;
	
	@FindBy(how = How.LINK_TEXT, using = "Parent Registration")
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
	
	@FindBy(how = How.ID, using = "ConfirmEmailId")
	public static WebElement ConfirmEmailId;
	
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
	
	@FindBy(how = How.XPATH, using = "//div[@class='col-md-6 col-sm-7']/a")
	public static WebElement signupcancel;
	

	public void accountregisteristration(DataInt dataInt) throws Exception {
		
			Assert.assertTrue(driver.getTitle().contains("Parent :: Login"));
			implicitWait();
			Parentregister.click();
			LOG.info("Parent Registration Starts");
			Assert.assertTrue(driver.getTitle().contains("Parent Registration"));
			Firstname.sendKeys(dataInt.getFirstName());
			Lastname.sendKeys(dataInt.getLastName());
			Address1.sendKeys(dataInt.getAddress1());
			Address2.sendKeys(dataInt.getAddress2());
			Phonenumber.sendKeys(dataInt.getPhonenumber());
			Signupemail.sendKeys(gettingEmailrandomly());
			copyTextIntoAnotherTextfield(Signupemail, ConfirmEmailId);
		    Password.sendKeys(dataInt.getPassword());
			Confirmpassword.sendKeys(dataInt.getPassword());
			City.sendKeys(dataInt.getCity());
			Zipcode.sendKeys(dataInt.getZipcode());
			Pictures.click();;
			Register.click();
			//signupcancel.click();
			if (driver.getTitle().contains("Parent Dashboard")) {
				LOG.info("Successfully Parent Registered");
			}
			
			
		
	}
	
	public void signup(DataInt dataInt) throws Exception {
		
		if (driver.getPageSource().contains("Registration / Login")) {
			btnlogIn.click();
			implicitWait();
			accountregisteristration(dataInt);
		}
	}
	
	
	
	

}
