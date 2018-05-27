package interface_imply;

import java.awt.List;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.WebDriver;

import com.gargoylesoftware.htmlunit.javascript.host.dom.Node;

import interfacehtb.GetCookies;


public class GetCookiesImply implements GetCookies{


	@Override
	public void getCookies(WebDriver driver) {
		

		Set<org.openqa.selenium.Cookie> cookies = driver.manage().getCookies();
		System.out.println(String.format("Domain -> name -> value -> expiry -> path"));
		for (org.openqa.selenium.Cookie c : cookies)
				System.out.println(String.format("%s -> %s -> %s -> %s -> %s",
		c.getDomain(), c.getName(), c.getValue(), c.getExpiry(),c.getPath()));

		
	}
		

}
