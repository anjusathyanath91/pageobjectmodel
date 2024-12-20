package testcases;

import java.util.List;

import org.testng.Assert;

import org.testng.annotations.Test;

import org.testng.asserts.SoftAssert;

import basepackage.BaseClass1;
import pages.DatePickers_PageClass;

public class Date_Picker_Testclass extends BaseClass1 {

	DatePickers_PageClass dateobj;

	SoftAssert softassert = new SoftAssert();

	@Test

	public void veridydatepicker()

	{

		dateobj = new DatePickers_PageClass(driver);

		dateobj.clickdatepickerstab();
		
		//to verify the text inside show message button

		String expectedshowbtntext = "Show Date";

		String actualshowbtntext = dateobj.verifyShowMsgBtnText();

		softassert.assertEquals(actualshowbtntext, expectedshowbtntext);
		
		//to verify show message btn colour

		String actualbgcolor = dateobj.verifybgcolorofshowmsgbtn();

		String expectedbgcolor = "rgba(0, 123, 255, 1)";

		softassert.assertEquals(actualbgcolor, expectedbgcolor);

	}

	@Test

	public void verifyjqueryhref()

	{
		
		//to verify the attribute href of HyperLinkofJquery

		dateobj = new DatePickers_PageClass(driver);

		dateobj.clickdatepickerstab();

		String actualhref = dateobj.getHyperLinkofJquery();

		String expectedhref = "https://selenium.qabible.in/jquery-date-picker.php";

		Assert.assertEquals(actualhref, expectedhref);

	}
	
	@Test
	public void verifymenuitems()
	{
		dateobj = new DatePickers_PageClass(driver);
		List<String> actualmenuitems = dateobj.HeaderTextofElement();
		List<String> expectedmenuitems = actualmenuitems;		
		Assert.assertEquals(actualmenuitems, expectedmenuitems);
		
				
	}
	@Test
	public void verifyDate() {
		
		dateobj = new DatePickers_PageClass(driver);
		
		dateobj.clickdatepickerstab();
		
		dateobj.enterdatemethod();

		
	}

}
