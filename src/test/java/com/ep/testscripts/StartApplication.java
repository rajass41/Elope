package com.ep.testscripts;

import java.util.ArrayList;
import java.util.List;
import org.openqa.selenium.WebDriver;
import org.testng.TestNG;
import com.ep.pagefactory.CommonBase;


public class StartApplication extends CommonBase{

	public StartApplication(WebDriver driver) {
		super(driver);
	}
	public static String testngpath = System.getProperty("user.dir");

	public static void main (String[] args) throws Exception {
		
	          try {
	        	  TestNG runner=new TestNG();
	        	  List<String> suitefiles=new ArrayList<String>();
	        	  suitefiles.add(testngpath + "//EPTestNG.xml");
	        	  runner.setTestSuites(suitefiles);
	        	  runner.run();
	        	  emailreport();
		     
	           } catch (Exception e) {
	    	      e.printStackTrace();
	         }
		
	  }
	
}