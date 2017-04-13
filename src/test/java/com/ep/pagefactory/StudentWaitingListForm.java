package com.ep.pagefactory;

import junit.framework.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import com.ep.datainitialization.DataInt;


public class StudentWaitingListForm extends StudentFormFill {

	public StudentWaitingListForm(WebDriver driver) {
		super(driver);
	}
	
	
	public void waitinglistformfill(DataInt dataInt) throws Exception {
		try {
			waitForSeconds(7);
			Newstudentform.click();
			waitForSeconds(5);
			AfterONLy.click();
			waitForSeconds(1);
			new Select(Schoolname).selectByVisibleText("Sea Isle Elementary");
			waitForSeconds(3);
			Lastname.sendKeys(dataInt.getLastname());
			Firsttname.sendKeys(dataInt.getFirstname());
			Middletname.sendKeys(dataInt.getMiddlename());
			StateId.sendKeys(dataInt.getStateid());
			Grade.sendKeys(dataInt.getGrade());
			Dateofbirth.sendKeys(dataInt.getDOB());
			waitForSeconds(2);
			Submit.click();
			
		} catch (Exception e) {
			excep = e.toString();
			Assert.fail(excep);

		}
	}

}
