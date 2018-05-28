package functions;

import org.openqa.selenium.WebDriver;

public interface Functions {
	public void openURL(String url, WebDriver driver);

	public void testTitle(String title, WebDriver driver);

	public String getAdminURL(WebDriver driver);

	public void login(WebDriver driver, String name, String pass);
	
	public void getCookies(WebDriver driver);
	
	public void jumptoBookpage(WebDriver driver);
	public void selectCity(WebDriver driver);
	public void ChooseCheckbox(WebDriver driver);
	public void returnTime(WebDriver driver);
	public void parameterize(WebDriver driver, String parameter);
	
	public void clickContinue(WebDriver driver);
	
	public void changeDefaultValue(WebDriver driver);
	
	public void clickContinue_sec(WebDriver driver);
	public void payMessage(WebDriver driver);
	
	public void clickContinue_third(WebDriver driver) ;
	
	public void screenshot(WebDriver driver);
	

}
