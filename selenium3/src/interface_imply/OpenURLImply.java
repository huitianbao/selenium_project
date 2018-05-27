package interface_imply;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OpenURLImply implements interfacehtb.OpenURL{
	

	@Override
	public void openURL(String url,WebDriver driver) {
		// TODO Auto-generated method stub
		
		
		driver.get(url);
		driver.navigate().to(url);
		
	}

}
