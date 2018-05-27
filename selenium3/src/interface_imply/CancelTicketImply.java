package interface_imply;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import interfacehtb.CancelTicket;
import main.Main;

public class CancelTicketImply implements CancelTicket{
	UtilImply utilentity=new UtilImply();
	@Override
	public void cancelTicket(WebDriver driver) {
		// TODO Auto-generated method stub
		
		
		
	}

	@Override
	public void click_litinerary(WebDriver driver) {
		// TODO Auto-generated method stub
		driver.switchTo().defaultContent();
		utilentity.switchto(driver, "body");
		utilentity.switchto(driver, "navbar");
		
		WebElement button_litinerary=driver.findElement(By.xpath("//a[@href='welcome.pl?page=itinerary']"));
		button_litinerary.click();
		
		
		
	}

	@Override
	public void select_myticket(WebDriver driver) {
		// TODO Auto-generated method stub
		driver.switchTo().defaultContent();
		utilentity.switchto(driver, "body");
		utilentity.switchto(driver, "info");
		
		WebElement check_box=driver.findElement(By.name(Main.countCheckbox+""));
		check_box.click();
		System.out.print(Main.countCheckbox);
		
		Main.countCheckbox++;
		
		
		
		
	}

	@Override
	public void click_cancel_btn(WebDriver driver) {
		// TODO Auto-generated method stub
		driver.switchTo().defaultContent();
		utilentity.switchto(driver, "body");
		utilentity.switchto(driver, "info");
		
		WebElement btn_cancel=driver.findElement(By.name("removeFlights"));
		btn_cancel.click();
		
	}

	@Override
	public void click_cancel_all(WebDriver driver) {
		// TODO Auto-generated method stub
		driver.switchTo().defaultContent();
		utilentity.switchto(driver, "body");
		utilentity.switchto(driver, "info");
		
		WebElement btn_cancel_all=driver.findElement(By.name("removeAllFlights"));
		
		btn_cancel_all.click();
		
	}

}
