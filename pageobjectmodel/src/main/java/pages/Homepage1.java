package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Homepage1 {

	WebDriver driver;
	By logo = By.xpath("//div[@class='top-logo']//img");
	
	public void printTitle() {
		
		System.out.println(driver.getTitle());
		
	}
	
	public Homepage1(WebDriver driver) {
		
		this.driver=driver;
		
		
	}
	public boolean isLogoDisplayed() {
		
		WebElement element=driver.findElement(logo);
		return element.isDisplayed();
	}
}
