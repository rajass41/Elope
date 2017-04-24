package com.ep.testscripts;

import java.util.ArrayList;
import java.util.List;

import org.automationtesting.excelreport.Xl;
import org.openqa.selenium.WebDriver;
import org.testng.TestNG;
import com.ep.pagefactory.CommonBase;


public class GenerateReport extends CommonBase{


	protected GenerateReport(WebDriver driver) {
		super(driver);
	}

	public static void main (String[] args) throws Exception {
	   try {
		     // Create object of TestNG Class
			 TestNG runner=new TestNG();
			 // Create a list of String 
			 List<String> suitefiles=new ArrayList<String>();
			 // Add xml file which you have to execute
			 suitefiles.add("D://ElopParentProject//EPTestNG.xml");
			 // now set xml file for execution
			 runner.setTestSuites(suitefiles);
			 // finally execute the runner using run method
			 runner.run();
		     Xl.generateReport("TestReport.xlsx");
		     emailreport();
		     
	       } catch (Exception e) {
	    	   e.getMessage();
	       }
		
	   }
	
}


