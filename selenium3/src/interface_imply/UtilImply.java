package interface_imply;

import org.openqa.selenium.WebDriver;

import interfacehtb.Util;

public class UtilImply implements Util{

	@Override
	public void switchto(WebDriver driver,String frame) {
		// TODO Auto-generated method stub
		driver.switchTo().frame(frame);
		
	}

	

}
