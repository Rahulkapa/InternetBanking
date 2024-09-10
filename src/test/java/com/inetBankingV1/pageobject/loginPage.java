package com.inetBankingV1.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginPage {
	
	// Declaration
	
	@FindBy(name="uid") private WebElement username;
	@FindBy(name="password") private WebElement password;
	@FindBy(name="btnLogin") private WebElement loginbutton;
	@FindBy(name="btnReset") private WebElement Resetbutton;
	
	
	// initialization
	
	public loginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	
	// usage--action method
	
	public void setGuru99logpageusername(String uname) {
		username.sendKeys(uname);
	}
	
	public void setGuru99logpagepassword(String upassword) {
		password.sendKeys(upassword);
	}
	
	public void clickGuru99logpageloginbutton() {
		loginbutton.click();
	}
	
	
	
	
	
	
}
