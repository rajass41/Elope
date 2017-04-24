package com.ep.testscripts;


import org.openqa.selenium.WebDriverException;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import com.ep.pagefactory.ChangePassword;
import com.ep.pagefactory.ContactUs;
import com.ep.pagefactory.DriverHome;
import com.ep.pagefactory.ForgotPassword;
import com.ep.pagefactory.Login;
import com.ep.pagefactory.Logout;
import com.ep.pagefactory.MyProfile;
import com.ep.pagefactory.ParentRegistration;
import com.ep.pagefactory.StudentFormFill;
import com.ep.pagefactory.StudentWaitingListForm;
import com.ep.utilities.Xls_Reader;

/**
 * 
 * 
 * This is the base class for all the test suites,It executes before executing
 * the TestSuite Classes
 * 
 */

public class Base {


	public DriverHome driverhome;
	public ParentRegistration signup;
	public Login login;
	public StudentFormFill formfill;
	public StudentWaitingListForm waitinglistform;
	public ContactUs contact;
	public ChangePassword cpswd;
	public MyProfile profile;
	public Logout acclogout;
	public ForgotPassword pswd;
	
	public static String passMessage = null;
	public static String finalMessage = null;
	public static String skipMessage = null;
	public Xls_Reader xls;
	public String testreportpath = System.getProperty("user.dir");

	@BeforeTest(alwaysRun = true)
	@Parameters({ "browser" })
	public void setUp(String browser) throws Exception {
		try {
			Reporter.log("=====Browser Session Started=====", true);
			driverhome = new DriverHome(browser, "test");
			
		} catch (WebDriverException e) {
			System.out.println(e);
			
		}
	}

	@AfterTest

	public void close() throws Exception {
		try {
			Thread.sleep(5000);
		    //driverhome.emailreport();
			driverhome.quitDriver();
			Reporter.log("=====Browser Session End=========", true);
		} catch (WebDriverException e) {
			System.out.println(e); 

		}
	}
	
	

}
