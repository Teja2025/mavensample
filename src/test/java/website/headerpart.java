package website;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class headerpart extends Baseclass{

	
	public WebDriver driver;
	public headerpart(WebDriver d)
	{
		driver=d;
	}
		@Test
		public void navigation() throws InterruptedException
		{
		    driver.get("https://www.ultraviolette.com");
			Thread.sleep(3000);
//			driver.findElement(By.xpath("//span[text()='See more']")).click();
//			Thread.sleep(3000);
//
//			driver.findElement(By.xpath("/html/body/div[4]/div[2]/div/div/div/img")).click();
//			Thread.sleep(3000);
			
//			driver.findElement(By.xpath("//img[@alt='close']")).click();
//			Thread.sleep(3000);
			
			//Nav-bar section //
			
			driver.findElement(By.xpath("//p[text()='F77 MACH 2']")).click();
			Thread.sleep(3000);
			driver.navigate().back();
			
			driver.findElement(By.xpath("//p[text()='SMART TECH']")).click();
			Thread.sleep(3000);
			driver.navigate().back();
			
			driver.findElement(By.xpath("//p[text()='UV RACING']")).click();
			Thread.sleep(3000);
			driver.navigate().back();
			
			driver.findElement(By.xpath("//p[text()='SQUADRON']")).click();
			Thread.sleep(3000);
			driver.navigate().back();
			
			driver.findElement(By.xpath("//p[text()='CONFIGURE']")).click();
			Thread.sleep(3000);
			driver.navigate().back();
			
			driver.findElement(By.xpath("//h1[text()='BOOK TEST RIDE']")).click();
			Thread.sleep(3000);
			driver.navigate().back();
			
//			driver.findElement(By.xpath("//img[@alt='new-menu']")).click();  //// header menu icon
//			Thread.sleep(5000);
//			driver.navigate().back();
//			
//			
//			driver.findElement(By.xpath("//*[@id=\"headlessui-dialog-panel-:r59:\"]/div/div[2]/p")).click();
//			Thread.sleep(3000);
//			driver.navigate().back();
//			
////			driver.findElement(By.xpath("//p[text()='ABOUT']")).click();
////			Thread.sleep(3000);
////			driver.navigate().back();
//			
//			driver.findElement(By.xpath("//*[@id=\"headlessui-menu-button-:Reqn6:\"]/img")).click();  //// header menu icon
//			Thread.sleep(3000);
//			driver.navigate().back();
//			
//			driver.findElement(By.xpath("//p[text()='LOCATE US']")).click();
//			Thread.sleep(3000);
//			driver.navigate().back();
//			
//			driver.findElement(By.xpath("//*[@id=\"headlessui-menu-button-:Reqn6:\"]/img")).click();  //// header menu icon
//			Thread.sleep(3000);
//			driver.navigate().back();
//			
//			driver.findElement(By.xpath("//p[text()='PRESS']")).click();
//			Thread.sleep(3000);
//			driver.navigate().back();
//			
//			driver.findElement(By.xpath("//*[@id=\"headlessui-menu-button-:Reqn6:\"]/img")).click();  //// header menu icon
//			Thread.sleep(3000);
//			driver.navigate().back();
//			
//			driver.findElement(By.xpath("//p[text()='careers']")).click();
//			Thread.sleep(3000);
//			driver.navigate().back();
//			
//			driver.findElement(By.xpath("//*[@id=\"headlessui-menu-button-:Reqn6:\"]/img")).click();  //// header menu icon
//			Thread.sleep(3000);
//			driver.navigate().back();
//			
//			driver.findElement(By.xpath("//p[text()='SIGN IN']")).click();
//			Thread.sleep(3000);
//			driver.navigate().back();
			
//			driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[1]/div[1]/div[1]/img")).click();

}
	}
