package com.ep.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import com.ep.pagefactory.CommonBase;

public class StudentFormObjects extends CommonBase {

	protected StudentFormObjects(WebDriver driver) {
		super(driver);
		
	}
	
	public static WebElement newstudentform(WebDriver driver){
		webelement = driver.findElement(By.xpath("html/body/div[1]/section[1]/div/div/form/div/div/div/div[2]/div/div/div/div/p/a[1]"));
        return webelement;
        }
	
	public static WebElement beforeandafter(WebDriver driver){
		webelement = driver.findElement(By.xpath("html/body/div[1]/section[1]/div/div/div/div/form/div/div[2]/div/div/div[1]/div/div[3]/input"));
        return webelement;
        }
	
	public static WebElement schoolname(WebDriver driver){
		webelement = driver.findElement(By.xpath("html/body/div[1]/section[1]/div/div/div/div/form/div/div[2]/div/div/div[2]/div[1]/select"));
        return webelement;
        }
	public static WebElement lastname(WebDriver driver){
		webelement = driver.findElement(By.id("StudentLastName"));
        return webelement;
        }
	
	
	public static WebElement firsttname(WebDriver driver){
		webelement = driver.findElement(By.id("StudentFirstName"));
        return webelement;
        }
	public static WebElement middletname(WebDriver driver){
		webelement = driver.findElement(By.id("StudentMiddleName"));
        return webelement;
        }
	
	public static WebElement ssn(WebDriver driver){
		webelement = driver.findElement(By.id("SSN"));
        return webelement;
        }
	
	
	public static WebElement grade(WebDriver driver){
		webelement = driver.findElement(By.id("Grade"));
        return webelement;
        }
	
	public static WebElement studentId(WebDriver driver){
		webelement = driver.findElement(By.id("StudentId"));
        return webelement;
        }
	
	
	public static WebElement dateofbirth(WebDriver driver){
		webelement = driver.findElement(By.id("DateOfBirth"));
        return webelement;
        }
	
	public static WebElement gender(WebDriver driver){
		webelement = driver.findElement(By.id("GenderMale"));
        return webelement;
        }
	public static WebElement ImmunizationRecordatSchool(WebDriver driver){
		webelement = driver.findElement(By.id("NoImmunizationRecordatSchool"));
        return webelement;
        }
	
	public static WebElement studenthavea504(WebDriver driver){
		webelement = driver.findElement(By.id("NoDoesthestudenthavea504"));
        return webelement;
        }
	
	public static WebElement IEP(WebDriver driver){
		webelement = driver.findElement(By.id("NoDoesthestudenthaveanIEP"));
        return webelement;
        }
	public static WebElement medical(WebDriver driver){
		webelement = driver.findElement(By.id("NoDoesthestudentusemedicalequipment"));
        return webelement;
        }
	
	public static WebElement adress(WebDriver driver){
		webelement = driver.findElement(By.id("LegalParentGuardianAddress"));
        return webelement;
        }
	
	public static WebElement zip(WebDriver driver){
		webelement = driver.findElement(By.id("LegalParentGuardianZip"));
        return webelement;
        }
	
	public static WebElement home(WebDriver driver){
		webelement = driver.findElement(By.id("LegalParentGuardianHomeNumber"));
        return webelement;
        }
	
	public static WebElement cell(WebDriver driver){
		webelement = driver.findElement(By.id("LegalParentGuardianCellNumber"));
        return webelement;
        }
	
	public static WebElement email(WebDriver driver){
		webelement = driver.findElement(By.id("LegalParentGuardianEmail"));
        return webelement;
        }
	
	
	public static WebElement parentemployee(WebDriver driver){
		webelement = driver.findElement(By.id("LegalParentGuardianParentEmployee"));
        return webelement;
        }
	
	
	public static WebElement telephone(WebDriver driver){
		webelement = driver.findElement(By.id("LegalParentGuardianTelephone"));
        return webelement;
        }
	
	
	public static WebElement name(WebDriver driver){
		webelement = driver.findElement(By.id("EmergencyContactName"));
        return webelement;
        }
	
	public static WebElement relationtochild(WebDriver driver){
		webelement = driver.findElement(By.id("EmergencyContactRelationtochild"));
        return webelement;
        }
	
	
	public static WebElement cell1(WebDriver driver){
		webelement = driver.findElement(By.id("EmergencyContactCellNumber"));
        return webelement;
        }
	
	
	public static WebElement email1(WebDriver driver){
		webelement = driver.findElement(By.id("EmergencyContactEmail"));
        return webelement;
        }
	
	public static WebElement pickuppersonname(WebDriver driver){
		webelement = driver.findElement(By.id("PersonallowedName"));
        return webelement;
        }
	public static WebElement telephone1(WebDriver driver){
		webelement = driver.findElement(By.id("PersonallowedTelephone"));
        return webelement;
        }
	
	public static WebElement medicalcondition(WebDriver driver){
		webelement = driver.findElement(By.id("checklst_1"));
        return webelement;
        }
	
	public static WebElement parentorgurdain(WebDriver driver){
		webelement = driver.findElement(By.id("PrintLegalParentGuardian"));
        return webelement;
        }
	
	public static WebElement signature(WebDriver driver){
		webelement = driver.findElement(By.id("SignatureLegalParentGuardian"));
        return webelement;
        }
	
	public static WebElement date(WebDriver driver){
		webelement = driver.findElement(By.id("Date"));
        return webelement;
        }
	
	public static WebElement terms(WebDriver driver){
		webelement = driver.findElement(By.id("TermsandConditions"));
        return webelement;
        }
	
	public static WebElement submit(WebDriver driver){
		webelement = driver.findElement(By.id("btnsubmit"));
        return webelement;
        }
	
	
}
