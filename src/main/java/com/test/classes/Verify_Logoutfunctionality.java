package com.test.classes;

import java.time.Duration;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.pom.classes.Homepomclass;

public class Verify_Logoutfunctionality extends Testbaseclass
{
	@Test
	public void verifylogoutfunctionality() throws InterruptedException
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		Homepomclass home = new Homepomclass(driver);
		home.menubutton();
		Thread.sleep(1000);
		home.logoutbtn();
		Thread.sleep(1000);
		
		String expectedtitle="Swag Labs";
		String actualtitle= driver.getTitle();
		Assert.assertEquals(actualtitle, expectedtitle);
		
		System.out.println("Verify logout test case is passed");
	}
	

}
