package website;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Legal extends Baseclass  {

	@Test

	public void legalMethod() throws InterruptedException {

		driver.get("https://www.ultraviolette.com/legal");

		//***********verify  title***********	

		String title=driver.getTitle();

		if(title.equals("Ultraviolette Legal Information | Terms and Policies")) {
			System.out.println(title);	
		}
		else {
			// Print a message if the title doesn't match
			System.out.println("Title does not match expected title.");
		}

		//*********verify header*************

		String header = new WebDriverWait(driver, Duration.ofSeconds(10))
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div[text()='LEGAL'])[1]"))).getText();
		if(header.equals("LEGAL")) {

			System.out.println(header);
		} else {
			// Print a message if the title doesn't match
			System.out.println("Header does not match expected header.");
		}

		//***********privacy policy link************

		driver.findElement(By.xpath("//div[text()='PRIVACY POLICY']")).click();
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(3000);

		//*************privacy policy arrow************

		driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div/div/div[4]/a[1]/div/div[2]/img")).click();
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(3000);

		//************terms of use link**************

		WebElement arrows = driver.findElement(By.xpath("//div[text()='TERMS OF USE']"));  // down load arrow
		String spwh=driver.getWindowHandle();              //parent address
		System.out.println(spwh);                          // print parent address
		arrows.click();                                    // click download arrow
		Thread.sleep(3000);
		Set<String> sallwh=driver.getWindowHandles();       // get all address
		for(String swh:sallwh)
		{
			System.out.println(swh);
			if(!spwh.equals(swh)) {
				driver.switchTo().window(spwh);              // switch back to parent address
			}
		}
		Thread.sleep(3000);

		//***********terms of use arrow************

		WebElement arrow2= driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div/div/div[4]/a[2]/div/div[2]/img"));  // down load arrow
		String spwh2=driver.getWindowHandle();              //parent address
		System.out.println(spwh2);                          // print parent address
		arrow2.click();                                    // click download arrow
		Thread.sleep(3000);
		Set<String> sallwh2=driver.getWindowHandles();       // get all address
		for(String swh2:sallwh2)
		{
			System.out.println(swh2);
			if(!spwh2.equals(swh2)) {
				driver.switchTo().window(spwh2);              // switch back to parent address
			}
		}
		Thread.sleep(3000);

		//************sale terms and condition****************

		WebElement arrow3 = driver.findElement(By.xpath("//div[text()='SALE TERMS AND CONDITIONS']"));  // down load arrow
		String spwh3=driver.getWindowHandle();              //parent address
		System.out.println(spwh2);                          // print parent address
		arrow3.click();                                    // click download arrow
		Thread.sleep(3000);
		Set<String> sallwh3=driver.getWindowHandles();       // get all address
		for(String swh3:sallwh3)
		{
			System.out.println(swh3);
			if(!spwh3.equals(swh3)) {
				driver.switchTo().window(spwh3);              // switch back to parent address
			}
		}
		Thread.sleep(3000);

		//***************sale terms and condition************

		WebElement arrow4 = driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div/div/div[4]/a[3]/div/div[2]/img"));  // down load arrow
		String spwh4=driver.getWindowHandle();              //parent address
		System.out.println(spwh4);                          // print parent address
		arrow4.click();                                    // click download arrow
		Thread.sleep(3000);
		Set<String> sallwh4=driver.getWindowHandles();       // get all address
		for(String swh4:sallwh4)
		{
			System.out.println(swh4);
			if(!spwh4.equals(swh4)) {
				driver.switchTo().window(spwh4);              // switch back to parent address
			}
		}
		Thread.sleep(3000);

		//***********Booking Agreement link***********

		WebElement arrow5= driver.findElement(By.xpath("//div[text()='BOOKING AGREEMENT']"));  // down load arrow
		String spwh5=driver.getWindowHandle();              //parent address
		System.out.println(spwh5);                          // print parent address
		arrow5.click();                                    // click download arrow
		Thread.sleep(3000);
		Set<String> sallwh5=driver.getWindowHandles();       // get all address
		for(String swh5:sallwh5)
		{
			System.out.println(swh5);
			if(!spwh5.equals(swh5)) {
				driver.switchTo().window(spwh5);              // switch back to parent address
			}
		}
		Thread.sleep(3000);

		//************Booking Agreement arrow*************

		WebElement arrow6 = driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div/div/div[4]/a[4]/div/div[2]/img"));  // down load arrow
		String spwh6=driver.getWindowHandle();              //parent address
		System.out.println(spwh2);                          // print parent address
		arrow6.click();                                    // click download arrow
		Thread.sleep(3000);
		Set<String> sallwh6=driver.getWindowHandles();       // get all address
		for(String swh6:sallwh6)
		{
			System.out.println(swh6);
			if(!spwh6.equals(swh6)) {
				driver.switchTo().window(spwh6);              // switch back to parent address
			}
		}
		Thread.sleep(3000);

		JavascriptExecutor j=(JavascriptExecutor)driver;
		j.executeScript("window.scrollTo(0,600)");


	}	

}
