package website;                //As expected................
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Testride extends Baseclass {

	@Test

	public void testrideMethod() throws InterruptedException
	{
		driver.get("https://www.ultraviolette.com/global/testride");
		Thread.sleep(1000);

		//***********verify  title***********	

		String title=driver.getTitle();

		if(title.equals("Ultraviolette Test Ride | Experience Our Electric Vehicles")) {
			System.out.println(title);	
		}
		else {
			// Print a message if the title doesn't match
			System.out.println("Title does not match expected title.");
		}

		//*********verify header*************

		String header = new WebDriverWait(driver, Duration.ofSeconds(10))
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[text()='TEST RIDE']"))).getText();
		if(header.equals("TEST RIDE")) {

			System.out.println(header);
		} else {
			// Print a message if the title doesn't match
			System.out.println("Header does not match expected header.");


		}

		//***********Choose the motor cycle************
		WebElement Choose_Motorcycle =driver.findElement(By.id("dropdown_filed"));
		Actions act = new Actions(driver);
		act.moveToElement(Choose_Motorcycle).click().sendKeys("F77 SUPERSTREET").sendKeys(Keys.ENTER).build().perform();
		Thread.sleep(3000);

		//************Enter full name**********************

		WebElement firstnameTextField =driver.findElement(By.id("enteredFirstName"));
		Thread.sleep(2000);
		firstnameTextField.sendKeys("Testing");
		Thread.sleep(2000);


		//*************enter mobile number**************

		WebElement MobileTextFeild =driver.findElement(By.xpath("//input[@id='phone-text']"));
		MobileTextFeild.sendKeys("8152946391");
		Thread.sleep(2000);

		//***************Enter email****************

		WebElement EmailTextFeild =driver.findElement(By.id("enteredEmailId"));
		EmailTextFeild.sendKeys("tejashwini.c@ultraviolette.com");
		Thread.sleep(4000);
		
		//**********Choose space station************

		WebElement Space_Station =driver.findElement(By.xpath("(//*[@id=\"dropdown_filed\"])[2]"));
		Thread.sleep(2000);
		act.moveToElement(Space_Station).click().sendKeys("BENGALURU").sendKeys(Keys.ENTER).build().perform();
		Thread.sleep(2000);
		
		//************Enter pincode*************

		driver.findElement(By.id("enteredPIN")).sendKeys("560071");
		Thread.sleep(2000);


		//************Click next Button*************

		driver.findElement(By.xpath("(//div[text()='BOOK'])[3]")).click();
		Thread.sleep(2000);

	}
}
