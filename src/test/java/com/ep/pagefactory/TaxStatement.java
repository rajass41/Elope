package com.ep.pagefactory;

import junit.framework.Assert;

import org.openqa.selenium.WebDriver;

import com.ep.pageobjects.TaxStatementPageObjects;

public class TaxStatement extends TaxStatementPageObjects{

	public TaxStatement(WebDriver driver) {
		super(driver);
	}

	public void taxreport() throws Exception{
		try {
			waitForSeconds(4);
			Nameofparent.click();
			waitForSeconds(4);
			TaxStatemnt.click();
			Assert.assertTrue(driver.getTitle().contains("TaxReport"));
		} catch (Exception e) {
			e.getMessage();
		}
		
	}
	
}
