package website;                                //As expected..............
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.time.Duration;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Careers extends Baseclass{

	@Test
	public void careersMethod() throws InterruptedException, IOException, AWTException {


		driver.get("https://www.ultraviolette.com/careers");
		Thread.sleep(3000);


		//**********verify title**********

		String title=driver.getTitle();
		if(title.equals("Ultraviolette Automotive | Careers")) {
			System.out.println(title);	
		}
		else {
			// Print a message if the title doesn't match
			System.out.println("Title does not match expected title.");
		}

		//************verify header*************

		String header = new WebDriverWait(driver, Duration.ofSeconds(10))
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[text()='LIFE AT UV']"))).getText();
		if(header.equals("LIFE AT UV")) {

			System.out.println(header);
		} else {
			// Print a message if the title doesn't match
			System.out.println("Header does not match expected header.");
		}



		driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div[1]/div[1]/div/button/div/div")).click(); //work with us
		Thread.sleep(3000);

		JavascriptExecutor j=(JavascriptExecutor)driver; // scroll back....landing page.
		j.executeScript("window.scrollTo(2000,-0)");
		Thread.sleep(3000); 

		JavascriptExecutor k=(JavascriptExecutor)driver;  //scroll up to video
		k.executeScript("window.scrollTo(0,700)");
		Thread.sleep(3000);

		driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div[3]/div[2]/img")).click(); // click the video
		Thread.sleep(3000);

		//driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div[3]/div[1]/div[2]/video")).click(); elementnotinteractableexeption.
		//Thread.sleep(3000); 

		JavascriptExecutor e=(JavascriptExecutor)driver;  //scroll the image
		e.executeScript("window.scrollTo(700,1300)");
		Thread.sleep(3000);

		for(int i=1;i<=3;i++) {
			driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div[4]/div[2]/div/button[2]")).click();    // click the forword arrow 3 times
			Thread.sleep(3000);
		}
		for(int i=1;i<=3;i++) {
			driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div[4]/div[2]/div/button[1]")).click();     // click the backword arrow 3 times
			Thread.sleep(3000);
		}


		JavascriptExecutor f=(JavascriptExecutor)driver;       // scroll the next image
		f.executeScript("window.scrollTo(1300,1700)");
		Thread.sleep(3000);

		driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div[5]/div[2]/div/button[2]")).click();   // click the forword arrow
		Thread.sleep(3000);

		driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div[5]/div[2]/div/button[1]")).click();    // // click the backword arrow
		Thread.sleep(3000);

		JavascriptExecutor g=(JavascriptExecutor)driver;  // scroll the current openings
		g.executeScript("window.scrollTo(1300,2100)");
		Thread.sleep(3000);

		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Lead");    // search the lead
		Thread.sleep(3000);

		WebElement q=driver.findElement(By.xpath("//input[@type='text']"));         // clear the search
		
		Thread.sleep(3000);
		q.sendKeys(Keys.chord(Keys.CONTROL,"a"));
		q.sendKeys(Keys.BACK_SPACE);

		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("dghdhdh");    // search the dghdhdh
		Thread.sleep(3000);

		driver.findElement(By.xpath("//input[@type='text']")).clear();                // clear the dghdhdh
		Thread.sleep(3000);

		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Lead");       // search the lead   
		Thread.sleep(3000);

		//	JavascriptExecutor h=(JavascriptExecutor)driver;                             // scroll upto last job
		//	h.executeScript("window.scrollTo(2100,3700)");
		//	Thread.sleep(3000);

		WebElement w = driver.findElement(By.xpath("//a[text()='SSE / Lead Software Engineer']"));   /////// click the last job.....navigate the job details 
		Actions a1=new Actions(driver);
		a1.moveToElement(w).click().perform();
		Thread.sleep(3000);

		driver.findElement(By.xpath("//*[@id=\"detail-page-applybtn\"]/button/lyte-yield")).click(); // click the i'm interested...application
		Thread.sleep(4000);

		driver.findElement(By.xpath("//a[text()='Job details']")).click();                // click the job details.....back to job details page
		Thread.sleep(3000);

		driver.findElement(By.xpath("//lyte-yield[text()='Share job via email']")).click();       // click share job via email
		Thread.sleep(3000);
		Robot robot = new Robot();
		
		robot.keyPress(KeyEvent.VK_ALT);
		robot.keyPress(KeyEvent.VK_F4);  
		robot.keyRelease(KeyEvent.VK_F4);
		robot.keyRelease(KeyEvent.VK_ALT);


		WebElement q1=  driver.findElement(By.xpath("//span[@class='fa fa-facebook']"));  // click facebook
		String pwh=driver.getWindowHandle();   //parent address
		System.out.println(pwh);                 // print parent address
		q1.click();                        // click download
		Thread.sleep(3000);

		Set<String> allwh=driver.getWindowHandles();    // get all address
		for(String wh:allwh)
		{
			System.out.println(wh);
			if(!pwh.equals(wh)) {
				driver.switchTo().window(pwh);           // switch back to parent address
			}

		} 
		Thread.sleep(3000);


		WebElement q2=driver.findElement(By.xpath("//span[@class='fa fa-twitter']"));                // click twitter
		String spwh=driver.getWindowHandle();   //parent address
		System.out.println(spwh);                 // print parent address
		q2.click();                        // click download
		Thread.sleep(3000);

		Set<String> sllwh=driver.getWindowHandles();    // get all address
		for(String swh:sllwh)
		{
			System.out.println(swh);
			if(!spwh.equals(swh)) {
				driver.switchTo().window(spwh);           // switch back to parent address
			}

		} 
		Thread.sleep(3000);

		WebElement q3=driver.findElement(By.xpath("//span[@class='fa fa-linkedin']"));                // click linkedin
		String tpwh=driver.getWindowHandle();   //parent address
		System.out.println(tpwh);                 // print parent address
		q3.click();                        // click download
		Thread.sleep(3000);

		Set<String> tllwh=driver.getWindowHandles();    // get all address
		for(String twh:tllwh)
		{
			System.out.println(twh);
			if(!tpwh.equals(twh)) {
				driver.switchTo().window(tpwh);           // switch back to parent address
			}

		} 
		Thread.sleep(3000);

		WebElement q4 =driver.findElement(By.xpath("//span[@class='fa fa-whatsapp']"));                // click watsaap
		String fpwh=driver.getWindowHandle();   //parent address
		System.out.println(fpwh);                 // print parent address
		q4.click();                        // click download
		Thread.sleep(3000);

		Set<String> fllwh=driver.getWindowHandles();    // get all address
		for(String fwh:fllwh)
		{
			System.out.println(fwh);
			if(!fpwh.equals(fwh)) {
				driver.switchTo().window(fpwh);           // switch back to parent address
			}

		} 
		Thread.sleep(3000);
		WebElement q5 =driver.findElement(By.xpath("//span[@class='fa fa-telegram']"));                // click telegram
		String qfpwh=driver.getWindowHandle();   //parent address
		System.out.println(qfpwh);                 // print parent address
		q5.click();                        // click download
		Thread.sleep(3000);

		Set<String> qfllwh=driver.getWindowHandles();    // get all address
		for(String qfwh:qfllwh)
		{
			System.out.println(qfwh);
			if(!qfpwh.equals(qfwh)) {
				driver.switchTo().window(qfpwh);           // switch back to parent address
			}

		} 
		Thread.sleep(3000);


		driver.findElement(By.xpath("//span[@class='fa fa-link']"));    // link copied


		JavascriptExecutor i=(JavascriptExecutor)driver;                            
		i.executeScript("window.scrollTo(0,2500)");
		Thread.sleep(3000);

		driver.findElement(By.xpath("//span[text()='View all jobs']")).click();     // click View all jobs....the future takes off with us.
		Thread.sleep(3000);

		driver.navigate().back();    // back to job details page
		Thread.sleep(3000);

		WebElement q6 =driver.findElement(By.xpath("//a[@class='cw-poweredby']")); // click zohorecruit
		String qspwh=driver.getWindowHandle();   //parent address
		System.out.println(qspwh);                 // print parent address
		q6.click();                        // click download
		Thread.sleep(3000);

		Set<String> qsllwh=driver.getWindowHandles();    // get all address
		for(String qswh:qsllwh)
		{
			System.out.println(qswh);
			if(!qfpwh.equals(qswh)) {
				driver.switchTo().window(qfpwh);           // switch back to parent address
			}

		} 
		Thread.sleep(4000);

		driver.findElement(By.xpath("//span[@class='cw-long-arrow-top']")).click(); //click the arrow....it goes top.
		Thread.sleep(3000);

		JavascriptExecutor p=(JavascriptExecutor)driver;     //scroll upto end 
		p.executeScript("window.scrollTo(0,2200)");
		Thread.sleep(3000);

		driver.findElement(By.xpath("//button[@class='lyte-button lyteBackgroundColorBtn lyteSuccess']")).click(); // click the i'm interested
		Thread.sleep(4000);

		WebElement t3= driver.findElement(By.xpath("//span[text()=' or drag and drop it here']"));            // upload the resume 
		Actions d=new Actions(driver);
		d.moveToElement(t3).click().perform();

		Runtime.getRuntime().exec("C:\\New folder\\autooscript.exe");        // used autoIT
		Thread.sleep(20000);

		JavascriptExecutor jk=(JavascriptExecutor)driver;                    
		jk.executeScript("window.scrollTo(0,500)");
		Thread.sleep(3000);

		//***********Enter name ************
		WebElement name = driver.findElement(By.xpath("//*[@id=\"rec-form_89246000000003151\"]/div/lyte-input/div/input"));
		Thread.sleep(5000);
		name.sendKeys("Testing");
		Thread.sleep(3000);

		//***********Enter mobile number***************

		driver.findElement(By.xpath("//*[@id=\"rec-form_89246000000003161\"]/div/div/lyte-input/div/input")).sendKeys("8152946391");
		Thread.sleep(3000);

		//************Enter current salary**************
		driver.findElement(By.xpath("//*[@id=\"rec-form_89246000000003199\"]/div/lyte-input/div/input")).sendKeys("30000");
		Thread.sleep(3000);

		//************ Enter expected salary************

		driver.findElement(By.xpath("//*[@id=\"rec-form_89246000000003197\"]/div/lyte-input/div/input")).sendKeys("50000");
		Thread.sleep(3000);

		//************ submit application ************

		driver.findElement(By.xpath("//*[@id=\"cw-submit-btn\"]/button")).click();
		Thread.sleep(3000);

		//************** click success 0k button ***************

		driver.findElement(By.xpath("/html/body/lyte-wormhole/lyte-yield/div/div[1]/div/lyte-button/button")).click();
		Thread.sleep(3000);

	}}
