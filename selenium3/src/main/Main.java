package main;

import org.apache.bcel.verifier.exc.StaticCodeConstraintException;
import org.junit.experimental.theories.Theories;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import interface_imply.AssertTitle;
import interface_imply.BookingImply;
import interface_imply.CancelTicketImply;
import interface_imply.GetAdminImply;
import interface_imply.GetCookiesImply;
import interface_imply.LoginImply;
import interface_imply.LogoutImply;
import interface_imply.OpenURLImply;
import interface_imply.Wait5Imply;
import interfacehtb.CancelTicket;
import interfacehtb.GetAdministration;
import interfacehtb.OpenURL;


public class Main {
	public static int countCheckbox=1;

	static {
		System.setProperty("webdriver.firefox.bin",
				"C:\\Program Files\\Mozilla Firefox\\firefox.exe");
		System.setProperty("webdriver.firefox.marionette",
				"C: \\geckodriver.exe");
	}

	public static void main(String[] args) {
		final String name = "2015020800047";
		final String pass = "123";
		Wait5Imply wait5 = new Wait5Imply();

		WebDriver driver = new FirefoxDriver();
		testOpenURL(driver);
		// 等待 5 秒
		//wait5.wait5();

		AssertTitle assertTitle = new AssertTitle();
		assertTitle.testTitle("Web Tours", driver);

		// ==================================================================================

		// 获取 administration URL
		// String admin=testGetAdmin(driver);
		// System.out.println(admin);

		// ===================================================================================

		// 实现登录功能
		testLogin(name, pass, driver);
		// 等待 5 秒
		//wait5.wait5();

		// ===================================================================================

		// 获取cookies

		//testGetCookies(driver);
		/*
		 * result Domain -> name -> value -> expiry -> path 127.0.0.1 -> MSO ->
		 * SID&1527179150 -> null -> /
		 */

		// ==================================================================================
		
		//订票要求
		BookingImply bookingImply=new BookingImply();
		
		//出发城市Los Angeles使用索引值定位方式，目的城市Seatle
		bookingImply.jumptoBookpage(driver);
//	try {
//		Thread.sleep(2*1000);
//	} catch (InterruptedException e) {
//		// TODO Auto-generated catch block
//		e.printStackTrace();
//	}
		
		bookingImply.selectCity(driver);
//		try {
//			Thread.sleep(2*1000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		//往返票
		bookingImply.ChooseCheckbox(driver);
		try {
			Thread.sleep(2*1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		//返航日期为一个月后
		System.out.println("before call for returntime() function");
		bookingImply.returnTime(driver);
		System.out.println("after call for returntime() function");
		
		//TestNG  位置参数化
		
		
	
		
		
		// 点击 第一个 continue
		bookingImply.clickContinue(driver);
		//有两个 单选按钮的  页面
		bookingImply.changeDefaultValue(driver);
		
		// 点击  第二个 continue
		bookingImply.clickContinue_sec(driver);
		
		//支付信息为自己姓名的英文拼音，信用卡信息填写有意义的数字
		bookingImply.payMessage(driver);
		
		bookingImply.clickContinue_third(driver);
		
		// 运行一次记得删除图片 不然估计会报错的吧？？？
		
		//结果并没有报错，应该是把图片重新写了一遍
		bookingImply.screenshot(driver);
		
		//=================================================================================
		
		CancelTicketImply cancelTicketImply=new CancelTicketImply();
		
		
		cancelTicketImply.click_litinerary(driver);
		
		cancelTicketImply.select_myticket(driver);
		wait5.wait5();
		
		cancelTicketImply.click_cancel_btn(driver);
		
		//注销
		
		LogoutImply logoutImply=new LogoutImply();
		logoutImply.click_signoff(driver);
		
		

	}

	private static void testGetCookies(WebDriver driver) {
		GetCookiesImply getCookiesImply = new GetCookiesImply();
		getCookiesImply.getCookies(driver);
	}

	private static void testLogin(final String name, final String pass,
			WebDriver driver) {
		LoginImply loginImply = new LoginImply();
		loginImply.login(driver, name, pass);
	}

	private static void testOpenURL(WebDriver driver) {
		String url = "http://127.0.0.1:1080/WebTours/";
		OpenURL openURLImply = new OpenURLImply();
		openURLImply.openURL(url, driver);
	}

	private static String testGetAdmin(WebDriver driver) {
		GetAdminImply getAdminImply = new GetAdminImply();
		String admin = getAdminImply.getAdminURL(driver);
		return admin;

	}

}
