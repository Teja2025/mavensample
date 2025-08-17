package website;                   //As expected................

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Enquiry extends Baseclass{



	@Test
	public void enquiryMethod() throws InterruptedException {

		driver.get("https://www.ultraviolette.com/enquiry");
		Thread.sleep(3000);

		//***********Verify title***********

		String title=driver.getTitle();

		if(title.equals("Contact Ultraviolette | Get in Touch with Our Team")) {
			System.out.println(title);	
		}
		else {
			// Print a message if the title doesn't match
			System.out.println("Title does not match expected title.");
		}

		//*************Verify header*************

		String header = new WebDriverWait(driver, Duration.ofSeconds(10))
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[text()='ENQUIRE HERE']"))).getText();
		if(header.equals("ENQUIRE HERE")) {

			System.out.println(header);
		} else {
			// Print a message if the heading doesn't match
			System.out.println("Header does not match expected header.");
		}

		//*************Click choose enquire about and f77*************

		Actions action = new Actions(driver);
		WebElement about =driver.findElement(By.xpath("//div[text()='SELECT ONE']"));
		action.moveToElement(about).click().sendKeys("f77").sendKeys(Keys.ENTER).build().perform();
		Thread.sleep(2000);

		//************Click select your query and others*************

		WebElement help =driver.findElement(By.xpath("//div[text()='SELECT YOUR QUERY']"));
		action.moveToElement(help).click().sendKeys("Others..").sendKeys(Keys.ENTER).build().perform();
		Thread.sleep(2000);

		//***************Enter the query***********

		WebElement Query  =driver.findElement(By.id("enteredQuery"));
		action.moveToElement(Query).doubleClick().sendKeys("Testing enquiry page").sendKeys(Keys.ENTER).build().perform();
		Thread.sleep(2000);


		//*************Enter name***********		
		WebElement NameTextfield =driver.findElement(By.id("enteredFullName"));
		NameTextfield.sendKeys("Teja122345");
		NameTextfield.clear();
		Thread.sleep(2000);
		NameTextfield.sendKeys("Teja");
		Thread.sleep(2000);

		//***********Enter country************

		WebElement countryFeild =driver.findElement(By.xpath("//div[text()='COUNTRY']"));
		//countryFeild.click();
		Thread.sleep(5000);
		action.moveToElement(countryFeild).click().sendKeys("INDIA").build().perform();
		Thread.sleep(5000);

		driver.findElement(By.xpath("//div[text()='INDIA']")).click();
		Thread.sleep(3000);

		//***************Enter state*************

		WebElement stateFeild =driver.findElement(By.xpath("//div[text()='STATE']"));
		//		countryFeild.click();
		//		Thread.sleep(2000);
		action.moveToElement(stateFeild).click().sendKeys("karnataka").sendKeys(Keys.ENTER).perform();
		Thread.sleep(2000);

		//***************Enter pincode***********

		WebElement Pincode=driver.findElement(By.id("enteredPincode"));
		//		Thread.sleep(2000);
		Pincode.sendKeys("55555");
		Thread.sleep(2000);
		Pincode.clear();
		Pincode.sendKeys("888888");

		//**********Enter phone number***********

		//WebElement mobileNumber =driver.findElement(By.xpath("//input[@placeholder='+91 PHONE NUMBER']"));
		WebElement mobileNumber =driver.findElement(By.id("phone-text"));
		mobileNumber.sendKeys("67899abcde");
		Thread.sleep(2000);
		mobileNumber.clear();
		Thread.sleep(2000);
		mobileNumber.sendKeys("8152946391");
		Thread.sleep(2000);

		//***********Enter email**********

		WebElement EmailFeild =driver.findElement(By.id("enteredEmailId"));
		EmailFeild.sendKeys("fdhvsjyijhgh");
		Thread.sleep(2000);
		EmailFeild.clear();
		EmailFeild.sendKeys("tejashwini.c@ultraviolette.com");
		Thread.sleep(2000);

		//**********Click next button***********	

		WebElement nextButton1 =driver.findElement(By.xpath("//div[text()='NEXT']"));
		nextButton1.click();
		System.out.println("Thank you message should be display");
		Thread.sleep(2000);

		//***********come back to enquiry page*************

		driver.navigate().back();
		Thread.sleep(2000);

		//*********click choose enquire about and dealership********

		WebElement dealer =driver.findElement(By.xpath("//div[text()='SELECT ONE']"));
		action.moveToElement(dealer).click().sendKeys("DEALERSHIP / DISTRIBUTORSHIP").sendKeys(Keys.ENTER).build().perform();
		Thread.sleep(2000);

		//**********Click next button***********	

		WebElement nextButton2 =driver.findElement(By.xpath("//div[text()='NEXT']"));
		nextButton2.click();
		Thread.sleep(2000);
		System.out.println("it navigates retail patnership page");

		//***********come back to Enquiry page*************

		driver.navigate().back();
		Thread.sleep(2000);
		
		
		
		

		
		

		
		
		
		
	}

}
