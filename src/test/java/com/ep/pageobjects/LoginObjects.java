package com.ep.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import com.ep.pagefactory.CommonBase;


public class LoginObjects extends CommonBase {

	protected LoginObjects(WebDriver driver) {
		super(driver);
	}
	
	
	public static WebElement btnlogIn(WebDriver driver){
		webelement = driver.findElement(By.xpath("/html/body/header/nav/div/div[2]/ul/li[5]/a"));
        return webelement;
        }

	public static WebElement emailid(WebDriver driver){
		webelement = driver.findElement(By.id("EmailId"));
        return webelement;
        }
	public static WebElement password(WebDriver driver){
		webelement = driver.findElement(By.id("PassWord"));
        return webelement;
        }
	
	public static WebElement loginbutton(WebDriver driver){
		webelement = driver.findElement(By.xpath("html/body/div[1]/section/div/div/form/div/div/input[3]"));
        return webelement;
        }
	 
}
