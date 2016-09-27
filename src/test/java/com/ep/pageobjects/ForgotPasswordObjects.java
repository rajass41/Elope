package com.ep.pageobjects;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import com.ep.pagefactory.CommonBase;

public class ForgotPasswordObjects extends CommonBase {

	public ForgotPasswordObjects(WebDriver driver) {
		super(driver);
	}
	
	
	public static WebElement forgotpswd(WebDriver driver){
		webelement = driver.findElement(By.xpath("/html/body/div/section/div/div/form/div/div/a[1]"));
        return webelement;
        }
	public static WebElement email(WebDriver driver){
		webelement = driver.findElement(By.id("Email"));
        return webelement;
        }
	
	
	public static WebElement submit(WebDriver driver){
		webelement = driver.findElement(By.id("btnsubmit"));
        return webelement;
        }
     }
	
