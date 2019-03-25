package com.ep.pagefactory;


import org.testng.Assert;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import com.ep.datainitialization.DataInt;

public class StudentRegistration extends CommonBase {
	
	public StudentRegistration(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(how = How.CSS, using = "span.username")
	public static WebElement Parent;
	
	@FindBy(how = How.LINK_TEXT, using = "Student Details")
	public static WebElement Dashboard;
	
	@FindBy(how = How.XPATH, using = "//div[@class='portlet-body form']/div/div/div/div/p/a")    
	public static WebElement Newstudentform;
	
	@FindBy(how = How.XPATH, using = "//input[@value='1']")
	public static WebElement BeforeONLY;
	
	@FindBy(how = How.XPATH, using = "//input[@value='2']")
	public static WebElement AfterONLy;
	
	@FindBy(how = How.XPATH, using = "//input[@value='3']")
	public static WebElement BeforeandAfter;
	
	@FindBy(how = How.XPATH, using = "//input[@value='4']")
	public static WebElement SummerEnrichment;

	@FindBy(how = How.XPATH, using = "//*[@id=\"noofspacescounta\"]")
	public static WebElement Noofspaces;
	
	@FindBy(how = How.ID, using = "noofspacescounta")
	public static WebElement Nospaces;
	
	@FindBy(how = How.ID, using = "SiteId")
	public static WebElement Schoolname;
	
	@FindBy(how = How.ID, using = "StudentLastName")
	public static WebElement Lastname;
	
	@FindBy(how = How.ID, using = "StudentFirstName")
	public static WebElement Firsttname;
	
	@FindBy(how = How.ID, using = "StudentMiddleName")
	public static WebElement Middletname;
	
	@FindBy(how = How.ID, using = "SSN")
	public static WebElement StateId;
	
	@FindBy(how = How.ID, using = "Grade")
	public static WebElement Grade;
	
	@FindBy(how = How.ID, using = "DateOfBirth")
	public static WebElement Dateofbirth;
	
	@FindBy(how = How.ID, using = "GenderMale")
	public static WebElement Gender;
	
	@FindBy(how = How.ID, using = "YesImmunizationRecordatSchool")
	public static WebElement YesImmunizationRecordatSchool;
	
	@FindBy(how = How.ID, using = "NoImmunizationRecordatSchool")
	public static WebElement NoImmunizationRecordatSchool;
	
	@FindBy(how = How.ID, using = "YesDoesthestudenthavea504")
	public static WebElement YesDoesthestudenthavea504;
	
	@FindBy(how = How.ID, using = "NoDoesthestudenthavea504")
	public static WebElement NoDoesthestudenthavea504;
	
	@FindBy(how = How.ID, using = "Whatisthe504for")
	public static WebElement Whatisthe504for;
	
	@FindBy(how = How.ID, using = "YesDoesthestudenthaveanIEP")
	public static WebElement YesDoesthestudenthaveanIEP;
	
	@FindBy(how = How.ID, using = "NoDoesthestudenthaveanIEP")
	public static WebElement NoDoesthestudenthaveanIEP;
	
	@FindBy(how = How.ID, using = "YesDoesthestudentusemedicalequipment")
	public static WebElement YesDoesthestudentusemedicalequipment;
	
	@FindBy(how = How.ID, using = "NoDoesthestudentusemedicalequipment")
	public static WebElement NoDoesthestudentusemedicalequipment;
	
	@FindBy(how = How.ID, using = "LegalParentGuardianAddress")
	public static WebElement Parentaddress;
	
	@FindBy(how = How.ID, using = "LegalParentGuardianZip")
	public static WebElement Zip;
	
	@FindBy(how = How.ID, using = "LegalParentGuardianHomeNumber")
	public static WebElement Home;
	
	@FindBy(how = How.ID, using = "LegalParentGuardianCellNumber")
	public static WebElement cell;
	
	@FindBy(how = How.ID, using = "LegalParentGuardianEmail")
	public static WebElement EmailAddress;
	
	@FindBy(how = How.ID, using = "LegalParentGuardianParentEmployee")
	public static WebElement Parentemployer;
	
	@FindBy(how = How.ID, using = "LegalParentGuardianTelephone")
	public static WebElement Telephone;
	
	@FindBy(how = How.ID, using = "LegalParentGuardian1Name")
	public static WebElement LegalParentGuardianName1;
	
	@FindBy(how = How.ID, using = "LegalParentGuardian1Address")
	public static WebElement Parentaddress1;
	
	@FindBy(how = How.ID, using = "LegalParentGuardian1Zip")
	public static WebElement Zip1;
	
	@FindBy(how = How.ID, using = "LegalParentGuardian1HomeNumber")
	public static WebElement Home1;
	
	@FindBy(how = How.ID, using = "LegalParentGuardian1CellNumber")
	public static WebElement Cell1;
	
	@FindBy(how = How.ID, using = "LegalParentGuardian1Email")
	public static WebElement EmailAddress1;
	
	@FindBy(how = How.ID, using = "LegalParentGuardian1ParentEmployee")
	public static WebElement Parentemployer1;
	
	@FindBy(how = How.ID, using = "LegalParentGuardian1Telephone")
	public static WebElement Telephone1;
	
	@FindBy(how = How.ID, using = "EmergencyContactName")
	public static WebElement Name;
	
	@FindBy(how = How.ID, using = "EmergencyContactRelationtochild")
	public static WebElement Relationtochild;
	
	@FindBy(how = How.ID, using = "EmergencyContactCellNumber")
	public static WebElement Cell2;
	
	@FindBy(how = How.ID, using = "EmergencyContactEmail")
	public static WebElement EmailAddress2;
	
	@FindBy(how = How.ID, using = "EmergencyContactName1")
	public static WebElement Name1;
	
	@FindBy(how = How.ID, using = "EmergencyContactRelationtochild1")
	public static WebElement Relationtochild1;
	
	@FindBy(how = How.ID, using = "EmergencyContactCellNumber1")
	public static WebElement Cell3;
	
	@FindBy(how = How.ID, using = "EmergencyContactEmail1")
	public static WebElement EmailAddress3;
	
	@FindBy(how = How.ID, using = "PersonallowedName")
	public static WebElement Pickupname1;
	
	@FindBy(how = How.ID, using = "PersonallowedTelephone")
	public static WebElement PickuppersonTelephone1;
	
	@FindBy(how = How.ID, using = "PersonallowedName1")
	public static WebElement Pickupname2;
	
	@FindBy(how = How.ID, using = "PersonallowedTelephone1")
	public static WebElement PickuppersonTelephone2;
	
	@FindBy(how = How.ID, using = "PersonallowedName2")
	public static WebElement Pickupname3;
	
	@FindBy(how = How.ID, using = "PersonallowedTelephone2")
	public static WebElement PickuppersonTelephone3;
	
	@FindBy(how = How.ID, using = "PersonallowedName3")
	public static WebElement Pickupname4;
	
	@FindBy(how = How.ID, using = "PersonallowedTelephone3")
	public static WebElement PickuppersonTelephone4;
	
	@FindBy(how = How.ID, using = "PersonallowedName4")
	public static WebElement Pickupname5;
	
	@FindBy(how = How.ID, using = "PersonallowedTelephone4")
	public static WebElement PickuppersonTelephone5;
	
	@FindBy(how = How.ID, using = "PersonallowedName5")
	public static WebElement Pickupname6;
	
	@FindBy(how = How.ID, using = "PersonallowedTelephone5")
	public static WebElement PickuppersonTelephone6;
	
	@FindBy(how = How.ID, using = "PersonallowedName6")
	public static WebElement Pickupname7;
	
	@FindBy(how = How.ID, using = "PersonallowedTelephone6")
	public static WebElement PickuppersonTelephone7;
	
	@FindBy(how = How.ID, using = "PersonallowedName7")
	public static WebElement Pickupname8;
	
	@FindBy(how = How.ID, using = "PersonallowedTelephone7")
	public static WebElement PickuppersonTelephone8;
	
	@FindBy(how = How.ID, using = "PersonallowedName8")
	public static WebElement Pickupname9;
	
	@FindBy(how = How.ID, using = "PersonallowedTelephone8")
	public static WebElement PickuppersonTelephone9;
	
	@FindBy(how = How.ID, using = "PersonallowedName9")
	public static WebElement Pickupname10;
	
	@FindBy(how = How.ID, using = "PersonallowedTelephone9")
	public static WebElement PickuppersonTelephone10;
	
	@FindBy(how = How.XPATH, using = "//input[@name='No known health problems']")
	public static WebElement Noknownhealthproblems;
	
	@FindBy(how = How.XPATH, using = "//input[@name='ADHD']")
	public static WebElement ADHD;
	
	@FindBy(how = How.XPATH, using = "//input[@name='Surgery(date)']")
	public static WebElement Surgery;
	
	@FindBy(how = How.ID, using = "surgerydate")
	public static WebElement Surgerydate;
	
	@FindBy(how = How.ID, using = "surgerytype")
	public static WebElement surgerytype;
	
	@FindBy(how = How.XPATH, using = "//input[@name='Tuberculosis']")
	public static WebElement Tuberculosis;
	
	@FindBy(how = How.XPATH, using = "//input[@name='Anxiety Attacks']")
	public static WebElement AnxietyAttacks;
	
	@FindBy(how = How.XPATH, using = "//input[@name='Cancer']")
	public static WebElement Cancer;
	
	@FindBy(how = How.XPATH, using = "//input[@name='Asthma']")
	public static WebElement Asthma;
	
	@FindBy(how = How.XPATH, using = "//input[@name='Nosebleeds']")
	public static WebElement Nosebleeds;
	
	@FindBy(how = How.XPATH, using = "//input[@name='Epilepsy']")
	public static WebElement Epilepsy;
	
	@FindBy(how = How.XPATH, using = "//input[@name='Allergies']")
	public static WebElement Allergies;
	
	@FindBy(how = How.XPATH, using = "//input[@name='Allergiescomments']")
	public static WebElement AllergiesType;
	
	@FindBy(how = How.XPATH, using = "//input[@name='Sinusitis']")
	public static WebElement Sinusitis;
	
	@FindBy(how = How.XPATH, using = "//input[@name='Seizures (convulsions)']")
	public static WebElement Seizuresconvulsions;
	
	@FindBy(how = How.XPATH, using = "//input[@name='Eye Problems']")
	public static WebElement EyeProblems;
	
	@FindBy(how = How.XPATH, using = "//input[@name='Heart problems']")
	public static WebElement Heartproblems;
	
	@FindBy(how = How.XPATH, using = "//input[@name='Diabetes']")
	public static WebElement Diabetes;
	
	@FindBy(how = How.XPATH, using = "//input[@name='Hearing difficulties']")
	public static WebElement Hearingdifficulties;
	
	@FindBy(how = How.XPATH, using = "//input[@name='Emotional difficulties']")
	public static WebElement Emotionaldifficulties;
	
	@FindBy(how = How.XPATH, using = "//input[@name='Kidney Problems']")
	public static WebElement KidneyProblems;
	
	@FindBy(how = How.XPATH, using = "//input[@name='Speech difficulties']")
	public static WebElement Speechdifficulties;
	
	@FindBy(how = How.XPATH, using = "//input[@name='Cancer']")
	public static WebElement Poliomyelitis;
	
	@FindBy(how = How.XPATH, using = "//input[@name='(Polio)myelitis date']")
	public static WebElement Poliomyelitisdate;
	
	@FindBy(how = How.XPATH, using = "//input[@name='Hemophilia']")
	public static WebElement Hemophilia;
	
	@FindBy(how = How.XPATH, using = "//input[@name='Sickle Cell Anemia']")
	public static WebElement SickleCellAnemia;
	
	@FindBy(how = How.XPATH, using = "//input[@name='Rheumatic Fever date']")
	public static WebElement RheumaticFever;
	
	@FindBy(how = How.XPATH, using = "//input[@name='rhematicdate']")
	public static WebElement RheumaticFeverdate;
	
	@FindBy(how = How.XPATH, using = "//input[@name='Hypertension (high blood pressure)']")
	public static WebElement Hypertensionhighbloodpressure;
	
	@FindBy(how = How.XPATH, using = "//input[@name='Hypotension (low blood pressure)']")
	public static WebElement Hypotensionlowbloodpressure;
	
	@FindBy(how = How.XPATH, using = "//input[@name='Other illness/disablity not listed']")
	public static WebElement Otherillnessdisablitynotlisted;
	
	@FindBy(how = How.ID, using = "comments")
	public static WebElement otherillnessdisablity;
	
	@FindBy(how = How.ID, using = "HospitalClinic")
	public static WebElement HospitalClinic;
	
	@FindBy(how = How.ID, using = "Physician")
	public static WebElement Physician;
	
	@FindBy(how = How.ID, using = "PhysicianAddress")
	public static WebElement PhysicianAddress;
	
	@FindBy(how = How.ID, using = "PhysicianTelephone")
	public static WebElement PhysicianTelephone;
	
	@FindBy(how = How.ID, using = "PrintLegalParentGuardian")
	public static WebElement Parentorgurdain;
	
	@FindBy(how = How.ID, using = "SignatureLegalParentGuardian")
	public static WebElement Signature;
	
	@FindBy(how = How.ID, using = "Date")
	public static WebElement Date;
	
	@FindBy(how = How.ID, using = "TermsandConditions")
	public static WebElement TermsandConditions;
	
	@FindBy(how = How.ID, using = "btnsubmit")
	public static WebElement Submit;
	
	@FindBy(how = How.ID, using = "CardType")
	public static WebElement Cardtype;

	@FindBy(how = How.ID, using = "CardNumber")
	public static WebElement Cardnumber;
	
	@FindBy(how = How.ID, using = "ExpiryMonth")
	public static WebElement Month;
	
	@FindBy(how = How.ID, using = "ExpiryYear")
	public static WebElement Year;
	
	@FindBy(how = How.ID, using = "CVV")
	public static WebElement Cvv;
	
	@FindBy(how = How.ID, using = "btncheckout")
	public static WebElement Paynow;
	
	@FindBy(how = How.XPATH, using = "/html/body/div[1]/section[1]/div/div/form/div/div/div/div[2]/div/div/div/div/div[2]/div/div[1]/table/tbody/tr[1]/td[2]/input")
	public static WebElement Selectbox;
	
	@FindBy(how = How.ID, using = "btnPay")
	public static WebElement Makepayment;
	
	@FindBy(how = How.XPATH, using = "//div[@class='form-body']/input")
	public static WebElement printpage;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"printid\"]/div[2]/div/div/div[1]/span[3]")
	public static WebElement orderNumber;
	
	
	public void studentInfo(DataInt dataInt) throws Exception {
		
		if (!driver.getTitle().contains("Parent Dashboard")) {
			implicitWait();
			Parent.click();
			Dashboard.click();
			 }
			Assert.assertTrue(driver.getTitle().contains("Parent Dashboard"));
			HighLightElement(Newstudentform);
			Newstudentform.click();
			BeforeONLY.click();
			Assert.assertTrue(driver.getTitle().contains("StudentApplication"));
			schoolSelection();
			LOG.info("Filling Student Info");
			Lastname.sendKeys(dataInt.getLastname());
			Firsttname.sendKeys(dataInt.getFirstname());
			Middletname.sendKeys(dataInt.getMiddlename());
			StateId.sendKeys(sevendigitrandomnumber());
			Grade.sendKeys(dataInt.getGrade());
			browsername();
			if(browserName.equalsIgnoreCase("firefox")){
				((JavascriptExecutor) driver).executeScript("window.scrollBy(0,300)","");
			}
			Dateofbirth.click();
			systemdateselect();
			Gender.click();
			YesImmunizationRecordatSchool.click();
			NoDoesthestudenthavea504.click();
			NoDoesthestudenthaveanIEP.click();
			NoDoesthestudentusemedicalequipment.click();
			LOG.info("Successfully filled student info details");
	}
	
	public void schoolSelection() throws Exception {
		

				WebElement item=new WebDriverWait(driver,10).until(ExpectedConditions.elementToBeClickable(Schoolname));
				Select listItem=new Select(item);
					for(Integer i=1;i<listItem.getOptions().size();i++) {
							listItem.selectByIndex(i);
							Thread.sleep(1000);
							String text=Noofspaces.getText();	
							//String data=listItem.getFirstSelectedOption().getText().concat(text);
							//System.out.println(data);
							if (text.isEmpty()) {
								break;	
								}

						}
		
	}
	
	
	public void legalParentorGuardian(DataInt dataInt) throws Exception {
		
			implicitWait();
			LOG.info("Filling Legal Parent/Guardian1");
			Home.sendKeys(dataInt.getHome());
			Parentemployer.sendKeys(dataInt.getParentemployer());
			Telephone.sendKeys(dataInt.getTelephone());
			LOG.info("Successfully filled Legal Parent/Guardian 1 details");
			LOG.info("Filling Legal Parent/Guardian2");
			LegalParentGuardianName1.sendKeys(dataInt.getLegalParentGuardianName1());
			Parentaddress1.sendKeys(dataInt.getParentaddress1());
			Zip1.sendKeys(dataInt.getZip1());
			Home1.sendKeys(dataInt.getHome1());
			Cell1.sendKeys(dataInt.getCell1());
			EmailAddress1.sendKeys(dataInt.getEmailAddress1());
			Parentemployer1.sendKeys(dataInt.getParentemployer1());
			Telephone1.sendKeys(dataInt.getTelephone1());
			LOG.info("Successfully filled Legal Parent/Guardian 2 details");
		
	}
	
	public void emergencyContacts(DataInt dataInt) throws Exception {
		
			LOG.info("Filling Emergency Contacts");
			Name.sendKeys(dataInt.getName());
			Relationtochild.sendKeys(dataInt.getRelationtochild());
			Cell2.sendKeys(dataInt.getCell2());
			EmailAddress2.sendKeys(dataInt.getEmailAddress2());
			Name1.sendKeys(dataInt.getName1());
			Relationtochild1.sendKeys(dataInt.getRelationtochild1());
			Cell3.sendKeys(dataInt.getCell3());
			EmailAddress3.sendKeys(dataInt.getEmailAddress3());
			LOG.info("Successfully filled Emergency Contacts");
		
	}
	
	public void pickupAfterSchool(DataInt dataInt) throws Exception {
			
			LOG.info("Filling pickup persons details");
			Pickupname1.sendKeys(dataInt.getPickupname1());
			PickuppersonTelephone1.sendKeys(dataInt.getPickuppersonTelephone1());
			Pickupname2.sendKeys(dataInt.getPickupname2());
			PickuppersonTelephone2.sendKeys(dataInt.getPickuppersonTelephone2());
			Pickupname3.sendKeys(dataInt.getPickupname3());
			PickuppersonTelephone3.sendKeys(dataInt.getPickuppersonTelephone3());
			Pickupname4.sendKeys(dataInt.getPickupname4());
			PickuppersonTelephone4.sendKeys(dataInt.getPickuppersonTelephone4());
			Pickupname5.sendKeys(dataInt.getPickupname5());
			PickuppersonTelephone5.sendKeys(dataInt.getPickuppersonTelephone5());
			Pickupname6.sendKeys(dataInt.getPickupname6());
			PickuppersonTelephone6.sendKeys(dataInt.getPickuppersonTelephone6());
			Pickupname7.sendKeys(dataInt.getPickupname7());
			PickuppersonTelephone7.sendKeys(dataInt.getPickuppersonTelephone7());			
			Pickupname8.sendKeys(dataInt.getPickupname8());
			PickuppersonTelephone8.sendKeys(dataInt.getPickuppersonTelephone8());				
			Pickupname9.sendKeys(dataInt.getPickupname9());
			PickuppersonTelephone9.sendKeys(dataInt.getPickuppersonTelephone9());
			Pickupname10.sendKeys(dataInt.getPickupname10());
			PickuppersonTelephone10.sendKeys(dataInt.getPickuppersonTelephone10());
			LOG.info("Successfully filled  pickup persons details");
		
	}	
	
	public void medicalConditions(DataInt dataInt) throws Exception {
			
			LOG.info("Filling Medical Conditions details");
			browsername();
			implicitWait();
			if (browserName.equalsIgnoreCase("firefox")|| browserName.equalsIgnoreCase("internet explorer")) {
				((JavascriptExecutor)driver).executeScript("window.scrollBy(0,350)","");
				waitForSeconds(3);}
			Noknownhealthproblems.click();
			LOG.info("Successfully filled  Medical Conditions details");
		
	}
	
	public void signatureDate(DataInt dataInt) throws Exception {
		
			LOG.info("Entering details of name,signature and date");
			Parentorgurdain.sendKeys(dataInt.getParentorGuardian());
			browsername();
			implicitWait();
			if (browserName.equalsIgnoreCase("internet explorer")) {
				((JavascriptExecutor)driver).executeScript("window.scrollBy(0,-250)","");
				   }
			Signature.sendKeys(dataInt.getSignatureLegalParentorGuardian());
			browsername();
			if (browserName.equalsIgnoreCase("firefox")) {
				((JavascriptExecutor)driver).executeScript("window.scrollBy(0,150)","");
				}
			Date.click();
			systemdateselect();
			LOG.info("Entered details of name,signature and date");
			TermsandConditions.click();
			LOG.info("Accepted Terms&Conditions");
			Submit.click();
			LOG.info("Student Form Submited Successfully");
			
		
	}
	
	public void paymentProcess(DataInt dataInt) throws Exception{
		
			if (driver.getTitle().contains("Student Payment")){
				LOG.info("Entering Payment Info");
				paymentDetails(dataInt);
			   }
	 }
	
	public void paymentDetails(DataInt dataInt) throws Exception {
		
			implicitWait();
			Cardtype.sendKeys(dataInt.getCardtype());
			Cardnumber.sendKeys(dataInt.getCardnumber());
			Month.sendKeys(dataInt.getMonth());
			Year.sendKeys(dataInt.getYear());
			Cvv.sendKeys(dataInt.getCVV());
			Paynow.click();
			waitForSeconds(9);
			paymentConfirmation();
		
	}
	
	public void paymentConfirmation()throws Exception{
		
		     if (driver.getTitle().contains("Student Payment Confirmation")) {
		    	 explicitWaitVisible(printpage);
		    	 String num=orderNumber.getText();
		    	 System.out.println(num);
		    	 LOG.info("Odernumber generated ");
		    	 Parent.click();
		    	 Dashboard.click();
		    	 statusAfterPayment();
			}
		
	
	}
	
	public void statusAfterPayment()throws Exception{
		
		         implicitWait();
		         WebElement mytable = driver.findElement(By.xpath("//*[@id=\"studetailslist\"]/div[1]/table"));
			    	//To locate rows of table. 
			    	List < WebElement > rows_table = mytable.findElements(By.tagName("tr"));
			    	//To calculate no of rows In table.
			    	int rows_count = rows_table.size();
			    	//Loop will execute till the last row of table.
			    	for (int row = 0; row < rows_count; row++) {
			    	    //To locate columns(cells) of that specific row.
			    	    List < WebElement > Columns_row = rows_table.get(row).findElements(By.tagName("td"));
			    	    //To calculate no of columns (cells). In that specific row.
			    	    int columns_count = Columns_row.size();
			    	    //System.out.println("Number of cells In Row " + row + " are " + columns_count);
			    	    //Loop will execute till the last cell of that specific row.
			    	    for (int column = 0; column < columns_count; column++) {
			    	        // To retrieve text from that specific cell.
			    	        //String celtext = Columns_row.get(column).getText();
			    	       // System.out.println("Cell Value of row number " + row + " and column number " + column + " Is " + celtext);
			    	        if (row == 1 && column == 8) {
			    	        	  String status = Columns_row.get(column).getText();
			    	        	 // System.out.println(status);
		                          Assert.assertEquals(status, "Admitted");
		                          LOG.info("Student Admitted Successfully");
			    	            }
			    	     
			    	      }
	             }
	   }
	
	
	
}