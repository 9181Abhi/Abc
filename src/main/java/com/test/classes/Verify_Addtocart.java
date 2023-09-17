package com.test.classes;

import java.time.Duration;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.pom.classes.Homepomclass;

public class Verify_Addtocart extends Testbaseclass
{
		
	@Test
	public void verifyaddtocart() throws InterruptedException
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		Homepomclass home = new Homepomclass(driver);
		home.addtocartbtn();
		Thread.sleep(1000);
		
		String Expectedproduct="1";
		String actualproduct= home.gettextfromaddtocat();
		Assert.assertEquals(actualproduct, Expectedproduct);
		
		System.out.println("Add to cart test case is passed");
		
	}

}
