package website;

import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Configurator {

	public static void main(String[] args) throws InterruptedException {
				System.setProperty("webdriver.chrome.driver","./jars/chromedriver.exe");
				WebDriver driver=new ChromeDriver();
				driver.get("https://www.ultraviolette.com/configure");
				Thread.sleep(3000);
				driver.manage().window().maximize(); //maximize
				Thread.sleep(3000);
				driver.findElement(By.xpath("//div[text()='CONFIGURE']")).click();   //configure
				Thread.sleep(3000);
				driver.findElement(By.xpath("//div[text()='F77']")).click();        //f77
			    Thread.sleep(3000);
			    driver.findElement(By.xpath("//div[text()='SMART TECH']")).click(); //smarttech
				Thread.sleep(3000);
		        driver.findElement(By.xpath("//div[text()='UV RACING']")).click();    //uv racing 
				Thread.sleep(3000);
				driver.findElement(By.xpath("//div[text()='SQUADRON']")).click();       //squadron
				Thread.sleep(3000);
				driver.findElement(By.xpath("//img[@class='cursor-pointer']")).click(); // logo
				Thread.sleep(3000);
				driver.findElement(By.xpath("//div[text()='CAREERS']")).click();          //careers
				Thread.sleep(3000);
				driver.findElement(By.xpath("//div[text()='BOOK TEST RIDE']")).click();    //book test ride
				Thread.sleep(3000);
				driver.findElement(By.xpath("//img[@alt='f77Mob']")).click();             // sign in   
				Thread.sleep(3000);
				driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div/div[1]/div[1]/div[1]/div[1]")).click();  // back.....book test ride
				Thread.sleep(3000);
				WebElement torget= driver.findElement(By.xpath("//div[text()='CONFIGURE']"));    //configure
				Actions a=new Actions(driver);
				a.moveToElement(torget).click().perform();
				Thread.sleep(3000);

				driver.findElement(By.xpath("//span[text()='PROCEED TO NEXT STAGE']")).click();  // proceed to next stage
				Thread.sleep(3000);
				
			    for(int i=1;i<=5;i++)
				{
				WebElement w=driver.findElement(By.xpath("//div[contains(@class,'absolute right-4 z-50 cursor-pointer')]"));   // images front arrow
				Actions g1=new Actions(driver);
				g1.moveToElement(w).click().perform();
				Thread.sleep(3000);
				}
				Thread.sleep(20000);
				
				for(int i=1;i<=5;i++) {
				WebElement w2=driver.findElement(By.xpath("//div[contains(@class,'absolute left-4 z-50 cursor-pointer rotate-180 ')]"));    // images back arrow
				Actions g2=new Actions(driver);
				g2.moveToElement(w2).click().perform();
				Thread.sleep(3000);
				} 
				
				driver.findElement(By.xpath("//div[text()='COMPARE VARIANTS']")).click();   // compare variants
				Thread.sleep(3000);
				driver.findElement(By.xpath("//*[@id=\"VARIANT_SIDE_PANEL\"]/div/div/div[1]/img")).click();    //close 
				Thread.sleep(3000);
				driver.findElement(By.xpath("//p[text()='POTENTIAL FUEL SAVINGS']")).click();  //potential fuel savings
				Thread.sleep(3000);
				driver.findElement(By.xpath("//*[@id=\"VARIANT_SIDE_PANEL\"]/div/div/div/div[1]/img")).click();     //close
				Thread.sleep(3000);
				driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div/div[1]/div[3]/div/div[2]/div[1]/div/div/button[2]")).click();    // mach2 recon
				Thread.sleep(3000);
				driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div/div[1]/div[3]/div/div[2]/div[1]/div/div/button[1]")).click();     // mach2
				Thread.sleep(3000);
			
				WebElement w1=driver.findElement(By.xpath("//div[text()='LASER']"));   // laser
				Actions a90=new Actions(driver);
				a90.moveToElement(w1).click().perform();
				Thread.sleep(3000);
				driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div/div[2]/section[2]/div/div[2]/div[1]/div[2]/div/div[1]/div[2]/div/div/div/img")).click();
				Thread.sleep(3000);
				driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div/div[2]/section[2]/div/div[2]/div[1]/div[2]/div/div[1]/div[3]/div/div/div/img")).click();
				Thread.sleep(3000);
				driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div/div[2]/section[2]/div/div[2]/div[1]/div[2]/div/div[1]/div[1]/div/div/div/img")).click();
				Thread.sleep(3000);


				JavascriptExecutor j=(JavascriptExecutor)driver;   //scroll to shadow
				j.executeScript("window.scrollTo(0,100)");

				WebElement w2= driver.findElement(By.xpath("//div[text()='SHADOW']"));      //shadow
				Actions b=new Actions(driver);
				b.moveToElement(w2).click().perform();
				Thread.sleep(4000);
				driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div/div[2]/section[2]/div/div[2]/div[2]/div[2]/div/div[1]/div[2]/div/div/div/img")).click();
				Thread.sleep(3000);
				driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div/div[2]/section[2]/div/div[2]/div[2]/div[2]/div/div[1]/div[3]/div/div/div/img")).click();
				Thread.sleep(3000);
				driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div/div[2]/section[2]/div/div[2]/div[2]/div[2]/div/div[1]/div[1]/div/div/div/img")).click();
				Thread.sleep(3000);

				WebElement w3=driver.findElement(By.xpath("//div[text()='AIRSTRIKE']"));       //airstaike
				Actions c=new Actions(driver);
				c.moveToElement(w3).click().perform();
				Thread.sleep(4000);
				driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div/div[2]/section[2]/div/div[2]/div[3]/div[2]/div/div[1]/div[2]/div/div/div/img")).click();
				Thread.sleep(3000);
				driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div/div[2]/section[2]/div/div[2]/div[3]/div[2]/div/div[1]/div[3]/div/div/div/img")).click();
				Thread.sleep(3000);
				driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div/div[2]/section[2]/div/div[2]/div[3]/div[2]/div/div[1]/div[1]/div/div/div/img")).click();
				Thread.sleep(3000);
				
				JavascriptExecutor k=(JavascriptExecutor)driver;           // scroll upto optional upgrades
				k.executeScript("window.scrollTo(100,4500)");
				
				driver.findElement(By.xpath("//h2[text()='Optional upgrades']")).click();    // optional upgrades  
				Thread.sleep(3000);
				
				JavascriptExecutor l=(JavascriptExecutor)driver;      // scroll 
				l.executeScript("window.scrollTo(4500,4700)");
				Thread.sleep(3000);

				WebElement t1=driver.findElement(By.xpath("//*[@id=\"section-five\"]/div[2]/div[1]/div/div[3]/div"));   // 1
				Actions a1=new Actions(driver);
				a1.moveToElement(t1).click().perform();
				Thread.sleep(3000);

				WebElement t2=driver.findElement(By.xpath("//*[@id=\"section-five\"]/div[2]/div[2]/div/div[3]/div"));    //2
				Actions a2=new Actions(driver);
				a2.moveToElement(t2).click().perform();
				Thread.sleep(3000);

				JavascriptExecutor m=(JavascriptExecutor)driver;      //scroll 
				m.executeScript("window.scrollTo(4700,5000)");
				Thread.sleep(3000);

				WebElement t3=	driver.findElement(By.xpath("//*[@id=\"section-five\"]/div[2]/div[3]/div/div[3]/div"));     // 3
				Actions a3=new Actions(driver);
				a3.moveToElement(t3).click().perform();
				Thread.sleep(3000);

				WebElement t4=driver.findElement(By.xpath("//*[@id=\"section-five\"]/div[2]/div[4]/div/div[3]/div"));        // 4
				Actions a4=new Actions(driver);
				a4.moveToElement(t4).click().perform();
				Thread.sleep(3000);

				driver.findElement(By.xpath("//button[text()='CONFIRM CONFIGURATION']")).click();                         // confirm configuration
				Thread.sleep(5000);
				
				driver.findElement(By.xpath("//input[@placeholder='ENTER EMAIL']")).sendKeys("saverio4@drussellj.com");   // email
				Thread.sleep(5000);
				
				driver.findElement(By.xpath("//input[@type='checkbox']")).click();                       // check box
				Thread.sleep(10000);
				
				driver.findElement(By.xpath("//div[@class='signin_proceedError__pcOPi']")).click();      //  proceed
				Thread.sleep(20000);
				driver.findElement(By.xpath("//div[text()='PROCEED']")).click();                //proceed
				Thread.sleep(20000);			
			
				
				driver.findElement(By.xpath("//input[@placeholder='FIRST AND LAST NAME']")).sendKeys("Tejashwini"); // enter the name 
				Thread.sleep(3000);
				
				WebElement w45=driver.findElement(By.xpath("//select[@id='country']"));      // select contry name
				Select s =new Select(w45);
         		s.selectByVisibleText("India");
				
				driver.findElement(By.xpath("//input[@placeholder='PINCODE']")).sendKeys("2345");      // pincode
				Thread.sleep(3000);
				
				driver.findElement(By.xpath("//input[@placeholder='PHONE NUMBER']")).sendKeys("8152946391");     // phone number
				Thread.sleep(3000);
				
				driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div[1]/div[2]")).click();            // next.....Summary  
				Thread.sleep(3000);
				
				JavascriptExecutor js=(JavascriptExecutor)driver;
				js.executeScript("window.scrollTo(0,3000)");
				Thread.sleep(5000);
				
				driver.findElement(By.xpath("//a[text()='Booking agreement']")).click();  // Booking agreement 
				Thread.sleep(3000);
				String pw=driver.getWindowHandle();
				System.out.println(pw);
				Set<String> awh=driver.getWindowHandles();
				System.out.println(awh);
				for(String wh:awh)
				{
				if(!pw.equals (wh))
				{
				driver.switchTo().window(pw);                                             // back
				}
				}
				
				driver.findElement(By.xpath("//input[@type='checkbox']")).click();        // check box
				Thread.sleep(3000);
				driver.findElement(By.xpath("//div[text()='PAY ₹ 5,000']")).click();       // pay 5000 button
				Thread.sleep(5000);
				WebElement v=driver.findElement(By.xpath("//*[@id=\"dkp-container-main\"]/div[3]/div/div[2]/div/div[2]/div[1]/button")); //skip
				Actions g=new Actions(driver);
				g.moveToElement(v).click().perform();
				Thread.sleep(6000);
			    WebElement b1=driver.findElement(By.xpath("//div[text()='Edit Contact']"));      // edit contact
			    Actions s45=new Actions(driver);
			    s45.moveToElement(b1).click().perform();
				Thread.sleep(3000);
				driver.findElement(By.xpath("//button[text()='Save Changes']")).click();          // save changes
				Thread.sleep(3000);
				driver.findElement(By.xpath("//button[text()='Cancel']")).click();                // cancel
				Thread.sleep(3000);
				Alert a99=driver.switchTo().alert();
				a99.accept();
				Thread.sleep(3000);
				driver.findElement(By.xpath("//div[text()='GO BACK TO CONFIGURE']")).click();      // go back to configure 
				Thread.sleep(3000);
				driver.findElement(By.xpath("//img[@alt='f77Mob']")).click();                      // click sign in  
				Thread.sleep(3000);
				
			    WebElement we= driver.findElement(By.xpath("//div[text()='SIGN OUT']"));           //  click sign out 
			    Thread.sleep(5000);
		        Actions at=new Actions(driver);
		        at.moveToElement(we).click().build().perform();
		        Thread.sleep(20000);
		        
		        
		        
		        driver.findElement(By.xpath("//div[text()='CONFIGURE']")).click();   //configure.........next flow....used email
				Thread.sleep(3000);
				
				driver.findElement(By.xpath("//span[text()='PROCEED TO NEXT STAGE']")).click();  // proceed to next stage
				Thread.sleep(3000);
				WebElement w14=driver.findElement(By.xpath("//div[text()='LASER']"));   // laser
				Actions a91=new Actions(driver);
				a91.moveToElement(w14).click().perform();
				Thread.sleep(3000);
				driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div/div[2]/section[2]/div/div[2]/div[1]/div[2]/div/div[1]/div[2]/div/div/div/img")).click();
				Thread.sleep(3000);
				
				JavascriptExecutor k2=(JavascriptExecutor)driver;           // scroll upto optional upgrades
				k2.executeScript("window.scrollTo(100,4500)");
				
				driver.findElement(By.xpath("//h2[text()='Optional upgrades']")).click();    // optional upgrades  
				Thread.sleep(3000);
				
				JavascriptExecutor l12=(JavascriptExecutor)driver;      // scroll 
				l12.executeScript("window.scrollTo(4500,4700)");
				Thread.sleep(3000);

				WebElement t12=driver.findElement(By.xpath("//*[@id=\"section-five\"]/div[2]/div[1]/div/div[3]/div"));   // 1
				Actions a12=new Actions(driver);
				a12.moveToElement(t12).click().perform();
				Thread.sleep(3000);

				WebElement t23=driver.findElement(By.xpath("//*[@id=\"section-five\"]/div[2]/div[2]/div/div[3]/div"));    //2
				Actions a23=new Actions(driver);
				a23.moveToElement(t23).click().perform();
				Thread.sleep(3000);

				JavascriptExecutor m1=(JavascriptExecutor)driver;      //scroll 
				m1.executeScript("window.scrollTo(4700,5000)");
				Thread.sleep(3000);

				WebElement t32=	driver.findElement(By.xpath("//*[@id=\"section-five\"]/div[2]/div[3]/div/div[3]/div"));     // 3
				Actions a32=new Actions(driver);
				a32.moveToElement(t32).click().perform();
				Thread.sleep(3000);

				WebElement t42=driver.findElement(By.xpath("//*[@id=\"section-five\"]/div[2]/div[4]/div/div[3]/div"));        // 4
				Actions a42=new Actions(driver);
				a42.moveToElement(t42).click().perform();
				Thread.sleep(3000);

				driver.findElement(By.xpath("//button[text()='CONFIRM CONFIGURATION']")).click();                         // confirm configuration
				Thread.sleep(5000);
		        
				driver.findElement(By.xpath("//input[@placeholder='ENTER EMAIL']")).sendKeys("tejashwini.c@ultraviolette.com");   // email
				Thread.sleep(5000);
				
				driver.findElement(By.xpath("//input[@type='checkbox']")).click();                       // check box
				Thread.sleep(10000);
				
				driver.findElement(By.xpath("//div[@class='signin_proceedError__pcOPi']")).click();      //  proceed
				Thread.sleep(20000);
				driver.findElement(By.xpath("//div[text()='PROCEED']")).click();                //proceed
				Thread.sleep(20000);
				
				WebElement w34=driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div/div[1]/div[1]/div[1]/div[3]/div[3]/img"));
				Thread.sleep(3000);
				Actions a34=new Actions(driver);
				a34.moveToElement(w34).click().perform();			
				Thread.sleep(20000);
				driver.findElement(By.xpath("//span[text()='PROCEED TO NEXT STAGE']")).click();  // proceed to next stage
				Thread.sleep(3000);
				WebElement w54=driver.findElement(By.xpath("//div[text()='LASER']"));   // laser
				Actions a81=new Actions(driver);
				a81.moveToElement(w54).click().perform();
				Thread.sleep(3000);
				driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div/div[2]/section[2]/div/div[2]/div[1]/div[2]/div/div[1]/div[2]/div/div/div/img")).click();
				Thread.sleep(3000);
				
				JavascriptExecutor k4=(JavascriptExecutor)driver;           // scroll upto optional upgrades
				k4.executeScript("window.scrollTo(100,4500)");
				
				driver.findElement(By.xpath("//h2[text()='Optional upgrades']")).click();    // optional upgrades  
				Thread.sleep(3000);
				
				JavascriptExecutor l45=(JavascriptExecutor)driver;      // scroll 
				l45.executeScript("window.scrollTo(4500,4700)");
				Thread.sleep(3000);

				WebElement t45=driver.findElement(By.xpath("//*[@id=\"section-five\"]/div[2]/div[1]/div/div[3]/div"));   // 1
				Actions a67=new Actions(driver);
				a67.moveToElement(t45).click().perform();
				Thread.sleep(3000);

				WebElement t89=driver.findElement(By.xpath("//*[@id=\"section-five\"]/div[2]/div[2]/div/div[3]/div"));    //2
				Actions a98=new Actions(driver);
				a98.moveToElement(t89).click().perform();
				Thread.sleep(3000);

				JavascriptExecutor m16=(JavascriptExecutor)driver;      //scroll 
				m16.executeScript("window.scrollTo(4700,5000)");
				Thread.sleep(3000);

				WebElement t38=	driver.findElement(By.xpath("//*[@id=\"section-five\"]/div[2]/div[3]/div/div[3]/div"));     // 3
				Actions a37=new Actions(driver);
				a37.moveToElement(t38).click().perform();
				Thread.sleep(3000);

				WebElement t92=driver.findElement(By.xpath("//*[@id=\"section-five\"]/div[2]/div[4]/div/div[3]/div"));        // 4
				Actions a92=new Actions(driver);
				a92.moveToElement(t92).click().perform();
				Thread.sleep(3000);

				driver.findElement(By.xpath("//button[text()='CONFIRM CONFIGURATION']")).click();                         // confirm configuration
				Thread.sleep(5000);
		        
				JavascriptExecutor j1s=(JavascriptExecutor)driver;
				j1s.executeScript("window.scrollTo(0,3000)");
				Thread.sleep(5000);
		
				driver.findElement(By.xpath("//input[@type='checkbox']")).click();        // check box
				Thread.sleep(3000);
				driver.findElement(By.xpath("//div[text()='PAY ₹ 5,000']")).click();       // pay 5000 button
				Thread.sleep(5000);
				WebElement v12=driver.findElement(By.xpath("//*[@id=\"dkp-container-main\"]/div[3]/div/div[2]/div/div[2]/div[1]/button")); //skip
				Actions g1=new Actions(driver);
				g1.moveToElement(v12).click().perform();
				Thread.sleep(5000);
				driver.findElement(By.xpath("//button[text()='Cancel']")).click();                // cancel
				Thread.sleep(3000);
				Alert a95=driver.switchTo().alert();
				a95.accept();
				Thread.sleep(3000);
				driver.findElement(By.xpath("//div[text()='GO BACK TO CONFIGURE']")).click();      // go back to configure 
				Thread.sleep(3000);
				driver.findElement(By.xpath("//span[text()='PROCEED TO NEXT STAGE']")).click();  // proceed to next stage
				Thread.sleep(3000);
				WebElement w24=driver.findElement(By.xpath("//div[text()='LASER']"));   // laser
				Actions a21=new Actions(driver);
				a21.moveToElement(w24).click().perform();
				Thread.sleep(3000);
				driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div/div[2]/section[2]/div/div[2]/div[1]/div[2]/div/div[1]/div[2]/div/div/div/img")).click();
				Thread.sleep(3000);
				
				JavascriptExecutor k24=(JavascriptExecutor)driver;           // scroll upto optional upgrades
				k24.executeScript("window.scrollTo(100,4500)");
				
				driver.findElement(By.xpath("//h2[text()='Optional upgrades']")).click();    // optional upgrades  
				Thread.sleep(3000);
				
				JavascriptExecutor l82=(JavascriptExecutor)driver;      // scroll 
				l82.executeScript("window.scrollTo(4500,4700)");
				Thread.sleep(3000);

				WebElement t52=driver.findElement(By.xpath("//*[@id=\"section-five\"]/div[2]/div[1]/div/div[3]/div"));   // 1
				Actions a72=new Actions(driver);
				a72.moveToElement(t52).click().perform();
				Thread.sleep(3000);

				WebElement t93=driver.findElement(By.xpath("//*[@id=\"section-five\"]/div[2]/div[2]/div/div[3]/div"));    //2
				Actions a93=new Actions(driver);
				a93.moveToElement(t93).click().perform();
				Thread.sleep(3000);

				JavascriptExecutor m91=(JavascriptExecutor)driver;      //scroll 
				m91.executeScript("window.scrollTo(4700,5000)");
				Thread.sleep(3000);

				WebElement t82=	driver.findElement(By.xpath("//*[@id=\"section-five\"]/div[2]/div[3]/div/div[3]/div"));     // 3
				Actions a62=new Actions(driver);
				a62.moveToElement(t82).click().perform();
				Thread.sleep(3000);

				WebElement t62=driver.findElement(By.xpath("//*[@id=\"section-five\"]/div[2]/div[4]/div/div[3]/div"));        // 4
				Actions a56=new Actions(driver);
				a56.moveToElement(t62).click().perform();
				Thread.sleep(3000);

				driver.findElement(By.xpath("//button[text()='CONFIRM CONFIGURATION']")).click();                         // confirm configuration
				Thread.sleep(5000);
		        
				driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div/div[2]/div/div[1]/button")).click();
				Thread.sleep(5000);
				
				WebElement w56=driver.findElement(By.xpath("//div[text()='LASER']"));   // laser
				Actions a57=new Actions(driver);
				a57.moveToElement(w56).click().perform();
				Thread.sleep(3000);
				driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div/div[2]/section[2]/div/div[2]/div[1]/div[2]/div/div[1]/div[3]/div/div/div/img")).click();
				Thread.sleep(3000);
				JavascriptExecutor k7=(JavascriptExecutor)driver;           // scroll upto optional upgrades
				k7.executeScript("window.scrollTo(100,4500)");
				
				driver.findElement(By.xpath("//h2[text()='Optional upgrades']")).click();    // optional upgrades  
				Thread.sleep(3000);
				
				JavascriptExecutor l56=(JavascriptExecutor)driver;      // scroll 
				l56.executeScript("window.scrollTo(4500,4700)");
				Thread.sleep(3000);

				WebElement t76=driver.findElement(By.xpath("//*[@id=\"section-five\"]/div[2]/div[1]/div/div[3]/div"));   // 1
				Actions a76=new Actions(driver);
				a76.moveToElement(t76).click().perform();
				Thread.sleep(3000);

				WebElement t94=driver.findElement(By.xpath("//*[@id=\"section-five\"]/div[2]/div[2]/div/div[3]/div"));    //2
				Actions a96=new Actions(driver);
				a96.moveToElement(t94).click().perform();
				Thread.sleep(3000);

				JavascriptExecutor m7=(JavascriptExecutor)driver;      //scroll 
				m7.executeScript("window.scrollTo(4700,5000)");
				Thread.sleep(3000);

				WebElement t88=	driver.findElement(By.xpath("//*[@id=\"section-five\"]/div[2]/div[3]/div/div[3]/div"));     // 3
				Actions a9=new Actions(driver);
				a9.moveToElement(t88).click().perform();
				Thread.sleep(3000);

				WebElement t99=driver.findElement(By.xpath("//*[@id=\"section-five\"]/div[2]/div[4]/div/div[3]/div"));        // 4
				Actions a97=new Actions(driver);
				a97.moveToElement(t99).click().perform();
				Thread.sleep(3000);

				driver.findElement(By.xpath("//button[text()='CONFIRM CONFIGURATION']")).click();                         // confirm configuration
				Thread.sleep(5000);
		        
				JavascriptExecutor j17=(JavascriptExecutor)driver;
				j17.executeScript("window.scrollTo(0,3000)");
				Thread.sleep(5000);
		
				driver.findElement(By.xpath("//input[@type='checkbox']")).click();        // check box
				Thread.sleep(3000);
				driver.findElement(By.xpath("//div[text()='PAY ₹ 5,000']")).click();       // pay 5000 button
				Thread.sleep(5000);
				
				WebElement v92=driver.findElement(By.xpath("//*[@id=\"dkp-container-main\"]/div[3]/div/div[2]/div/div[2]/div[1]/button")); //skip
				Actions g61=new Actions(driver);
				g61.moveToElement(v92).click().perform();
				Thread.sleep(5000);
				
				driver.findElement(By.xpath("//button[text()='Cancel']")).click();                // cancel
				Thread.sleep(3000);
				Alert a85=driver.switchTo().alert();
				a85.accept();
				Thread.sleep(3000);
				driver.findElement(By.xpath("//div[text()='GO BACK TO CONFIGURE']")).click();      // go back to configure 
				Thread.sleep(3000);
				
	}}
			

