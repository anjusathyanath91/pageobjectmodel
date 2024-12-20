package testcases;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import basepackage.BaseClass1;
import pages.Input_Form_Pageclass;



public class InputForm_TestClass extends BaseClass1 {

	Input_Form_Pageclass inputformpage;

SoftAssert softassert = new SoftAssert();

	@Test

	public void verifysingleinputtext()

	{

		
		inputformpage = new Input_Form_Pageclass(driver);

		inputformpage.clickoninputform();//calling the method of page class

		String actualtext = inputformpage.getheadertext();

		String expecetdtext = "INPUT FORM";

		softassert.assertEquals(actualtext, expecetdtext);

		String actualsubmittext = inputformpage.getSubmitbtnText();

		String expectedsubmittext = "Show Message";

		softassert.assertEquals(actualsubmittext, expectedsubmittext, "Failure");

		softassert.assertAll();

		

		

	}

	

}


