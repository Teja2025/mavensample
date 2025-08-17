package website;                                    //As expected but need to add new implimention
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Faqpage extends Baseclass {

	@Test
	public void faqpMethod() throws InterruptedException, AWTException {

		driver.get("https://www.ultraviolette.com/faq");
		Thread.sleep(3000);


		//***********verify title**********

		String title=driver.getTitle();

		if(title.equals("Ultraviolette FAQs | Answers to Common Questions")) {
			System.out.println(title);	
		}
		else {
			// Print a message if the title doesn't match
			System.out.println("Title does not match expected title.");

		}

		//***********download spec sheet*************

		WebElement download =driver.findElement(By.xpath("(//a[text()='here'])[1]"));  // Specs sheet
		String pwh=driver.getWindowHandle();   //parent address
		System.out.println(pwh);                 // print parent address
		download.click();                        // click download
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


		JavascriptExecutor js1=(JavascriptExecutor)driver;
		js1.executeScript("window.scrollTo(0,600)");

		//***********Click contact number**********

		driver.findElement(By.xpath("(//a[text()='080-694-53322'])[1]")).click();
		Thread.sleep(3000);

		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_ESCAPE);
		robot.keyRelease(KeyEvent.VK_ESCAPE);

		//**********Click Email****************

		driver.findElement(By.xpath("//a[text()='info@ultraviolette.com']")).click();
		Thread.sleep(3000);
		robot.keyPress(KeyEvent.VK_ALT);
		robot.keyPress(KeyEvent.VK_F4);  
		robot.keyRelease(KeyEvent.VK_F4);
		robot.keyRelease(KeyEvent.VK_ALT);

		//***********Click Configure***********

		WebElement b=driver.findElement(By.xpath("//a[text()='Configure']")); //configure
		String ph=driver.getWindowHandle();   //parent address
		System.out.println(ph);                 // print parent address
		b.click();                        // click download
		Thread.sleep(3000);

		Set<String> alwh=driver.getWindowHandles();    // get all address
		for(String wh:alwh)
		{
			System.out.println(wh);
			if(!ph.equals(wh)) {
				driver.switchTo().window(ph);           // switch back to parent address
			}
		}
		Thread.sleep(3000);

		//***********Click Smarttech***********

		WebElement c=driver.findElement(By.xpath("(//a[text()='here'])[2]"));
		String phl=driver.getWindowHandle();   //parent address
		System.out.println(phl);                 // print parent address
		c.click();                        // click download
		Thread.sleep(3000);

		Set<String> awh=driver.getWindowHandles();    // get all address
		for(String wh:awh)
		{
			System.out.println(wh);
			if(!ph.equals(wh)) {
				driver.switchTo().window(phl);           // switch back to parent address
			}
		}
		Thread.sleep(3000);

		JavascriptExecutor js2=(JavascriptExecutor)driver;
		js2.executeScript("window.scrollTo(600,1000)");	

		//************Click configure****************

		WebElement d=driver.findElement(By.xpath("(//a[text()='here'])[3]"));
		String ph2=driver.getWindowHandle();   //parent address
		System.out.println(ph2);                 // print parent address
		d.click();                        // click download
		Thread.sleep(3000);

		Set<String> aw=driver.getWindowHandles();    // get all address
		for(String wha:aw)
		{
			System.out.println(wha);
			if(!ph2.equals(wha)) {
				driver.switchTo().window(ph2);           // switch back to parent address
			}
		}
		Thread.sleep(3000);


		//************Click the F77 super street*********

		JavascriptExecutor js3=(JavascriptExecutor)driver;
		js3.executeScript("window.scrollTo(600,-200)");	

		driver.findElement(By.xpath("(//h3[text()='F77 SuperStreet'])[1]")).click();
		Thread.sleep(3000);


		//*************Click the Configure page**************

		WebElement con=driver.findElement(By.xpath("//a[text()='Configure']"));
		String pha=driver.getWindowHandle();   //parent address
		System.out.println(pha);                 // print parent address
		con.click();                        // click download
		Thread.sleep(3000);

		Set<String> awpa=driver.getWindowHandles();    // get all address
		for(String whpa:awpa)
		{
			System.out.println(whpa);
			if(!pha.equals(whpa)) {
				driver.switchTo().window(pha);           // switch back to parent address
			}
		}
		Thread.sleep(3000);

		//**********Click the Street talk***********

		driver.findElement(By.xpath("(//h3[text()='Street Talk'])[1]")).click();
		Thread.sleep(3000);

		//***********Click the product***************

		JavascriptExecutor js3a=(JavascriptExecutor)driver;
		js3a.executeScript("window.scrollTo(-1000,0)");	
		driver.findElement(By.xpath("//h1[text()='Product']")).click();
		Thread.sleep(3000);

		JavascriptExecutor js4=(JavascriptExecutor)driver;
		js4.executeScript("window.scrollTo(0,1500)");
		Thread.sleep(3000);

		//***********Click terms and condition************

		WebElement e=driver.findElement(By.xpath("(//a[text()='here'])[1]"));
		String ph3=driver.getWindowHandle();   //parent address
		System.out.println(ph3);                 // print parent address
		e.click();                        // click download
		Thread.sleep(3000);

		Set<String> awp=driver.getWindowHandles();    // get all address
		for(String whp:awp)
		{
			System.out.println(whp);
			if(!ph3.equals(whp)) {
				driver.switchTo().window(ph3);           // switch back to parent address
			}
		}
		Thread.sleep(3000);
		JavascriptExecutor js5=(JavascriptExecutor)driver;
		js5.executeScript("window.scrollTo(1500,1800)");
		Thread.sleep(3000);

		//***********Click Squadron page***************

		WebElement f=driver.findElement(By.xpath("(//a[text()='here'])[2]"));
		String ph4=driver.getWindowHandle();   //parent address
		System.out.println(ph4);                 // print parent address
		f.click();                        // click download
		Thread.sleep(3000);

		Set<String> ap=driver.getWindowHandles();    // get all address
		for(String wp:ap)
		{
			System.out.println(wp);
			if(!ph4.equals(wp)) {
				driver.switchTo().window(ph4);           // switch back to parent address
			}
		}
		Thread.sleep(3000);

		//************click Youtube video1************

		WebElement g=driver.findElement(By.xpath("//a[text()='Pilot Talks Episode 01']"));
		String ph5=driver.getWindowHandle();   //parent address
		System.out.println(ph5);                 // print parent address
		g.click();                        // click download
		Thread.sleep(3000);

		Set<String> api=driver.getWindowHandles();    // get all address
		for(String wpi:api)
		{
			System.out.println(wpi);
			if(!ph5.equals(wpi)) {
				driver.switchTo().window(ph5);           // switch back to parent address
			}
		}
		Thread.sleep(3000);

		//***********click Youtube video2***********

		WebElement h=driver.findElement(By.xpath("//a[text()='Pilot Talks Episode 02']"));
		String ph6=driver.getWindowHandle();   //parent address
		System.out.println(ph6);                 // print parent address
		h.click();                        // click download
		Thread.sleep(3000);

		Set<String> apt=driver.getWindowHandles();    // get all address
		for(String wpt:apt)
		{
			System.out.println(wpt);
			if(!ph6.equals(wpt)) {
				driver.switchTo().window(ph6);           // switch back to parent address
			}
		}
		Thread.sleep(3000);	

		JavascriptExecutor js8=(JavascriptExecutor)driver;
		js8.executeScript("window.scrollTo(0,500)");
		Thread.sleep(3000);

		//***********Click battery**********

		driver.findElement(By.xpath("(//h3[text()='Battery'])[1]")).click();
		Thread.sleep(3000);	

		//***********Click range************
		driver.findElement(By.xpath("(//h3[text()='Range'])[1]")).click();
		Thread.sleep(3000);	

		//**********Click Charging************

		driver.findElement(By.xpath("(//h3[text()='Charging'])[1]")).click();
		Thread.sleep(3000);	

		//**********Click warranty*************

		driver.findElement(By.xpath("(//h3[text()='Warranty'])[1]")).click();
		Thread.sleep(3000);	

		//***********Click terms and condition***************

		WebElement i=driver.findElement(By.xpath("(//a[text()='here'])[1]"));
		String ph7=driver.getWindowHandle();   //parent address
		System.out.println(ph7);                 // print parent address
		i.click();                        // click download
		Thread.sleep(3000);

		Set<String> apv=driver.getWindowHandles();    // get all address
		for(String wpv:apv)
		{
			System.out.println(wpv);
			if(!ph7.equals(wpv)) {
				driver.switchTo().window(ph7);           // switch back to parent address
			}
		}
		Thread.sleep(3000);	

		JavascriptExecutor js9=(JavascriptExecutor)driver;
		js9.executeScript("window.scrollTo(-500,200)");
		Thread.sleep(3000);

		//**********Click sales**************

		driver.findElement(By.xpath("//h1[text()='Sales']")).click();
		Thread.sleep(3000);

		//************Click Test ride**************

		WebElement k=driver.findElement(By.xpath("//a[text()='link']"));
		String ph8=driver.getWindowHandle();   //parent address
		System.out.println(ph8);                 // print parent address
		k.click();                        //click download
		Thread.sleep(3000);

		Set<String> aph=driver.getWindowHandles();    // get all address
		for(String wph:aph)
		{
			System.out.println(wph);
			if(!ph7.equals(wph)) {
				driver.switchTo().window(ph8);           // switch back to parent address
			}
		}
		Thread.sleep(3000);	

		//***********Click booking**********

		driver.findElement(By.xpath("(//h3[text()='Booking'])[1]")).click();
		Thread.sleep(3000);

		//*********Click finance***********

		driver.findElement(By.xpath("(//h3[text()='Finance'])[1]")).click();
		Thread.sleep(3000);

		//**********Click contact number**********

		driver.findElement(By.xpath("(//a[text()='080-694-53322'])[1]")).click();
		Thread.sleep(3000);

		robot.keyPress(KeyEvent.VK_ESCAPE);
		robot.keyRelease(KeyEvent.VK_ESCAPE);

		//*************Click email************

		driver.findElement(By.xpath("//a[text()='info@ultraviolette.com']")).click();
		Thread.sleep(3000);

		robot.keyPress(KeyEvent.VK_ALT);
		robot.keyPress(KeyEvent.VK_F4);  
		robot.keyRelease(KeyEvent.VK_F4);
		robot.keyRelease(KeyEvent.VK_ALT);

		//***************click purchase************

		driver.findElement(By.xpath("(//h3[text()='Purchase'])[1]")).click();
		Thread.sleep(3000);

		//***********accessories***************

		driver.findElement(By.xpath("(//h3[text()='Accessories'])[1]")).click();
		Thread.sleep(3000);

		//************Click Service*****************

		driver.findElement(By.xpath("(//h1[text()='Service'])[1]")).click();
		Thread.sleep(3000);

		//*************Click service frequency**************

		driver.findElement(By.xpath("(//h3[text()='Service Frequency'])[1]")).click();
		Thread.sleep(3000);

		//***********Click free service**********

		driver.findElement(By.xpath("(//h3[text()='Free Service'])[1]")).click();
		Thread.sleep(3000);

		//************Click Service Scheduling***************

		driver.findElement(By.xpath("(//h3[text()='Service Scheduling'])[1]")).click();
		Thread.sleep(3000);

		//****************Click contact number*************

		driver.findElement(By.xpath("(//a[text()='080-694-53322'])[1]")).click();
		Thread.sleep(3000);
		robot.keyPress(KeyEvent.VK_ESCAPE);
		robot.keyRelease(KeyEvent.VK_ESCAPE);

		//*************Click email**********

		driver.findElement(By.xpath("//a[text()='support@ultraviolette.com']")).click();
		Thread.sleep(4000);

		robot.keyPress(KeyEvent.VK_ALT);
		robot.keyPress(KeyEvent.VK_F4);  
		robot.keyRelease(KeyEvent.VK_F4);
		robot.keyRelease(KeyEvent.VK_ALT);

		//************Click RSA***********

		driver.findElement(By.xpath("(//h3[text()='RSA'])[1]")).click();
		Thread.sleep(3000);

		//***********Home Maintenance**************

		driver.findElement(By.xpath("(//h3[text()='Home Maintenance'])[1]")).click();
		Thread.sleep(3000);

		// **********Public Charging***************

		driver.findElement(By.xpath("(//h1[text()='Public Charging'])[1]")).click();
		Thread.sleep(3000);

		JavascriptExecutor js0=(JavascriptExecutor)driver;
		js0.executeScript("window.scrollTo(0,1400)");
		Thread.sleep(3000);


		//****************Click contact number*************

		driver.findElement(By.xpath("(//a[text()='080-694-53322'])[1]")).click();
		Thread.sleep(3000);
		robot.keyPress(KeyEvent.VK_ESCAPE);
		robot.keyRelease(KeyEvent.VK_ESCAPE);

		JavascriptExecutor j9=(JavascriptExecutor)driver;
		j9.executeScript("window.scrollTo(1400,2000)");
		Thread.sleep(3000);

		//****************Click contact number*************

		driver.findElement(By.xpath("(//a[text()='080-694-53322'])[2]")).click();
		Thread.sleep(3000);

		robot.keyPress(KeyEvent.VK_ESCAPE);
		robot.keyRelease(KeyEvent.VK_ESCAPE);

		//*************Click email**********		

		driver.findElement(By.xpath("(//a[text()='support@ultraviolette.com'])")).click();
		Thread.sleep(4000);

		robot.keyPress(KeyEvent.VK_ALT);
		robot.keyPress(KeyEvent.VK_F4);  
		robot.keyRelease(KeyEvent.VK_F4);
		robot.keyRelease(KeyEvent.VK_ALT);

		//****************Click contact number*************

		driver.findElement(By.xpath("(//a[text()='080-694-53322'])[3]")).click();
		Thread.sleep(3000);
		robot.keyPress(KeyEvent.VK_ESCAPE);
		robot.keyRelease(KeyEvent.VK_ESCAPE);

		//************Click the Vihicles*************

		driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div/div[2]/div[1]/div/div/div[1]/h1")).click();
		Thread.sleep(3000);

	}

}
