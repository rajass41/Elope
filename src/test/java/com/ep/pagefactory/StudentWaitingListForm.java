package com.ep.pagefactory;

import junit.framework.Assert;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import com.ep.datainitialization.DataInt;
import com.ep.pageobjects.StudentFormObjects;

public class StudentWaitingListForm extends StudentFormFill {

	public StudentWaitingListForm(WebDriver driver) {
		super(driver);
	}
	
	
	public void waitinglistformfill(DataInt dataInt) throws Exception {
		try {
			Thread.sleep(8000);
			StudentFormObjects.newstudentform(driver).click();
			Thread.sleep(5000);
			StudentFormObjects.beforeonly(driver).click();
			Thread.sleep(1000);
			new Select(StudentFormObjects.schoolname(driver)).selectByVisibleText("Alcy Elem");
			StudentFormObjects.lastname(driver).sendKeys(dataInt.getLastname());
			StudentFormObjects.firsttname(driver).sendKeys(dataInt.getFirstname());
			StudentFormObjects.middletname(driver).sendKeys(dataInt.getMiddlename());
			StudentFormObjects.ssn(driver).sendKeys(dataInt.getSSN());
			StudentFormObjects.grade(driver).sendKeys(dataInt.getGrade());
			StudentFormObjects.studentId(driver).sendKeys(dataInt.getStudentid());
			StudentFormObjects.dateofbirth(driver).sendKeys(dataInt.getDOB());
			//StudentFormObjects.submit(driver).click();
			
		} catch (Exception e) {
			excep = e.toString();
			Assert.fail(excep);

		}
	}

}
