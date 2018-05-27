package interface_imply;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import interfacehtb.Login;

public class LoginImply implements Login{

	@Override
	public void login(WebDriver driver, String name, String pass) {
		// TODO Auto-generated method stub
		UtilImply utilImply=new UtilImply();
		
		driver.switchTo().defaultContent();
		utilImply.switchto(driver, "body");
		utilImply.switchto(driver, "navbar");
		
		
		//driver.switchTo().frame("body");
		//driver.switchTo().frame("navbar");
		
		WebElement username=driver.findElement(By.name("username"));
		WebElement password=driver.findElement(By.name("password"));
		WebElement loginbutton=driver.findElement(By.name("login"));
		
		
		username.sendKeys(name);
		password.sendKeys(pass);
		
		loginbutton.click();
		
		
	}

}
