package website;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class f77mach2 extends Baseclass {
	
	@Test
	public void f77mach() throws InterruptedException {
		
		driver.get("https://www.ultraviolette.com/f77");
		Thread.sleep(2000);
		
//         String title=driver.getTitle();
//		
//		if(title.equals("Ultraviolette : High-Performance Electric Vehicles")) {
//			System.out.println(title);	
//		}
//		
////		driver.findElement(By.xpath("//img[@alt='fzzSticky']")).click();// book your f77.....configure
////		Thread.sleep(3000);
////		driver.findElement(By.xpath("//p[text()='F77 MACH 2']")).click();    //F77mach2
////		Thread.sleep(3000);
//
//		JavascriptExecutor j=(JavascriptExecutor)driver;
//		
//		j.executeScript("window.scrollTo(0,820)");
//		Thread.sleep(3000);
//		
//		driver.findElement(By.xpath("//div[text()='TORQUE']")).click();  //TORQUE
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("//div[text()='POWER']")).click();    //POWER
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("//div[text()='RANGE']")).click();    //RANGE
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("//div[text()='TOP SPEED']")).click();  //TOP SPEED
//		Thread.sleep(1000);
//
//		WebElement download =driver.findElement(By.xpath("//a[text()='Download Full Specifications']"));  // download
//		String pwh=driver.getWindowHandle();   //parent address
//		System.out.println(pwh);                 // print parent address
//		download.click();                        // click download
//		Thread.sleep(3000);
//
//		Set<String> allwh=driver.getWindowHandles();    // get all address
//		for(String wh:allwh)
//		{
//			System.out.println(wh);
//			if(!pwh.equals(wh)) {
//				driver.switchTo().window(pwh);           // switch back to parent address
//			}
//
//		}
//		Thread.sleep(3000);
//
//		/////////////// download arrow ///////////////////////
//
//		WebElement arrows = driver.findElement(By.xpath("//img[@alt='arrow']"));  // down load arrow
//		String spwh=driver.getWindowHandle();              //parent address
//		System.out.println(spwh);                          // print parent address
//		arrows.click();                                    // click download arrow
//		Thread.sleep(3000);
//		Set<String> sallwh=driver.getWindowHandles();       // get all address
//		for(String swh:sallwh)
//		{
//			System.out.println(swh);
//			if(!spwh.equals(swh)) {
//				driver.switchTo().window(spwh);              // switch back to parent address
//			}
//		}
//		Thread.sleep(3000);
//		
//		j.executeScript("window.scrollTo(820,1800)");
//		Thread.sleep(3000);
//		
//		j.executeScript("window.scrollTo(1800,2500)");
//		Thread.sleep(3000);
//		
	//	Actions a=new Actions(driver);
//		WebElement turkey=driver.findElement(By.xpath("//div[text()='TÜRKIYE']"));
//		a.moveToElement(turkey).click().perform();
//		Thread.sleep(3000);
//		
//		WebElement india=driver.findElement(By.xpath("//div[text()='INDIA']"));
//		a.moveToElement(india).click().perform();
//		Thread.sleep(3000);
//		
//		WebElement europe=	driver.findElement(By.xpath("//div[text()='EUROPE']"));
//		a.moveToElement(europe).click().perform();
//		Thread.sleep(3000);
//		
//		WebElement nepal =driver.findElement(By.xpath("//div[text()='NEPAL']"));
//		a.moveToElement(nepal).click().perform();
//		Thread.sleep(3000);
//		
//		j.executeScript("window.scrollTo(2500,3100)");
//		Thread.sleep(3000);
//		
//		WebElement source=driver.findElement(By.xpath("//div[text()='Learn more']"));    // learn more....smarttech
//		a.moveToElement(source).click().perform();
//		Thread.sleep(3000);
//		driver.navigate().back();   // f77
//		Thread.sleep(3000);
		
		Actions a=new Actions(driver);
		JavascriptExecutor j=(JavascriptExecutor)driver;
		j.executeScript("window.scrollTo(0,3600)"); // mouse huover
		Thread.sleep(3000);
		
		
		WebElement t1=driver.findElement(By.id("spoticon-m-new-console-themes-img"));
		a.moveToElement(t1).click().build().perform();
		Thread.sleep(1000);
		
		WebElement t2=driver.findElement(By.id("spoticon-m-delta-watch-img"));
		a.moveToElement(t2).click().build().perform();
		Thread.sleep(1000);
		
		WebElement t3=driver.findElement(By.id("spoticon-m-anti-collision-warning-system-img"));
		a.moveToElement(t3).click().build().perform();
		Thread.sleep(1000);
		
		WebElement t4 =driver.findElement(By.id("spoticon-m-remote-lockdown-img"));
		a.moveToElement(t4).click().build().perform();
		Thread.sleep(1000);
		
		WebElement t5=driver.findElement(By.id("spoticon-m-crash-alert-img"));
		a.moveToElement(t5).click().build().perform();
		Thread.sleep(1000);
		
		WebElement t6=driver.findElement(By.id("spoticon-m-low-tyre-pressure-alerts-img"));
		a.moveToElement(t6).click().build().perform();
		Thread.sleep(1000);	

//		JavascriptExecutor m =(JavascriptExecutor)driver;
//		m.executeScript("window.scrollTo(2000,2800)");
//		Thread.sleep(3000);
//
//		driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div[1]/div[5]/div/div[3]/img")).click();  //play button
//		Thread.sleep(3000);
//
//		for(int i=1; i<=2;i++) {
//			driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div[1]/div[5]/div/div[3]/div[1]/img")).click();  // mute and unmute
//			Thread.sleep(3000);
//		}
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div[1]/div[5]/div/div[3]/div[2]/img")).click();     //refhresh
//
//		JavascriptExecutor n =(JavascriptExecutor)driver;
//		n.executeScript("window.scrollTo(2800,3500)");
//		Thread.sleep(3000);
//
//		driver.findElement(By.xpath("//div[text()='SUAVE & CHARISMATIC']")).click();
//		Thread.sleep(3000); 
//
//		for(int i=1; i<=2;i++ ) 
//		{
//			driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div[1]/div[6]/div[2]/div[1]/div[2]/div[3]/div/img")).click();   //unmute and mute
//			Thread.sleep(3000);
//		}
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("//div[text()='SUAVE & CHARISMATIC']")).click();
//		Thread.sleep(3000);
//
//		driver.findElement(By.xpath("//div[text()='PASSION & ADRENALINE']")).click();
//		Thread.sleep(3000);
//		for(int i=1; i<=2;i++)
//		{
//			driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div[1]/div[6]/div[2]/div[2]/div[2]/div[3]/div/img")).click();  //unmute and mute
//			Thread.sleep(3000);
//		}
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("//div[text()='PASSION & ADRENALINE']")).click();
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("//div[text()='COVERT & ENIGMATIC']")).click();
//		Thread.sleep(3000);
//		for(int i=1; i<=2;i++) {
//			driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div[1]/div[6]/div[2]/div[3]/div[2]/div[3]/div/img")).click(); // unmute and mute
//			Thread.sleep(3000);
//		}
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("//div[text()='COVERT & ENIGMATIC']")).click();  
//		Thread.sleep(3000);
//
//		JavascriptExecutor f=(JavascriptExecutor)driver;
//		f.executeScript("window.scrollTo(3500,5000)");
//		Thread.sleep(3000);
//
//		for(int i=1; i<=2;i++) {
//			driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div[1]/div[8]/div[1]/div/div[2]/img")).click();   //arrow
//			Thread.sleep(3000);
//		}
//		for(int i=1; i<=2;i++) {
//			driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div[1]/div[8]/div[1]/div/div[1]/img")).click();     // arrow
//			Thread.sleep(3000);
//		}
//		driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div[1]/div[8]/div[2]/div/div[1]/div[1]/div/div/img")).click();   //button
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div[1]/div[8]/div[2]/div/div[1]/div[1]/video")).click();        //video
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div[1]/div[8]/div[1]/div/div[2]/img")).click();                 //arrow
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div[1]/div[8]/div[2]/div/div[2]/div[1]/div/div/img")).click();   //button
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div[1]/div[8]/div[2]/div/div[2]/div[1]/video")).click();          //video
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div[1]/div[8]/div[1]/div/div[2]/img")).click();                    //arrow
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div[1]/div[8]/div[2]/div/div[3]/div[1]/div/div/img")).click();     // play button
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div[1]/div[8]/div[2]/div/div[3]/div[1]/video")).click();           //video
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div[1]/div[8]/div[2]/div/div[4]/div[1]/div/div/img")).click();	    //play button
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div[1]/div[8]/div[2]/div/div[4]/div[1]/video")).click();            // video
//		Thread.sleep(3000);
//
//		JavascriptExecutor p=(JavascriptExecutor)driver;
//		p.executeScript("window.scrollTo(5000,6500)");
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div[1]/div[10]/div[1]/div/div[2]/img")).click(); // arrow
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div[1]/div[10]/div[1]/div/div[1]/img")).click();   // arrow
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div[1]/div[10]/div[2]/div/div[2]/div[1]/div/div/img")).click();	// play button	
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div[1]/div[10]/div[2]/div/div[2]/div[1]/video")).click();     //video
//		Thread.sleep(3000);
//
//		JavascriptExecutor o=(JavascriptExecutor)driver;
//		o.executeScript("window.scrollTo(0,8200)");
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("//div[text()='DYNAMIC REGEN']")).click();   //dynamic regen
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("//div[text()='TRACTION CONTROL']")).click();   //traction control
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("//div[text()='DELTA WATCH']")).click();      //delta watch
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("//div[text()='HILL HOLD']")).click();         // hill hold
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("//div[text()='PARK ASSIST']")).click();        //park assist
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("//a[text()='LEARN MORE']")).click();   //   LEARN MORE......smattech   
//		Thread.sleep(3000);
//		driver.navigate().back(); // f77
//		Thread.sleep(3000);
//
//		JavascriptExecutor b=(JavascriptExecutor)driver;
//		b.executeScript("window.scrollTo(0,8200)");
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div[1]/div[12]/div[2]/div[1]/div[3]/div[3]/a/div/img")).click(); //learn more arrow....smattech
//		Thread.sleep(3000);
//		driver.navigate().back(); // f77
//		Thread.sleep(3000);
//		JavascriptExecutor c=(JavascriptExecutor)driver;
//		c.executeScript("window.scrollTo(0,12000)");
//		Thread.sleep(3000);
//		for(int i=1; i<=5;i++) {
//			driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div[1]/div[16]/div/div/div[2]/div[1]/div[3]/div[2]/div/div/button[2]/span")).click();//+
//			Thread.sleep(3000);
//		}
//		for(int i=1; i<=5;i++) {
//			driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div[1]/div[16]/div/div/div[2]/div[1]/div[3]/div[2]/div/div/button[1]/span")).click(); //-
//			Thread.sleep(3000);
//		}
//		for(int i=1; i<=5;i++) {
//			driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div[1]/div[16]/div/div/div[2]/div[1]/div[4]/div[2]/div/div/button[2]/span")).click(); //+
//			Thread.sleep(3000);
//		}
//
//
//		for(int i=1; i<=5;i++) {
//			driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div[1]/div[16]/div/div/div[2]/div[1]/div[4]/div[2]/div/div/button[1]/span")).click(); //-
//			Thread.sleep(3000);
//		}
//
//		JavascriptExecutor v=(JavascriptExecutor)driver;
//		v.executeScript("window.scrollTo(12000,12500)");
//		Thread.sleep(3000);
//
//		for(int i=1; i<=2;i++) {
//			driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div[1]/div[17]/div[1]/div[2]/div[2]/img")).click(); // youtube arrow
//			Thread.sleep(3000);
//		}
//
//		for(int i=1; i<=2;i++) {
//			driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div[1]/div[17]/div[1]/div[2]/div[1]/img")).click();  //youtube arrow
//			Thread.sleep(3000);
//		}
//
//		Thread.sleep(3000);
//		JavascriptExecutor q=(JavascriptExecutor)driver;
//		q.executeScript("window.scrollTo(12500,14000)");
//		Thread.sleep(3000);
//
//		driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div[1]/div[18]/div[3]/div[2]/img")).click(); // book your f77....configure
//		Thread.sleep(3000);
//		driver.navigate().back();  // f77
//		Thread.sleep(3000); 
//
//		JavascriptExecutor r=(JavascriptExecutor)driver;
//		r.executeScript("window.scrollTo(0,14000)");   // end
//		Thread.sleep(3000); 

}
}
