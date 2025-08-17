package website;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class home extends Baseclass {

	@Test
	public void homeMethod()throws InterruptedException {


		driver.get("https://www.ultraviolette.com/f77");
		Thread.sleep(2000);

		//***********verify  title***********	

		String title=driver.getTitle();

		if(title.equals("Ultraviolette : High-Performance Electric Vehicles")) {
			System.out.println(title);	
		}
		else {
			// Print a message if the title doesn't match
			System.out.println("Title does not match expected title.");
		}

		Thread.sleep(3000);

		//***********Click book your f77 button************

		WebElement book_your_f77=driver.findElement(By.id("home-configure-expanded-btn"));
		book_your_f77.click();
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(4000);


		//**********Awards Section************

		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollTo(0,500)");
		Thread.sleep(4000);

		//************performance section*************

		js.executeScript("window.scrollTo(500,1000)");
		Thread.sleep(4000);

		//************Performance section****************

		driver.findElement(By.xpath("//div[text()='TOP SPEED']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[text()='RANGE']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[text()='POWER']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[text()='TORQUE']")).click();
		Thread.sleep(3000);

		//*********click download-full-spec-sheet link***********

		WebElement download=driver.findElement(By.xpath("//a[text()='Download Full Specifications']"));

		String parentWindow = driver.getWindowHandle();
		System.out.println("parent window id is :" + parentWindow);
		download.click();
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

		//*********click download arrow************

		WebElement download_arrow =driver.findElement(By.xpath("//img[@alt='arrow']"));

		String parentWindow1 = driver.getWindowHandle();
		System.out.println("parent window id is :" + parentWindow1);
		download_arrow.click();
		Thread.sleep(3000);
		Set<String> childWindow =driver.getWindowHandles();
		for (String childWindow1 : childWindow) 
		{
			System.out.println(childWindow1);
			if(!childWindow.equals(parentWindow1))
			{
				driver.switchTo().window(parentWindow1);
			}
		}


		Thread.sleep(3000);

		//**********Media Review*************


		js.executeScript("window.scrollTo(1000,1800)");
		Thread.sleep(4000);

		driver.findElement(By.id("home-medias-indicator-main-2")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("home-medias-indicator-main-1")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("home-medias-indicator-main-0")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("home-medias-indicator-main-4")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("home-medias-indicator-main-3")).click();
		Thread.sleep(3000);

		//***************Globally expanding section***************

		js.executeScript("window.scrollTo(1800,2500)");
		Thread.sleep(4000);

		Actions a = new Actions(driver);
		WebElement turkey=driver.findElement(By.xpath("//div[text()='TÜRKIYE']"));
		a.moveToElement(turkey).click().perform();
		Thread.sleep(3000);

		WebElement india=driver.findElement(By.xpath("//div[text()='INDIA']"));
		a.moveToElement(india).click().perform();
		Thread.sleep(3000);

		WebElement europe=	driver.findElement(By.xpath("//div[text()='EUROPE']"));
		a.moveToElement(europe).click().perform();
		Thread.sleep(3000);

		WebElement nepal =driver.findElement(By.xpath("//div[text()='NEPAL']"));
		a.moveToElement(nepal).click().perform();
		Thread.sleep(3000);

		//**********Smarttech section**********

		js.executeScript("window.scrollTo(2500,3500)");
		Thread.sleep(3000);

		driver.findElement(By.id("home-smarttech-learnmore-btn")).click();
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(3000);

		//*********locating points*************

		Actions action = new Actions(driver);
		js.executeScript("window.scrollTo(0,3700)");
		Thread.sleep(3000);

		WebElement location1 = driver.findElement(By.id("spoticon-new-console-themes-img"));
		action.moveToElement(location1).click().build().perform();
		Thread.sleep(3000);

		WebElement location2 = driver.findElement(By.id("spoticon-delta-watch-img"));
		action.moveToElement(location2).click().build().perform();
		Thread.sleep(3000);

		WebElement location3 =  driver.findElement(By.id("spoticon-anti-collision-warning-system-img"));
		action.moveToElement(location3).click().build().perform();
		Thread.sleep(3000);

		WebElement location4 = driver.findElement(By.id("spoticon-low-tyre-pressure-alerts-img"));
		action.moveToElement(location4).click().build().perform();
		Thread.sleep(3000);

		WebElement location5 = driver.findElement(By.id("spoticon-crash-alert-img"));
		action.moveToElement(location5).click().build().perform();
		Thread.sleep(3000);

		WebElement location6 = driver.findElement(By.id("spoticon-remote-lockdown-img"));
		action.moveToElement(location6).click().build().perform();

		Thread.sleep(3000);   
		js.executeScript("window.scrollTo(3700,4500)");
		Thread.sleep(3000);

		//**************sound of the future play icon******************

		driver.findElement(By.id("home-jet-start-video-btn")).click();  
		Thread.sleep(7000);
		driver.findElement(By.id("home-jet-mute-video-btn")).click();  // mute button
		Thread.sleep(3000);
		driver.findElement(By.id("home-jet-replay-video-btn")).click(); // replay button
		Thread.sleep(3000);

		//************ 3 personalities section*****************

		js.executeScript("window.scrollTo(4500,5300)");
		Thread.sleep(3000);

		//Actions action = new Actions(driver);	   

		WebElement Airstrike =driver.findElement(By.id("home-personality-airstrike"));
		action.moveToElement(Airstrike).click().build().perform();
		Thread.sleep(3000);
		driver.findElement(By.id("home-personality-airstrike-mute-video-btn"));

		Thread.sleep(2000);
		driver.findElement(By.id("home-personality-airstrike-mute-video-btn")).click();   //mute icon
		Thread.sleep(3000);
		driver.findElement(By.id("home-personality-airstrike-video")).click();
		Thread.sleep(3000);

		WebElement Laser=driver.findElement(By.id("home-personality-laser"));
		action.moveToElement(Laser).click().build().perform();
		Thread.sleep(3000);
		driver.findElement(By.id("home-personality-laser-mute-video-btn"));
		Thread.sleep(2000);
		driver.findElement(By.id("home-personality-laser-mute-video-btn")).click();   // mute icon
		Thread.sleep(3000);
		driver.findElement(By.id("home-personality-laser-video")).click();
		Thread.sleep(3000);

		WebElement Shadow =driver.findElement(By.id("home-personality-shadow"));

		action.moveToElement(Shadow).click().build().perform();
		Thread.sleep(3000);
		driver.findElement(By.id("home-personality-shadow-mute-video-btn"));
		Thread.sleep(2000);
		driver.findElement(By.id("home-personality-shadow-mute-video-btn")).click();   // mute icon
		Thread.sleep(3000);
		driver.findElement(By.id("home-personality-shadow-video")).click();
		Thread.sleep(3000);

		//************ battery section **************

		js.executeScript("window.scrollTo(0,6100)");
		Thread.sleep(4000); 


		//************* advanced 5 levels of safety ************

		js.executeScript("window.scrollTo(6100,6800)");
		Thread.sleep(3000);


		WebElement first_palybutton =driver.findElement(By.id("home-slider-advanced-5-levels-of-safety-1-mechanical-play-btn"));
		action.moveToElement(first_palybutton).click().build().perform();
		Thread.sleep(5000);

		// right button //
		driver.findElement(By.xpath("//*[@id=\"heading\"]/div[3]/button[2]/img")).click();
		Thread.sleep(3000);


		WebElement second_palybutton=driver.findElement(By.id("home-slider-advanced-5-levels-of-safety-2-technical-play-btn"));
		action.moveToElement(second_palybutton).click().build().perform();
		Thread.sleep(5000);

		// right button //
		driver.findElement(By.xpath("//*[@id=\"heading\"]/div[3]/button[2]/img")).click();
		Thread.sleep(3000);

		WebElement third_palybutton=driver.findElement(By.id("home-slider-advanced-5-levels-of-safety-3-mechanical-play-btn"));
		action.moveToElement(third_palybutton).click().build().perform();
		Thread.sleep(3000);

		WebElement forth_palybutton=driver.findElement(By.id("home-slider-advanced-5-levels-of-safety-4-technical-play-btn"));
		action.moveToElement(forth_palybutton).click().build().perform();
		Thread.sleep(3000);  

		//*********** boost standard section ********************



		js.executeScript("window.scrollTo(6900,7500)");
		Thread.sleep(4000);

		//************  take charger *******************

		js.executeScript("window.scrollTo(7500,8700)");
		Thread.sleep(3000);

		//    	driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div/div[13]/div[3]/button[2]/img")).click();
		//		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"home-slider-take-charge-2-technical-play-btn\"]")).click();
		Thread.sleep(3000);
		//		driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div/div[13]/div[3]/button[1]/img")).click();
		//		Thread.sleep(3000);


		//***********Supernova section *************

		js.executeScript("window.scrollTo(8700,9150)");
		Thread.sleep(3000);

		//********** smart ride section ***************

		js.executeScript("window.scrollTo(9150,10100)");
		Thread.sleep(3000);

		driver.findElement(By.id("home-performance-category-selected-hill hold-label")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("home-performance-category-selected-park assist-label")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("home-performance-category-selected-dynamic regen-label")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("home-performance-category-selected-dynamic regen-label")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("home-performance-category-selected-traction control-label")).click();
		Thread.sleep(3000);
		System.out.println("smart ride section is succefully executed");

		//*********** learn more button ****************

		driver.findElement(By.id("home-performance-learn-more-btn")).click();
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(3000);


		//************* Last details section************

		js.executeScript("window.scrollTo(0,11200)");
		Thread.sleep(4000);

		//************ single image ****************

		js.executeScript("window.scrollTo(11600,12100)");
		Thread.sleep(4000);

		//************ infinite to 8 years warranty video *************

		js.executeScript("window.scrollTo(12200,13000)");
		Thread.sleep(6000);

		//************ savings part*************

		js.executeScript("window.scrollTo(13050,13850)");
		Thread.sleep(4000);

		//		for(int i=1;i<=5;i++)
		//		{
		//			driver.findElement(By.xpath("//*[@id=\"home-savings-fuel-price-counter-increment-btn\"]")).click();
		//			Thread.sleep(3000);
		//		}
		//
		//		for(int j=1;j<=5;j++)
		//		{
		//
		//			driver.findElement(By.xpath("//*[@id=\"home-savings-years-counter-increment-btn\"]")).click();
		//			Thread.sleep(3000);
		//		}

		//////		driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div[1]/div[1]/div/div/div[1]/img")).click();
		//////		Thread.sleep(4000);
		//////		driver.navigate().back();

		//************ F77 YouTube videos ************

		js.executeScript("window.scrollTo(13900,14450)");
		Thread.sleep(4000);

		//		for(int i=1;i<=3;i++)
		//		{
		//			driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div/div[19]/div[3]/button[2]/img")).click();
		//			Thread.sleep(4000);
		//		}
		//
		//		for(int j=1;j<=3;j++)
		//		{
		//			driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div/div[19]/div[3]/button[1]/img")).click();
		//			Thread.sleep(4000);
		//		}

		//***********Footer***********
		js.executeScript("window.scrollTo(14450,15150)");
		Thread.sleep(4000);

		//		WebElement config_Button = driver.findElement(By.id("home-flight-mode-configure-btn"));
		//		config_Button.click(); // configure button
		//		Thread.sleep(4000);				
		//		driver.navigate().back();
	}
}
