package com.test.classes;

import java.time.Duration;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Verify_Loginfunctionality extends Testbaseclass
{
	@Test
	public void verifyloginfunctionality()
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		String expectedtitle="Swag Labs";
		String actualtitle= driver.getTitle();
		Assert.assertEquals(actualtitle, expectedtitle);
		
		System.out.println("verify Login Test case is passed");

	}

}
