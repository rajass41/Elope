package com.ep.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.ep.pagefactory.CommonBase;

public class ContactUsObjects extends CommonBase {

	public ContactUsObjects(WebDriver driver) {
		super(driver);
		
	}
	
	public static WebElement contact(WebDriver driver){
		webelement = driver.findElement(By.xpath("/html/body/div/header/div[2]/div/div[1]/a[2]"));
        return webelement;
        }
	
	public static WebElement Firstname(WebDriver driver){
		webelement = driver.findElement(By.id("Firstname"));
        return webelement;
        }
	
	public static WebElement Lastname(WebDriver driver){
		webelement = driver.findElement(By.id("Lastname"));
        return webelement;
        }
	
	public static WebElement emailid(WebDriver driver){
		webelement = driver.findElement(By.id("Email"));
        return webelement;
        }
	public static WebElement ph(WebDriver driver){
		webelement = driver.findElement(By.id("Phone"));
        return webelement;
        }
	public static WebElement Company(WebDriver driver){
		webelement = driver.findElement(By.id("Company"));
        return webelement;
        }
	public static WebElement City(WebDriver driver){
		webelement = driver.findElement(By.id("City"));
        return webelement;
        }
	
	public static WebElement State(WebDriver driver){
		webelement = driver.findElement(By.id("StateId"));
        return webelement;
        }
	public static WebElement Zip(WebDriver driver){
		webelement = driver.findElement(By.id("Zip"));
        return webelement;
        }
	
	public static WebElement comments(WebDriver driver){
		webelement = driver.findElement(By.id("Message"));
        return webelement;
        }
	public static WebElement submit(WebDriver driver){
		webelement = driver.findElement(By.id("submit"));
        return webelement;
        }
}
