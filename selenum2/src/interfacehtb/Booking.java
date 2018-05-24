package interfacehtb;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public interface Booking {
	public void jumptoBookpage(WebDriver driver);

	public void selectCity(WebDriver driver);

	public void ChooseCheckbox(WebDriver driver);

	public void clickContinue(WebDriver driver);

	public void changeDefaultValue(WebDriver driver);
	
	public void returnTime(WebDriver driver);

}
