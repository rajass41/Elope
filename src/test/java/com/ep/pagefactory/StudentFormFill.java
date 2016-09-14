package com.ep.pagefactory;

import junit.framework.Assert;
import org.openqa.selenium.WebDriver;
import com.ep.datainitialization.DataInt;
import com.ep.pageobjects.StudentFormObjects;

public class StudentFormFill extends CommonBase {

	protected StudentFormFill(WebDriver driver) {
		super(driver);
		
	}
	

	public void formfill(DataInt dataInt) throws Exception {
		try {
			Thread.sleep(6000);
			StudentFormObjects.newstudentform(driver).click();
			
		} catch (Exception e) {
			excep = e.toString();
			Assert.fail(excep);

		}
	}	

}
