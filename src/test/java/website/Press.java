package website;                                  //Need to impliment new press page

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Press extends Baseclass {

	@Test

	public void pressMethod() throws InterruptedException {
		driver.get("https://www.ultraviolette.com/press");

		//***********verify  title***********	

		String title=driver.getTitle();

		if(title.equals("Ultraviolette Automotive | Press")) {
			System.out.println(title);	
		}
		else {
			// Print a message if the title doesn't match
			System.out.println("Title does not match expected title.");
		}
		
		//*********verify header*************

		String header = new WebDriverWait(driver, Duration.ofSeconds(10))
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[text()='PRESS']"))).getText();
		if(header.equals("PRESS")) {

			System.out.println(header);
		} else {
			// Print a message if the title doesn't match
			System.out.println("Header does not match expected header.");
		}


		//*********click subscribe button***********

		WebElement subscribeOption =driver.findElement(By.xpath("//div[text()='SUBSCRIBE']"));
		subscribeOption.click();

		//************Enter Email************

		WebElement EmailTextField =driver.findElement(By.id("enteredEmailId"));
		EmailTextField.sendKeys("fddg");
		EmailTextField.clear();
		Thread.sleep(5000);
		EmailTextField.sendKeys("desfrfrg@gmail.com");
		Thread.sleep(2000);


		//************click subscribe button************

		WebElement subscribe =driver.findElement(By.xpath("//button[text()='SUBSCRIBE']"));
		subscribe.click();
		Thread.sleep(2000);

		//*********** article section ***************

		WebElement article1 =driver.findElement(By.id("press-article-1-view-btn"));
		String parentWindow01 = driver.getWindowHandle();
		System.out.println("parent window id is :" + parentWindow01);
		Thread.sleep(3000);
		article1.click();
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

		WebElement article2 =driver.findElement(By.id("press-article-2-view-btn"));
		String parentWindow02 = driver.getWindowHandle();
		System.out.println("parent window id is :" + parentWindow02);
		Thread.sleep(3000);
		article2.click();
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


		WebElement article3 =driver.findElement(By.id("press-article-3-view-btn"));
		String parentWindow03 = driver.getWindowHandle();
		System.out.println("parent window id is :" + parentWindow03);
		Thread.sleep(3000);
		article3.click();
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

		WebElement article4 =driver.findElement(By.id("press-article-4-view-btn"));
		String parentWindow04 = driver.getWindowHandle();
		System.out.println("parent window id is :" + parentWindow04);
		//	      Thread.sleep(3000);
		article4.click();
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

		WebElement article5 =driver.findElement(By.id("press-article-5-view-btn"));
		String parentWindow05 = driver.getWindowHandle();
		System.out.println("parent window id is :" + parentWindow05);
		Thread.sleep(3000);
		article5.click();
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

		WebElement article6 =driver.findElement(By.xpath("//*[@id=\"press-article-6-view-btn\"]/div/button/div/div"));
		String parentWindow06 = driver.getWindowHandle();
		System.out.println("parent window id is :" + parentWindow06);
		Thread.sleep(3000);
		article6.click();
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


		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollTo(0,500)");
		Thread.sleep(2000);

		//************click subscribe our youtube button************

		WebElement subscribeTo =driver.findElement(By.xpath("//div[text()='SUBSCRIBE TO OUR YOUTUBE']"));
		String parentWindow = driver.getWindowHandle();
		System.out.println("parent window id is :" + parentWindow);
		//  Thread.sleep(3000);
		subscribeTo.click();
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


		js.executeScript("window.scrollTo(500,1000)");
		Thread.sleep(3000);


		js.executeScript("window.scrollTo(1000,1500)");
		Thread.sleep(4000);


		js.executeScript("window.scrollTo(1500,3000)");
		Thread.sleep(4000);





		//		driver.findElement(By.xpath("(//div[text()='SUBSCRIBE'])[1]")).click();
		//		Thread.sleep(3000);
		//		driver.findElement(By.xpath("//input[@id='enteredEmailId']")).sendKeys("tejashwini.c@ultraviolette.com");
		//		Thread.sleep(3000);
		//		driver.findElement(By.xpath("//button[text()='SUBSCRIBE']")).click();
		//		JavascriptExecutor js1=(JavascriptExecutor)driver;
		//		js1.executeScript("window.scrollTo(0,300)");
		//		WebElement w1=	driver.findElement(By.xpath("(//div[text()='VIEW ARTICLE'])[1]"));
		//		Thread.sleep(3000);
		//		w1.click();
		//		Thread.sleep(5000);	
		//
		//		String pwh=driver.getWindowHandle();
		//		System.out.println();
		//		Set<String> allwh=driver.getWindowHandles();
		//		for(String wh:allwh) {
		//			System.out.println(wh);
		//			if(!pwh.equals(wh)) {
		//				driver.switchTo().window(pwh);
		//			}
		//		}
		//		Thread.sleep(5000);
		//		WebElement w2=	driver.findElement(By.xpath("(//div[text()='VIEW ARTICLE'])[2]"));
		//		Thread.sleep(3000);
		//		w2.click();
		//		Thread.sleep(5000);	
		//
		//		String pwh2=driver.getWindowHandle();
		//		System.out.println();
		//		Set<String> allwh2=driver.getWindowHandles();
		//		for(String wh2:allwh2) {
		//			System.out.println(wh2);
		//			if(!pwh2.equals(wh2)) {
		//				driver.switchTo().window(pwh2);
		//			}
		//		}
		//		Thread.sleep(5000);
		//
		//		WebElement w3=	driver.findElement(By.xpath("(//div[text()='VIEW ARTICLE'])[3]"));
		//		Thread.sleep(3000);
		//		w3.click();
		//		Thread.sleep(5000);	
		//		String pwh3=driver.getWindowHandle();
		//		System.out.println();
		//		Set<String> allwh3=driver.getWindowHandles();
		//		for(String wh3:allwh3) {
		//			System.out.println(wh3);
		//			if(!pwh3.equals(wh3)) {
		//				driver.switchTo().window(pwh3);
		//			}
		//		}
		//		Thread.sleep(5000);
		//
		//		WebElement w4=	driver.findElement(By.xpath("(//div[text()='VIEW ARTICLE'])[4]"));
		//		Thread.sleep(3000);
		//		w4.click();
		//		Thread.sleep(5000);	
		//		String pwh4=driver.getWindowHandle();
		//		System.out.println();
		//		Set<String> allwh4=driver.getWindowHandles();
		//		for(String wh4:allwh4) {
		//			System.out.println(wh4);
		//			if(!pwh4.equals(wh4)) {
		//				driver.switchTo().window(pwh4);
		//			}
		//		}
		//		Thread.sleep(5000);
		//
		//		WebElement w5=	driver.findElement(By.xpath("(//div[text()='VIEW ARTICLE'])[5]"));
		//		Thread.sleep(3000);
		//		w5.click();
		//		Thread.sleep(5000);	
		//		String pwh5=driver.getWindowHandle();
		//		System.out.println();
		//		Set<String> allwh5=driver.getWindowHandles();
		//		for(String wh5:allwh5) {
		//			System.out.println(wh5);
		//			if(!pwh5.equals(wh5)) {
		//				driver.switchTo().window(pwh5);
		//			}
		//		}
		//		Thread.sleep(5000);
		//
		//		JavascriptExecutor js6=(JavascriptExecutor)driver;
		//		js6.executeScript("window.scrollTo(0,500)");
		//		Thread.sleep(3000);
		//
		//		WebElement  w= driver.findElement(By.xpath("//div[text()='SUBSCRIBE TO OUR YOUTUBE']"));
		//		Actions a=new Actions(driver);
		//		a.moveToElement(w).click().perform();
		//		Thread.sleep(5000);	
		//
		//		String pwh6=driver.getWindowHandle();
		//		System.out.println();
		//		Set<String> allwh6=driver.getWindowHandles();
		//		for(String wh6:allwh6) {
		//			System.out.println(wh6);
		//			if(!pwh6.equals(wh6)) {
		//				driver.switchTo().window(pwh6);
		//			}
		//		}
		//		Thread.sleep(5000);	
		//
		//		JavascriptExecutor js7=(JavascriptExecutor)driver;
		//		js7.executeScript("window.scrollTo(500,1800)");
		//		Thread.sleep(3000);


	}}
