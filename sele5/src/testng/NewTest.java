package testng;

import org.testng.annotations.Test;

import functions.FunctionImply;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.DataProvider;



public class NewTest {
  @Test(dataProvider = "dp")
  public void f(String key, String value) {
	// 写 测试的逻辑
			System.out
					.println("this seat key is " + key + "  the value is " + value);

			System.setProperty("webdriver.firefox.bin",
					"C:\\Program Files\\Mozilla Firefox\\firefox.exe");
			System.setProperty("webdriver.firefox.marionette",
					"C: \\geckodriver.exe");
			
			// =================================================================================
			final String name = "2015020800047";
			final String pass = "123";
			
			// ================================================================================
			WebDriver driver = new FirefoxDriver();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			FunctionImply functionImply=new FunctionImply();
			
			
			// 打开 浏览器
			String url = "http://127.0.0.1:1080/WebTours/";
			functionImply.openURL(url, driver);
			// 验证参数
			functionImply.testTitle("Web Tours", driver);
			
			
			
			// 获取 administration URL
			String URL=functionImply.getAdminURL(driver);
			System.out.print(URL);
			
			// 登录操作
			functionImply.login(driver, name, pass);
			
			// 获取cookies
			functionImply.getCookies(driver);
			
			// 订票要求
			functionImply.jumptoBookpage(driver);
			// 出发城市Los Angeles使用索引值定位方式，目的城市Seatle
			functionImply.selectCity(driver);
			// 往返票
			functionImply.ChooseCheckbox(driver);
			// 返航日期为一个月后
			
			
			System.out.println("before call for returntime() function");
			//functionImply.returnTime(driver);
			System.out.println("after call for returntime() function");
			
			// 参数化
			functionImply.parameterize(driver, value);
			
			
			// 点击 第一个 continue
			functionImply.clickContinue(driver);
			
			// 有两个 单选按钮的 页面
			functionImply.changeDefaultValue(driver);
			
			// 点击 第二个 continue
			functionImply.clickContinue_sec(driver);
			
			// 支付信息为自己姓名的英文拼音，信用卡信息填写有意义的数字
			functionImply.payMessage(driver);
			
			functionImply.clickContinue_third(driver);
			
			// 运行一次记得删除图片 不然估计会报错的吧？？？

			// 结果并没有报错，应该是把图片重新写了一遍
			
			functionImply.screenshot(driver);
			
			// 关闭浏览器
			driver.quit();
			
			
			

	  
  }

  @DataProvider
  public Object[][] dp() {
	  return new Object[][] { new Object[] { "seatPref1", "Aisle" },
			new Object[] { "seatPref2", "Window" },
			new Object[] { "seatPref3", "None" },

    };
  }
}
