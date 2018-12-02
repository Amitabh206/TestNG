package qsp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertProgram {
	
	@Test
	public void TestSoftAssert() throws InterruptedException{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://demo.actitime.com/login.do");
		
		Thread.sleep(1000);
		
		String eTitle="actiTIME - Login";
		String aTitle=driver.getTitle();
		SoftAssert sa=new SoftAssert();
		sa.assertEquals(aTitle, eTitle);
		driver.close();
		sa.assertAll();
	}

}
