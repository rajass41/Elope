package com.ep.testscripts;

import java.util.Iterator;

import org.apache.log4j.Logger;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;







import com.ep.datainitialization.DataInt;
//import com.yp.pagefactory.YPBase;
import com.ep.utilities.Util;
import com.ep.utilities.Xls_Reader;


public class TestSuite extends Base {
	
	public static final Logger LOG = Logger.getLogger(TestSuite.class);
	String testDataPath = System.getProperty("user.dir")
			+ "\\src\\main\\java\\com\\ep\\test\\data\\TestData.xlsx";
	public Xls_Reader xls = new Xls_Reader(testDataPath);

	
	
	@Test(description = "Login", dataProvider = "getLogin", priority = 0)
	public void Login(DataInt dataInt) throws Exception {
			login= driverhome.getLogin();
			login.accountlogin(dataInt);			
	}
	
	
	
	
	
			@DataProvider
			public Iterator<Object[]> getLogin() {
				return Util.getLoginData("Login", xls).iterator();

			}
			
			
			
			
}


