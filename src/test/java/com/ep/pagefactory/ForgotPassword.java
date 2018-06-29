package com.ep.pagefactory;

import org.testng.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.ep.datainitialization.DataInt;

public class ForgotPassword  extends CommonBase{

	public ForgotPassword(WebDriver driver) {
		super(driver);
	}
	
	
	@FindBy(how = How.XPATH, using = "//div[@class='top-nav']/a[3]")
	public static WebElement btnlogIn;
	
	@FindBy(how = How.LINK_TEXT, using = "Forgot Password?")
	public static WebElement Forgotpswd;
	
	@FindBy(how = How.ID, using = "Email")
	public static WebElement Emailforgetpassword;
	
	@FindBy(how = How.ID, using = "btnsubmit")
	public static WebElement Submitforrget;
	
	@FindBy(how = How.XPATH, using = "//div[@class='form-body']/p")
	public static WebElement emailtext;
	
	@FindBy(how = How.XPATH, using = "//div[@class='top-nav']/a")
	public static WebElement homePage;
	
	
	public void forgottenPassword(DataInt dataInt) throws Exception {
		
					implicitWait();
					Forgotpswd.click();
					Assert.assertTrue(driver.getTitle().contains("Forgot Password"));
					Emailforgetpassword.sendKeys(dataInt.getEmail());
					LOG.info("Entering registerd email address");
					Submitforrget.click();
					String text=emailtext.getText();
					if (text.equalsIgnoreCase("We've sent a password reset link to your email address")) {
						LOG.info("Forgot password resetlink has been sent");				
					}
					homePage.click();
       			}
	
	
	public void checkLogin(DataInt dataInt) throws Exception {

					if (driver.getPageSource().contains("Registration / Login")) {
						btnlogIn.click();
						forgottenPassword(dataInt);
					} 
				}
	}