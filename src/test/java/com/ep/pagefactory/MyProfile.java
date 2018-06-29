package com.ep.pagefactory;

import org.testng.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.ep.datainitialization.DataInt;


public class MyProfile extends CommonBase {

	public MyProfile(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(how = How.CSS, using = "span.username")
	public static WebElement Nameofparent;
	
	@FindBy(how = How.LINK_TEXT, using = "My Profile")
	public static WebElement MyProfile;
	                                   
	@FindBy(how = How.XPATH, using = "//a[@class='btn edit hvr-icon-fade']")
	public static WebElement Editprofile;
	
	@FindBy(how = How.ID, using = "FirstName")
	public static WebElement FirstName;
	
	@FindBy(how = How.ID, using = "LastName")
	public static WebElement LastName;
	
	@FindBy(how = How.ID, using = "Address1")
	public static WebElement Address1;
	
	@FindBy(how = How.ID, using = "Address2")
	public static WebElement Address2;
	
	@FindBy(how = How.ID, using = "City")
	public static WebElement City;
	
	@FindBy(how = How.ID, using = "ZipCode")
	public static WebElement ZipCode;
	
	@FindBy(how = How.ID, using = "PhoneNumber")
	public static WebElement PhoneNumber;
	                                  
	@FindBy(how = How.XPATH, using = "//input[@type='submit']")
	public static WebElement ProfileUpdte;
	
	@FindBy(how = How.XPATH, using = "//*[@id='usm']")
	public static WebElement updatesuccessmsg;
	
	
	public void updateprofile(DataInt dataInt) throws Exception {
		
					implicitWait();
					Nameofparent.click();
					MyProfile.click();
					Assert.assertTrue(driver.getTitle().contains("My Profile"));
					Editprofile.click();
					Assert.assertTrue(driver.getTitle().contains("Edit Profile"));
					clearData();
					updateData(dataInt);
					ProfileUpdte.click();
					String text=updatesuccessmsg.getText();
					if (text.equalsIgnoreCase("Your profile has been successfully updated.")) {
						LOG.info("Profile Updated");
					}
					
					
		
	}	
	
	public void clearData() {
		
					implicitWait();
					FirstName.clear();
					LastName.clear();
					Address1.clear();
					City.clear();
					ZipCode.clear();
					PhoneNumber.clear();
		
			}
	
	public void updateData(DataInt dataInt) {
		
		
					implicitWait();
					FirstName.sendKeys(dataInt.getFirstName());
					LastName.sendKeys(dataInt.getLastName());
					Address1.sendKeys(dataInt.getAddress1());
					Address2.sendKeys(dataInt.getAddress2());
					City.sendKeys(dataInt.getCity());
					ZipCode.sendKeys(dataInt.getZipcode());
					PhoneNumber.sendKeys(dataInt.getPhonenumber());
					
		
		
	}

}
