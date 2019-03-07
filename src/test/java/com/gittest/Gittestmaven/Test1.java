package com.gittest.Gittestmaven;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Test1 {
	WebDriver dr;
	

	
	@Test
	public void tests()
	{
System.setProperty("webdriver.chrome.driver", "F:\\Selenium course\\Browser driver\\chromedriver.exe");
		
		WebDriver dr=new ChromeDriver();
		dr.get("https://stagesite5-identity.medrio.com/identity/login?signin=e515505840cbf62c00e7ec86c4a47c37");
		dr.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		System.out.println(dr.getTitle());
	}
	


}
