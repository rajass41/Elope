package com.ep.pagefactory;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
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
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.sikuli.script.Screen;
import com.ep.utilities.PropertiesFileReader;


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
	public static Properties CONFIG = null;
	public static WebDriver driver;
	public static WebElement webelement = null;
	public Screen s = new Screen();
	
	
	
	// CommonBase File
	
	public WebDriverWait dwait;
	String[] dialog;
	protected String url = null;
	protected String browser;
	public final int elementTimeOut = Integer.parseInt(PropertiesFileReader.getproperty("element.time.out"));
	public int windowTimeOut = Integer.parseInt(PropertiesFileReader.getproperty("window.time.out"));
			

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
		if (browser.equalsIgnoreCase("IE")) {
			// Create the DesiredCapability object of InternetExplorer
			DesiredCapabilities capabilities = DesiredCapabilities.internetExplorer();
			// Setting this capability will make your tests unstable and hard to debug.
			capabilities.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS,false);
			//This will move the mouse pointer to the location where the operation is being performed on screen.
			capabilities.setCapability("requireWindowFocus", true);
			capabilities.setCapability("enablePersistentHover", false);
			System.setProperty(
					"webdriver.ie.driver",
					System.getProperty("user.dir")
							+ System.getProperty("file.separator")
							+ "BrowserDrivers"
							+ System.getProperty("file.separator")
							+ "IEDriverServer.exe");
			driver = new InternetExplorerDriver(capabilities);
			driver.get(url);

		} else if (browser.equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver(FirefoxDriverProfile());
			driver.get(url);

		} else if (browser.equalsIgnoreCase("chrome")) {
			System.setProperty(
					"webdriver.chrome.driver",
					System.getProperty("user.dir")
							+ System.getProperty("file.separator")
							+ "BrowserDrivers"
							+ System.getProperty("file.separator")
							+ "chromedriver.exe");
			driver = new ChromeDriver();
			driver.get(url);

		}else if (browser.equalsIgnoreCase("safari")) {
			System.setProperty("webdriver.safari.driver",
					System.getProperty("user.dir")
					       + System.getProperty("file.separator")
					       + "BrowserDrivers"
					       + System.getProperty("file.separator")
					       +"SafariDriver.safariextz ");
			driver = new SafariDriver();
			driver.get(url);
			                
			
		}
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
		Thread.sleep(3000);
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
	

	public void mouseOver(WebElement parentElement, WebElement childElement)
			throws Exception {
		LOG.info("Inside the Mouse Over Method");
		Actions action = new Actions(driver);
		Thread.sleep(2000);
		action.moveToElement(parentElement).perform();
		// Thread.sleep(1000)
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
		String v = cap.getVersion().toString();
		LOG.info("OS version is" + v);

	}

	
	public String gettimestamp() {
		timeStamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss")	.format(new Date());
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
		 Session session = Session.getDefaultInstance(props);			 
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
			 		+ "    Please Find The Attached Automation Report File dowlnload and then open it!"
			 		+ "\n"
			 		+ "\n"
			 		+ "\n"
			 		+"Thanks&Regards"
			 		+"\n"
			 		+"\n"
			 		+"Manikanta");
			 Multipart multipart = new MimeMultipart();
			 multipart.addBodyPart(objMessageBodyPart);
			 objMessageBodyPart = new MimeBodyPart();
			 String filename = "E:/Seleniumeclipsewoekspace/ElopParentProject/test-output/Extent.html";        
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
	
	}
