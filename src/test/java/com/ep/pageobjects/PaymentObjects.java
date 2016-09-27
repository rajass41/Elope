package com.ep.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import com.ep.pagefactory.CommonBase;

public class PaymentObjects extends CommonBase {

	protected PaymentObjects(WebDriver driver) {
		super(driver);
		
	}

	public static WebElement cardtype(WebDriver driver){
		webelement = driver.findElement(By.id("CardType"));
        return webelement;
        }
	public static WebElement cardnumber(WebDriver driver){
		webelement = driver.findElement(By.id("CardNumber"));
        return webelement;
        }
	public static WebElement month(WebDriver driver){
		webelement = driver.findElement(By.id("ExpiryMonth"));
        return webelement;
        }
	
	public static WebElement year(WebDriver driver){
		webelement = driver.findElement(By.id("ExpiryYear"));
        return webelement;
        }
	
	
	public static WebElement cvv(WebDriver driver){
		webelement = driver.findElement(By.id("CVV"));
        return webelement;
        }
	
	public static WebElement paynow(WebDriver driver){
		webelement = driver.findElement(By.id("btncheckout"));
        return webelement;
        }
}
