package com.ep.testscripts;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriverException;
import org.testng.annotations.AfterTest;
//import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import com.ep.pagefactory.DriverHome;
import com.ep.pagefactory.Login;
import com.ep.pagefactory.StudentFormFill;
import com.ep.utilities.Xls_Reader;

/**
 * 
 * 
 * This is the base class for all the test suites,It executes before executing
 * the TestSuite Classes
 * 
 */

public class Base {
	public static final Logger LOG = Logger.getLogger(Base.class);
	public DriverHome driverhome;
	public Login login;
	public StudentFormFill formfill;
	
	public static String passMessage = null;
	public static String finalMessage = null;
	public static String skipMessage = null;
	public Xls_Reader xls;

	@BeforeTest
	@Parameters({ "browser" })
	public void setUp(String browser) throws Exception {
		try {
			
			LOG.info("Open The Url");
			driverhome = new DriverHome(browser, "test");
			LOG.info("test");
		} catch (WebDriverException e) {
			System.out.println(e);
			
		}
	}

	@AfterTest
	public void close() throws Exception {
		try {
			Thread.sleep(5000);
		    driverhome.emailreport();
			//driverhome.quitDriver();
		} catch (WebDriverException e) {
			System.out.println(e); // TODO: handle exception }

		}
	}
}
