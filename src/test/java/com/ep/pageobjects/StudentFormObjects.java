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

}
