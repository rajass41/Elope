package com.ep.pagefactory;

import junit.framework.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.ep.datainitialization.DataInt;


public class ContactUs extends CommonBase{

	public ContactUs(WebDriver driver) {
		super(driver);
	}
	@FindBy(how = How.XPATH, using = "//div[@class='top-nav']/a[2]")
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
	
	public void contactformfilling(DataInt dataInt) throws Exception {
		
			implicitWait();
			Contact.click();
			Assert.assertTrue(driver.getTitle().contains("Contact-Us"));
			LOG.info("Filling contact information");
			ContactFirstName.sendKeys(dataInt.getContactFirstName());
			browsername();
			if (browserName.equalsIgnoreCase("internet explorer")) {
				((JavascriptExecutor) driver).executeScript("window.scrollBy(0,-200)","");
				     }
			ContactLastName.sendKeys(dataInt.getContactLastName());
			Contactemail.sendKeys(dataInt.getContactemail());
			Contactphone.sendKeys(dataInt.getContactphone());
			Schoolname.sendKeys(dataInt.getSchoolname());
			Chlidname.sendKeys(dataInt.getChlidname());
			waitForSeconds(1);
			Comments.sendKeys(dataInt.getComments());
			browsername();
			if (browserName.equalsIgnoreCase("firefox")) {
				((JavascriptExecutor) driver).executeScript("window.scrollBy(0,100)","");
				}
			submitbtn.click();
			implicitWait();
			checkAlert();
			LOG.info("Successfully filled contact details");
		
	   }		
}
