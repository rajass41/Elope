package com.ep.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import com.ep.pagefactory.CommonBase;


public class StudentFormPageObjects extends CommonBase{

	protected StudentFormPageObjects(WebDriver driver) {
		super(driver);
	}

	
	@FindBy(how = How.XPATH, using = "html/body/div[1]/section[1]/div/div/form/div/div/div/div[2]/div/div/div/div/p/a[1]")      
	public static WebElement Newstudentform;
	
	@FindBy(how = How.XPATH, using = "/html/body/div[1]/section[1]/div/div/div/div/form/div/div[2]/div/div/div[1]/div/div[1]/input")
	public  static WebElement BeforeONLY;
	
	@FindBy(how = How.XPATH, using = "/html/body/div[1]/section[1]/div/div/div/div/form/div/div[2]/div/div/div[1]/div/div[2]/input")
	public  static WebElement AfterONLy;
	
	@FindBy(how = How.XPATH, using = "/html/body/div[1]/section[1]/div/div/div/div/form/div/div[2]/div/div/div[1]/div/div[3]/input")
	public static WebElement BeforeandAfter;
	
	@FindBy(how = How.ID, using = "SiteId")
	public  static WebElement Schoolname;
	
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
	
	@FindBy(how = How.XPATH, using = "/html/body/div[1]/section[1]/div/div/div/div/form/div/div[2]/div/div/div[4]/div[47]/div[2]/input")
	public static WebElement Noknownhealthproblems;
	
	@FindBy(how = How.XPATH, using = "/html/body/div[1]/section[1]/div/div/div/div/form/div/div[2]/div/div/div[4]/div[47]/div[3]/input")
	public static WebElement ADHD;
	
	@FindBy(how = How.XPATH, using = "/html/body/div[1]/section[1]/div/div/div/div/form/div/div[2]/div/div/div[4]/div[47]/div[4]/input[1]")
	public static WebElement Surgery;
	
	@FindBy(how = How.ID, using = "surgerydate")
	public static WebElement Surgerydate;
	
	@FindBy(how = How.ID, using = "surgerytype")
	public static WebElement surgerytype;
	
	@FindBy(how = How.XPATH, using = "/html/body/div[1]/section[1]/div/div/div/div/form/div/div[2]/div/div/div[4]/div[47]/div[5]/input")
	public static WebElement Tuberculosis;
	
	@FindBy(how = How.XPATH, using = "/html/body/div[1]/section[1]/div/div/div/div/form/div/div[2]/div/div/div[4]/div[47]/div[6]/input")
	public static WebElement AnxietyAttacks;
	
	@FindBy(how = How.XPATH, using = "/html/body/div[1]/section[1]/div/div/div/div/form/div/div[2]/div/div/div[4]/div[47]/div[7]/input")
	public static WebElement Cancer;
	
	@FindBy(how = How.XPATH, using = "/html/body/div[1]/section[1]/div/div/div/div/form/div/div[2]/div/div/div[4]/div[47]/div[8]/input")
	public static WebElement Asthma;
	
	@FindBy(how = How.XPATH, using = "/html/body/div[1]/section[1]/div/div/div/div/form/div/div[2]/div/div/div[4]/div[47]/div[9]/input")
	public static WebElement Nosebleeds;
	
	@FindBy(how = How.XPATH, using = "/html/body/div[1]/section[1]/div/div/div/div/form/div/div[2]/div/div/div[4]/div[47]/div[10]/input")
	public static WebElement Epilepsy;
	
	@FindBy(how = How.XPATH, using = "/html/body/div[1]/section[1]/div/div/div/div/form/div/div[2]/div/div/div[4]/div[47]/div[11]/input[1]")
	public static WebElement Allergies;
	
	@FindBy(how = How.ID, using = "Allergiescomments")
	public static WebElement AllergiesType;
	
	@FindBy(how = How.XPATH, using = "/html/body/div[1]/section[1]/div/div/div/div/form/div/div[2]/div/div/div[4]/div[47]/div[12]/input")
	public static WebElement Sinusitis;
	
	@FindBy(how = How.XPATH, using = "/html/body/div[1]/section[1]/div/div/div/div/form/div/div[2]/div/div/div[4]/div[47]/div[13]/input")
	public static WebElement Seizuresconvulsions;
	
	@FindBy(how = How.XPATH, using = "/html/body/div[1]/section[1]/div/div/div/div/form/div/div[2]/div/div/div[4]/div[47]/div[14]/input")
	public static WebElement EyeProblems;
	
	@FindBy(how = How.XPATH, using = "/html/body/div[1]/section[1]/div/div/div/div/form/div/div[2]/div/div/div[4]/div[47]/div[15]/input")
	public static WebElement Heartproblems;
	
	@FindBy(how = How.XPATH, using = "/html/body/div[1]/section[1]/div/div/div/div/form/div/div[2]/div/div/div[4]/div[47]/div[16]/input")
	public static WebElement Diabetes;
	
	@FindBy(how = How.XPATH, using = "/html/body/div[1]/section[1]/div/div/div/div/form/div/div[2]/div/div/div[4]/div[47]/div[17]/input")
	public static WebElement Hearingdifficulties;
	
	@FindBy(how = How.XPATH, using = "/html/body/div[1]/section[1]/div/div/div/div/form/div/div[2]/div/div/div[4]/div[47]/div[18]/input")
	public static WebElement Emotionaldifficulties;
	
	@FindBy(how = How.XPATH, using = "/html/body/div[1]/section[1]/div/div/div/div/form/div/div[2]/div/div/div[4]/div[47]/div[19]/input")
	public static WebElement KidneyProblems;
	
	@FindBy(how = How.XPATH, using = "/html/body/div[1]/section[1]/div/div/div/div/form/div/div[2]/div/div/div[4]/div[47]/div[20]/input")
	public static WebElement Speechdifficulties;
	
	@FindBy(how = How.XPATH, using = "/html/body/div[1]/section[1]/div/div/div/div/form/div/div[2]/div/div/div[4]/div[47]/div[21]/input[1]")
	public static WebElement Poliomyelitis;
	
	@FindBy(how = How.ID, using = "poliyodate")
	public static WebElement Poliomyelitisdate;
	
	@FindBy(how = How.XPATH, using = "/html/body/div[1]/section[1]/div/div/div/div/form/div/div[2]/div/div/div[4]/div[47]/div[22]/input")
	public static WebElement Hemophilia;
	
	@FindBy(how = How.XPATH, using = "/html/body/div[1]/section[1]/div/div/div/div/form/div/div[2]/div/div/div[4]/div[47]/div[23]/input")
	public static WebElement SickleCellAnemia;
	
	@FindBy(how = How.XPATH, using = "/html/body/div[1]/section[1]/div/div/div/div/form/div/div[2]/div/div/div[4]/div[47]/div[24]/input[1]")
	public static WebElement RheumaticFever;
	
	@FindBy(how = How.ID, using = "mendicalDate")
	public static WebElement RheumaticFeverdate;
	
	@FindBy(how = How.XPATH, using = "/html/body/div[1]/section[1]/div/div/div/div/form/div/div[2]/div/div/div[4]/div[47]/div[25]/input")
	public static WebElement Hypertensionhighbloodpressure;
	
	@FindBy(how = How.XPATH, using = "/html/body/div[1]/section[1]/div/div/div/div/form/div/div[2]/div/div/div[4]/div[47]/div[26]/input")
	public static WebElement Hypotensionlowbloodpressure;
	
	@FindBy(how = How.XPATH, using = "/html/body/div[1]/section[1]/div/div/div/div/form/div/div[2]/div/div/div[4]/div[47]/div[27]/input[1]")
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
	
	@FindBy(how = How.XPATH, using = "/html/body/div[1]/header/div[2]/div/div[1]/ul/li/a/span")
	public static WebElement Nameofparent;
	
	@FindBy(how = How.XPATH, using = "/html/body/div[1]/header/div[2]/div/div[1]/ul/li/ul/li[3]/a")
	public static WebElement Studentdetails;
	
	@FindBy(how = How.XPATH, using = "/html/body/div[1]/section[1]/div/div/form/div/div/div/div[2]/div/div/div/div/div[2]/div/div[1]/table/tbody/tr[1]/td[2]/input")
	public static WebElement Selectbox;
	
	@FindBy(how = How.ID, using = "btnPay")
	public static WebElement Makepayment;
	
}
