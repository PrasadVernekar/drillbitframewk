package com.drillbit.testCases;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import javax.mail.MessagingException;

import org.apache.commons.io.FileUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.*;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.openqa.selenium.TakesScreenshot;

import com.drillbit.utilities.ReadConfig;

public class BaseClass {
	ReadConfig readconfig = new ReadConfig();
	public String baseURL = readconfig.getApplicationURL();
	public String username = readconfig.getUsername();
	public String password = readconfig.getPassword();
	public static WebDriver driver;

	@Parameters("browser")
	@BeforeClass
	public void setup(String brw) {
		
		if (brw.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", readconfig.getChromePath());
			driver = new ChromeDriver();
		} else if (brw.equals("firefox")) {
			System.setProperty("webdriver.geckodriver.driver", readconfig.getFirefoxPath());
			driver = new FirefoxDriver();
		} else if (brw.equals("IE")) {
			System.setProperty("webdriver.IEdriver.driver", readconfig.getIEPath());
			driver = new InternetExplorerDriver();
		}
		driver.get(baseURL);

	}
	@AfterClass
	public void tearDown() {
		
		 driver.quit();
	}
}
	/*
	public void onTestFailure(ITestResult result) {
	    System.out.println("Method failed: " + result.getName());
	}


		public void onTestSkipped(ITestResult result) {
		System.out.println("Method skipped"+ result.getName());
		}

		public void onTestStart(ITestResult result) {
		System.out.println("Method started"+ result.getName());
		}

		public void onTestSuccess(ITestResult result) {
		System.out.println("Method passed"+ result.getName());
		}
		
		@AfterMethod

		public void ScreenShot(ITestResult result) throws MessagingException{

		//using ITestResult.FAILURE is equals to result.getStatus then it enter into if condition

		if(ITestResult.FAILURE==result.getStatus()){

			public void captureScreenShot(WebDriver driver, String tname) throws IOException {
				TakesScreenshot ts = (TakesScreenshot) driver;
				File source = ts.getScreenshotAs(OutputType.FILE);
				File target = new File(System.getProperty("user.dir") + "/Screenshots/" + tname + ".png");
				FileUtils.copyFile(source, target);
				System.out.println("Screenshot taken");
			}

		} 

		public void screenShot(ITestResult result) throws MessagingException{

		 

		if(ITestResult.FAILURE==result.getStatus()){

		 

		try{

		 

		// To create reference of TakesScreenshot

		 

		TakesScreenshot screenshot=(TakesScreenshot)driver;

		 

		// Call method to capture screenshot

		 

		// result.getName() will return name of test case so that screenshot name will be same as test case name

		 

		File src= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(src,new File(“filelocation”+result.getName()+”.png”));
		System.out.println(“screenshot is captured”);

		 

		//Sending mail

		 

		String receipientTo = “TOMAIL”;

		 

		//Sender’s Mail id

		 

		String senderFrom = “FROMMAIL”;

		 

		String path=”LOCATION”+result.getName()+”.png”;

		 

		//Getting System properties

		 

		Properties prop = System.getProperties();

		 

		//Setting up smtp host

		 

		prop.setProperty(“mail.smtp.host”, “smtp.gmail.com”);

		 

		//Creating a new session for smtp

		 

		Session session = Session.getDefaultInstance(prop);

		 

		MimeMessage msg = new MimeMessage(session);

		 

		//Instance of From Internet address

		 

		InternetAddress frmAddress = new InternetAddress(senderFrom);

		 

		//Instance of To Internet address

		 

		InternetAddress toAddress = new InternetAddress(receipientTo);

		 

		//Setting up sender’s address

		 

		msg.setFrom(frmAddress);

		 

		//Setting up recipient’s address

		 

		msg.addRecipient(Message.RecipientType.TO, toAddress);

		 

		//Setting email’s subject
		msg.setSubject(“Test Status Report”);

		 

		BodyPart msgBody = new MimeBodyPart();

		 

		//Setting email’s message body

		 

		msgBody.setText(“Failed tests with screenshot”);

		 

		//Instance of second part

		 

		Multipart multiPart = new MimeMultipart();

		 

		multiPart.addBodyPart(msgBody);

		 

		//Another mail body

		 

		msgBody = new MimeBodyPart();

		 

		//path of screenshot saved

		 

		DataSource source = new FileDataSource(path);

		 

		DataHandler dataHandler = new DataHandler(source);

		 

		msgBody.setDataHandler(dataHandler);

		 

		msgBody.setFileName(path);

		 

		multiPart.addBodyPart(msgBody);

		 

		msg.setContent(multiPart);

		 

		//Authentication and connection establishment to the sender’s mail

		 

		Transport transport = session.getTransport(“smtps”);

		 

		transport.connect(“smtp.gmail.com”,465,"FROMMAIL”,"PASSWORD”);

		 

		transport.sendMessage(msg, msg.getAllRecipients());

		 

		transport.close();

		 

		System.out.println(“prasadvernekar72@gmail.com”);

		}catch (Exception e){

		 

		System.out.println(“Exception while taking screenshot"+e.getMessage());
		}

		 

		}}}
		*/
	