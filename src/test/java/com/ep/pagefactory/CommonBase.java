package com.ep.pagefactory;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Properties;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.activation.FileDataSource;
import javax.mail.BodyPart;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Multipart;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.sikuli.script.Screen;

import com.ep.utilities.PropertiesFileReader;
import com.ep.pagefactory.CommonBase;



/**
 * 
 * 
 * This Class is the base class for the entire script the driver is initialized here
 * 
 * 
 */

public class CommonBase {
	
	public String timeStamp;
	public String browserName;
	public String sikulipath = System.getProperty("user.dir");
	public String screenshot = System.getProperty("user.dir") + "_Screenshot";
	public String str;
	public String snum;
	public String excep;
	public String order;
	public String today;
	public String randomemail;
	public static Properties CONFIG = null;
	public static WebDriver driver;
	public static WebElement webelement = null;
	public Screen s = new Screen();
	
	
	// CommonBase File
	
	public WebDriverWait dwait;
	String[] dialog;
	protected String url = null;
	protected String browser;
	
	public final int elementTimeOut = Integer.parseInt(PropertiesFileReader.readvalueOfKey("element.time.out"));
	public int windowTimeOut = Integer.parseInt(PropertiesFileReader.readvalueOfKey("window.time.out"));
			

	public static final Logger LOG = Logger.getLogger(CommonBase.class);

	@SuppressWarnings("static-access")//to suppress warnings relative to incorrect static access
	protected CommonBase(WebDriver driver) {
		if (this.driver == null) {
			this.driver = driver;
		}
		dwait = new WebDriverWait(driver, 20);
	}


	public CommonBase(String url, String browser) {

		createWebDriver(url, browser);

	}
	

	public void createWebDriver(String url, String browser) {

		try {
			this.url = url;
			driver = initDriver(url, browser);
			driver.manage().timeouts().implicitlyWait(elementTimeOut, TimeUnit.SECONDS);
					
		} catch (Exception exec) {

		}
	}
	

	public WebDriver initDriver(String url, String browser) throws Exception {
		
		if (browser.equalsIgnoreCase("ie")|| browser.equalsIgnoreCase("internet explorer")) {
			// Create the DesiredCapability object of InternetExplorer
			DesiredCapabilities capabilities = DesiredCapabilities.internetExplorer();
			// Setting this capability will make your tests unstable and hard to debug.
			capabilities.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS,false);
			//This will move the mouse pointer to the location where the operation is being performed on screen.
			capabilities.setCapability("requireWindowFocus", true);
			capabilities.setCapability("enablePersistentHover", false);
			capabilities.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
			System.setProperty(
					"webdriver.ie.driver",
					System.getProperty("user.dir")
							+ System.getProperty("file.separator")
							+ "BrowserDrivers"
							+ System.getProperty("file.separator")
							+ "IEDriverServer.exe");
			driver = new InternetExplorerDriver(capabilities);
			//driver.manage().window().setSize(new Dimension(1024,768));
			driver.get(url);

		} else if (browser.equalsIgnoreCase("firefox")||browser.equalsIgnoreCase("mozilla")||browser.equalsIgnoreCase("mozilla firefox")) {
			
			/*DesiredCapabilities capabilities=DesiredCapabilities.firefox();
			capabilities.setCapability("marionette", false);
			System.setProperty(
					"webdriver.gecko.driver",
					System.getProperty("user.dir")
							+ System.getProperty("file.separator")
							+ "BrowserDrivers"
							+ System.getProperty("file.separator")
							+ "geckodriver.exe");*/
			
			driver = new FirefoxDriver(FirefoxDriverProfile());
			driver.get(url);

		} else if (browser.equalsIgnoreCase("chrome")||browser.equalsIgnoreCase("google chrome")) {
			DesiredCapabilities handlSSLErr = DesiredCapabilities.chrome () ;      
			handlSSLErr.setCapability (CapabilityType.ACCEPT_SSL_CERTS, true);
			System.setProperty(
					"webdriver.chrome.driver",
					System.getProperty("user.dir")
							+ System.getProperty("file.separator")
							+ "BrowserDrivers"
							+ System.getProperty("file.separator")
							+ "chromedriver.exe");
			driver = new ChromeDriver();
			driver.get(url);

		}else if (browser.equalsIgnoreCase("safari")||browser.equalsIgnoreCase("apple safari")) {
			System.setProperty("webdriver.safari.driver",
					System.getProperty("user.dir")
					       + System.getProperty("file.separator")
					       + "BrowserDrivers"
					       + System.getProperty("file.separator")
					       +"SafariDriver.safariextz ");
			driver = new SafariDriver();
			driver.get(url);
			                
			
		}else if (browser.equalsIgnoreCase("microsoft edge")||browser.equalsIgnoreCase("edge")) {
			System.setProperty("webdriver.edge.driver",
					System.getProperty("user.dir")
					       + System.getProperty("file.separator")
					       + "BrowserDrivers"
					       + System.getProperty("file.separator")
					       +"MicrosoftWebDriver.exe ");
			
			//System.setProperty("webdriver.edge.driver",new File (serverpath).getAbsolutePath());
			driver = new EdgeDriver();
			driver.get(url);
			          	
		}/*else {
			throw new IllegalArgumentException("The Browser Type is Undefined");
		}*/
     	driver.manage().window().maximize();
		return driver;
	}

	
	public static FirefoxProfile FirefoxDriverProfile() throws Exception {
		FirefoxProfile profile = new FirefoxProfile();
		profile.setPreference("browser.download.folderList", 2);
		profile.setPreference("browser.download.manager.showWhenStarting",false);
		profile.setPreference("browser.download.dir",System.getProperty("user.dir") + "_Downloads");
		profile.setPreference(
				"browser.helperApps.neverAsk.openFile",
				"application/octet-stream;application/pdf,text/csv,application/x-msexcel,application/excel,application/x-excel,application/vnd.ms-excel,image/png,image/jpeg,text/html,text/plain,application/msword,application/xml");
		profile.setPreference(
				"browser.helperApps.neverAsk.saveToDisk",
				"application/octet-stream;application/pdf,text/csv,application/x-msexcel,application/excel,application/x-excel,application/vnd.ms-excel,image/png,image/jpeg,text/html,text/plain,application/msword,application/xml");
		profile.setPreference("pdfjs.disabled", true);
		profile.setPreference("plugin.scan.Acrobat", "99.0");
		profile.setPreference("plugin.scan.plid.all", false);
		profile.setPreference("browser.helperApps.alwaysAsk.force", false);
		profile.setPreference("browser.download.manager.alertOnEXEOpen", false);
		profile.setPreference("browser.download.manager.focusWhenStarting",false);
		profile.setPreference("browser.download.manager.useWindow", false);
		profile.setPreference("browser.download.manager.showAlertOnComplete",false);
		profile.setPreference("browser.download.manager.closeWhenDone", false);
		profile.setAcceptUntrustedCertificates(true);
		profile.setAssumeUntrustedCertificateIssuer(false);
		
		/*profile.setPreference("javascript.enabled", true);
		profile.setPreference("dom.max_chrome_script_run_time", 0);
		profile.setPreference("dom.max_script_run_time", 0);
		profile.setPreference("browser.startup.homepage_override.mstone", "ignore");
		profile.setPreference("startup.homepage_welcome_url.additional",  "about:blank");
		profile.setPreference("startup.homepage_welcome_url", "about:blank");*/
		return profile;

	}

	
	public void quitDriver() {
		driver.close();
	}
	
	
	public int switchToNewWindow(String sTitle) {

		String parentWindow = driver.getWindowHandle();		//To get the window handle of the current window
		Set<String> allWindows = driver.getWindowHandles(); //To get the window handle of all the current windows.
		for (String childWindows : allWindows) {
			if (!childWindows.equals(parentWindow)) {
				driver.switchTo().window(childWindows);
				break;
			}
		}
		return 0;
	}

	
	public void switchWindowUsingTitle(String title) {

		String handle = driver.getWindowHandle();

		for (int i = 1; i <= windowTimeOut; i++) {
			for (String windowHandler : driver.getWindowHandles()) {
				driver.switchTo().window(windowHandler);
				if (driver.getTitle().contains(title)) {
				return;
				}
			}
			if (i == windowTimeOut) {
				driver.switchTo().window(handle);
				throw new NoSuchElementException(
						"No window available with given title : " + title);
			}
			try {
				Thread.sleep(1000L);
			} catch (InterruptedException ie) {

				throw new RuntimeException("Exception occured in sleep method");
			}
		}
	}
	

	public void scrollPage() throws InterruptedException {
		((JavascriptExecutor) driver).executeScript("window.scrollBy(0,500)");
		waitForSeconds(3);
		((JavascriptExecutor) driver).executeScript("window.scrollBy(500,0)");

	}

	
	public void switchbackToMainWindow() {

		Set<String> windowIterator = driver.getWindowHandles();
		Object[] handles = windowIterator.toArray();
		driver.switchTo().window(handles[0].toString());
	}

	
	@SuppressWarnings("static-access")//to suppress warnings relative to incorrect static access
	public WebElement findElement(By by) throws Exception {
		WebElement element = null;
		for (int i = 1; i <= elementTimeOut; i++) {
			try {
				element = this.driver.findElement(by);
			} catch (WebDriverException e) {
				if (i == elementTimeOut) {
					throw e;
				}

				try {
					Thread.sleep(1000L);
				} catch (InterruptedException ie) {

					throw new RuntimeException(
							"Exception occured in sleep method");
				}
			}
		}
		if (element != null) {
			return element;
		} else {
			throw new WebDriverException("Cannot find element with "
					+ by.getClass());
		}

	}
	
	
	public static void waitForSeconds(int Sec){
		
		long start = System.currentTimeMillis();//returns the current time in milliseconds
		//System.out.println("stsrt Time "+start);
		long stop = start+Sec*1000;
		//System.out.println("Stop Time "+stop);
		while(System.currentTimeMillis()<stop){
			
		}		
	}
	
	
	public boolean isElementExist(WebElement elemetName) {

		boolean present = true;
		try {
			elemetName.isDisplayed();
			present = true;

		} catch (NoSuchElementException e) {
			present = false;
		}

		return present;
	}

	
	public static boolean hasTextContainsString(String actual, String expected) throws Exception {
			
					boolean result = false;
						if (actual.contains(expected)) {
								result = true;
								}
							return result;
				}
	

	public String getTitle() {
		return driver.getTitle();
	}

	
	public void clickButtoninputValueContaintext(String text) throws Exception {
		findElement(By.xpath("//input[@value='" + text + "']")).click();
	}

	
	public WebElement waitforElementToAppear(WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver, 60);
		WebElement ele = wait.until(ExpectedConditions.visibilityOf(element));
		return ele;
	}
	

	public void mouseOver(WebElement parentElement, WebElement childElement)throws Exception {
			
		LOG.info("Inside the Mouse Over Method");
		Actions action = new Actions(driver);
		waitForSeconds(2);
		action.moveToElement(parentElement).perform();
		waitForSeconds(1);
		action.moveToElement(childElement).perform();

	}

	
	public boolean checkAlert() {
		try {
			str = driver.switchTo().alert().getText();
			driver.switchTo().alert().accept();
			return true;

		} catch (NoAlertPresentException Ex) {

		}
		return false;

	}
	

	public void browsername() {

		Capabilities cap = ((RemoteWebDriver) driver).getCapabilities();
		browserName = cap.getBrowserName().toLowerCase();
		LOG.info("BrowserName is" + browserName);
		String os = cap.getPlatform().toString();
		LOG.info("OS is" + os);
		String ver = cap.getVersion().toString();
		LOG.info("OS version is" + ver);

	}

	
	public String gettimestamp() {
		timeStamp = new SimpleDateFormat("MM/dd/YYYY").format(new Date());
		LOG.info("TimeStamp" + timeStamp);
		
		return timeStamp;
	}

	
	public void robot() throws Exception {
		
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_A);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_A);
		robot.keyPress(KeyEvent.VK_DELETE);
		robot.keyRelease(KeyEvent.VK_DELETE);
	}

	
	public Boolean waitforElementTotype(WebElement con, String text) {
		WebDriverWait wait = new WebDriverWait(driver, 40);
		Boolean tr = wait.until(ExpectedConditions.textToBePresentInElement(
				con, text));
		return tr;
	}

	
	public Boolean switchtonewtab() {
		try {
			ArrayList<String> tabs2 = new ArrayList<String>(driver.getWindowHandles());
			driver.switchTo().window(tabs2.get(1));
			return true;
		} catch (Exception e) {
			
		}
		return false;
	}
	

	public Boolean switchbacktotab() {
		try {
			ArrayList<String> tabs2 = new ArrayList<String>(driver.getWindowHandles());
			driver.close();
			driver.switchTo().window(tabs2.get(0));
			return true;
			
		} catch (Exception e) {
			
		}
		return false;

	}
	

	public boolean getscreenshot() {
		try {
			File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			File browseFile = new File((screenshot + File.separator + getnum() + ".png"));
			FileUtils.moveFile(scrFile, browseFile);
			return true;
		} catch (Exception e) {
			
		}
		return false;

	}

	
	public String getnum() {
		order = driver.findElement(By.id("orderNumber")).getText();
		return order;
	}
	
		
	public boolean getFailedScreenshot() {
			try {
				File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
				File browseFile = new File((screenshot + File.separator + gettimestamp() + ".png"));
				FileUtils.moveFile(scrFile, browseFile);
				return true;
			} catch (Exception e) {
				
			}
			return false;

		}
		
		
	public String getfuturedate() {
			   Date tomorrow = new Date(System.currentTimeMillis()+ (1000 * 60 * 60 * 24 * 7));
			   System.out.println(tomorrow);
			SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy");
			   String s = formatter.format(tomorrow);
			   System.out.println(s);
			return s;

			}
	
	public void emailreport(){		 
		 sendPDFReportByGMail("ebiztesting57@gmail.com", "1111111!", "mani6747@gmail.com", "Elop Parent Automation Report", "");
	 }	 
	  
	 private static void sendPDFReportByGMail(String from, String pass, String to, String subject, String body) {
		 System.out.println("Waiting for generating report....");
		 System.setProperty("javax.net.ssl.trustStore", "C://Program Files//Java//jre1.8.0_101//lib//security//cacerts");
		 System.setProperty("javax.net.ssl.trustStorePassword", "changeit");
		 Properties props = System.getProperties();		 
		 String host = "smtp.gmail.com";
	     props.put("mail.smtp.starttls.enable", "true");
	     props.put("mail.smtp.host", host);
	     props.put("mail.smtp.user", from);
	     props.put("mail.smtp.password", pass);
	     props.put("mail.smtp.auth", "true");	  
	     props.put("mail.smtp.socketFactory.port", "465");  
	     props.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");   
	     props.put("mail.smtp.auth", "true");  
	     props.put("mail.smtp.port", "465");  
		 Session session = Session.getDefaultInstance(props,new javax.mail.Authenticator() {
			 
				protected PasswordAuthentication getPasswordAuthentication() {

				return new PasswordAuthentication("from","pass");

				}
			});			 
		 MimeMessage message = new MimeMessage(session);
		 
		try {
			 //Set from address
			 message.setFrom(new InternetAddress(from));
			 message.addRecipient(Message.RecipientType.TO, new InternetAddress(to));
			 //Set subject
			 message.setSubject(subject);
			 message.setText(body);
			 BodyPart objMessageBodyPart = new MimeBodyPart();
			 objMessageBodyPart.setText("Hi,"
			 		+ "\n"
			 		+ "\n"
			 		+ "      Please Find The Attached Automation Report File download and then open it!"
			 		+ "\n"
			 		+ "\n");
			 Multipart multipart = new MimeMultipart();
			 multipart.addBodyPart(objMessageBodyPart);
			 objMessageBodyPart = new MimeBodyPart();
			 String filename = "D:/ElopParentProject/test-output/Extent.html";        
			 File file = new File(filename);
			 //Create data source to attach the file in mail
			 DataSource source = new FileDataSource(file);
			 objMessageBodyPart.setDataHandler(new DataHandler(source));
			 objMessageBodyPart.setFileName(file.getName());
			 multipart.addBodyPart(objMessageBodyPart);
			 message.setContent(multipart);
			 Transport transport = session.getTransport("smtp");
			 transport.connect(host, from, pass);
			 transport.sendMessage(message, message.getAllRecipients());
			 transport.close();		 
		}
		catch (AddressException ae) {		 
			ae.printStackTrace();		 
		}
			 
		catch (MessagingException me) {		 
			me.printStackTrace();		 
		}
		System.out.println("Report Was Sent Successfully....");
}
	 
	//------------System Present Date select ------//
		
		
			public void  systemdateselect(){
				
				try {
					DateFormat dateformat = new SimpleDateFormat("d"); //date format
		            Date date = new Date();					
		            today = dateformat.format(date);   
		            WebElement dateWidget = driver.findElement(By.id("ui-datepicker-div")); //find the calendar
		            List<WebElement> columns=dateWidget.findElements(By.tagName("td"));  
		            //comparing the text of cell with today's date and clicking it.
		            for (WebElement cell : columns)
		            {
		               if (cell.getText().equals(today))
		               {
		                  cell.click();
		                  break;
		               }
		            }
				} catch (Exception e) {
					
				}
				
			}
			
			
			
	public static void scrollTo(WebDriver driver, WebElement element) {
		   ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);          
		    }
			
			
	//----------------Program to generate Random Email for signup-------------------
	
			public static enum ModeEmail {
				
				ALPHA, NUMERIC
			}

			public static String generateRandomStringemail(int length, ModeEmail alpha)throws Exception {
					

				StringBuffer buffer = new StringBuffer();
				String characters = "";

				switch (alpha) {

				case ALPHA:
					characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
					break;

				case NUMERIC:
					characters = "1234567890";
					break;
				}

				int charactersLength = characters.length();

				for (int i = 0; i < length; i++) {
					double index = Math.random() * charactersLength;
					buffer.append(characters.charAt((int) index));
				}
				return buffer.toString();
			}

			public String gettingEmailrandomly() throws Exception {
				
				for (int i = 0; i < 1; i++) {
					String alpha = CommonBase.generateRandomStringemail(6, CommonBase.ModeEmail.ALPHA);
					String numeric = CommonBase.generateRandomStringemail(2, CommonBase.ModeEmail.NUMERIC);
					//String alpha2 = CommonBase.generateRandomStringemail(1, CommonBase.ModeEmail.ALPHA);
					//String numeric1 = CommonBase.generateRandomStringemail(2,CommonBase.ModeEmail.NUMERIC);		
					//String alpha3 = CommonBase.generateRandomStringemail(1, CommonBase.ModeEmail.ALPHA);
					//String numeric2 = CommonBase.generateRandomStringemail(3,CommonBase.ModeEmail.NUMERIC);
					//String alpha4 = CommonBase.generateRandomStringemail(1, CommonBase.ModeEmail.ALPHA);
					//randomemail = alpha.concat(numeric).concat(alpha2).concat(numeric1).concat(alpha3).concat(numeric2).concat(alpha4).concat("@gmail.com");
					randomemail=alpha.concat(numeric).concat("@gmail.com");
							
				}
				return randomemail;
			}			
	

			//-- Program to Drag and Drop--//
			
			
			public void dragAndDrop(WebElement sourceElement, WebElement destinationElement) {
				try {
					if (sourceElement.isDisplayed() && destinationElement.isDisplayed()) {
						Actions action = new Actions(driver);
						action.dragAndDrop(sourceElement, destinationElement).build().perform();
					} else {
						System.out.println("Element was not displayed to drag");
					}
				} catch (StaleElementReferenceException e) {
					System.out.println("Element with " + sourceElement + "or" + destinationElement + "is not attached to the page document "
							+ e.getStackTrace());
				} catch (NoSuchElementException e) {
					System.out.println("Element " + sourceElement + "or" + destinationElement + " was not found in DOM "+ e.getStackTrace());
				} catch (Exception e) {
					System.out.println("Error occurred while performing drag and drop operation "+ e.getStackTrace());
				}
			}
			
			
			
			
	
	}
