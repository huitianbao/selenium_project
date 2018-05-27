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
		// �ȴ� 5 ��
		//wait5.wait5();

		AssertTitle assertTitle = new AssertTitle();
		assertTitle.testTitle("Web Tours", driver);

		// ==================================================================================

		// ��ȡ administration URL
		// String admin=testGetAdmin(driver);
		// System.out.println(admin);

		// ===================================================================================

		// ʵ�ֵ�¼����
		testLogin(name, pass, driver);
		// �ȴ� 5 ��
		//wait5.wait5();

		// ===================================================================================

		// ��ȡcookies

		//testGetCookies(driver);
		/*
		 * result Domain -> name -> value -> expiry -> path 127.0.0.1 -> MSO ->
		 * SID&1527179150 -> null -> /
		 */

		// ==================================================================================
		
		//��ƱҪ��
		BookingImply bookingImply=new BookingImply();
		
		//��������Los Angelesʹ������ֵ��λ��ʽ��Ŀ�ĳ���Seatle
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
		
		//����Ʊ
		bookingImply.ChooseCheckbox(driver);
		try {
			Thread.sleep(2*1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		//��������Ϊһ���º�
		System.out.println("before call for returntime() function");
		bookingImply.returnTime(driver);
		System.out.println("after call for returntime() function");
		
		//TestNG  λ�ò�����
		
		
	
		
		
		// ��� ��һ�� continue
		bookingImply.clickContinue(driver);
		//������ ��ѡ��ť��  ҳ��
		bookingImply.changeDefaultValue(driver);
		
		// ���  �ڶ��� continue
		bookingImply.clickContinue_sec(driver);
		
		//֧����ϢΪ�Լ�������Ӣ��ƴ�������ÿ���Ϣ��д�����������
		bookingImply.payMessage(driver);
		
		bookingImply.clickContinue_third(driver);
		
		// ����һ�μǵ�ɾ��ͼƬ ��Ȼ���ƻᱨ��İɣ�����
		
		//�����û�б���Ӧ���ǰ�ͼƬ����д��һ��
		bookingImply.screenshot(driver);
		
		//=================================================================================
		
		CancelTicketImply cancelTicketImply=new CancelTicketImply();
		
		
		cancelTicketImply.click_litinerary(driver);
		
		cancelTicketImply.select_myticket(driver);
		wait5.wait5();
		
		cancelTicketImply.click_cancel_btn(driver);
		
		//ע��
		
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
