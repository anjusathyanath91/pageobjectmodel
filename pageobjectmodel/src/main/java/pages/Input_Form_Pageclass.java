package pages;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;

public class Input_Form_Pageclass {

	WebDriver driver;

	By inputform = By.xpath("//a[contains(text(),'Input Form')]");

	By singleinputfieldtext = By.xpath("//div[contains(text(),'Single Input Field')]");

	By submitbtntext = By.xpath("//button[contains(text(),'Show Message')]");
	
	

	public Input_Form_Pageclass(WebDriver driver) {

		this.driver = driver;

	}

	public void clickoninputform()

	{

		WebElement inputformelement = driver.findElement(inputform);

		inputformelement.click();

	}

	// This method is used to check header of input form page

	public String getheadertext()

	{

		WebElement singleinputfieldtext2 = driver.findElement(inputform);

		System.out.println(singleinputfieldtext2.getText());

		return singleinputfieldtext2.getText();

	}

	// to verify show message text

	public String getSubmitbtnText()

	{

		WebElement submitbtntext2 = driver.findElement(submitbtntext);

		System.out.println(submitbtntext2.getText());

		return submitbtntext2.getText();

	}

}
