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
	// д ���Ե��߼�
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
			
			
			// �� �����
			String url = "http://127.0.0.1:1080/WebTours/";
			functionImply.openURL(url, driver);
			// ��֤����
			functionImply.testTitle("Web Tours", driver);
			
			
			
			// ��ȡ administration URL
			String URL=functionImply.getAdminURL(driver);
			System.out.print(URL);
			
			// ��¼����
			functionImply.login(driver, name, pass);
			
			// ��ȡcookies
			functionImply.getCookies(driver);
			
			// ��ƱҪ��
			functionImply.jumptoBookpage(driver);
			// ��������Los Angelesʹ������ֵ��λ��ʽ��Ŀ�ĳ���Seatle
			functionImply.selectCity(driver);
			// ����Ʊ
			functionImply.ChooseCheckbox(driver);
			// ��������Ϊһ���º�
			
			
			System.out.println("before call for returntime() function");
			//functionImply.returnTime(driver);
			System.out.println("after call for returntime() function");
			
			// ������
			functionImply.parameterize(driver, value);
			
			
			// ��� ��һ�� continue
			functionImply.clickContinue(driver);
			
			// ������ ��ѡ��ť�� ҳ��
			functionImply.changeDefaultValue(driver);
			
			// ��� �ڶ��� continue
			functionImply.clickContinue_sec(driver);
			
			// ֧����ϢΪ�Լ�������Ӣ��ƴ�������ÿ���Ϣ��д�����������
			functionImply.payMessage(driver);
			
			functionImply.clickContinue_third(driver);
			
			// ����һ�μǵ�ɾ��ͼƬ ��Ȼ���ƻᱨ��İɣ�����

			// �����û�б���Ӧ���ǰ�ͼƬ����д��һ��
			
			functionImply.screenshot(driver);
			
			// �ر������
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
