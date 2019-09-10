package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegistrationPOMRETC_001 {
	

	private WebDriver driver; 
	
	public RegistrationPOMRETC_001(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	
		
	@FindBy(xpath=("//*[@id=\"post-133\"]/div/div/div/ul/li[2]/a"))
	public WebElement sendbtn; 
	
	@FindBy(id="email")
	public WebElement emailid;
	
	@FindBy(id="first-name")
	public WebElement firstn;

	@FindBy(id="last-name")
	public WebElement Lastn;

	
	
	public void rec_send()
    { 
        //msg send
		Actions action1 = new Actions(driver);
        action1.moveToElement(sendbtn).click().perform();
     }
	
	public void sendemail(String emailid) 
	{
		this.emailid.clear(); 
		this.emailid.sendKeys(emailid); 
	}
	public void sendfirstname(String firstn) 
	{
		this.firstn.clear(); 
		this.firstn.sendKeys(firstn); 
	}
		
	public void sendlastname(String Lastn)
	{
		this.Lastn.clear();
	this.Lastn.sendKeys(Lastn);
	}

	public void clickSigninlnk() {
		// TODO Auto-generated method stub
		
	}

	public void sendPassword(String string) {
		// TODO Auto-generated method stub
		
	}
}
