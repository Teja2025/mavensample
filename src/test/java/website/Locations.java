package website;                                       //As expected but implimentation pending
import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Locations extends Baseclass {

	@Test

	public void locationMethod() throws InterruptedException {

		driver.get("https://www.ultraviolette.com/location"); 
		driver.navigate().refresh();
		
		
		//***********verify  title***********	

				String title=driver.getTitle();

				if(title.equals("ultraviolette.com/location")) {
					System.out.println(title);	
				}
				else {
					// Print a message if the title doesn't match
					System.out.println("Title does not match expected title.");
				}
		  
		

				//*********verify header*************

				String header = new WebDriverWait(driver, Duration.ofSeconds(10))
						.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"__next\"]/div/div[2]/div[1]/div[1]/div[1]/h1"))).getText();
				if(header.equals("LOCATE US")) {

					System.out.println(header);
				} else {
					// Print a message if the header doesn't match
					System.out.println("Header does not match expected header.");
				}
				Thread.sleep(3000);


		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollTo(0,500)");
		Thread.sleep(3000);

		//**************Bangalore get direction************

		WebElement get =driver.findElement(By.xpath("//h1[text()='GET DIRECTIONS']"));
		String parentWindow = driver.getWindowHandle();
		System.out.println("parent window id is :" + parentWindow);
		get.click();
		Thread.sleep(3000);
		Set<String> childWindows =driver.getWindowHandles();
		for (String childWindow : childWindows) 
		{
			System.out.println(childWindow);
			if(!childWindow.equals(parentWindow))
			{
				driver.switchTo().window(parentWindow);
			}
		}

		Thread.sleep(3000);


		//*****************Banglore book test ride***************

		driver.findElement(By.xpath("//h1[text()='BOOK TEST RIDE']")).click();
		Thread.sleep(3000);
		driver.navigate().back();

		Thread.sleep(3000);
		
		js.executeScript("window.scrollTo(0,500)");
		Thread.sleep(3000);
		
		

		//****************pune get direction***************


		WebElement get_direction_pune =driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div[2]/div/div/div[2]/div[4]/div[2]/div/div/a[1]/div/h1"));
		String parentWindow01 = driver.getWindowHandle();
		System.out.println("parent window id is :" + parentWindow01);
		get_direction_pune.click();
		Thread.sleep(3000);
		Set<String> childWindows01 =driver.getWindowHandles();
		for (String childWindow01 : childWindows01) 
		{
			System.out.println(childWindow01);
			if(!childWindow01.equals(parentWindow01))
			{
				driver.switchTo().window(parentWindow01);
			}
		}

		Thread.sleep(3000);

		//********************pune test ride***************

		WebElement pune = driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div[2]/div/div/div[2]/div[4]/div[2]/div/div/a[2]/div/h1"));
		Thread.sleep(2000);
		pune.click();  
		Thread.sleep(3000);
		driver.navigate().back();

		Thread.sleep(3000);
		
		
		js.executeScript("window.scrollTo(0,1000)");
		Thread.sleep(3000);
		
		//***********kochi get direction*************
		
		WebElement get_direction_kochi =driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div[2]/div/div/div[3]/div[4]/div[2]/div/div/a[1]/div/h1"));
		String parentWindow02 = driver.getWindowHandle();
		System.out.println("parent window id is :" + parentWindow02);
		get_direction_kochi.click();
		Thread.sleep(3000);
		Set<String> childWindows02 =driver.getWindowHandles();
		for (String childWindow02 : childWindows02) 
		{
			System.out.println(childWindow02);
			if(!childWindow02.equals(parentWindow02))
			{
				driver.switchTo().window(parentWindow02);
			}
		}

		Thread.sleep(3000);

		
		//**********kochi test ride**************

		WebElement kochi = driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div[2]/div/div/div[3]/div[4]/div[2]/div/div/a[2]/div/h1"));
		Thread.sleep(2000);
		kochi.click();  
		Thread.sleep(3000);
		driver.navigate().back();

		Thread.sleep(3000);
		
		js.executeScript("window.scrollTo(0,1000)");
		Thread.sleep(3000);
		
		
		//*****************Ahmadabad get direction****************
		
		WebElement get_direction_ahmadabad =driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div[2]/div/div/div[4]/div[4]/div[2]/div/div/a[1]/div/h1"));
		String parentWindow03 = driver.getWindowHandle();
		System.out.println("parent window id is :" + parentWindow03);
		get_direction_ahmadabad.click();
		Thread.sleep(3000);
		Set<String> childWindows03 =driver.getWindowHandles();
		for (String childWindow03 : childWindows03) 
		{
			System.out.println(childWindow03);
			if(!childWindow03.equals(parentWindow03))
			{
				driver.switchTo().window(parentWindow03);
			}
		}

		Thread.sleep(3000);
		

		//***********Ahmadabad test ride************

		WebElement ahmadabad = driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div[2]/div/div/div[4]/div[4]/div[2]/div/div/a[2]/div/h1"));
		Thread.sleep(2000);
		ahmadabad.click();  
		Thread.sleep(3000);
		driver.navigate().back();

		Thread.sleep(3000);
		
		
		js.executeScript("window.scrollTo(0,1500)");
		Thread.sleep(3000);
		
		
		//****************hydarabad get direction************
		
		WebElement get_direction_hydarabad =driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div[2]/div/div/div[5]/div[4]/div[2]/div/div/a[1]/div/h1"));
		String parentWindow04 = driver.getWindowHandle();
		System.out.println("parent window id is :" + parentWindow04);
		get_direction_hydarabad.click();
		Thread.sleep(3000);
		Set<String> childWindows04 =driver.getWindowHandles();
		for (String childWindow04 : childWindows04) 
		{
			System.out.println(childWindow04);
			if(!childWindow04.equals(parentWindow04))
			{
				driver.switchTo().window(parentWindow04);
			}
		}

		Thread.sleep(3000);
		
		
		//*****************hydarabad test ride*************

		WebElement hydarabad = driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div[2]/div/div/div[5]/div[4]/div[2]/div/div/a[2]/div/h1"));
		Thread.sleep(2000);
		hydarabad.click();  
		Thread.sleep(3000);
		driver.navigate().back();

		Thread.sleep(3000);
		
		js.executeScript("window.scrollTo(0,1500)");
		Thread.sleep(3000);
		
		//************visakhapatnam get direction*************
		
		WebElement get_direction_visakhapatnam =driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div[2]/div/div/div[6]/div[4]/div[2]/div/div/a[1]/div/h1"));
		String parentWindow05 = driver.getWindowHandle();
		System.out.println("parent window id is :" + parentWindow05);
		get_direction_visakhapatnam.click();
		Thread.sleep(3000);
		Set<String> childWindows05 =driver.getWindowHandles();
		for (String childWindow05 : childWindows05) 
		{
			System.out.println(childWindow05);
			if(!childWindow05.equals(parentWindow05))
			{
				driver.switchTo().window(parentWindow05); 
			}
		}

		Thread.sleep(3000);    
		
		
		//**************visakhapatnam test ride*************

		WebElement visakhapatnam = driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div[2]/div/div/div[6]/div[4]/div[2]/div/div/a[2]/div/h1"));
		Thread.sleep(2000);
		visakhapatnam.click(); 
		Thread.sleep(3000);
		driver.navigate().back();
		
		
		js.executeScript("window.scrollTo(0,2000)");
		Thread.sleep(3000);
		
		
		//**************manglore get direction*************
		
		WebElement get_direction_manglore =driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div[2]/div/div/div[7]/div[4]/div[2]/div/div/a[1]/div/h1"));
		String parentWindow06 = driver.getWindowHandle();
		System.out.println("parent window id is :" + parentWindow06);
		get_direction_manglore.click();
		Thread.sleep(3000);
		Set<String> childWindows06 =driver.getWindowHandles();
		for (String childWindow06 : childWindows06) 
		{
			System.out.println(childWindow06);
			if(!childWindow06.equals(parentWindow06))
			{
				driver.switchTo().window(parentWindow06); 
			}
		}

		Thread.sleep(3000);  
		
		
	//***************mangalore test ride**************
	
		WebElement mangalore= driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div[2]/div/div/div[7]/div[4]/div[2]/div/div/a[2]/div/h1"));
		Thread.sleep(2000);
		mangalore.click(); 
		Thread.sleep(3000);
		driver.navigate().back();
		
		js.executeScript("window.scrollTo(0,2000)");
		Thread.sleep(3000);
		
			
		
	//***************chennai test ride**************
		
		WebElement chennai= driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div[2]/div/div/div[8]/div[4]/div[2]/div/div/a[2]/div/h1"));
		Thread.sleep(2000);
		chennai.click(); 
		Thread.sleep(3000);
		driver.navigate().back();
		


		JavascriptExecutor jse1 =(JavascriptExecutor)driver;
		jse1.executeScript("window.scrollTo(2000,1500)");
		Thread.sleep(2000);

		JavascriptExecutor jse2 =(JavascriptExecutor)driver;
		jse2.executeScript("window.scrollTo(1500,2000)");
		Thread.sleep(2000);


	}

}
