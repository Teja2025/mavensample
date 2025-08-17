package website;                                   //failed
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Squadron extends Baseclass {
	
	
	@Test
	public void squadronMethod() throws InterruptedException
	{
		
		driver.get("https://www.ultraviolette.com/squadron");
		Thread.sleep(3000);
		
		//***********verify  title***********	

				String title=driver.getTitle();

				if(title.equals("Ultraviolette Automotive | Squadron")) {
					System.out.println(title);	
			}
			else {
					// Print a message if the title doesn't match
					System.out.println("Title does not match expected title.");
				}
			
				
				JavascriptExecutor js = (JavascriptExecutor)driver;
				js.executeScript("window.scrollTo(0,1000)");
				Thread.sleep(3000);
				
				//**********click "go to leader board button"**********
				WebElement leaderboardButton =driver.findElement(By.xpath("//button[text()='GO TO LEADERBOARD']"));
				leaderboardButton.click();
				Thread.sleep(3000);
				
				js.executeScript("window.scrollTo(500,1000)");
				Thread.sleep(3000);
				
				js.executeScript("window.scrollTo(1000,2000)");
				Thread.sleep(3000);
				
				js.executeScript("window.scrollTo(2000,0)");
				Thread.sleep(4000);
				
				driver.findElement(By.xpath("//span[text()='BACK']")).click();
				Thread.sleep(2000);
				
			
				js.executeScript("window.scrollTo(0,1000)");
				Thread.sleep(3000);
				
				//************pilot testimonials***********

				js.executeScript("window.scrollTo(1000,1700)");
				Thread.sleep(3000);
				WebElement video1 =driver.findElement(By.xpath("(//img[contains(@alt,'Ultraviolette EV Review')])[16]"));
				String parentWindow1= driver.getWindowHandle();
				System.out.println("parent window id is :" + parentWindow1);
				video1.click();
				Thread.sleep(3000);
				Set<String> childWindows1 =driver.getWindowHandles();
				for (String childWindow1 : childWindows1) 
				{
					System.out.println(childWindow1);
					if(!childWindow1.equals(parentWindow1))
					{
						driver.switchTo().window(parentWindow1);
					}
				}

				Thread.sleep(3000);
				
				WebElement video2=driver.findElement(By.xpath("(//img[contains(@alt,'Ultraviolette EV Review')])[21]"));
				String parentWindow2 = driver.getWindowHandle();
				System.out.println("parent window id is :" + parentWindow2);
				video2.click();
				Thread.sleep(3000);
				Set<String> childWindows2 =driver.getWindowHandles();
				for (String childWindow2 : childWindows2) 
				{
					System.out.println(childWindow2);
					if(!childWindow2.equals(parentWindow2))
					{
						driver.switchTo().window(parentWindow2);
					}
				}

				Thread.sleep(3000);
				
				WebElement video3=driver.findElement(By.xpath("(//img[contains(@alt,'Ultraviolette EV Review')])[26]"));
				String parentWindow3 = driver.getWindowHandle();
				System.out.println("parent window id is :" + parentWindow3);
				video3.click();
				Thread.sleep(3000);
				Set<String> childWindows3 =driver.getWindowHandles();
				for (String childWindow3 : childWindows3) 
				{
					System.out.println(childWindow3);
					if(!childWindow3.equals(parentWindow3))
					{
						driver.switchTo().window(parentWindow3);
						
					}
				}

				Thread.sleep(3000);
				
				js.executeScript("window.scrollTo(1500,2500)");
				Thread.sleep(3000);
				
//				WebElement ww1=driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[3]/div[6]/div[3]/div/div/div/div/div/div/div/div[1]/div/div/div/img")); //drag and drop
//				WebElement ww2=driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[3]/div[6]/div[3]/div/div/div/div/div/div/div/div[2]/div/div/div/img"));
//				WebElement ww3=driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[3]/div[6]/div[3]/div/div/div/div/div/div/div/div[3]/div/div/div/img"));
//				WebElement ww4=driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[3]/div[6]/div[3]/div/div/div/div/div/div/div/div[4]/div/div/div/img"));
//				
//				Actions a=new Actions(driver);
//				a.dragAndDrop(ww1,ww2).build().perform();
//				Thread.sleep(3000);	
//				
//				
//				a.dragAndDrop(ww2,ww3).build().perform();
//				Thread.sleep(3000);	
//				
//				a.dragAndDrop(ww4,ww3).build().perform();
//				Thread.sleep(3000);	
//				
//				a.dragAndDrop(ww3,ww2).build().perform();
//				Thread.sleep(3000);	
//	
//				
//				js.executeScript("window.scrollTo(2500,3200)");
//				Thread.sleep(3000);
//				
//				driver.findElement(By.xpath("//span[text()='EXPLORE WALLPAPERS']")).click(); // explore wallpaper
//				Thread.sleep(3000);


				
				//*********** Verify Wallpaper images*************
				
				//*********** F77 Mach 2 Airstrike ***************
				
				driver.findElement(By.xpath(("//*[@id=\"__next\"]/div/div[2]/div[2]/div/div[3]/div[1]/div[2]/div[1]/div/img"))).click();  
				Thread.sleep(3000);
		       
			    driver.findElement(By.xpath("/html/body/div[4]/div[2]/div/div/div/div/img")).click();
			    Thread.sleep(3000);
			
				driver.findElement(By.xpath(("//*[@id=\"__next\"]/div/div[2]/div[2]/div/div[3]/div[1]/div[2]/div[5]/div/img"))).click();  
				Thread.sleep(3000);
		       
			    driver.findElement(By.xpath("/html/body/div[4]/div[2]/div/div/div/div/img")).click();
			    Thread.sleep(3000);
			
				driver.findElement(By.xpath(("//*[@id=\"__next\"]/div/div[2]/div[2]/div/div[3]/div[1]/div[2]/div[9]/div/img"))).click(); 
				Thread.sleep(3000);
		       
			    driver.findElement(By.xpath("/html/body/div[4]/div[2]/div/div/div/div/img")).click();
			    Thread.sleep(3000);
			
				driver.findElement(By.xpath(("//*[@id=\"__next\"]/div/div[2]/div[2]/div/div[3]/div[1]/div[2]/div[2]/div/img"))).click(); 
				Thread.sleep(3000);
		        
			    driver.findElement(By.xpath("/html/body/div[4]/div[2]/div/div/div/div/img")).click();
			    Thread.sleep(3000);
			
				driver.findElement(By.xpath(("//*[@id=\"__next\"]/div/div[2]/div[2]/div/div[3]/div[1]/div[2]/div[6]/div/img"))).click();  
				Thread.sleep(3000);
		      
			    driver.findElement(By.xpath("/html/body/div[4]/div[2]/div/div/div/div/img")).click();
			    Thread.sleep(3000);
			
				driver.findElement(By.xpath(("//*[@id=\"__next\"]/div/div[2]/div[2]/div/div[3]/div[1]/div[2]/div[10]/div/img"))).click(); 
				Thread.sleep(3000);
		       
			    driver.findElement(By.xpath("/html/body/div[4]/div[2]/div/div/div/div/img")).click();
			    Thread.sleep(3000);
			
				driver.findElement(By.xpath(("//*[@id=\"__next\"]/div/div[2]/div[2]/div/div[3]/div[1]/div[2]/div[3]/div/img"))).click(); 
				Thread.sleep(3000);
		       
			    driver.findElement(By.xpath("/html/body/div[4]/div[2]/div/div/div/div/img")).click();
			    Thread.sleep(3000);
			
				driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div[2]/div/div[3]/div[1]/div[2]/div[7]/div/img")).click();
				Thread.sleep(3000);
		       
			    driver.findElement(By.xpath("/html/body/div[4]/div[2]/div/div/div/div/img")).click();
			    Thread.sleep(3000);
			
				driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div[2]/div/div[3]/div[1]/div[2]/div[11]/div/img")).click();
				Thread.sleep(3000);
		     
			    driver.findElement(By.xpath("/html/body/div[4]/div[2]/div/div/div/div/img")).click();
			    Thread.sleep(3000);
			    
			
				driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div[2]/div/div[3]/div[1]/div[2]/div[4]/div/img")).click();
				Thread.sleep(3000);
		      
			    driver.findElement(By.xpath("/html/body/div[4]/div[2]/div/div/div/div/img")).click();
			    Thread.sleep(3000);
			
				driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div[2]/div/div[3]/div[1]/div[2]/div[8]/div/img")).click();
				Thread.sleep(3000);
		    
		 	    driver.findElement(By.xpath("/html/body/div[4]/div[2]/div/div/div/div/img")).click();
			    Thread.sleep(3000);
			
				driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div[2]/div/div[3]/div[1]/div[2]/div[12]/div/img")).click();
				Thread.sleep(3000);
		     
			    driver.findElement(By.xpath("/html/body/div[4]/div[2]/div/div/div/div/img")).click();
			    Thread.sleep(3000);
				
				
				
				//************* F77 - the future****************
			    
			    driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div[2]/div/div[3]/div[2]/div[2]/div[1]/div/img")).click();   
			    Thread.sleep(3000);
		      
		        driver.findElement(By.xpath("/html/body/div[4]/div[2]/div/div/div/div/img")).click();
		        Thread.sleep(3000);
		        
			    driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div[2]/div/div[3]/div[2]/div[2]/div[4]/div/img")).click();   
			    Thread.sleep(3000);
		        
		        driver.findElement(By.xpath("/html/body/div[4]/div[2]/div/div/div/div/img")).click();
		        Thread.sleep(3000);
		        
			    driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div[2]/div/div[3]/div[2]/div[2]/div[7]/div/img")).click();   
			    Thread.sleep(3000);
		      
		        driver.findElement(By.xpath("/html/body/div[4]/div[2]/div/div/div/div/img")).click();
		        Thread.sleep(3000);
		        
			    driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div[2]/div/div[3]/div[2]/div[2]/div[2]/div/img")).click();  
			    Thread.sleep(3000);
		     
			    driver.findElement(By.xpath("/html/body/div[4]/div[2]/div/div/div/div/img")).click();
		        Thread.sleep(3000);
		        
			    driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div[2]/div/div[3]/div[2]/div[2]/div[5]/div/img")).click();   
			    Thread.sleep(3000);
		       
			    driver.findElement(By.xpath("/html/body/div[4]/div[2]/div/div/div/div/img")).click();
		        Thread.sleep(3000);
		        
			    driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div[2]/div/div[3]/div[2]/div[2]/div[8]/div/img")).click();   
			    Thread.sleep(3000);
		      
		        driver.findElement(By.xpath("/html/body/div[4]/div[2]/div/div/div/div/img")).click();
		        Thread.sleep(3000);
		  
			    driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div[2]/div/div[3]/div[2]/div[2]/div[3]/div/img")).click();  
			    Thread.sleep(3000);
		       
		        driver.findElement(By.xpath("/html/body/div[4]/div[2]/div/div/div/div/img")).click();
		        Thread.sleep(3000);
			    
			    driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div[2]/div/div[3]/div[2]/div[2]/div[6]/div/img")).click();  
			    Thread.sleep(3000);
		      
		        driver.findElement(By.xpath("/html/body/div[4]/div[2]/div/div/div/div/img")).click();
		        Thread.sleep(3000);
		        
		        
		        
		        //***********space edition**************
		        
		        driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div[2]/div/div[3]/div[3]/div[2]/div[1]/div/img")).click();  
			    Thread.sleep(3000);
		       
		        driver.findElement(By.xpath("/html/body/div[4]/div[2]/div/div/div/div/img")).click();
		        Thread.sleep(3000);
		        
		        driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div[2]/div/div[3]/div[3]/div[2]/div[5]/div/img")).click();
			    Thread.sleep(3000);
		        
		        driver.findElement(By.xpath("/html/body/div[4]/div[2]/div/div/div/div/img")).click();
		        Thread.sleep(3000);
		        
		        driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div[2]/div/div[3]/div[3]/div[2]/div[9]/div/img")).click();  
			    Thread.sleep(3000);
		     
		        driver.findElement(By.xpath("/html/body/div[4]/div[2]/div/div/div/div/img")).click();
		        Thread.sleep(3000);
		        
		        driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div[2]/div/div[3]/div[3]/div[2]/div[2]/div/img")).click();  
			    Thread.sleep(3000);
		       
		        driver.findElement(By.xpath("/html/body/div[4]/div[2]/div/div/div/div/img")).click();
		        Thread.sleep(3000);
		        
		        driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div[2]/div/div[3]/div[3]/div[2]/div[6]/div/img")).click();  
			    Thread.sleep(3000);
		     
		        driver.findElement(By.xpath("/html/body/div[4]/div[2]/div/div/div/div/img")).click();
		        Thread.sleep(3000);
		        
		        driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div[2]/div/div[3]/div[3]/div[2]/div[10]/div/img")).click(); 
			    Thread.sleep(3000);
		     
		        driver.findElement(By.xpath("/html/body/div[4]/div[2]/div/div/div/div/img")).click();
		        Thread.sleep(3000);
		        
		        driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div[2]/div/div[3]/div[3]/div[2]/div[11]/div/img")).click();  
			    Thread.sleep(3000);
		       
		        driver.findElement(By.xpath("/html/body/div[4]/div[2]/div/div/div/div/img")).click();
		        Thread.sleep(3000);
		        
		        driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div[2]/div/div[3]/div[3]/div[2]/div[3]/div/img")).click();  
			    Thread.sleep(3000);
		      
		        driver.findElement(By.xpath("/html/body/div[4]/div[2]/div/div/div/div/img")).click();
		        Thread.sleep(3000);
		        
		        driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div[2]/div/div[3]/div[3]/div[2]/div[7]/div/img")).click();  
			    Thread.sleep(3000);
		        
		        driver.findElement(By.xpath("/html/body/div[4]/div[2]/div/div/div/div/img")).click();
		        Thread.sleep(3000);
		        
		        driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div[2]/div/div[3]/div[3]/div[2]/div[12]/div/img")).click(); 
			    Thread.sleep(3000);
		      
		        driver.findElement(By.xpath("/html/body/div[4]/div[2]/div/div/div/div/img")).click();
		        Thread.sleep(3000);
		        
		        driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div[2]/div/div[3]/div[3]/div[2]/div[4]/div/img")).click(); 
			    Thread.sleep(3000);
		     
		        driver.findElement(By.xpath("/html/body/div[4]/div[2]/div/div/div/div/img")).click();
		        Thread.sleep(3000);
		        
		        driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div[2]/div/div[3]/div[3]/div[2]/div[8]/div/img")).click(); 
			    Thread.sleep(3000);
		      
		        driver.findElement(By.xpath("/html/body/div[4]/div[2]/div/div/div/div/img")).click();
		        Thread.sleep(3000);

		        
		        //***************** Beyond Asphalt***************
		        
		        driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div[2]/div/div[3]/div[4]/div[2]/div[1]/div/img")).click();   
			    Thread.sleep(3000);
		      
		        driver.findElement(By.xpath("/html/body/div[4]/div[2]/div/div/div/div/img")).click();
		        Thread.sleep(3000);
		        
		        driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div[2]/div/div[3]/div[4]/div[2]/div[5]/div/img")).click();  
			    Thread.sleep(3000);
		       
		        driver.findElement(By.xpath("/html/body/div[4]/div[2]/div/div/div/div/img")).click();
		        Thread.sleep(3000);
		        
		        driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div[2]/div/div[3]/div[4]/div[2]/div[9]/div/img")).click(); 
			    Thread.sleep(3000);
		      
		        driver.findElement(By.xpath("/html/body/div[4]/div[2]/div/div/div/div/img")).click();
		        Thread.sleep(3000);
		        
		        driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div[2]/div/div[3]/div[4]/div[2]/div[2]/div/img")).click();   
			    Thread.sleep(3000);
		      
		        driver.findElement(By.xpath("/html/body/div[4]/div[2]/div/div/div/div/img")).click();
		        Thread.sleep(3000);
		        
		        driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div[2]/div/div[3]/div[4]/div[2]/div[6]/div/img")).click();  
			    Thread.sleep(3000);
		       
		        driver.findElement(By.xpath("/html/body/div[4]/div[2]/div/div/div/div/img")).click();
		        Thread.sleep(3000);
		        
		        driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div[2]/div/div[3]/div[4]/div[2]/div[10]/div/img")).click();   
			    Thread.sleep(3000);
		       
		        driver.findElement(By.xpath("/html/body/div[4]/div[2]/div/div/div/div/img")).click();
		        Thread.sleep(3000);
		        
		        driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div[2]/div/div[3]/div[4]/div[2]/div[11]/div/img")).click();  
			    Thread.sleep(3000);
		       
		        driver.findElement(By.xpath("/html/body/div[4]/div[2]/div/div/div/div/img")).click(); ////////////////////////////////
		        Thread.sleep(3000);
		        
		        driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div[2]/div/div[3]/div[4]/div[2]/div[3]/div/img")).click(); 
			    Thread.sleep(3000);
		      
		        driver.findElement(By.xpath("/html/body/div[4]/div[2]/div/div/div/div/img")).click();
		        Thread.sleep(3000);
		        
		        driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div[2]/div/div[3]/div[4]/div[2]/div[7]/div/img")).click();   
			    Thread.sleep(3000);
		       
		        driver.findElement(By.xpath("/html/body/div[4]/div[2]/div/div/div/div/img")).click();
		        Thread.sleep(3000);
		        
		        driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div[2]/div/div[3]/div[4]/div[2]/div[12]/div/img")).click();   
			    Thread.sleep(3000);
	
		        driver.findElement(By.xpath("/html/body/div[4]/div[2]/div/div/div/div/img")).click();
		        Thread.sleep(3000);
		        
		        driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div[2]/div/div[3]/div[4]/div[2]/div[4]/div/img")).click();
			    Thread.sleep(3000);
		       
		        driver.findElement(By.xpath("/html/body/div[4]/div[2]/div/div/div/div/img")).click();
		        Thread.sleep(3000);
		        
		        driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div[2]/div/div[3]/div[4]/div[2]/div[8]/div/img")).click();  
			    Thread.sleep(3000);
		      
		        driver.findElement(By.xpath("/html/body/div[4]/div[2]/div/div/div/div/img")).click();
		        Thread.sleep(3000);
		        
		        driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div[2]/div/div[3]/div[4]/div[2]/div[13]/div/img")).click(); 
			    Thread.sleep(3000);
		       
		        driver.findElement(By.xpath("/html/body/div[4]/div[2]/div/div/div/div/img")).click();
		        Thread.sleep(3000);
		        
		        driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div[2]/div/div[3]/div[4]/div[2]/div[14]/div/img")).click();  
			    Thread.sleep(3000);
		       
		        driver.findElement(By.xpath("/html/body/div[4]/div[2]/div/div/div/div/img")).click();
		        Thread.sleep(3000);
		        
		        js.executeScript("window.scrollTo(6000,0)");  
		    	driver.navigate().back(); // squadron
				Thread.sleep(3000);
				js.executeScript("window.scrollTo(0,14000)");    
			}}

	

	

		
    
