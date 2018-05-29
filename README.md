# selenium_project
用selenium 测试网页
 
selenium  3  是成功的

sele5   是最新的版本


 
bookingImply.changeDefaultValue(driver);

public void changeDefaultValue(WebDriver driver) {
		// TODO Auto-generated method stub
		driver.switchTo().defaultContent();
		// driver.switchTo().frame("body");
		// driver.switchTo().frame("info");

		utilentity.switchto(driver, "body");
		utilentity.switchto(driver, "info");

		// WebElement radioButton=driver.findElement(By.name("outboundFlight"));

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		WebElement radioButton1 = driver
				.findElement(By.xpath("//input[@value='301;224;05/30/2018']"));


		WebElement radioButton2 = driver
				.findElement(By.xpath("//input[@value='031;224;05/31/2018']"));

//  此处的日期需要改动，否则运行不成功，
//05/30/2018   比当前时间多一天
//05/31/2018    比当前时间多两天

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
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

