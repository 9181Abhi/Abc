package com.test.classes;

import java.time.Duration;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.pom.classes.Homepomclass;

public class VerifyAllproductintoaddtocat extends Testbaseclass
{
	@Test
	public void verifyallproduct() throws InterruptedException
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		Homepomclass home = new Homepomclass(driver);
		home.allproductaddtocart();
		Thread.sleep(3000);
		
		String Expectedproduct="6";
		String actualproduct=home.gettextfromaddtocat();
		Assert.assertEquals(actualproduct, Expectedproduct);
		
		System.out.println("Verify all products test case is passed");
		
	}

}
