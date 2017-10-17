package com.ep.pagefactory;


import junit.framework.Assert;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import com.ep.datainitialization.DataInt;
import com.ep.pageobjects.StudentFormPageObjects;

public class StudentFormFill extends StudentFormPageObjects {
	
	public StudentFormFill(WebDriver driver) {
		super(driver);
	}
	
	public void studentinfo(DataInt dataInt) throws Exception {
		
			Assert.assertTrue(driver.getTitle().contains("Parent Dashboard"));
			waitForSeconds(8);
			Newstudentform.click();
			waitForSeconds(5);
			Assert.assertTrue(driver.getTitle().contains("StudentApplication"));
			BeforeONLY.click();
			waitForSeconds(3);
			new Select(Schoolname).selectByVisibleText("Ross Elementary");
			waitForSeconds(2);
			LOG.info("Filling Student Info");
			Lastname.sendKeys(dataInt.getLastname());
			Firsttname.sendKeys(dataInt.getFirstname());
			Middletname.sendKeys(dataInt.getMiddlename());
			StateId.sendKeys(sevendigitrandomnumber());
			//StateId.sendKeys(dataInt.getStateid());
			Grade.sendKeys(dataInt.getGrade());
			browsername();
			waitForSeconds(1);
			if(browserName.equalsIgnoreCase("firefox")){
				((JavascriptExecutor) driver).executeScript("window.scrollBy(0,300)","");
			waitForSeconds(2);}
			Dateofbirth.click();
			systemdateselect();
			waitForSeconds(2);
			Gender.click();
			waitForSeconds(1);
			YesImmunizationRecordatSchool.click();
			waitForSeconds(1);
			NoDoesthestudenthavea504.click();
			waitForSeconds(1);
			NoDoesthestudenthaveanIEP.click();
			waitForSeconds(1);
			NoDoesthestudentusemedicalequipment.click();
			LOG.info("Successfully filled student info details");
			
		}
			
	public void legalparentorguardian(DataInt dataInt) throws Exception {
		
			waitForSeconds(1);
			LOG.info("Filling Legal Parent/Guardian1");
			Parentaddress.sendKeys(dataInt.getParentaddress());
			Zip.sendKeys(dataInt.getZip());
			Home.sendKeys(dataInt.getHome());
			cell.sendKeys(dataInt.getCell());
			EmailAddress.sendKeys(dataInt.getEmailAddress());
			Parentemployer.sendKeys(dataInt.getParentemployer());
			Telephone.sendKeys(dataInt.getTelephone());
			LOG.info("Successfully filled Legal Parent/Guardian 1 details");
			LOG.info("Filling Legal Parent/Guardian2");
			Parentaddress1.sendKeys(dataInt.getParentaddress1());
			Zip1.sendKeys(dataInt.getZip1());
			Home1.sendKeys(dataInt.getHome1());
			Cell1.sendKeys(dataInt.getCell1());
			EmailAddress1.sendKeys(dataInt.getEmailAddress1());
			Parentemployer1.sendKeys(dataInt.getParentemployer1());
			Telephone1.sendKeys(dataInt.getTelephone1());
			LOG.info("Successfully filled Legal Parent/Guardian 2 details");
		
	}
	
	public void emergencyContacts(DataInt dataInt) throws Exception {
		
			LOG.info("Filling Emergency Contacts");
			Name.sendKeys(dataInt.getName());
			Relationtochild.sendKeys(dataInt.getRelationtochild());
			Cell2.sendKeys(dataInt.getCell2());
			EmailAddress2.sendKeys(dataInt.getEmailAddress2());
			Name1.sendKeys(dataInt.getName1());
			Relationtochild1.sendKeys(dataInt.getRelationtochild1());
			Cell3.sendKeys(dataInt.getCell3());
			EmailAddress3.sendKeys(dataInt.getEmailAddress3());
			LOG.info("Successfully filled Emergency Contacts");
		
	}
	
	public void pickupafterschool(DataInt dataInt) throws Exception {
			
			LOG.info("Filling pickup persons details");
			Pickupname1.sendKeys(dataInt.getPickupname1());
			PickuppersonTelephone1.sendKeys(dataInt.getPickuppersonTelephone1());
			Pickupname2.sendKeys(dataInt.getPickupname2());
			PickuppersonTelephone2.sendKeys(dataInt.getPickuppersonTelephone2());
			Pickupname3.sendKeys(dataInt.getPickupname3());
			PickuppersonTelephone3.sendKeys(dataInt.getPickuppersonTelephone3());
			Pickupname4.sendKeys(dataInt.getPickupname4());
			PickuppersonTelephone4.sendKeys(dataInt.getPickuppersonTelephone4());
			Pickupname5.sendKeys(dataInt.getPickupname5());
			PickuppersonTelephone5.sendKeys(dataInt.getPickuppersonTelephone5());
			Pickupname6.sendKeys(dataInt.getPickupname6());
			PickuppersonTelephone6.sendKeys(dataInt.getPickuppersonTelephone6());
			Pickupname7.sendKeys(dataInt.getPickupname7());
			PickuppersonTelephone7.sendKeys(dataInt.getPickuppersonTelephone7());			
			Pickupname8.sendKeys(dataInt.getPickupname8());
			PickuppersonTelephone8.sendKeys(dataInt.getPickuppersonTelephone8());				
			Pickupname9.sendKeys(dataInt.getPickupname9());
			PickuppersonTelephone9.sendKeys(dataInt.getPickuppersonTelephone9());
			Pickupname10.sendKeys(dataInt.getPickupname10());
			PickuppersonTelephone10.sendKeys(dataInt.getPickuppersonTelephone10());
			LOG.info("Successfully filled  pickup persons details");
		
	}	
	
	public void medicalConditions(DataInt dataInt) throws Exception {
			
			LOG.info("Filling Medical Conditions details");
			waitForSeconds(3);
			browsername();
			waitForSeconds(1);
			if (browserName.equalsIgnoreCase("firefox")|| browserName.equalsIgnoreCase("internet explorer")) {
				((JavascriptExecutor)driver).executeScript("window.scrollBy(0,350)","");
				waitForSeconds(3);}
			Noknownhealthproblems.click();
			waitForSeconds(2);
			LOG.info("Successfully filled  Medical Conditions details");
		
	}
	
	public void signatureanddate(DataInt dataInt) throws Exception {
		
			LOG.info("Entering details of name,signature and date");
			Parentorgurdain.sendKeys(dataInt.getParentorGuardian());
			browsername();
			waitForSeconds(1);
			if (browserName.equalsIgnoreCase("internet explorer")) {
				((JavascriptExecutor)driver).executeScript("window.scrollBy(0,-250)","");
				waitForSeconds(3);}
			Signature.sendKeys(dataInt.getSignatureLegalParentorGuardian());
			browsername();
			waitForSeconds(1);
			if (browserName.equalsIgnoreCase("firefox")) {
				((JavascriptExecutor)driver).executeScript("window.scrollBy(0,150)","");
				waitForSeconds(3);}
			Date.click();
			waitForSeconds(2);
			systemdateselect();
			waitForSeconds(2);
			LOG.info("Entered details of name,signature and date");
			TermsandConditions.click();
			LOG.info("Clicked Terms&Conditions");
			waitForSeconds(3);
			Submit.click();
			LOG.info("Student Form Submited Successfully");
			//checkAlert();
		
	}
	
	public void paymentprocess(DataInt dataInt) throws Exception{
		
			if (Selectbox.isEnabled()) {
				Selectbox.click();
				waitForSeconds(2);
				Makepayment.click();
				paymentdetails(dataInt);
			   }
	 }
	
	public void paymentdetails(DataInt dataInt) throws Exception {
		
			waitForSeconds(6);
			Cardtype.sendKeys(dataInt.getCardtype());
			Cardnumber.sendKeys(dataInt.getCardnumber());
			Month.sendKeys(dataInt.getMonth());
			Year.sendKeys(dataInt.getYear());
			Cvv.sendKeys(dataInt.getCVV());
			waitForSeconds(2);
			Paynow.click();
			waitForSeconds(9);
		    Nameofparent.click();
		    waitForSeconds(1);
			Studentdetails.click();
			
		
	}
}