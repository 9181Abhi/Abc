package com.test.classes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;


import com.pom.classes.Loginpomclass;

public class Testbaseclass {
	public WebDriver driver;
	@BeforeMethod
	
	public void setup() throws InterruptedException
	{
		System.setProperty("Webdriver.chrome.driver", "E:\\Selenium download\\chromedriver_win32\\chromedriver.exe");
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		DesiredCapabilities cp= new DesiredCapabilities();
		cp.setCapability(ChromeOptions.CAPABILITY,options);
		options.merge(cp);
		driver= new ChromeDriver(options);
		driver.get("https://www.saucedemo.com");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		Loginpomclass login = new Loginpomclass(driver);
		login.sendemailID();
		Thread.sleep(1000);
		login.sendpassword();
		Thread.sleep(1000);
		login.clicklogin();
		Thread.sleep(1000);
	
		

	}	
		
		@AfterMethod
		public void teardown()
		{
			driver.quit();
			System.out.println("Browser is closed");
		
				
	}

}
