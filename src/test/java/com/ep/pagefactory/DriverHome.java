package com.ep.pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import com.ep.utilities.PropertiesFileReader;

public class DriverHome extends CommonBase {
	
	public static final String prod_url = PropertiesFileReader.readvalueOfKey("app.url");
			

	public DriverHome(WebDriver driver) {
		super(driver);

	}

	public DriverHome(String browser, String text) {
		super(prod_url, browser);
	}

	public DriverHome(String url) {
		super(url, "test");

	}
	public ParentRegistration getSignup(){
		return PageFactory.initElements(driver, ParentRegistration.class);
	}
	
	public Login getLogin(){
		return PageFactory.initElements(driver, Login.class);
	}
	
	public StudentRegistration getformfill(){
		return PageFactory.initElements(driver, StudentRegistration.class);
	}
	
	public StudentWaitingListForm getWaitingListForm(){
		return PageFactory.initElements(driver, StudentWaitingListForm.class);
	}
	public ContactUs getcontact(){
		return PageFactory.initElements(driver, ContactUs.class);
	}
	
	public ChangePassword getcpswd(){
		return PageFactory.initElements(driver, ChangePassword.class);
	}
	
	public MyProfile getprofile(){
		return PageFactory.initElements(driver, MyProfile.class);
	}
	
	public TaxStatement getstatement(){
		return PageFactory.initElements(driver, TaxStatement.class);
	}
	
	
	
	public Logout getacclogout (){
		return PageFactory.initElements(driver, Logout.class);
	}
	public ForgotPassword getpswd(){
		return PageFactory.initElements(driver, ForgotPassword.class);
	}

	
	
	
}

