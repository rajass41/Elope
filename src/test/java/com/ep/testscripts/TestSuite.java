package com.ep.testscripts;

import java.util.Iterator;
import org.apache.log4j.Logger;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import com.ep.pageobjects.ExcelSheetObjects;
import com.ep.testscripts.SetupEnvironment;
import com.ep.datainitialization.DataInt;
import com.ep.utilities.Util;
import com.ep.utilities.Xls_Reader;



public class TestSuite extends Base {
	
	public static final Logger LOG = Logger.getLogger(TestSuite.class);
	String testDataPath = System.getProperty("user.dir")+ "\\src\\main\\java\\com\\ep\\test\\data\\TestData.xlsx";
	public Xls_Reader xls = new Xls_Reader(testDataPath);
    


   /*@Test(description = "Signup", dataProvider = "getsignup",retryAnalyzer=Retry.class, priority = 0)
	public void SignupProcess(DataInt dataInt) throws Exception {
		try {
			signup=driverhome.getSignup();
			signup.accountregisteristration(dataInt);	
			SetupEnvironment.createXLSReport(ExcelSheetObjects.KEYWORD_PASS, ExcelSheetObjects.SignupWithRequiredData, "TestCases");
		} catch (Exception e) {
			SetupEnvironment.createXLSReport(ExcelSheetObjects.KEYWORD_FAIL,ExcelSheetObjects.SignupWithRequiredData, "TestCases");
			e.printStackTrace();
		}
			
	}*/
	
	@Test(description = "Login", dataProvider = "getLogin", priority = 1)
	public void Login(DataInt dataInt) throws Exception {
		try {
			login= driverhome.getLogin();
			login.accountlogin(dataInt);
			SetupEnvironment.createXLSReport(ExcelSheetObjects.KEYWORD_PASS, ExcelSheetObjects.LoginWithValidCredentials, "TestCases");
		} catch (Exception e) {
			SetupEnvironment.createXLSReport(ExcelSheetObjects.KEYWORD_FAIL,ExcelSheetObjects.LoginWithValidCredentials, "TestCases");
			e.printStackTrace();
		}
					
	}
	
	 @Test(description = "StudentFormfill",dataProvider = "getStudentForm" , priority = 2)
	public void fillingform(DataInt dataInt) throws Exception {
	 try {
		    formfill=driverhome.getformfill();
			formfill.studentinfo(dataInt);
			formfill.legalparentorguardian(dataInt);
			formfill.emergencyContacts(dataInt);
			formfill.pickupafterschool(dataInt);
			formfill.medicalConditions(dataInt);
			formfill.signatureanddate(dataInt);
			formfill.paymentprocess(dataInt);
			SetupEnvironment.createXLSReport(ExcelSheetObjects.KEYWORD_PASS, ExcelSheetObjects.StudentForm, "TestCases");
	      } catch (Exception e) {
	    	  SetupEnvironment.createXLSReport(ExcelSheetObjects.KEYWORD_FAIL,ExcelSheetObjects.StudentForm, "TestCases");
		    e.printStackTrace();
	  }	
				
	}
	
  /*  @Test(description = "StudentWaitingListFormfill", dataProvider = "getStudentForm" , priority = 3)
	public void waitinglistformfilling(DataInt dataInt) throws Exception {
		try {
			waitinglistform = driverhome.getWaitingListForm();
			waitinglistform.waitinglistformfill(dataInt);
			SetupEnvironment.createXLSReport(ExcelSheetObjects.KEYWORD_PASS, ExcelSheetObjects.StudentWLForm, "TestCases");			
		} catch (Exception e) {
			SetupEnvironment.createXLSReport(ExcelSheetObjects.KEYWORD_FAIL,ExcelSheetObjects.StudentWLForm, "TestCases");
			e.printStackTrace();
		}
	
	}
	
	@Test(description = "ContactUsForm", dataProvider = "getContactus" , priority = 4)
	public void ContactUs(DataInt dataInt) throws Exception {
		try {
			contact=driverhome.getcontact();
			contact.contactformfilling(dataInt);
			SetupEnvironment.createXLSReport(ExcelSheetObjects.KEYWORD_PASS, ExcelSheetObjects.ContactUsForm, "TestCases");
			
		} catch (Exception e) {
			SetupEnvironment.createXLSReport(ExcelSheetObjects.KEYWORD_FAIL,ExcelSheetObjects.ContactUsForm, "TestCases");
			e.printStackTrace();
		}
		
				
	}
	
	@Test(description = "Changepassword", dataProvider = "getChangePassword", priority = 5)
	public void ChangePassword(DataInt dataInt) throws Exception {
		try {
			cpswd=driverhome.getcpswd();
			cpswd.changepswd(dataInt);
			SetupEnvironment.createXLSReport(ExcelSheetObjects.KEYWORD_PASS, ExcelSheetObjects.Changepassword, "TestCases");
			
		} catch (Exception e) {
			SetupEnvironment.createXLSReport(ExcelSheetObjects.KEYWORD_FAIL,ExcelSheetObjects.Changepassword, "TestCases");
			e.printStackTrace();
		}
		
	}
	
	@Test(description = "ProfileUpdate",  priority = 6)
	public void Updateingprofile() throws Exception {
		try {
			profile=driverhome.getprofile();
			profile.updateprofile();
			SetupEnvironment.createXLSReport(ExcelSheetObjects.KEYWORD_PASS, ExcelSheetObjects.ProfileUpdate, "TestCases");
		} catch (Exception e) {
			SetupEnvironment.createXLSReport(ExcelSheetObjects.KEYWORD_FAIL,ExcelSheetObjects.ProfileUpdate, "TestCases");
			e.printStackTrace();
		}
		
	}
	
	@Test(description = "Tax",  priority = 7)
	public void Taxstatement() throws Exception {
		try {
			statement=driverhome.getstatement();
			statement.taxreport();
			SetupEnvironment.createXLSReport(ExcelSheetObjects.KEYWORD_PASS, ExcelSheetObjects.Taxstatement, "TestCases");
		} catch (Exception e) {
			SetupEnvironment.createXLSReport(ExcelSheetObjects.KEYWORD_FAIL,ExcelSheetObjects.Taxstatement, "TestCases");
			e.printStackTrace();
		}
		
	}
	
	@Test(description = "AccountLogout",  priority = 8)
	public void AccLogout() throws Exception {
		try {
			acclogout=driverhome.getacclogout();
			acclogout.accountlogout();
			SetupEnvironment.createXLSReport(ExcelSheetObjects.KEYWORD_PASS, ExcelSheetObjects.AccountLogout, "TestCases");
		} catch (Exception e) {
			SetupEnvironment.createXLSReport(ExcelSheetObjects.KEYWORD_FAIL,ExcelSheetObjects.AccountLogout, "TestCases");
			e.printStackTrace();
		}
		
	}
	
	@Test(description = "Forgotpassword", dataProvider = "getContactus", priority = 9)
	public void ForgotPassword(DataInt dataInt) throws Exception {
		try {
			pswd=driverhome.getpswd();
			pswd.forgottenpassword(dataInt);
			SetupEnvironment.createXLSReport(ExcelSheetObjects.KEYWORD_PASS, ExcelSheetObjects.Forgotpassword, "TestCases");
		} catch (Exception e) {
			SetupEnvironment.createXLSReport(ExcelSheetObjects.KEYWORD_FAIL,ExcelSheetObjects.Forgotpassword, "TestCases");
			e.printStackTrace();
		}
		
	}
	*/
	
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
