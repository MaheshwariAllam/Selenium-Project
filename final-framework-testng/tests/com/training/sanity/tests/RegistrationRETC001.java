package com.training.sanity.tests;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.training.generics.ScreenShot;
import com.training.pom.RegistrationPOMRETC_001;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class RegistrationRETC001 {

	private WebDriver driver;
	private String baseUrl;
	// private LoginPOM loginPOM;
	private static Properties properties;
	private ScreenShot screenShot;

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
	public void validLoginTest() {
			//	loginPOM.sendUserName("admin");
	//	loginPOM.sendPassword("admin@123");
	//	loginPOM.clickLoginBtn(); 
	
		RegistrationPOMRETC_001 obj1 = new RegistrationPOMRETC_001(driver);
		obj1.rec_send();
		obj1.sendemail("mahi@gmail.com");
		
		RegistrationPOMRETC_001 obj2 = new RegistrationPOMRETC_001(driver);
		obj2.rec_send();
		obj2.sendfirstname("maheshwari");
		
		RegistrationPOMRETC_001 obj3 = new RegistrationPOMRETC_001(driver);
		obj3.rec_send();
		obj3.sendlastname("Reddy");
				
		WebElement register = driver.findElement(By.name("submit"));
		register.click();
	}
}
