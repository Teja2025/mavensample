package website;

import java.util.Set;
//import java.util.Set;
//import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
//import org.openqa.selenium.support.ui.Select;

public class Configure extends Baseclass{

	@Test

	public void configureMethod() throws InterruptedException {


		//***********configure 1st page****************

		driver.get("https://www.ultraviolette.com/configure");

		//************click f77 mach2 recon************

		driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div[1]/div[1]/div[3]/div")).click();
		Thread.sleep(3000);

		//**********click F77 mach2**************

		driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div[1]/div[1]/div[1]/div/div/div")).click();
		Thread.sleep(3000);


		//		//*************compare variants***********
		//
		//		driver.findElement(By.xpath("//div[text()='COMPARE VARIANTS']")).click();
		//		Thread.sleep(3000);
		//
		//		WebElement download_spec_sheet =driver.findElement(By.xpath("//div[text()='DOWNLOAD FULL SPEC SHEET']"));
		//		String parentWindow = driver.getWindowHandle();
		//		System.out.println("parent window id is :" + parentWindow);
		//		download_spec_sheet.click();
		//		Thread.sleep(5000);
		//		Set<String> childWindows =driver.getWindowHandles();
		//		for (String childWindow : childWindows) 
		//		{
		//			System.out.println(childWindow);
		//			if(!childWindow.equals(parentWindow))
		//			{
		//				driver.switchTo().window(parentWindow);
		//			}
		//		}
		//		Thread.sleep(3000);

		//***********Get back configure page************

		//		driver.findElement(By.xpath("//*[@id=\"VARIANT_SIDE_PANEL\"]/div/div/div[2]/div[1]/img")).click();
		//		Thread.sleep(3000);

		//***********proceed to next stage************

		driver.findElement(By.xpath("//span[text()='PROCEED TO NEXT STAGE']")).click();
		Thread.sleep(5000);


		//		//***********configure 2nd page************
		//
		//		driver.findElement(By.xpath("//button[text()='mach 2 recon']")).click();   //click mach2 recon
		//		Thread.sleep(3000);
		//
		//		driver.findElement(By.xpath("//button[text()='mach 2']")).click();         // click mach2
		//		Thread.sleep(3000);
		//
		//		driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div/div[1]/div[3]/div/div[3]/p")).click();  // click potential savings 
		//		Thread.sleep(3000);
		//
		//		driver.findElement(By.xpath("//*[@id=\"VARIANT_SIDE_PANEL\"]/div/div/div/div[2]/div[1]/img")).click();   // close potential savings 
		//		Thread.sleep(3000);

		//***********image section************

		//		 for(int i=1;i<=7;i++)
		//			{
		//			WebElement w=driver.findElement(By.xpath("//div[contains(@class,'absolute right-4 z-50 cursor-pointer')]"));   // images front arrow
		//			Actions g1=new Actions(driver);
		//			g1.moveToElement(w).click().perform();
		//			Thread.sleep(1000);
		//			}
		//			Thread.sleep(20000);
		//			
		//			for(int i=1;i<=7;i++) {
		//			WebElement w2=driver.findElement(By.xpath("//div[contains(@class,'absolute left-4 z-50 cursor-pointer rotate-180 ')]"));    // images back arrow
		//			Actions g2=new Actions(driver);
		//			g2.moveToElement(w2).click().perform();
		//			Thread.sleep(1000);
		//			} 

		//**********Colors section************

		//**********Airstrike*****************

//		driver.findElement(By.xpath("//div[text()='AIRSTRIKE']")).click();
//		Thread.sleep(3000);
//
//		driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div/div[2]/section[2]/div/div[2]/div[1]/div[2]/div/div[1]/div[2]/div/div/div/img")).click(); //	Stellar
//		Thread.sleep(3000);
//
//		driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div/div[2]/section[2]/div/div[2]/div[1]/div[2]/div/div[1]/div[3]/div/div/div/img")).click(); //Lightning Blue
//		Thread.sleep(3000);
//
//		driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div/div[2]/section[2]/div/div[2]/div[1]/div[2]/div/div[1]/div[1]/div/div/div/img")).click(); //Super Sonic Silver
//		Thread.sleep(3000);
//
		JavascriptExecutor js = (JavascriptExecutor)driver;
//		js.executeScript("window.scrollTo(0,300)");
//		Thread.sleep(3000);
//
//		//**************Shadow***********
//
		Actions action = new Actions(driver);
//		WebElement shadow =driver.findElement(By.xpath("//div[text()='SHADOW']"));
//		action.moveToElement(shadow).click().build().perform();
//		Thread.sleep(5000);
//
//		driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div/div[2]/section[2]/div/div[2]/div[2]/div[2]/div/div[1]/div[2]/div/div/div/img")).click(); //	Asteroid grey
//		Thread.sleep(3000);
//
//		driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div/div[2]/section[2]/div/div[2]/div[2]/div[2]/div/div[1]/div[3]/div/div/div/img")).click(); // Cosmic block
//		Thread.sleep(3000);
//
//		driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div/div[2]/section[2]/div/div[2]/div[2]/div[2]/div/div[1]/div[1]/div/div/div/img")).click(); // Stealth grey
//		Thread.sleep(3000);
//
//		//*****************Laser************
//
//		WebElement laser =driver.findElement(By.xpath("//div[text()='LASER']"));
//		action.moveToElement(laser).click().build().perform();
//		Thread.sleep(5000);
//
//
//		driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div/div[2]/section[2]/div/div[2]/div[3]/div[2]/div/div[1]/div[2]/div/div/div/img")).click(); //	After burner yellow
//		Thread.sleep(3000);
//
//		driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div/div[2]/section[2]/div/div[2]/div[3]/div[2]/div/div[1]/div[3]/div/div/div/img")).click(); // plasma red
//		Thread.sleep(3000);
//
//		driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div/div[2]/section[2]/div/div[2]/div[3]/div[2]/div/div[1]/div[1]/div/div/div/img")).click(); // Turbo red
//		Thread.sleep(3000);

		js.executeScript("window.scrollTo(0,500)");
		Thread.sleep(3000);

		
		js.executeScript("window.scrollTo(500,1500)");
		Thread.sleep(3000);

		js.executeScript("window.scrollTo(1500,2000)");
		Thread.sleep(3000);

		js.executeScript("window.scrollTo(3000,4000)");
		Thread.sleep(3000);	


		//***************Mach 2 Recon upgrades************

		driver.findElement(By.xpath("//button[text()='mach 2']")).click();
		Thread.sleep(3000);

		driver.findElement(By.xpath("//button[text()='mach 2 recon']")).click();
		Thread.sleep(3000);

		driver.findElement(By.xpath("//button[text()='mach 2']")).click();
		Thread.sleep(3000);

		//************info icon*********************

		driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div/div[1]/div[3]/div/div[2]/div[2]/div[2]/div[2]/img")).click();
		Thread.sleep(3000);

		//****************Terms and conditions link **************

		driver.findElement(By.xpath("//a[text()='T&C']")).click();
		Thread.sleep(3000);

		//****************** close pop up********************

		driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div/div[1]/div[6]/div/div[2]/div/div/div[1]/div[2]/img")).click();


		// mach 2 upgrades//
		driver.findElement(By.xpath("//button[text()='mach 2']")).click();
		Thread.sleep(3000);

		js.executeScript("window.scrollTo(0,4000)");
		Thread.sleep(3000);

		driver.findElement(By.xpath("//h2[text()='Optional upgrades']")).click();
		Thread.sleep(3000);
		//		
		WebElement upgrade1=driver.findElement(By.xpath("//div[text()='MACH 2 Racing Pack']"));
		action.moveToElement(upgrade1).click().build().perform();
		Thread.sleep(3000);

		WebElement upgrade2=driver.findElement(By.xpath("//div[text()='Violette A.I.']"));
		action.moveToElement(upgrade2).click().build().perform();
		Thread.sleep(3000);

		WebElement upgrade3=driver.findElement(By.xpath("//div[text()='Boost Charger']"));
		action.moveToElement(upgrade3).click().build().perform();
		Thread.sleep(3000);

		WebElement upgrade4 =driver.findElement(By.xpath("//div[text()='UV Care Plus Warranty']"));
		action.moveToElement(upgrade4).click().build().perform();
		Thread.sleep(3000);

		//************* Mach 2 Recon***************

		driver.findElement(By.xpath("//button[text()='mach 2 recon']")).click();
		Thread.sleep(3000);
	
		js.executeScript("window.scrollTo(0,4000)");
		Thread.sleep(3000);

		driver.findElement(By.xpath("//span[text()='ADD FOR ₹ 11094']")).click();
		Thread.sleep(3000);
		
		js.executeScript("window.scrollTo(4000,4500)");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//span[text()='ADD FOR ₹ 42500']")).click();
		Thread.sleep(3000);
		
		js.executeScript("window.scrollTo(4500,5000)");
		Thread.sleep(3000);
		//		
		driver.findElement(By.xpath("//span[text()='ADD FOR ₹ 40000']")).click();
		Thread.sleep(3000);


		driver.findElement(By.xpath("//button[text()='CONFIRM CONFIGURATION']")).click();
		Thread.sleep(4000);


		/// sign in page ///
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@placeholder='ENTER EMAIL']")).sendKeys("joanna45@paeurrtde.com");             //mail
		Thread.sleep(3000);

		driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div/div[1]/div[1]/div[2]/div[2]/div[1]/input")).click();
		Thread.sleep(3000);

		WebElement proceedButton =driver.findElement(By.xpath("//div[text()='PROCEED']"));
		proceedButton.click();
		Thread.sleep(35000);

		//		WebElement proceedButton1 =driver.findElement(By.xpath("//div[text()='PROCEED']"));
		//		Thread.sleep(20000);
		//		 proceedButton1.click();
		//		 Thread.sleep(30000);

		//////// Delivery Details page //////////////

		//name text field //
		WebElement name_field = driver.findElement(By.xpath("//input[@placeholder='FIRST AND LAST NAME']"));
		Thread.sleep(10000);
		action.moveToElement(name_field).click().sendKeys("Testing").build().perform();

		///// country drop down ///

		//		driver.findElement(By.id("country")).click();
		//		Thread.sleep(3000);
		//		
		//		driver.findElement(By.xpath("//option[text()='Greenland']")).click();
		//		Thread.sleep(3000);
		//		
		///// pincode field ////

		WebElement pincode_field =driver.findElement(By.xpath("//input[@placeholder='PINCODE']"));
		pincode_field.click();
		Thread.sleep(3000);
		pincode_field.sendKeys("23dfgtrg22@##");
		Thread.sleep(3000);
		pincode_field.clear();
		Thread.sleep(3000);
		pincode_field.sendKeys("523108");
		Thread.sleep(3000);

		/////// phone number field ///////

		WebElement phonenumber_field = driver.findElement(By.xpath("//input[@placeholder='PHONE NUMBER']"));
		phonenumber_field.click();
		Thread.sleep(3000);
		phonenumber_field.sendKeys("46878379889983");
		Thread.sleep(3000);
		phonenumber_field.clear();
		phonenumber_field.sendKeys("46878379889983#%$$%$");
		Thread.sleep(3000);
		phonenumber_field.clear();
		phonenumber_field.sendKeys("9999999999");
		Thread.sleep(3000);

		////// proceed button ///////

		driver.findElement(By.xpath("//div[text()='PROCEED']")).click();

		////// Summary page /////
		Thread.sleep(5000);
		WebElement edit_design =driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div/div[3]/div/div[1]/button"));
		Thread.sleep(2000);
		action.moveToElement(edit_design).click().build().perform();
		////// changing bike color //////
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div/div[2]/section[2]/div/div[2]/div[1]/div[2]/div/div[1]/div[3]/div/div/div/img")).click();

		js.executeScript("window.scrollTo(0,5000)");
		Thread.sleep(3000);

		driver.findElement(By.xpath("//h2[text()='Optional upgrades']")).click();
		Thread.sleep(3000);
			
		//************ mach 2 upgrades***********
				
		WebElement upgrade01=driver.findElement(By.xpath("//div[text()='Comes with the seamlessly designed & engineered Aero Disc, Tank Grips & Lever Guards.']"));
		action.moveToElement(upgrade01).click().build().perform();
		Thread.sleep(3000);

		driver.findElement(By.xpath("//button[text()='CONFIRM CONFIGURATION']")).click();
		Thread.sleep(3000);

		////////check box /////////

		driver.findElement(By.xpath("//input[@type='checkbox']")).click();
		Thread.sleep(3000);

		
		js.executeScript("window.scrollTo(0,5000)");
		Thread.sleep(2000);


		WebElement booking =driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div/div[3]/div/div[5]/div[2]/a"));
		String parentWindow001 = driver.getWindowHandle();
		System.out.println("parent window id is :" + parentWindow001);
		booking.click();
		Thread.sleep(5000);
		Set<String> childWindows001 =driver.getWindowHandles();
		for (String childWindow1 : childWindows001) 
		{
			System.out.println(childWindow1);
			if(!childWindow1.equals(parentWindow001))
			{
				driver.switchTo().window(parentWindow001);
			}
		}
		Thread.sleep(3000);




		WebElement terms =driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div/div[3]/div/div[7]/a"));

		String parentWindow002 = driver.getWindowHandle();
		System.out.println("parent window id is :" + parentWindow002);
		terms.click();
		Thread.sleep(5000);
		Set<String> childWindows002 =driver.getWindowHandles();
		for (String childWindow2 : childWindows002) 
		{
			System.out.println(childWindow2);
			if(!childWindow2.equals(parentWindow002))
			{
				driver.switchTo().window(parentWindow002);
			}
		}
		Thread.sleep(3000);

		driver.findElement(By.xpath("//div[text()='PAY ₹ 5,000']")).click();
		Thread.sleep(5000);

		WebElement close_arrow =driver.findElement(By.xpath("//button[text()='Skip']"));
		Thread.sleep(3000);
		close_arrow.click();

		//************cancel booking************

		driver.findElement(By.xpath("//button[text()='Cancel']")).click();
		Thread.sleep(6000);

		driver.findElement(By.xpath("//div[text()='GO BACK TO CONFIGURE']")).click();
		Thread.sleep(4000);

		//**********profile *******************

		driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[1]/div[1]/div[4]/div[2]/img")).click();
		Thread.sleep(4000);

		//**************signout button*************

		driver.findElement(By.xpath("//div[text()='SIGN OUT']")).click();
		Thread.sleep(4000);


		//**************** user after sign out  flow**************************



		driver.get("https://www.ultraviolette.com/configure");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//span[text()='PROCEED TO NEXT STAGE']")).click();
		Thread.sleep(5000);


		JavascriptExecutor jse006 = (JavascriptExecutor)driver;
		jse006.executeScript("window.scrollTo(0,5000)");
		Thread.sleep(3000);

		driver.findElement(By.xpath("//button[text()='CONFIRM CONFIGURATION']")).click();
		Thread.sleep(2000);


		/// sign in page ///

		driver.findElement(By.xpath("//input[@placeholder='ENTER EMAIL']")).sendKeys("tejashwinic1234@gmail.com");
		Thread.sleep(3000);

		driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div/div[1]/div[1]/div[2]/div[1]/input")).click();
		Thread.sleep(3000);

		WebElement proceedButton0 =driver.findElement(By.xpath("//div[text()='PROCEED']"));
		proceedButton0.click();
		Thread.sleep(3000);
		WebElement proceedButton01 =driver.findElement(By.xpath("//div[text()='PROCEED']"));

		proceedButton01.click();
		Thread.sleep(20000);

		///////////////////  profile page ////////////////////////

		/////////// configure page ////////////

		WebElement profile_page =driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div[1]/div[1]/div[1]/div[3]/div[3]/img"));
		Thread.sleep(5000);
		action.moveToElement(profile_page).click().build().perform();
		Thread.sleep(3000);

		driver.findElement(By.xpath("//span[text()='PROCEED TO NEXT STAGE']")).click();
		Thread.sleep(5000);


		JavascriptExecutor jse0006 = (JavascriptExecutor)driver;
		jse0006.executeScript("window.scrollTo(0,5000)");
		Thread.sleep(3000);

		WebElement confirm_configure =driver.findElement(By.xpath("//button[text()='CONFIRM CONFIGURATION']"));
		Thread.sleep(2000);
		confirm_configure.click();

		//////////// summary page ////////////////

		driver.findElement(By.xpath("//button[text()='< EDIT YOUR DESIGN']")).click();
		Thread.sleep(4000);

		/////////////// profile page sign out option //////////////

		driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[1]/div[1]/div[4]/div[2]/img")).click();
		Thread.sleep(4000);

		driver.findElement(By.xpath("//div[text()='SIGN OUT']")).click();
		Thread.sleep(4000);



		////////////////////// paid user flow ////////////



		driver.get("https://www.ultraviolette.com/configure");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//span[text()='PROCEED TO NEXT STAGE']")).click();
		Thread.sleep(5000);

		driver.findElement(By.xpath("//button[text()='CONFIRM CONFIGURATION']")).click();
		Thread.sleep(4000);

		driver.findElement(By.xpath("//input[@placeholder='ENTER EMAIL']")).sendKeys("tejashwini.c@ultraviolette.com");
		Thread.sleep(3000);

		driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div/div[1]/div[1]/div[2]/div[1]/input")).click();
		Thread.sleep(3000);

		WebElement proceedButton00 =driver.findElement(By.xpath("//div[text()='PROCEED']"));
		proceedButton00.click();
		Thread.sleep(3000);
		WebElement proceedButton011 =driver.findElement(By.xpath("//div[text()='PROCEED']"));

		proceedButton011.click();
		Thread.sleep(20000);

		///////////////// profile page /////////////////////

		JavascriptExecutor jse062 = (JavascriptExecutor)driver;
		jse062.executeScript("window.scrollTo(0,1000)");
		Thread.sleep(2000);

		JavascriptExecutor jse063 = (JavascriptExecutor)driver;
		jse063.executeScript("window.scrollTo(1000,2000)");
		Thread.sleep(2000);






		//		driver.findElement(By.xpath("//span[text()='PROCEED TO NEXT STAGE']")).click();  // proceed to next stage
		//		Thread.sleep(3000);
		//		
		//		for(int i=1;i<=5;i++)
		//		{
		//		WebElement w=driver.findElement(By.xpath("//div[contains(@class,'absolute right-4 z-50 cursor-pointer')]"));   // images front arrow
		//		Actions g1=new Actions(driver);
		//		g1.moveToElement(w).click().perform();
		//		Thread.sleep(3000);
		//		}
		//		Thread.sleep(20000);
		//		
		//		for(int i=1;i<=5;i++) {
		//		WebElement w2=driver.findElement(By.xpath("//div[contains(@class,'absolute left-4 z-50 cursor-pointer rotate-180 ')]"));    // images back arrow
		//		Actions g2=new Actions(driver);
		//		g2.moveToElement(w2).click().perform();
		//		Thread.sleep(3000);
		//		} 
		//		
		//		driver.findElement(By.xpath("//div[text()='COMPARE VARIANTS']")).click();
		//		Thread.sleep(3000);
		//		driver.findElement(By.xpath("//*[@id=\"VARIANT_SIDE_PANEL\"]/div/div/div[1]/img")).click();
		//		Thread.sleep(3000);
		//		driver.findElement(By.xpath("//p[text()='POTENTIAL FUEL SAVINGS']")).click();
		//		Thread.sleep(3000);
		//		driver.findElement(By.xpath("//*[@id=\"VARIANT_SIDE_PANEL\"]/div/div/div/div[1]/img")).click();
		//		Thread.sleep(3000);
		//		driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div/div[1]/div[3]/div/div[2]/div[1]/div/div/button[2]")).click();
		//		Thread.sleep(3000);
		//		driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div/div[1]/div[3]/div/div[2]/div[1]/div/div/button[1]")).click();
		//		Thread.sleep(3000);
		//	
		//		WebElement w1=driver.findElement(By.xpath("//div[text()='LASER']"));   // laser
		//		Actions a90=new Actions(driver);
		//		a90.moveToElement(w1).click().perform();
		//		Thread.sleep(3000);
		//		driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div/div[2]/section[2]/div/div[2]/div[1]/div[2]/div/div[1]/div[2]/div/div/div/img")).click();
		//		Thread.sleep(3000);
		//		driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div/div[2]/section[2]/div/div[2]/div[1]/div[2]/div/div[1]/div[3]/div/div/div/img")).click();
		//		Thread.sleep(3000);
		//		driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div/div[2]/section[2]/div/div[2]/div[1]/div[2]/div/div[1]/div[1]/div/div/div/img")).click();
		//		Thread.sleep(3000);
		//
		//
		//		JavascriptExecutor j=(JavascriptExecutor)driver;   //scroll to shadow
		//		j.executeScript("window.scrollTo(0,100)");
		//
		//		WebElement w2= driver.findElement(By.xpath("//div[text()='SHADOW']"));      //shadow
		//		Actions b=new Actions(driver);
		//		b.moveToElement(w2).click().perform();
		//		Thread.sleep(4000);
		//		driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div/div[2]/section[2]/div/div[2]/div[2]/div[2]/div/div[1]/div[2]/div/div/div/img")).click();
		//		Thread.sleep(3000);
		//		driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div/div[2]/section[2]/div/div[2]/div[2]/div[2]/div/div[1]/div[3]/div/div/div/img")).click();
		//		Thread.sleep(3000);
		//		driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div/div[2]/section[2]/div/div[2]/div[2]/div[2]/div/div[1]/div[1]/div/div/div/img")).click();
		//		Thread.sleep(3000);
		//
		//		WebElement w3=driver.findElement(By.xpath("//div[text()='AIRSTRIKE']"));       //airstaike
		//		Actions c=new Actions(driver);
		//		c.moveToElement(w3).click().perform();
		//		Thread.sleep(4000);
		//		driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div/div[2]/section[2]/div/div[2]/div[3]/div[2]/div/div[1]/div[2]/div/div/div/img")).click();
		//		Thread.sleep(3000);
		//		driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div/div[2]/section[2]/div/div[2]/div[3]/div[2]/div/div[1]/div[3]/div/div/div/img")).click();
		//		Thread.sleep(3000);
		//		driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div/div[2]/section[2]/div/div[2]/div[3]/div[2]/div/div[1]/div[1]/div/div/div/img")).click();
		//		Thread.sleep(3000);*/
		//		
		//		JavascriptExecutor k=(JavascriptExecutor)driver;           // scroll upto optional upgrades
		//		k.executeScript("window.scrollTo(100,4500)");
		//		
		//		driver.findElement(By.xpath("//h2[text()='Optional upgrades']")).click();    // optional upgrades  
		//		Thread.sleep(3000);
		//		
		//		JavascriptExecutor l=(JavascriptExecutor)driver;      // scroll 
		//		l.executeScript("window.scrollTo(4500,4700)");
		//		Thread.sleep(3000);
		//
		//		WebElement t1=driver.findElement(By.xpath("//*[@id=\"section-five\"]/div[2]/div[1]/div/div[3]/div"));   // 1
		//		Actions a1=new Actions(driver);
		//		a1.moveToElement(t1).click().perform();
		//		Thread.sleep(3000);
		//
		//		WebElement t2=driver.findElement(By.xpath("//*[@id=\"section-five\"]/div[2]/div[2]/div/div[3]/div"));    //2
		//		Actions a2=new Actions(driver);
		//		a2.moveToElement(t2).click().perform();
		//		Thread.sleep(3000);
		//
		//		JavascriptExecutor m=(JavascriptExecutor)driver;      //scroll 
		//		m.executeScript("window.scrollTo(4700,5000)");
		//		Thread.sleep(3000);
		//
		//		WebElement t3=	driver.findElement(By.xpath("//*[@id=\"section-five\"]/div[2]/div[3]/div/div[3]/div"));     // 3
		//		Actions a3=new Actions(driver);
		//		a3.moveToElement(t3).click().perform();
		//		Thread.sleep(3000);
		//
		//		WebElement t4=driver.findElement(By.xpath("//*[@id=\"section-five\"]/div[2]/div[4]/div/div[3]/div"));        // 4
		//		Actions a4=new Actions(driver);
		//		a4.moveToElement(t4).click().perform();
		//		Thread.sleep(3000);
		//
		//		driver.findElement(By.xpath("//button[text()='CONFIRM CONFIGURATION']")).click();                         // confirm configuration
		//		Thread.sleep(5000);
		//		
		//		driver.findElement(By.xpath("///input[@placeholder='ENTER EMAIL']")).sendKeys("eli2@hometownyi.com");   // email
		//		Thread.sleep(5000);
		//		
		//		driver.findElement(By.xpath("//input[@type='checkbox']")).click();                       // check box
		//		Thread.sleep(10000);
		//		
		//		driver.findElement(By.xpath("//div[@class='signin_proceedError__pcOPi']")).click();      //  proceed
		//		Thread.sleep(20000);
		//		driver.findElement(By.xpath("//div[text()='PROCEED']")).click();                //proceed
		//		Thread.sleep(20000);
		//		
		//		driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div[1]/div[1]/div/div[1]")).click();
		//		Thread.sleep(10000);
		//		
		//		driver.findElement(By.xpath("//input[@class='signin_input__7mAAh']")).sendKeys("eli2@hometownyi.com");   // email
		//		Thread.sleep(5000);
		//		
		//		driver.findElement(By.xpath("//input[@type='checkbox']")).click();                       // check box
		//		Thread.sleep(10000);
		//		
		//		driver.findElement(By.xpath("//div[@class='signin_proceedError__pcOPi']")).click();      //  proceed
		//		Thread.sleep(20000);
		//		driver.findElement(By.xpath("//div[text()='PROCEED']")).click();                //proceed
		//		Thread.sleep(20000);
		//		
		//		driver.findElement(By.xpath("//input[@placeholder='FIRST AND LAST NAME']")).sendKeys("Tejashwini");
		//		Thread.sleep(3000);
		//		
		//		WebElement w45=driver.findElement(By.xpath("//select[@id='country']"));
		//		Select s =new Select(w45);
		//		s.selectByVisibleText("India");
		//		
		//		driver.findElement(By.xpath("//input[@placeholder='PINCODE']")).sendKeys("2345");
		//		Thread.sleep(3000);
		//		
		//		driver.findElement(By.xpath("//input[@placeholder='PHONE NUMBER']")).sendKeys("8152946391");
		//		Thread.sleep(3000);
		//		
		//		driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div[1]/div[2]")).click();
		//		Thread.sleep(3000);
		//		
		//		
		//		
		//		
		//	  WebElement we= driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div/div[1]/div[1]/div[1]/div[3]/div[3]/img"));//arrow....configure main page.
		//	  Thread.sleep(5000);
		//      Actions at=new Actions(driver);
		//      at.moveToElement(we).click().build().perform();
		//      Thread.sleep(5000);
		//		
		//    	driver.findElement(By.xpath("//input[@class='signin_input__7mAAh']")).sendKeys("tejashwini.c@ultraviolette.com");   // email
		//		Thread.sleep(3000);
		//		
		//		driver.findElement(By.xpath("//input[@type='checkbox']")).click();                       // check box
		//		Thread.sleep(10000);
		//		
		//		driver.findElement(By.xpath("//div[@class='signin_proceedError__pcOPi']")).click();      //  proceed
		//		Thread.sleep(20000);
		//		driver.findElement(By.xpath("//div[text()='PROCEED']")).click();                //proceed
		//		Thread.sleep(20000);
		//		
		//	  WebElement we= driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div/div[1]/div[1]/div[1]/div[3]/div[3]/img"));//arrow....configure main page.
		//	  Thread.sleep(5000);
		//      Actions at=new Actions(driver);
		//      at.moveToElement(we).click().build().perform();
		//      Thread.sleep(5000);
		//      
		//   	driver.findElement(By.xpath("//span[text()='PROCEED TO NEXT STAGE']")).click();  // proceed to next stage
		//	Thread.sleep(3000);
		//	WebElement w10=driver.findElement(By.xpath("//div[text()='LASER']"));   // laser
		//	Actions a60=new Actions(driver);
		//	a60.moveToElement(w10).click().perform();
		//	Thread.sleep(3000);
		//	driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div/div[2]/section[2]/div/div[2]/div[1]/div[2]/div/div[1]/div[2]/div/div/div/img")).click();
		//	Thread.sleep(3000);
		//	
		//	JavascriptExecutor k1=(JavascriptExecutor)driver;           // scroll upto optional upgrades
		//	k1.executeScript("window.scrollTo(100,4500)");
		//	
		//	driver.findElement(By.xpath("//h2[text()='Optional upgrades']")).click();    // optional upgrades  
		//	Thread.sleep(3000);
		//	
		//	JavascriptExecutor l3=(JavascriptExecutor)driver;      // scroll 
		//	l3.executeScript("window.scrollTo(4500,4700)");
		//	Thread.sleep(3000);
		//
		//	WebElement tq=driver.findElement(By.xpath("//*[@id=\"section-five\"]/div[2]/div[1]/div/div[3]/div"));   // 1
		//	Actions ab1=new Actions(driver);
		//	ab1.moveToElement(tq).click().perform();
		//	Thread.sleep(3000);
		//
		//	WebElement tq1=driver.findElement(By.xpath("//*[@id=\"section-five\"]/div[2]/div[2]/div/div[3]/div"));    //2
		//	Actions ac5=new Actions(driver);
		//	ac5.moveToElement(tq1).click().perform();
		//	Thread.sleep(3000);
		//
		//	JavascriptExecutor m1=(JavascriptExecutor)driver;      //scroll 
		//	m1.executeScript("window.scrollTo(4700,5000)");
		//	Thread.sleep(3000);
		//
		//	WebElement tq3=	driver.findElement(By.xpath("//*[@id=\"section-five\"]/div[2]/div[3]/div/div[3]/div"));     // 3
		//	Actions aq3=new Actions(driver);
		//	aq3.moveToElement(tq3).click().perform();
		//	Thread.sleep(3000);
		//
		//	WebElement tq4=driver.findElement(By.xpath("//*[@id=\"section-five\"]/div[2]/div[4]/div/div[3]/div"));        // 4
		//	Actions aq4=new Actions(driver);
		//	aq4.moveToElement(tq4).click().perform();
		//	Thread.sleep(3000);
		//
		//	driver.findElement(By.xpath("//button[text()='CONFIRM CONFIGURATION']")).click();                         // confirm configuration
		//	Thread.sleep(3000);
		//	
		//	driver.findElement(By.xpath("//button[text()='< EDIT YOUR DESIGN']")).click();         // edit your design
		//	Thread.sleep(3000);
		//	
		//	WebElement w0=driver.findElement(By.xpath("//div[text()='LASER']"));   // laser
		//	Actions a0=new Actions(driver);
		//	a0.moveToElement(w0).click().perform();
		//	Thread.sleep(3000);
		//	driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div/div[2]/section[2]/div/div[2]/div[1]/div[2]/div/div[1]/div[2]/div/div/div/img")).click();
		//	Thread.sleep(3000);
		//	
		//	JavascriptExecutor k10=(JavascriptExecutor)driver;           // scroll upto optional upgrades
		//	k10.executeScript("window.scrollTo(100,4500)");
		//	
		//	driver.findElement(By.xpath("//h2[text()='Optional upgrades']")).click();    // optional upgrades  
		//	Thread.sleep(3000);
		//	
		//	JavascriptExecutor l30=(JavascriptExecutor)driver;      // scroll 
		//	l30.executeScript("window.scrollTo(4500,4700)");
		//	Thread.sleep(3000);
		//
		//	WebElement tq0=driver.findElement(By.xpath("//*[@id=\"section-five\"]/div[2]/div[1]/div/div[3]/div"));   // 1
		//	Actions ab10=new Actions(driver);
		//	ab10.moveToElement(tq0).click().perform();
		//	Thread.sleep(3000);
		//
		//	WebElement tq10=driver.findElement(By.xpath("//*[@id=\"section-five\"]/div[2]/div[2]/div/div[3]/div"));    //2
		//	Actions ac50=new Actions(driver);
		//	ac50.moveToElement(tq10).click().perform();
		//	Thread.sleep(3000);
		//
		//	JavascriptExecutor m10=(JavascriptExecutor)driver;      //scroll 
		//	m10.executeScript("window.scrollTo(4700,5000)");
		//	Thread.sleep(3000);
		//
		//	WebElement tq30=	driver.findElement(By.xpath("//*[@id=\"section-five\"]/div[2]/div[3]/div/div[3]/div"));     // 3
		//	Actions aq30=new Actions(driver);
		//	aq30.moveToElement(tq30).click().perform();
		//	Thread.sleep(3000);
		//
		//	WebElement tq40=driver.findElement(By.xpath("//*[@id=\"section-five\"]/div[2]/div[4]/div/div[3]/div"));        // 4
		//	Actions aq40=new Actions(driver);
		//	aq40.moveToElement(tq40).click().perform();
		//	Thread.sleep(3000);
		//	
		//	driver.findElement(By.xpath("//button[text()='CONFIRM CONFIGURATION']")).click();                         // confirm configuration
		//	Thread.sleep(3000);
		//	
		//	JavascriptExecutor js=(JavascriptExecutor)driver;
		//	js.executeScript("window.scrollTo(0,3000)");
		//	Thread.sleep(3000);
		//	
		//	driver.findElement(By.xpath("//a[text()='Booking agreement']")).click();
		//	Thread.sleep(3000);
		//	String pw=driver.getWindowHandle();
		//	System.out.println(pw);
		//	Set<String> awh=driver.getWindowHandles();
		//	System.out.println(awh);
		//	for(String wh:awh)
		//	{
		//	if(!pw.equals (wh))
		//	{
		//	driver.switchTo().window(pw);
		//	}
		//	}
		//	
		//	driver.findElement(By.xpath("//input[@type='checkbox']")).click();
		//	Thread.sleep(3000);
		//	driver.findElement(By.xpath("//div[text()='PAY ₹ 5,000']")).click();
		//	Thread.sleep(5000);
		//	WebElement v=driver.findElement(By.xpath("//*[@id=\"dkp-container-main\"]/div[3]/div/div[2]/div/div[2]/div[1]/button"));
		//	Actions g=new Actions(driver);
		//	g.moveToElement(v).click().perform();
		//	Thread.sleep(5000);
		//    WebElement b1=driver.findElement(By.xpath("//div[text()='Edit Contact']"));
		//    Actions s=new Actions(driver);
		//    s.moveToElement(b1).click().perform();
		//	Thread.sleep(3000);
		//	driver.findElement(By.xpath("//button[text()='Save Changes']")).click();
		//	Thread.sleep(3000);
		//	driver.findElement(By.xpath("//button[text()='Cancel']")).click();
		//	Thread.sleep(3000);
		//	Alert a99=driver.switchTo().alert();
		//	a99.accept();
		//	driver.findElement(By.xpath("//div[text()='GO BACK TO CONFIGURE']")).click();
		//	Thread.sleep(3000);

	}
}

