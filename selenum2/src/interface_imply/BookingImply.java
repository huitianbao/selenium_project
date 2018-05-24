package interface_imply;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import interfacehtb.Booking;
import util.DateNormalizeImply;

public class BookingImply implements Booking{
	UtilImply utilentity=new UtilImply();
	

	@Override
	public void jumptoBookpage(WebDriver driver) {
		// TODO Auto-generated method stub
		driver.switchTo().defaultContent();
		utilentity.switchto(driver, "body");
		utilentity.switchto(driver, "navbar");
		
		//driver.switchTo().frame("body");
		//driver.switchTo().frame("navbar");
		
		WebElement flightbuttton=driver.findElement(By.xpath("//a[@href='welcome.pl?page=search']"));
		flightbuttton.click();
		
	}

	@Override
	public void selectCity(WebDriver driver) {
		// TODO Auto-generated method stub
		driver.switchTo().defaultContent();
		//driver.switchTo().frame("body");
		//driver.switchTo().frame("info");
		
		utilentity.switchto(driver, "body");
		utilentity.switchto(driver, "info");
		
		Select select1 = new Select(driver.findElement(By.name("depart")));
		select1.selectByValue("Los Angeles");
		
		Select select = new Select(driver.findElement(By.name("arrive")));
		select.selectByValue("Denver");
		
	}

	@Override
	public void ChooseCheckbox(WebDriver driver) {
		// TODO Auto-generated method stub
		driver.switchTo().defaultContent();
		//driver.switchTo().frame("body");
		//driver.switchTo().frame("info");
		
		utilentity.switchto(driver, "body");
		utilentity.switchto(driver, "info");
		
		WebElement checkbox=driver.findElement(By.name("roundtrip"));
		checkbox.click();
		
	}

	@Override
	public void clickContinue(WebDriver driver) {
		// TODO Auto-generated method stub
		driver.switchTo().defaultContent();
		//driver.switchTo().frame("body");
		//driver.switchTo().frame("info");
		
		utilentity.switchto(driver, "body");
		utilentity.switchto(driver, "info");
		
		
		WebElement continue_button=driver.findElement(By.name("findFlights"));
		continue_button.click();
		
	}

	@Override
	public void changeDefaultValue(WebDriver driver) {
		// TODO Auto-generated method stub
		driver.switchTo().defaultContent();
		//driver.switchTo().frame("body");
		//driver.switchTo().frame("info");
		
		utilentity.switchto(driver, "body");
		utilentity.switchto(driver, "info");
		
		WebElement radioButton=driver.findElement(By.name("outboundFlight"));
		
	}

	@Override
	public void returnTime(WebDriver driver) {
		// TODO Auto-generated method stub
		WebElement returntime=driver.findElement(By.name("returnDate"));
		String text_returntime=returntime.getText();
		DateNormalizeImply dateNormalizeImply=new DateNormalizeImply();
		String real_time=dateNormalizeImply.DateFramat(text_returntime);
		
		returntime.clear();
		returntime.sendKeys(real_time);
		
		
	}

}
