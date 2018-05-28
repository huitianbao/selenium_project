package functions;

import java.io.File;
import java.io.IOException;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class FunctionImply implements Functions {

	@Override
	public void openURL(String url, WebDriver driver) {
		// TODO Auto-generated method stub

		driver.get(url);
		driver.navigate().to(url);

	}

	@Override
	public void testTitle(String title, WebDriver driver) {
		// TODO Auto-generated method stub
		String title_get = driver.getTitle();
		String currentURL = driver.getCurrentUrl();

		System.out.println("the title is " + title_get + "\n" + "the URL is "
				+ currentURL);
		Assert.assertEquals(title, title_get);

	}

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

	@Override
	public void login(WebDriver driver, String name, String pass) {
		// TODO Auto-generated method stub

		driver.switchTo().defaultContent();
		driver.switchTo().frame("body");
		driver.switchTo().frame("navbar");

		WebElement username = driver.findElement(By.name("username"));
		WebElement password = driver.findElement(By.name("password"));
		WebElement loginbutton = driver.findElement(By.name("login"));

		username.sendKeys(name);
		password.sendKeys(pass);

		loginbutton.click();

	}

	@Override
	public void getCookies(WebDriver driver) {
		// TODO Auto-generated method stub

		Set<org.openqa.selenium.Cookie> cookies = driver.manage().getCookies();
		System.out.println(
				String.format("Domain -> name -> value -> expiry -> path"));
		for (org.openqa.selenium.Cookie c : cookies)
			System.out.println(String.format("%s -> %s -> %s -> %s -> %s",
					c.getDomain(), c.getName(), c.getValue(), c.getExpiry(),
					c.getPath()));

	}

	@Override
	public void jumptoBookpage(WebDriver driver) {
		// TODO Auto-generated method stub
		driver.switchTo().defaultContent();
		driver.switchTo().frame("body");
		driver.switchTo().frame("navbar");

		WebElement flightbuttton = driver
				.findElement(By.xpath("//a[@href='welcome.pl?page=search']"));
		flightbuttton.click();
	}

	@Override
	public void selectCity(WebDriver driver) {
		// TODO Auto-generated method stub
		driver.switchTo().defaultContent();
		driver.switchTo().frame("body");
		driver.switchTo().frame("info");

		Select select1 = new Select(driver.findElement(By.name("depart")));
		select1.selectByValue("Los Angeles");

		Select select = new Select(driver.findElement(By.name("arrive")));
		select.selectByValue("Denver");

	}

	@Override
	public void ChooseCheckbox(WebDriver driver) {
		// TODO Auto-generated method stub
		driver.switchTo().defaultContent();
		driver.switchTo().frame("body");
		driver.switchTo().frame("info");

		WebElement checkbox = driver.findElement(By.name("roundtrip"));
		checkbox.click();

	}

	@Override
	public void returnTime(WebDriver driver) {
		// TODO Auto-generated method stub
		// 出错 的原因 没有调框架
		driver.switchTo().defaultContent();
		driver.switchTo().frame("body");
		driver.switchTo().frame("info");

		WebElement returntime = driver.findElement(By.name("returnDate"));

		String date = returntime.getText();
		// System.out.println("the intital date is " + date);
		// 1 分离
		String month = date.substring(0, 2);

		String day = date.substring(3, 5);

		String year = date.substring(6);
		String result;

		int int_mounth = Integer.parseInt(month);
		int int_year = Integer.parseInt(year);

		// System.out.println(day);
		// System.out.println(month);
		// System.out.println(year);

		if (int_mounth == 12) {
			int_mounth = 1;
			int_year = int_year + 1;

		} else {
			int_mounth = int_mounth + 1;
		}

		if (int_mounth < 10) {
			result = day + "/0" + int_mounth + "/" + int_year;

		} else {
			result = day + "/" + int_mounth + "/" + int_year;
		}

		returntime.sendKeys(result + "");

	}

	@Override
	public void parameterize(WebDriver driver, String parameter) {
		// TODO Auto-generated method stub
		driver.switchTo().defaultContent();
		driver.switchTo().frame("body");
		driver.switchTo().frame("info");

		WebElement button = driver
				.findElement(By.xpath("//input[@value='" + parameter + "']"));
		button.click();

	}

	@Override
	public void clickContinue(WebDriver driver) {
		// TODO Auto-generated method stub
		driver.switchTo().defaultContent();

		driver.switchTo().frame("body");
		driver.switchTo().frame("info");
		WebElement continue_button = driver.findElement(By.name("findFlights"));
		continue_button.click();

	}

	@Override
	public void changeDefaultValue(WebDriver driver) {
		// TODO Auto-generated method stub
		driver.switchTo().defaultContent();
		driver.switchTo().frame("body");
		driver.switchTo().frame("info");

		// WebElement radioButton=driver.findElement(By.name("outboundFlight"));

		WebElement radioButton1 = driver
				.findElement(By.xpath("//input[@value='301;224;05/29/2018']"));

		WebElement radioButton2 = driver
				.findElement(By.xpath("//input[@value='031;224;05/30/2018']"));
		// Xpath
		/*
		 * WebElement radioButton1 = driver.findElement(By.xpath(
		 * "/html/body/blockquote/form/center/table/tbody/tr[3]/td[1]/input[2]")
		 * );
		 * 
		 * WebElement radioButton2 = driver.findElement(By.xpath(
		 * "/html/body/blockquote/form/center/table[2]/tbody/tr[3]/td[1]/input[2]"
		 * ));
		 */
		radioButton1.click();
		radioButton2.click();

	}

	@Override
	public void clickContinue_sec(WebDriver driver) {
		// TODO Auto-generated method stub
		driver.switchTo().defaultContent();
		driver.switchTo().frame("body");
		driver.switchTo().frame("info");

		WebElement continue_button = driver
				.findElement(By.name("reserveFlights"));
		continue_button.click();

	}

	@Override
	public void payMessage(WebDriver driver) {
		// TODO Auto-generated method stub
		WebElement firstname = driver.findElement(By.name("firstName"));
		WebElement secondname = driver.findElement(By.name("lastName"));

		WebElement text_street = driver.findElement(By.name("address1"));
		WebElement text_city = driver.findElement(By.name("address2"));
		WebElement text_passnager_name = driver.findElement(By.name("pass1"));
		WebElement text_exp_date = driver.findElement(By.name("expDate"));

		WebElement creditCard = driver.findElement(By.name("creditCard"));

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
	public void clickContinue_third(WebDriver driver) {
		// TODO Auto-generated method stub
		driver.switchTo().defaultContent();
		driver.switchTo().frame("body");
		driver.switchTo().frame("info");

		WebElement continue_button = driver.findElement(By.name("buyFlights"));
		continue_button.click();

	}

	@Override
	public void screenshot(WebDriver driver) {
		// TODO Auto-generated method stub
		File scrFile = ((TakesScreenshot) driver)
				.getScreenshotAs(OutputType.FILE);
		try {
			// String savePath = "E:\\ecli_code\\selenium3\\src\\invoice.jpg";

			String savePath = "E:\\ecli_code\\sele5\\screen\\invoice.jpg";

			// 复制内容到指定文件中
			FileUtils.copyFile(scrFile, new File(savePath));
		} catch (IOException e) {
			e.printStackTrace();
		}		
	}
}
