
package website;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Sighin extends Baseclass{
	
	@Test
	public void newsigninMethod() throws InterruptedException {
		
		driver.get("https://www.ultraviolette.com/signin");
		Thread.sleep(3000);
		
		//***********verify  title***********	

				String signintitle=driver.getTitle();

				if(signintitle.equals("Ultraviolette Automotive | Sign In")) {
					System.out.println(signintitle);	
				}
				else {
					// Print a message if the title doesn't match
					System.out.println("Title does not match expected title.");
				}
				Thread.sleep(3000);
				
				//*********verify header*************

				String signinheader = new WebDriverWait(driver, Duration.ofSeconds(10))
						.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[text()='SIGN IN']"))).getText();
				if(signinheader.equals("SIGN IN")) {

					System.out.println(signinheader);
				} else {
					// Print a message if the title doesn't match
					System.out.println("Header does not match expected header.");
				}
				Thread.sleep(3000);

		driver.findElement(By.xpath("//input[@class='signin_input__7mAAh']")).sendKeys("dabof49631@inkight.com");       // email
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("(//input[@type='checkbox'])[1]")).click();                       // subscribe check box
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("(//input[@type='checkbox'])[2]")).click();                       // accept check box
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//div[@class='signin_proceedError__pcOPi']")).click();      //  proceed
		Thread.sleep(10000);
		
		driver.findElement(By.xpath("//div[text()='PROCEED']")).click();                //proceed
		Thread.sleep(20000);
		
		//***********#  delivery details page  #************
		
		//***********verify delivery details page title***********	

		String deltitle=driver.getTitle();

		//if(deltitle.equals("//div[text()='DELIVERY DETAILS']")) {
			System.out.println(deltitle);	
		//}
		//else {
			// Print a message if the title doesn't match
//			System.out.println("Title does not match expected title.");
//		}
//		Thread.sleep(3000);
		
		//*********verify delivery details page header*************

		String delheader = new WebDriverWait(driver, Duration.ofSeconds(10))
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[text()='DELIVERY DETAILS']"))).getText();
		if(delheader.equals("DELIVERY DETAILS")) {

			System.out.println(delheader);
		} else {
			// Print a message if the title doesn't match
			System.out.println("Header does not match expected header.");
		}
		Thread.sleep(3000);
	
		
		driver.findElement(By.xpath("//input[@placeholder='FIRST AND LAST NAME']")).sendKeys("Testing");     //first name
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@placeholder='POSTAL CODE']")).sendKeys("454542");
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//input[@placeholder='PHONE NUMBER']")).sendKeys("8152946392");
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//input[@type='checkbox']")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//div[text()='PROCEED']")).click();
		Thread.sleep(10000);
		
		//********** # profile page # ***********
		
		//*********** verify Profile title***********	

		String profiletitle=driver.getTitle();

		//if(profiletitle.equals("")) {
			System.out.println(profiletitle);	
//		}
//		else {
//			// Print a message if the title doesn't match
//			System.out.println("Title does not match expected title.");
//		}
//		Thread.sleep(3000);
		
		//********* verify Profile header*************

		String profileheader = new WebDriverWait(driver, Duration.ofSeconds(10))
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[text()='ACCOUNT DETAILS']"))).getText();
		if(profileheader.equals("ACCOUNT DETAILS")) {

			System.out.println(profileheader);
		} else {
			// Print a message if the title doesn't match
			System.out.println("Header does not match expected header.");
		}
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("(//div[text()='SIGN OUT'])[1]")).click();
		Thread.sleep(3000);
		
	}
		
//		@Test
//		public void existingsigninMethod() throws InterruptedException {
//			
//			driver.get("https://www.ultraviolette.com/signin");
//			Thread.sleep(3000);
//
//			driver.findElement(By.xpath("//input[@class='signin_input__7mAAh']")).sendKeys("elpidio@generateaeg.com");       // email
//			Thread.sleep(3000);
//			
//			driver.findElement(By.xpath("(//input[@type='checkbox'])[1]")).click();                       // subscribe check box
//			Thread.sleep(10000);
//			
//			driver.findElement(By.xpath("(//input[@type='checkbox'])[2]")).click();                       // accept check box
//			Thread.sleep(10000);
//			
//			driver.findElement(By.xpath("//div[@class='signin_proceedError__pcOPi']")).click();      //  proceed
//			Thread.sleep(20000);
//			
//			driver.findElement(By.xpath("//div[text()='PROCEED']")).click();                //proceed
//			Thread.sleep(20000);
//		
//	}

}
