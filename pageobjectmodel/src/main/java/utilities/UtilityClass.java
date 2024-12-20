package utilities;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebElement;

//for getting common needs,getAttribut,get Background color

//this should be called in page class only

public class UtilityClass {

	public String get_Attribute(WebElement element,String attribute) {

		return element.getAttribute(attribute);

	}

	public String get_Cssproperty(WebElement element,String attribute)

	{

		return element.getCssValue(attribute);

	}

	public List<String> getTextofElements(List<WebElement> elements) {
		List<String> data = new ArrayList<String>();
		for (WebElement element : elements) {
			data.add(element.getText());
		}
		return data;
	}
		
}