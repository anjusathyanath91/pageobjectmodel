package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import basepackage.BaseClass1;
import pages.Homepage1;

public class HomeTest1 extends BaseClass1 {

	Homepage1 homepage1;
	
	

	@Test

	public void verifylogo() {
		homepage1 = new Homepage1(driver);
		System.out.println(driver.getTitle());
		homepage1.printTitle();

	//	int a = 10;
		
		boolean actual_status =homepage1.isLogoDisplayed();
		Assert.assertEquals(actual_status, true);

	}

}
