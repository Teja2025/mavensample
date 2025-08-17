package website;                  //As expected 
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Limitedpage extends Baseclass{


	@Test
	public void limitedMethod() throws InterruptedException {


		driver.get("https://www.ultraviolette.com/limited");
		Thread.sleep(3000);


		//***********verify  title***********	

		String title=driver.getTitle();

		if(title.equals("Ultraviolette Limited Edition Electric Vehicles | Ultraviolette F77 Space Edition")) {
			System.out.println(title);	
		}
		else {
			// Print a message if the title doesn't match
			System.out.println("Title does not match expected title.");
		}


		JavascriptExecutor jse =(JavascriptExecutor)driver;
		jse.executeScript("window.scrollTo(0,1000)");
		Thread.sleep(2000);

		JavascriptExecutor jse01 =(JavascriptExecutor)driver;
		jse01.executeScript("window.scrollTo(1000,2000)");
		Thread.sleep(2000);

		JavascriptExecutor jse02 =(JavascriptExecutor)driver;
		jse02.executeScript("window.scrollTo(2000,3000)");
		Thread.sleep(2000);


		//**********Click download full specification link ***********


		WebElement Download=driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div[2]/div[1]/div[9]/div[1]/div[2]/div/a"));  // down load arrow
		String spwh=driver.getWindowHandle();              //parent address
		System.out.println(spwh);                          // print parent address
		Download.click();                                    // click download arrow
		Thread.sleep(3000);
		Set<String> sallwh=driver.getWindowHandles();       // get all address
		for(String swh:sallwh)
		{
			System.out.println(swh);
			if(!spwh.equals(swh)) {
				driver.switchTo().window(spwh);              // switch back to parent address
			}
		}

		Thread.sleep(2000);

		//***********Enter mobile number************

		WebElement mobileField = driver.findElement(By.id("phone-text"));
		mobileField.sendKeys("81529463911");
		Thread.sleep(3000);

		System.out.println("11 digit mobile number should not accept");
		mobileField.clear();

		mobileField.sendKeys("8152946391");

		//************click notify button***************

		WebElement NotifyButton =driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div[2]/div[2]/div[2]/div[4]/div[2]/div/div/div[2]"));
		NotifyButton.click();
		Thread.sleep(3000);
		System.out.println("Thank you message should occur");

	}

}
