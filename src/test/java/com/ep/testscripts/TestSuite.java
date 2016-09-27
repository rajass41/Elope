package com.ep.testscripts;

import java.util.Iterator;
import org.apache.log4j.Logger;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import com.ep.datainitialization.DataInt;
import com.ep.utilities.Util;
import com.ep.utilities.Xls_Reader;


public class TestSuite extends Base {
	
	public static final Logger LOG = Logger.getLogger(TestSuite.class);
	String testDataPath = System.getProperty("user.dir")
			+ "\\src\\main\\java\\com\\ep\\test\\data\\TestData.xlsx";
	public Xls_Reader xls = new Xls_Reader(testDataPath);

	/*@Test(description = "Signup", dataProvider = "getsignup", priority = 0)
	public void SignupProcess(DataInt dataInt) throws Exception {
		signup=driverhome.getSignup();
		signup.accountregister(dataInt);			
	}*/

	@Test(description = "Login", dataProvider = "getLogin", priority = 0)
	public void Login(DataInt dataInt) throws Exception {
			login= driverhome.getLogin();
			login.accountlogin(dataInt);			
	}
	
	
   @Test(description = "StudentFormfill", dataProvider = "getStudentForm" , priority = 1)
	public void fillingform(DataInt dataInt) throws Exception {
		formfill=driverhome.getformfill();
		formfill.newformfill(dataInt);
		formfill.Payment(dataInt);
					
	}
	
	@Test(description = "StudentWaitingListFormfill", dataProvider = "getStudentForm" , priority = 2)
	public void waitinglistformfilling(DataInt dataInt) throws Exception {
	waitinglistform = driverhome.getWaitingListForm();
	waitinglistform.waitinglistformfill(dataInt);
				
	}
	
	@Test(description = "ContactUsForm", dataProvider = "getContactus" , priority = 3)
	public void ContactUs(DataInt dataInt) throws Exception {
		contact=driverhome.getcontact();
		contact.contactformfilling(dataInt);
				
	}
	
	/*@Test(description = "Forgotpassword", dataProvider = "getContactus", priority = 0)
	public void ForgotPassword(DataInt dataInt) throws Exception {
		pswd=driverhome.getpswd();
		pswd.forgottenpassword(dataInt);
	}*/
	
	@Test(description = "Changepassword", dataProvider = "getChangePassword", priority = 4)
	public void ChangePassword(DataInt dataInt) throws Exception {
		cpswd=driverhome.getcpswd();
		cpswd.changepswd(dataInt);
	}
	
	
	       @DataProvider
	       public Iterator<Object[]> getsignup(){
	    	   return Util.getSignup("Signup", xls).iterator();
	       }
		     
	
	
			@DataProvider
			public Iterator<Object[]> getLogin() {
				return Util.getLoginData("Login", xls).iterator();

			}
			
			@DataProvider
			public Iterator<Object[]> getStudentForm() {
				return Util.getStudentForm("StudentForm", xls).iterator();

			}	
			
			@DataProvider
			public Iterator<Object[]> getContactus() {
				return Util.getContactus("Contactus", xls).iterator();

			}		
			
			@DataProvider
			public Iterator<Object[]> getChangePassword() {
				return Util.getChangePassword("ChangePassword", xls).iterator();

			}	
}


