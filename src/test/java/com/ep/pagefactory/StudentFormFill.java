package com.ep.pagefactory;

import junit.framework.Assert;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import com.ep.datainitialization.DataInt;
import com.ep.pageobjects.PaymentObjects;
import com.ep.pageobjects.StudentFormObjects;


public class StudentFormFill extends CommonBase {

	public StudentFormFill(WebDriver driver) {
		super(driver);
	}
	

	public void newformfill(DataInt dataInt) throws Exception {
		try {
			Thread.sleep(6000);
			StudentFormObjects.newstudentform(driver).click();
			Thread.sleep(5000);
			StudentFormObjects.beforeandafter(driver).click();
			Thread.sleep(2000);
			new Select(StudentFormObjects.schoolname(driver)).selectByVisibleText("Balmoral Ridgeway Elementary");
			Thread.sleep(2000);
			StudentFormObjects.lastname(driver).sendKeys(dataInt.getLastname());
			StudentFormObjects.firsttname(driver).sendKeys(dataInt.getFirstname());
			StudentFormObjects.middletname(driver).sendKeys(dataInt.getMiddlename());
			StudentFormObjects.ssn(driver).sendKeys(dataInt.getSSN());
			StudentFormObjects.grade(driver).sendKeys(dataInt.getGrade());
			StudentFormObjects.studentId(driver).sendKeys(dataInt.getStudentid());
			StudentFormObjects.dateofbirth(driver).sendKeys(dataInt.getDOB());
			Thread.sleep(1000);
			StudentFormObjects.gender(driver).click();
			StudentFormObjects.ImmunizationRecordatSchool(driver).click();
			StudentFormObjects.studenthavea504(driver).click();
			StudentFormObjects.IEP(driver).click();
			StudentFormObjects.medical(driver).click();
			StudentFormObjects.adress(driver).sendKeys(dataInt.getAddress());
			StudentFormObjects.zip(driver).sendKeys(dataInt.getZip());
			StudentFormObjects.home(driver).sendKeys(dataInt.getHome());
			StudentFormObjects.cell(driver).sendKeys(dataInt.getCell());
			StudentFormObjects.email(driver).sendKeys(dataInt.getEmailaddress());
			StudentFormObjects.parentemployee(driver).sendKeys(dataInt.getParentemployer());
			StudentFormObjects.telephone(driver).sendKeys(dataInt.getTelephone());
			StudentFormObjects.name(driver).sendKeys(dataInt.getName());
			StudentFormObjects.relationtochild(driver).sendKeys(dataInt.getRelationtochild());
			StudentFormObjects.cell1(driver).sendKeys(dataInt.getCell());
			StudentFormObjects.email1(driver).sendKeys(dataInt.getEmailaddress());
			StudentFormObjects.pickuppersonname(driver).sendKeys(dataInt.getName());
			StudentFormObjects.telephone1(driver).sendKeys(dataInt.getTelephone());
			StudentFormObjects.medicalcondition(driver).click();
			StudentFormObjects.parentorgurdain(driver).sendKeys(dataInt.getParentorGuardian());
			StudentFormObjects.signature(driver).sendKeys(dataInt.getSignatureLegalParentorGuardian());
			StudentFormObjects.date(driver).click();
			Thread.sleep(1000);
			super.systemdateselect();
			StudentFormObjects.terms(driver).click();
			Thread.sleep(3000);
			StudentFormObjects.submit(driver).click();
			
		} catch (Exception e) {
			excep = e.toString();
			Assert.fail(excep);

		}
	}
	
	
	public void Payment(DataInt dataInt) throws Exception {
		try {
			Thread.sleep(8000);
			PaymentObjects.cardtype(driver).sendKeys(dataInt.getCardtype());
			PaymentObjects.cardnumber(driver).sendKeys(dataInt.getCardnumber());
			PaymentObjects.month(driver).sendKeys(dataInt.getMonth());
			PaymentObjects.year(driver).sendKeys(dataInt.getYear());
			PaymentObjects.cvv(driver).sendKeys(dataInt.getCVV());
			Thread.sleep(2000);
			PaymentObjects.paynow(driver).click();
			
		} catch (Exception e) {
			excep = e.toString();
			Assert.fail(excep);

		}
	}
	
}
