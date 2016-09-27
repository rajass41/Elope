package com.ep.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.ep.pagefactory.CommonBase;

public class ChangePasswordObjects extends CommonBase{

	public ChangePasswordObjects(WebDriver driver) {
		super(driver);
	
	}
	
	public static WebElement nameofparent(WebDriver driver){
		webelement = driver.findElement(By.cssSelector("span.username"));
        return webelement;
        }
	public static WebElement changepass(WebDriver driver){
		webelement = driver.findElement(By.linkText("Change Password"));
        return webelement;
        }
	public static WebElement CurrentPassword(WebDriver driver){
		webelement = driver.findElement(By.id("Password"));
        return webelement;
        }
	public static WebElement NewPassword(WebDriver driver){
		webelement = driver.findElement(By.id("NewPassword"));
        return webelement;
        }
	public static WebElement ConfirmPassword(WebDriver driver){
		webelement = driver.findElement(By.id("ConfirmPassword"));
        return webelement;
        }
	
	public static WebElement changepassword(WebDriver driver){
		webelement = driver.findElement(By.xpath("/html/body/div/section[1]/div/div/form/div/div/div/div[2]/div/div/div[4]/div/input"));
        return webelement;
        }
}

