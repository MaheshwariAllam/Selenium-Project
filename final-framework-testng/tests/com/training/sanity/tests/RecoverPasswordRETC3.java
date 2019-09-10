package com.training.sanity.tests;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.training.generics.ScreenShot;
import com.training.pom.RecoverPasswordPOMRETC_003;
import com.training.pom.RegistrationPOMRETC_001;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class RecoverPasswordRETC3 {

	private WebDriver driver;
	private String baseUrl;
	// private LoginPOM loginPOM;
	private static Properties properties;
	private ScreenShot screenShot;
	//*[@id="tab1"]/form/p[4]/a
	
	@BeforeClass
	public static void setUpBeforeClass() throws IOException {
		properties = new Properties();
		FileInputStream inStream = new FileInputStream("./resources/others.properties");
		properties.load(inStream);
	}

	@BeforeMethod
	public void setUp() throws Exception {
		driver = DriverFactory.getDriver(DriverNames.CHROME);
		// loginPOM = new LoginPOM(driver); 
		baseUrl = properties.getProperty("baseURL");
		screenShot = new ScreenShot(driver); 
		// open the browser 
		driver.get(baseUrl);
	}
	
	@AfterMethod
	public void tearDown() throws Exception {
		Thread.sleep(1000);
		// driver.quit();
	}
	@Test
	public void RecoverpasswordTest() {
			RecoverPasswordPOMRETC_003 obj1 = new RecoverPasswordPOMRETC_003(driver);
		obj1.lostpwd();
		obj1.sendemail("maheshwari.allam@gmail.com");
		
		obj1.sendreset(baseUrl);
		obj1.reset.click();	
	}

	public void clickUpdtprofileBtn() {
		// TODO Auto-generated method stub
		
	}

	public void sendPhone(String string) {
		// TODO Auto-generated method stub
		
	}

	public void sendLastname(String string) {
		// TODO Auto-generated method stub
		
	}

	public void editprfllnk() {
		// TODO Auto-generated method stub
		
	}

	public void moverAdminlnk() {
		// TODO Auto-generated method stub
		
	}

	
}
