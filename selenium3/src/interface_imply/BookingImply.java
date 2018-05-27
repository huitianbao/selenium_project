package interface_imply;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
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
	public void clickContinue_sec(WebDriver driver) {
		// TODO Auto-generated method stub
		driver.switchTo().defaultContent();
		utilentity.switchto(driver, "body");
		utilentity.switchto(driver, "info");
		
		WebElement continue_button=driver.findElement(By.name("reserveFlights"));
		continue_button.click();
		
	}
	
	@Override
	public void clickContinue_third(WebDriver driver) {
		// TODO Auto-generated method stub

		driver.switchTo().defaultContent();
		utilentity.switchto(driver, "body");
		utilentity.switchto(driver, "info");
		
		WebElement continue_button=driver.findElement(By.name("buyFlights"));
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
		
		//WebElement radioButton=driver.findElement(By.name("outboundFlight"));
		WebElement radioButton1=driver.findElement(By.xpath("//input[@value='301;224;05/28/2018']"));
		
		WebElement radioButton2=driver.findElement(By.xpath("//input[@value='032;238;']"));
		
		
	
		radioButton1.click();
		radioButton2.click();
		
		
	}

	@Override
	public void returnTime(WebDriver driver) {
		// TODO Auto-generated method stub
		
		//出错 的原因  没有调框架
		driver.switchTo().defaultContent();
		utilentity.switchto(driver, "body");
		utilentity.switchto(driver, "info");
		

		WebElement returntime=driver.findElement(By.name("returnDate"));
		if (returntime!=null) {
			System.out.println("not null"); 
			
		}
		System.out.println("before statments");
		System.out.println(returntime.getText());  //这句执行不成功 
		System.out.println("after statments");
		returntime.clear();//  这句执行成功
		
		
		
		/*
		
		String text_returntime=returntime.getText().toString();
		
		System.out.println(text_returntime);
		DateNormalizeImply dateNormalizeImply=new DateNormalizeImply();
		String real_time=dateNormalizeImply.DateFramat(text_returntime);
		System.out.println(real_time);
		
		returntime.clear();
		returntime.sendKeys(real_time);
		*/
		
		
		
	}

	@Override
	public void payMessage(WebDriver driver) {
		// TODO Auto-generated method stub
		WebElement firstname=driver.findElement(By.name("firstName"));
		WebElement secondname=driver.findElement(By.name("lastName"));
		
		WebElement text_street=driver.findElement(By.name("address1"));
		WebElement text_city=driver.findElement(By.name("address2"));
		WebElement text_passnager_name=driver.findElement(By.name("pass1"));
		WebElement text_exp_date=driver.findElement(By.name("expDate"));
		
		
		
		
		WebElement creditCard=driver.findElement(By.name("creditCard"));
		
		
		
		firstname.clear();
		firstname.sendKeys("tianbao");
		secondname.clear();
		secondname.sendKeys("hui");
		
		text_street.clear();
		text_street.sendKeys("学府路8号");
		
		text_city.clear();
		text_city.sendKeys("NanJing");
		
		text_passnager_name.clear();
		text_passnager_name.sendKeys("this is pass1");
		
		text_exp_date.clear();
		text_exp_date.sendKeys("2018");
		
		creditCard.sendKeys("99998888");
		
		
		
	}

	@Override
	public void screenshot(WebDriver driver) {
		// TODO Auto-generated method stub
		File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        try {
            //String savePath = "E:\\ecli_code\\selenium3\\src\\invoice.jpg";
        	
        	String savePath ="E:\\ecli_code\\selenium3\\src\\screenshot\\invoice.jpg";
        
            
            
            //复制内容到指定文件中
            FileUtils.copyFile(scrFile, new File(savePath));
        } catch (IOException e) {
            e.printStackTrace();
        }

		
	}

	

	

}
