package interface_imply;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import interfacehtb.GetAdministration;

public class GetAdminImply implements GetAdministration{

	@Override
	public String getAdminURL(WebDriver driver) {
		// TODO Auto-generated method stub
		driver.switchTo().frame("body");
		driver.switchTo().frame("info");
		WebElement admin = driver.findElement(By.linkText("administration"));

		
		if (admin != null) {
			return admin.getText();
		} else {

			return null;
		}
	}

}
