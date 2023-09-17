package com.pom.classes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpomclass {
	private WebDriver driver;
	private Actions act;
	
	@FindBy(xpath="//input[@id='user-name']")
	private WebElement emailID;
	public void sendemailID()
	{
		emailID.sendKeys("standard_user");
	}
	
	@FindBy(xpath="//input[@id='password']")
	private WebElement password;
	public void sendpassword()
	{
		password.sendKeys("secret_sauce");
	}
	
	@FindBy(xpath="//input[@id='login-button']")
	private WebElement Login;
	public void clicklogin()
	{
		Login.click();
	}
	
	
	
	public Loginpomclass(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
		
	
	

}
