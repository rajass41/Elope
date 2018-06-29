package com.ep.pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.ep.datainitialization.DataInt;


public class TaxStatement extends Login{

	public TaxStatement(WebDriver driver) {
		super(driver);
	}

	@FindBy(how = How.CSS, using = "span.username")
	public static WebElement Nameofparent;
								      
	@FindBy(how = How.XPATH, using = "/html/body/div/header/div[2]/div/div[1]/ul/li/ul/li[4]/a")
	public  static WebElement TaxStatemnt;
	
	public void taxreport() throws Exception{
		
		    implicitWait();
			Nameofparent.click();
			TaxStatemnt.click();
			if (driver.getTitle().contains("TaxReport")){
				LOG.info("Taxreport viwed");
			 
			}
				
	}
	
	public void checkLogin(DataInt dataInt) throws Exception {

			if (driver.getPageSource().contains("Registration / Login")) {
				LOG.info("Need to Login");
				HighLightElement(btnlogIn);
				btnlogIn.click();
				accountlogin(dataInt);
				taxreport();
		} 
	}
	
}
