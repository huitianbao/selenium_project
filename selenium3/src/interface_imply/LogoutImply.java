package interface_imply;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import interfacehtb.Logout;

public class LogoutImply implements Logout{
	UtilImply utilentity=new UtilImply();

	@Override
	public void click_signoff(WebDriver driver) {
		// TODO Auto-generated method stub
		
		driver.switchTo().defaultContent();
		utilentity.switchto(driver, "body");
		utilentity.switchto(driver, "navbar");
		
		WebElement button_sign_off=driver.findElement(By.xpath("//a[@href='welcome.pl?signOff=1']"));
		button_sign_off.click();
		
	}

}
