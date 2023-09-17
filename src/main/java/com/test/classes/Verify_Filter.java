package com.test.classes;

import java.time.Duration;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.pom.classes.Homepomclass;

public class Verify_Filter extends Testbaseclass
{
	@Test
	public void verifyfilter() throws InterruptedException
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		Homepomclass home = new Homepomclass(driver);
		home.clickdropodownfilter();
		Thread.sleep(3000);
		
		String expectedtext="Price (low to high)";
		String actualtext= home.getdropdowntext();
		Thread.sleep(3000);
		
		Assert.assertEquals(actualtext, expectedtext);
		System.out.println("Verify filter test case is pass");
		
				
	}

}
