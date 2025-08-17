package  website;                 //As expected

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Uvracing extends Baseclass{

	@Test

	public void uvracing() throws InterruptedException {

		driver.get("https://www.ultraviolette.com/f99");

		//***********verify  title***********	

		String title=driver.getTitle();

		if(title.equals("F99 - India's First Superbike")) {
			System.out.println(title);	
		}
		else {
			// Print a message if the title doesn't match
			System.out.println("Title does not match expected title.");
		}
		
		
		//**********click on the youtube video***********
		 
		Thread.sleep(2000);
        driver.findElement(By.xpath("//div[text()='PLAY VIDEO']")).click();
        Thread.sleep(2000);
        
        //********stop the youtube video*********
        
        driver.findElement(By.xpath("//*[@id=\"bhadwa\"]")).click();
        Thread.sleep(2000);


		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollTo(0,1000)");
		Thread.sleep(2000);


		js.executeScript("window.scrollTo(1000,2500)");
		Thread.sleep(2000);


		js.executeScript("window.scrollTo(2500,3500)");
		Thread.sleep(2000);


		js.executeScript("window.scrollTo(3500,4500)");
		Thread.sleep(2000);



		js.executeScript("window.scrollTo(4500,5500)");
		Thread.sleep(2000);


		js.executeScript("window.scrollTo(5500,6500)");
		Thread.sleep(2000);

		//**************Click I am interested button***********

		WebElement element =driver.findElement(By.xpath("//div[text()='I am Interested']"));
		element.click();
		Thread.sleep(4000);


		//************Enter name*****************

		//	WebElement NameTextfield =driver.findElement(By.xpath("//input[@placeholder='FULL NAME']"));
		Actions action = new Actions(driver);
		//	NameTextfield.sendKeys("testing123");
		//	NameTextfield.clear();
		//	Thread.sleep(2000);

		WebElement name = driver.findElement(By.id("enteredFullName"));
		action.moveToElement(name).click().sendKeys("testing").perform();
		Thread.sleep(2000);

		//************Enter country**************

		WebElement country = driver.findElement(By.xpath("//div[text()='COUNTRY']"));
		action.moveToElement(country).click().sendKeys("AFGHANISTAN").sendKeys(Keys.ENTER).perform();
		Thread.sleep(2000);

		//		WebElement StateOption =driver.findElement(By.xpath("//div[text()='STATE']"));
		//		action.moveToElement(StateOption).click().sendKeys("Ghazni").sendKeys(Keys.ENTER).perform();
		//		Thread.sleep(2000);
		//		
		//		WebElement pincode =driver.findElement(By.id("enteredPincode"));
		//		pincode.sendKeys("123456");
		//		Thread.sleep(2000);

		//***********Enter phone Number************

		WebElement phone =driver.findElement(By.id("phone-text"));
		phone.sendKeys("8152946391");
		Thread.sleep(2000);

		//***************Enter email id***************

		WebElement email = driver.findElement(By.id("enteredEmailId"));
		email.sendKeys("ssdsf123@gmail.com");
		Thread.sleep(2000);

		//**************Click next*****************

		WebElement nextButton =driver.findElement(By.xpath("//div[text()='NEXT']"));
		nextButton.click();
		Thread.sleep(2000);

		//**************Click the Explore f99 button**************

		WebElement button=driver.findElement(By.xpath("//div[text()='EXPLORE THE F99']"));
		button.click();
		Thread.sleep(2000);




		//		JavascriptExecutor a1=(JavascriptExecutor)driver;
		//		a1.executeScript("window.scrollTo(0,3900)"); 
		//		Thread.sleep(3000);
		//		driver.findElement(By.xpath("//div[text()='I am Interested']")).click(); // register your interest
		//		Thread.sleep(3000);
		//		driver.navigate().back(); // UV RACING
		//		Thread.sleep(3000);
		//		JavascriptExecutor aa1=(JavascriptExecutor)driver;
		//		aa1.executeScript("window.scrollTo(0,6000)"); //end
		//		Thread.sleep(3000);
	}
}
