package website;                               //As expected...................
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Contact extends Baseclass{


	@Test
	public void contactMethod() throws InterruptedException, AWTException {

		driver.get("https://www.ultraviolette.com/contact");
		Thread.sleep(3000);
		Robot robot = new Robot();

		//***********verify title**********

		String title=driver.getTitle();

		if(title.equals("Contact Ultraviolette | Reach Out for Support"))
		{
			System.out.println(title);	
		}
		else {
			// Print a message if the title doesn't match
			System.out.println("Title does not match expected title.");

		}

		//**********verify header**********

		String header = new WebDriverWait(driver, Duration.ofSeconds(10))
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div[text()='CONTACT'])[2]"))).getText();
		if(header.equals("CONTACT")) {

			System.out.println(header);
		} else {
			// Print a message if the title doesn't match
			System.out.println("Header does not match expected header.");
		}

		//**********click general query*********

		WebElement info= driver.findElement(By.xpath("//a[text()='info@ultraviolette.com']"));
		Thread.sleep(3000);
		info.click();
		Thread.sleep(3000);
		robot.keyPress(KeyEvent.VK_ALT);
		robot.keyPress(KeyEvent.VK_F4);  
		robot.keyRelease(KeyEvent.VK_F4);
		robot.keyRelease(KeyEvent.VK_ALT);


		//************click grievances**********

		WebElement support= driver.findElement(By.xpath("//a[text()='support@ultraviolette.com']"));
		Thread.sleep(3000);
		support.click();
		Thread.sleep(3000);
		robot.keyPress(KeyEvent.VK_ALT);
		robot.keyPress(KeyEvent.VK_F4);  
		robot.keyRelease(KeyEvent.VK_F4);
		robot.keyRelease(KeyEvent.VK_ALT);

		//***********click careers***********

		WebElement careers= driver.findElement(By.xpath("//a[text()='careers@ultraviolette.com']"));
		Thread.sleep(3000);
		careers.click();
		Thread.sleep(3000);
		robot.keyPress(KeyEvent.VK_ALT);
		robot.keyPress(KeyEvent.VK_F4);  
		robot.keyRelease(KeyEvent.VK_F4);
		robot.keyRelease(KeyEvent.VK_ALT);

		JavascriptExecutor j=(JavascriptExecutor)driver;
		j.executeScript("window.scrollTo(0,500)");
		Thread.sleep(3000); 

        //************verify the address**********

		String text=driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div/div/div[2]/div[2]/div[4]/div[2]")).getText();
		if(text.equals("Address: No. 529, 530, Intermediate Ring Rd, Krishna Reddy Layout, Amarjyoti Layout, Domlur, Bengaluru, Karnataka 560071"))
		{
			System.out.println(text);	
		}
		else
		{
			System.out.println("Address not matching");
		}
		
		//**********click the map***********

		WebElement hanger =driver.findElement(By.xpath("//img[@alt='Ultraviolette Hangar']"));
		String parentWindow = driver.getWindowHandle();
		System.out.println("parent window id is :" + parentWindow);
		//Thread.sleep(3000);
		hanger.click();
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


	}
}
