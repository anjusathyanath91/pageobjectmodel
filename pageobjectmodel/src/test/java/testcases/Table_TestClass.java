package testcases;

import java.util.List;

import org.testng.Assert;
import org.testng.annotations.Test;


import basepackage.BaseClass1;
import pages.Table_PageClass;

public class Table_TestClass extends BaseClass1 {
Table_PageClass tableobj;
@Test
public void verifyTabledata()
{
tableobj = new Table_PageClass(driver);
tableobj.clicktablebtn();
String expectednameofperson = "Rhona Davidson";
String actualnameofperson = tableobj.getnameofperson();
Assert.assertEquals(actualnameofperson, expectednameofperson);


}
//TEST CASE TO GET ALL NAMES OF TABLE USING LIST
@Test
public void verifyallnamestable()
{
tableobj = new Table_PageClass(driver);
tableobj.clicktablebtn();
List<String> actualnames = tableobj.getallnames();
List<String> expectednames = actualnames;
Assert.assertEquals(actualnames, expectednames);

}

//to get the offc of cedric kelly from the table

@Test

public void verifyTableOffice() {
	tableobj = new Table_PageClass(driver);
	tableobj.clicktablebtn();
	tableobj.getOfficeofPerson("Cedric Kelly");
	String actualoffc=tableobj.getOfficeofPerson("Cedric Kelly");
	String expectedoffc="Edinburgh";
	Assert.assertEquals(actualoffc, expectedoffc);
	
}

@Test
public void verifyAgeofPerson() {
	tableobj = new Table_PageClass(driver);
	tableobj.clicktablebtn();

	String actualage=tableobj.getAgeofPerson("Cedric Kelly");
	String expecteage="22";
	Assert.assertEquals(actualage, expecteage);
	
	//to check path
	String path=System.getProperty("user.dir");
	System.out.println(path);
	
}
}

