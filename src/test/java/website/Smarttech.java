package website;                               //As expected

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Smarttech extends Baseclass{

	@Test

	public void smarttechMethod() throws InterruptedException {

		driver.get("https://www.ultraviolette.com/smarttech");
		Thread.sleep(3000);

		//***********verify  title***********	

		String title=driver.getTitle();

		if(title.equals("ultraviolette.com/smarttech")) {
			System.out.println(title);	
		}
		else {
			// Print a message if the title doesn't match
			System.out.println("Title does not match expected title.");
		}

		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollTo(0,1500)");
		Thread.sleep(3000);

		Actions action = new Actions(driver);

		//******** click AI video button*********

		driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div[1]/div[2]/div[2]/div[1]/div[2]/button/img")).click();
		Thread.sleep(3000);

		js.executeScript("window.scrollTo(1500,2500)");
		Thread.sleep(3000);

		//********Towing Alert*******

		driver.findElement(By.xpath("//h1[text()='Towing Alert']")).click();
		Thread.sleep(3000);

		//******* Movement & fall alert*******

		driver.findElement(By.xpath("//h1[text()='Movement & Fall Alert']")).click();
		Thread.sleep(3000);

		//***********3 ride modes section***********

		js.executeScript("window.scrollTo(2500,3800)");
		Thread.sleep(3000);

		//**************10 levels of regenerative braking*********

		js.executeScript("window.scrollTo(3800,4400)");
		Thread.sleep(3000);

		//***********D.S.C dynamic stability control section*********

		js.executeScript("window.scrollTo(4400,5000)");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div[1]/div[6]/div[2]/div[2]/div/div/div/img")).click();
		Thread.sleep(5000);


		//********** in flight safety slider section **************

		js.executeScript("window.scrollTo(5000,5650)");
		Thread.sleep(3000);



		WebElement traction =driver.findElement(By.id("home-slider-traction-control-4-levels-of-traction-control-ensure-the-tyres-always-stick-well-to-any-terrain-when-you-go-ballistic.-index--index-play-btn"));
		traction.click();
		Thread.sleep(3000);

//		WebElement slider_flight =driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div/div[7]/div[1]/div[2]/div[3]/button[2]/img"));
//		slider_flight.click();
//		Thread.sleep(3000);

//		WebElement Anti_Collision =driver.findElement(By.id("//*[@id=\"__next\"]/div/div[2]/div/div[7]/div[1]/div[2]/div[3]/button[2]/img"));
//		Anti_Collision.click();
//		Thread.sleep(3000);

//		WebElement slider_flight2 =driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div/div[7]/div[1]/div[2]/div[3]/button[1]/img"));
//		slider_flight2.click();
//		Thread.sleep(3000);


//		WebElement Hill_Hold =driver.findElement(By.id("home-slider-hillhold-no-matter-the-incline,-the-f77-mach-2-remains-steady-and-in-place-without-engaging-the-brakes.-index--m-index-play-btn"));
//		Hill_Hold.click();
//		Thread.sleep(3000); 


		//***********remote safety ************

		js.executeScript("window.scrollTo(5700,6200)");
		Thread.sleep(3000);

		//************ remote safety video**************

		js.executeScript("window.scrollTo(6250,6700)");
		Thread.sleep(3000);

		driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div[1]/div[8]/img")).click();
		Thread.sleep(6000);



		//***********Being Connected Always Section ***************

		js.executeScript("window.scrollTo(6750,7800)");
		Thread.sleep(3000);

		//**********ride analytics ************

		WebElement ride =driver.findElement(By.id("alert-item-desktop-1"));
		Thread.sleep(1000);
		action.moveToElement(ride).click().build().perform();
		Thread.sleep(1000);

		//*************vehicle diagnostics**********

		WebElement vehicle = driver.findElement(By.id("alert-item-desktop-0"));
		Thread.sleep(1000);
		action.moveToElement(vehicle).click().build().perform();
		Thread.sleep(1000);

		//***********charge limit ***********

		WebElement charge =driver.findElement(By.id("alert-item-desktop-3"));
		Thread.sleep(1000);
		action.moveToElement(charge).click().build().perform();
		Thread.sleep(1000);
		//*********** FindMy F77 ***************

		WebElement control = driver.findElement(By.id("alert-item-desktop-4"));
		Thread.sleep(1000);
		action.moveToElement(control).click().build().perform();
		Thread.sleep(1000);

		//*********** controls in your palm ************

		WebElement FindMy = driver.findElement(By.id("alert-item-desktop-2"));
		Thread.sleep(1000);
		action.moveToElement(FindMy).click().build().perform();

		js.executeScript("window.scrollTo(8100,8800)");
		Thread.sleep(3000);

		driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div[1]/div[11]/div[1]/div/button/img")).click();
		Thread.sleep(3000);

		driver.findElement(By.xpath("//h1[text()='TAP TO SEE DETAILS']")).click();
		Thread.sleep(3000);

		//**********glide button *************

		driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div[1]/div[12]/div/div[3]/div[1]/h1[1]")).click();
		Thread.sleep(3000);

		//***********Ballistic button *************

		driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div[1]/div[12]/div/div[3]/div[1]/h1[3]")).click();
		Thread.sleep(3000);

		//************* combat button ***********

		driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div[1]/div[12]/div/div[3]/div[1]/h1[2]")).click();
		Thread.sleep(3000);

		//************ day mode**********

		driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div[1]/div[12]/div/div[3]/div[3]/div[3]")).click();
		Thread.sleep(3000);

		//********** night mode************

		driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div[1]/div[12]/div/div[3]/div[3]/div[1]")).click();
		Thread.sleep(3000);

		//***********day mode**************

		driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div[1]/div[12]/div/div[3]/div[3]/div[3]")).click();
		Thread.sleep(3000);


		//**********glide button ************

		driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div[1]/div[12]/div/div[3]/div[1]/h1[1]")).click();
		Thread.sleep(3000);

		//************Ballistic button***********

		driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div[1]/div[12]/div/div[3]/div[1]/h1[3]")).click();
		Thread.sleep(3000);

		//********** combat button***********

		driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div[1]/div[12]/div/div[3]/div[1]/h1[2]")).click();
		Thread.sleep(3000);


		//************* locating points ****************


		driver.findElement(By.id("smarttech-radar-console-icon-4")).click();
		Thread.sleep(3000);

		driver.findElement(By.id("smarttech-radar-console-icon-5")).click();
		Thread.sleep(3000);

		driver.findElement(By.id("smarttech-radar-console-icon-1")).click();
		Thread.sleep(3000);

		driver.findElement(By.id("smarttech-radar-console-icon-2")).click();
		Thread.sleep(3000);

		driver.findElement(By.id("smarttech-radar-console-icon-3")).click();
		Thread.sleep(3000);

		driver.findElement(By.id("smarttech-radar-console-icon-6")).click();
		Thread.sleep(3000);

		driver.findElement(By.id("smarttech-radar-console-icon-7")).click();
		Thread.sleep(3000);

		driver.findElement(By.id("smarttech-radar-console-icon-8")).click();
		Thread.sleep(3000);

		driver.findElement(By.id("smarttech-radar-console-icon-9")).click();
		Thread.sleep(3000);

		driver.findElement(By.id("smarttech-radar-console-icon-10")).click();
		Thread.sleep(3000);

		driver.findElement(By.id("smarttech-radar-console-icon-11")).click();
		Thread.sleep(3000);

		driver.findElement(By.id("smarttech-radar-console-icon-12")).click();
		Thread.sleep(3000);

		//*********** close button ************

		driver.findElement(By.xpath("//h1[text()='Close']")).click();
		Thread.sleep(3000);

		//*********** Park Assist**********
		js.executeScript("window.scrollTo(9000,9500)");
		Thread.sleep(5000);

		//***********are u step into the future **********

		js.executeScript("window.scrollTo(9500,10500)");
		Thread.sleep(3000);

		//********** Book your F77 Button************

		WebElement configure_button =driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div/div[14]/div[4]/a/img"));
		action.moveToElement(configure_button).click().build().perform();
		Thread.sleep(4000);

		driver.navigate().back();  





		//        driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div[1]/div[2]/div[2]/div[1]/div[2]/button/img")).click(); //unmute
		//        Thread.sleep(3000);
		//        JavascriptExecutor b=(JavascriptExecutor)driver;
		//		b.executeScript("window.scrollTo(1500,2500)");
		//		Thread.sleep(3000);
		//		driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div[1]/div[3]/div[1]/div[1]/div/div[2]/div[2]/h1")).click(); // towing alert
		//		Thread.sleep(3000);
		//		driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div[1]/div[3]/div[1]/div[1]/div/div[2]/div[1]/h1")).click();  // movement & fall alert
		//		Thread.sleep(3000);
		//		JavascriptExecutor c=(JavascriptExecutor)driver;
		//		c.executeScript("window.scrollTo(1500,5000)"); 
		//		Thread.sleep(3000);
		//		driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div[1]/div[6]/div[4]/div[2]/div/div/img")).click(); // uvdsc clickon
		//		Thread.sleep(3000);
		//		driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div[1]/div[6]/div[4]/div[2]/div/video")).click(); // uvdsc clickoff
		//		Thread.sleep(3000);
		//		
		//		JavascriptExecutor d=(JavascriptExecutor)driver;
		//		d.executeScript("window.scrollTo(5000,5800)");
		//		
		//	    WebElement w1 = driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div[1]/div[7]/section/div/div/div[1]/div/video")); // drag and drop sliders
		//	    WebElement w2 = driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div[1]/div[7]/section/div/div/div[2]/div/video"));
		//	    WebElement w3 = driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div[1]/div[7]/section/div/div/div[3]/div/video"));
		//	    Actions f=new Actions(driver);
		//		f.dragAndDrop(w1,w2).perform();
		//	    Thread.sleep(3000);
		//	    Actions g=new Actions(driver);
		//		g.dragAndDrop(w2,w3).perform();
		//	    Thread.sleep(3000);
		//	    Actions h=new Actions(driver);
		//		h.dragAndDrop(w3,w1).perform();
		//	    Thread.sleep(3000);
		//		JavascriptExecutor dd=(JavascriptExecutor)driver;
		//		dd.executeScript("window.scrollTo(5800,6900)");
		//		Thread.sleep(3000);
		//		driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div[1]/div[8]/img")).click(); //video on
		//		Thread.sleep(3000);
		//		driver.findElement(By.xpath("//video[contains(@poster,'https://d2atk76x06g5eh.cloudfront.net/smarttech/lockdown/lockdown_thumb_1.webp')]")).click(); // video off
		//		Thread.sleep(3000);
		//		
		//		JavascriptExecutor ddd=(JavascriptExecutor)driver;
		//		ddd.executeScript("window.scrollTo(6900,8000)");
		//		Thread.sleep(3000);
		//		driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div[1]/div[9]/div/div[2]/div[4]/div[2]/div/div[3]/h1")).click();  // charge limit
		//		Thread.sleep(3000);
		//		driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div[1]/div[9]/div/div[2]/div[4]/div[2]/div/div[1]/h1")).click();   // vehicle diagnostics
		//		Thread.sleep(3000);
		//		driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div[1]/div[9]/div/div[2]/div[4]/div[2]/div/div[2]/h1")).click();   //ride analytics
		//		Thread.sleep(3000);
		//		driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div[1]/div[9]/div/div[2]/div[4]/div[2]/div/div[4]/h1")).click();   // find my f77
		//		Thread.sleep(3000);
		//		driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div[1]/div[9]/div/div[2]/div[4]/div[2]/div/div[5]/h1")).click();    // controls in yours palm
		//		Thread.sleep(3000);
		//        JavascriptExecutor ss=(JavascriptExecutor)driver;
		//		ss.executeScript("window.scrollTo(8000,8500)");
		//		Thread.sleep(3000);
		//		
		//		for(int i=1; i<=2;i++) {
		//		driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div[1]/div[11]/div[1]/div/button/img")).click(); //unmute and mute
		//		Thread.sleep(3000);
		//		}
		//		
		//		JavascriptExecutor hh=(JavascriptExecutor)driver;
		//		hh.executeScript("window.scrollTo(8500,9800)");
		//		Thread.sleep(3000);
		//		driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div[1]/div[12]/div/div[3]/div[1]/h1[2]")).click();//c
		//		Thread.sleep(3000);
		//		driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div[1]/div[12]/div/div[3]/div[1]/h1[3]")).click();//b
		//		Thread.sleep(3000);
		//		driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div[1]/div[12]/div/div[3]/div[1]/h1[1]")).click();//g
		//		Thread.sleep(3000);
		//
		//     	driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div[1]/div[12]/div/div[3]/div[3]/div[2]/img")).click();//day
		//		Thread.sleep(3000);
		//		driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div[1]/div[12]/div/div[3]/div[1]/h1[2]")).click();//c
		//		Thread.sleep(3000);
		//		driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div[1]/div[12]/div/div[3]/div[1]/h1[3]")).click();//b
		//		Thread.sleep(3000);
		//		driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div[1]/div[12]/div/div[3]/div[1]/h1[1]")).click();//g
		//		Thread.sleep(3000);
		//		
		//	    driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div[1]/div[12]/div/div[3]/div[2]/h1")).click();// top to see  details
		//		Thread.sleep(3000);
		//		
		//	WebElement aa1=	driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div[1]/div[12]/div/div[1]/div[7]/div/img"));
		//	Actions a1=new Actions(driver);
		//	a1.moveToElement(aa1).click().perform();
		//    Thread.sleep(3000); 
		//		
		//    WebElement bb1=  driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div[1]/div[12]/div/div[1]/div[6]/div/img"));
		//    Actions b1=new Actions(driver);
		//	b1.moveToElement(bb1).click().perform();
		//    Thread.sleep(3000);
		//    
		//	WebElement cc1=	driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div[1]/div[12]/div/div[1]/div[5]/div/img"));
		//	Actions c1=new Actions(driver);
		//	c1.moveToElement(cc1).click().perform();
		//    Thread.sleep(3000); 
		//    
		//	WebElement dd1= driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div[1]/div[12]/div/div[1]/div[4]/div/img"));
		//	Actions d1=new Actions(driver);
		//	d1.moveToElement(dd1).click().perform();
		//	Thread.sleep(3000); 
		//	    
		//	    
		//	WebElement ee1= driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div[1]/div[12]/div/div[1]/div[2]/div/img"));
		//	Actions e1=new Actions(driver);
		//	e1.moveToElement(ee1).click().perform();
		//	Thread.sleep(3000);
		//		
		//	WebElement ff1= driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div[1]/div[12]/div/div[1]/div[1]/div/img"));
		//	Actions f1=new Actions(driver);
		//	f1.moveToElement(ff1).click().perform();
		//	Thread.sleep(3000);
		//		
		//		
		//	WebElement gg1= driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div[1]/div[12]/div/div[1]/div[3]/div/img"));
		//	Actions g1=new Actions(driver);
		//	g1.moveToElement(gg1).click().perform();
		//	Thread.sleep(3000);
		//	
		//	WebElement hh1=	driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div[1]/div[12]/div/div[1]/div[8]/div/img"));
		//	Actions h1=new Actions(driver);
		//	h1.moveToElement(hh1).click().perform();
		//	Thread.sleep(3000);
		//	
		//    WebElement ii1=	driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div[1]/div[12]/div/div[1]/div[9]/div/img"));
		//    Actions i1=new Actions(driver);
		//    i1.moveToElement(ii1).click().perform();
		//    Thread.sleep(3000);
		//
		//    WebElement jj1=   driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div[1]/div[12]/div/div[1]/div[10]/div/img"));
		//    Actions j1=new Actions(driver);
		//    j1.moveToElement(jj1).click().perform();
		//    Thread.sleep(3000);
		//
		//	 WebElement kk1=  driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div[1]/div[12]/div/div[1]/div[12]/div/img"));
		//	  Actions k1=new Actions(driver);
		//	  k1.moveToElement(kk1).click().perform();
		//	  Thread.sleep(3000);
		//	  
		//	WebElement ll1=    driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div[1]/div[12]/div/div[1]/div[11]/div/img"));
		//    Actions l1=new Actions(driver);
		//	l1.moveToElement(ll1).click().perform();
		//	Thread.sleep(3000);
		//	  
		//		
		//	driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div[1]/div[12]/div/div[3]/div[3]/div[3]")).click();// night
		//	Thread.sleep(3000); 
		//	
		//	WebElement mm1=	driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div[1]/div[12]/div/div[1]/div[7]/div/img"));
		//	Actions m1=new Actions(driver);
		//	m1.moveToElement(mm1).click().perform();
		//    Thread.sleep(3000); 
		//		
		//    WebElement nn1=  driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div[1]/div[12]/div/div[1]/div[6]/div/img"));
		//    Actions n1=new Actions(driver);
		//	n1.moveToElement(nn1).click().perform();
		//    Thread.sleep(3000);
		//    
		//	WebElement oo1=	driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div[1]/div[12]/div/div[1]/div[5]/div/img"));
		//	Actions o1=new Actions(driver);
		//	o1.moveToElement(oo1).click().perform();
		//    Thread.sleep(3000); 
		//    
		//	WebElement pp1= driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div[1]/div[12]/div/div[1]/div[4]/div/img"));
		//	Actions p1=new Actions(driver);
		//	p1.moveToElement(pp1).click().perform();
		//	Thread.sleep(3000); 
		//	    
		//	    
		//	WebElement rr1= driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div[1]/div[12]/div/div[1]/div[2]/div/img"));
		//	Actions r1=new Actions(driver);
		//	r1.moveToElement(rr1).click().perform();
		//	Thread.sleep(3000);
		//		
		//	WebElement ss1= driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div[1]/div[12]/div/div[1]/div[1]/div/img"));
		//	Actions s1=new Actions(driver);
		//	s1.moveToElement(ss1).click().perform();
		//	Thread.sleep(3000);
		//		
		//		
		//	WebElement tt1= driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div[1]/div[12]/div/div[1]/div[3]/div/img"));
		//	Actions t1=new Actions(driver);
		//	t1.moveToElement(tt1).click().perform();
		//	Thread.sleep(3000);
		//	
		//	WebElement uu1=	driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div[1]/div[12]/div/div[1]/div[8]/div/img"));
		//	Actions u1=new Actions(driver);
		//	u1.moveToElement(uu1).click().perform();
		//	Thread.sleep(3000);
		//	
		//    WebElement vv1=	driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div[1]/div[12]/div/div[1]/div[9]/div/img"));
		//    Actions v1=new Actions(driver);
		//    v1.moveToElement(vv1).click().perform();
		//    Thread.sleep(3000);
		//
		//    WebElement ww11=   driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div[1]/div[12]/div/div[1]/div[10]/div/img"));
		//    Actions w11=new Actions(driver);
		//    w11.moveToElement(ww11).click().perform();
		//    Thread.sleep(3000);
		//
		//	 WebElement xx1=  driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div[1]/div[12]/div/div[1]/div[12]/div/img"));
		//	  Actions x1=new Actions(driver);
		//	  x1.moveToElement(xx1).click().perform();
		//	  Thread.sleep(3000);
		//	  
		//	WebElement yy1=    driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div[1]/div[12]/div/div[1]/div[11]/div/img"));
		//    Actions y1=new Actions(driver);
		//	y1.moveToElement(yy1).click().perform();
		//	Thread.sleep(3000);
		//	  
		//	driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div[1]/div[12]/div/div[3]/div[2]/h1")).click(); // top to see details
		//	Thread.sleep(3000);
		//	
		//	JavascriptExecutor e=(JavascriptExecutor)driver;
		//	e.executeScript("window.scrollTo(9800,11000)");
		//	Thread.sleep(3000);
		//	driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div[1]/div[14]/a/img")).click(); // book your f77....configure
		//	Thread.sleep(3000);
		//	driver.navigate().back(); // smattech
		//	Thread.sleep(3000);
		//		
		//	JavascriptExecutor ggg=(JavascriptExecutor)driver;
		//	ggg.executeScript("window.scrollTo(0,11000)");     // end
		//	Thread.sleep(3000);


	}
}
