package interface_imply;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import interfacehtb.AsseretTitle;


public class AssertTitle implements AsseretTitle{



	@SuppressWarnings("deprecation")
	@Override
	public void testTitle(String title, WebDriver driver) {
		// TODO Auto-generated method stub
		String title_get=driver.getTitle();
		String currentURL =driver.getCurrentUrl();
		
		System.out.println("the title is " + title_get + "\n" + "the URL is " + currentURL);
		Assert.assertEquals(title, title_get);
		
		
	}

}
