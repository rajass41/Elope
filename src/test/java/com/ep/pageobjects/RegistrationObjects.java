package com.ep.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import com.ep.pagefactory.CommonBase;

public class RegistrationObjects extends CommonBase {
	
	protected RegistrationObjects(WebDriver driver) {
		super(driver);
	}

	public static WebElement btnregister(WebDriver driver){
		webelement = driver.findElement(By.xpath("/html/body/div/section/div/div/form/div/div/a[2]"));
        return webelement;
        }
	
	public static WebElement Firstname(WebDriver driver){
		webelement = driver.findElement(By.id("FirstName"));
        return webelement;
        }
	
	public static WebElement Lastname(WebDriver driver){
		webelement = driver.findElement(By.id("LastName"));
        return webelement;
        }
	
	public static WebElement address(WebDriver driver){
		webelement = driver.findElement(By.id("Address1"));
        return webelement;
        }
	
	public static WebElement phone(WebDriver driver){
		webelement = driver.findElement(By.id("PhoneNumber"));
        return webelement;
        }
	
	public static WebElement email(WebDriver driver){
		webelement = driver.findElement(By.id("EmailId"));
        return webelement;
        }
	
	public static WebElement Password(WebDriver driver){
		webelement = driver.findElement(By.id("PassWord"));
        return webelement;
        }
	
	public static WebElement Confirmpassword(WebDriver driver){
		webelement = driver.findElement(By.id("ConfirmPassword"));
        return webelement;
        }

	public static WebElement City(WebDriver driver){
		webelement = driver.findElement(By.id("City"));
        return webelement;
        }
	
	public static WebElement Zipcode(WebDriver driver){
		webelement = driver.findElement(By.id("ZipCode"));
        return webelement;
        }
	
	public static WebElement register(WebDriver driver){
		webelement = driver.findElement(By.id("btn-submit"));
        return webelement;
        }

}
