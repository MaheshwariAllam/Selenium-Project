package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RecoverPasswordPOMRETC_003 {
	

	private WebDriver driver; 
	
	public RecoverPasswordPOMRETC_003(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	
		
	@FindBy(xpath=("//*[@id=\"tab1\"]/form/p[4]/a"))
	public WebElement lostpassword; 
	
	 @FindBy(id="user_login")
	 public WebElement email;
	
	 @FindBy(xpath=("//*[@id=\"lostpasswordform\"]/p[2]/input"))
		public WebElement reset;


	// @FindBy(id="last-name")
	// public WebElement Lastn;

	
	
	public void lostpwd()
    { 
        //msg send
		Actions action1 = new Actions(driver);
        action1.moveToElement(lostpassword).click().perform();
     }
	
	public void sendemail(String email) 
	{
		this.email.clear(); 
		this.email.sendKeys(email); 
	}
	public void sendreset(String reset) 
	{
		this.reset.click(); 
	 
	}

	public void clickUpdtprofileBtn() {
		// TODO Auto-generated method stub
		
	}

	public void moverAdminlnk() {
		// TODO Auto-generated method stub
		
	}

	public void editprfllnk() {
		// TODO Auto-generated method stub
		
	}

	public void sendLastname(String string) {
		// TODO Auto-generated method stub
		
	}

	public void sendPhone(String string) {
		// TODO Auto-generated method stub
		
	}
		
}
