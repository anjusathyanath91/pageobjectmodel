package pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.UtilityClass;

public class Table_PageClass {
WebDriver driver;
UtilityClass util = new UtilityClass();
@FindBy(xpath = "//a[contains(text(),'Table')]")
WebElement tablebtn;

//get one person name
@FindBy(xpath = "//table//tbody//tr[8]//td[1]")
WebElement nameofperson;

//names of all persons from table
@FindBy(xpath = "//table//tbody//tr//td[1]")
List<WebElement> allnames;

public Table_PageClass(WebDriver driver) {
this.driver = driver;
PageFactory.initElements(driver,this);
}
public void clicktablebtn()
{
tablebtn.click();
}
public String getnameofperson()
{
System.out.println(nameofperson.getText());
return nameofperson.getText();
}
//getting names of all persons --> from here it will go to utility common list
public List<String> getallnames()
{
List<String> allnamesstring = new ArrayList<String>();
allnamesstring= util.getTextofElements(allnames);
System.out.println(allnamesstring);
return allnamesstring;
}

public String getOfficeofPerson(String personname) {
	List<String> allnamesstring = new ArrayList<String>();
	allnamesstring= util.getTextofElements(allnames);
	int index=0;
	for(index=0;index<allnamesstring.size();index++) {
		if(personname.equals(allnamesstring.get(index))) {
			
			index++;
			break;
		}
		
		
	}
	//concatenation is not possible in @findBy
	WebElement offcofperson=driver.findElement(By.xpath("//table//tbody//tr["+index+"]//td[3]"));
	return offcofperson.getText();
	
}

//to check age of cedric kelly

public String getAgeofPerson(String personname) {
	List<String> allnamesstring = new ArrayList<String>();
	allnamesstring= util.getTextofElements(allnames);
	int index=0;
	for(index=0;index<allnamesstring.size();index++) {
		if(personname.equals(allnamesstring.get(index))) {
			
			index++;
			break;
		}
		
		
	}
	//concatenation is not possible in @findBy
	WebElement ageofperson=driver.findElement(By.xpath("//table//tbody//tr["+index+"]//td[4]"));
	return ageofperson.getText();
	
}
}

