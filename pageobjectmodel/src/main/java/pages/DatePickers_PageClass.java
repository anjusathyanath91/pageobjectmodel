package pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;

import org.openqa.selenium.support.PageFactory;

import org.openqa.selenium.support.decorators.WebDriverDecorator;

import utilities.UtilityClass;

public class DatePickers_PageClass {

	UtilityClass utilclass = new UtilityClass();

	WebDriver driver;

	@FindBy(xpath = "//a[contains(text(),'Date Pickers')]")

	WebElement datepickerbtn;

	@FindBy(xpath = "//button[ @id='button-one']")

	WebElement showbtn;

	@FindBy(xpath = "//a[@href='jquery-date-picker.php']")

	WebElement jqueryelement;
	
	//for list elements
	
	@FindBy(xpath = "//div[@id='collapsibleNavbar']//ul//li//a")
	
	List<WebElement> menuelements;
	
	@FindBy(xpath = "//input[@id='single-input-field']")
	WebElement enterdatefield;
	/*
	 * For initialising web element we need to use page factory
	 * 
	 * By datapickbtn = By.xpath("//a[contains(text(),'Date Pickers')]");
	 * 
	 * By datepickertext = By.xpath("//div[contains(text(),'Date Picker')]");
	 */

	public DatePickers_PageClass(WebDriver driver) {

		this.driver = driver;

		PageFactory.initElements(driver, this); // this responsible for initialise the web element declared by @FindBy

	}

	public void clickdatepickerstab() {

		datepickerbtn.click();

	}

	public String verifyShowMsgBtnText()

	{

		System.out.println(showbtn.getText());

		return showbtn.getText();

	}

	public String getHyperLinkofJquery()

	{

		System.out.println(utilclass.get_Attribute(jqueryelement, "href"));

		return utilclass.get_Attribute(jqueryelement, "href");

	}

	public String verifybgcolorofshowmsgbtn()

	{

		System.out.println(utilclass.get_Cssproperty(showbtn, "background-color"));

		return utilclass.get_Cssproperty(showbtn, "background-color");

	}
	
	public List<String> HeaderTextofElement() {
		
		List<String> headerdata = new ArrayList<String>();
		headerdata=utilclass.getTextofElements(menuelements);
		System.out.println(headerdata);
		return headerdata;
		
	}
	
	public void enterdatemethod()
	{
		enterdatefield.sendKeys("14/11/2024");
		enterdatefield.sendKeys(Keys.ENTER);
		
	}
	

}
