package com.ep.pagefactory;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.ep.datainitialization.DataInt;

import org.testng.Assert;


public class StudentWaitingListForm extends StudentRegistration {

	public StudentWaitingListForm(WebDriver driver) {
		super(driver);
	}
	
	
	public void waitinglistformfill(DataInt dataInt) throws Exception {
		
			implicitWait();
			Newstudentform.click();
			SummerEnrichment.click();
			schoolSelection();
			Lastname.sendKeys(dataInt.getLastname());
			Firsttname.sendKeys(dataInt.getFirstname());
			Middletname.sendKeys(dataInt.getMiddlename());
			StateId.sendKeys(dataInt.getStateid());
			Grade.sendKeys(dataInt.getGrade());
			Dateofbirth.click();
			systemdateselect();
			Submit.click();
			implicitWait();
			statusAfterPayment();
			
		
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
					if (!text.isEmpty()) {
						break;	
						}

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
	    	        	 System.out.println(status);
                         Assert.assertEquals(status, "Waiting List");
                         LOG.info("Student is in Waiting List");
	    	            }
	    	     
	    	      }
        }
}

	

}
