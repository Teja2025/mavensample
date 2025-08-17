package org.sample.mavensample;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class testClass {
	WebDriver driver;
	
	@BeforeClass
	void setup()
	{
	driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://www.ultraviolette.com");
	driver.manage().window().maximize();
	}
	
	@Test
	void testmethod() throws InterruptedException
	{
		pageObjectClass po=new pageObjectClass(driver);
		po.clickf77button();
		Thread.sleep(3000);
	}
	
	@AfterClass
	void tearDown()
	{
	   driver.quit();
	}
	

}
