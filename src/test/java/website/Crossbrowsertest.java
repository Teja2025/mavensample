package website;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Crossbrowsertest {
	
	public WebDriver driver;
	
	FirefoxOptions firefoxoption=new FirefoxOptions();
	ChromeOptions chromeoption= new ChromeOptions();
	EdgeOptions edgeoption=new EdgeOptions();
	
	
	@Parameters("browser")
	@BeforeTest
	
	public void initializedriver(String browser) {
		
		// initialize WebDriver based on BrowerName
		if(browser.equalsIgnoreCase("chrome")) {
			
			//Chrome browser
			
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
			System.out.println("chromedriver is launched");
			
		}
			
			else if(browser.equalsIgnoreCase("edge")) {
				
				//edge browser
				
				WebDriverManager.edgedriver().setup();
				driver=new EdgeDriver();
				System.out.println("edgedriver is launched");
				
			}
				
				else if(browser.equalsIgnoreCase("firefox")) {
					
					//FireFox browser
					
					WebDriverManager.chromedriver().setup();
					driver=new FirefoxDriver();
					System.out.println("firefoxdriver is launched");
					
		}
	
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();

	}
	
	@Test
	public void Method()
	
{
	driver.get("https://www.ultraviolette.com");	
	
}
	
//@AfterTest
//public void endTest()
//
//{
//driver.quit();
//
//}
}


