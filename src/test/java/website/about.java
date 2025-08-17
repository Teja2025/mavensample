package website;                                           //As expected................
import java.io.IOException;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class about extends Baseclass {

    @Test
    public void aboutMethod() throws InterruptedException, IOException {
    
      
            //Open the "About" page
    	
            driver.get("https://www.ultraviolette.com/about");
            Thread.sleep(1000);

            //*********** Verify Title ***********	
            
            String title = driver.getTitle();
            if (title.equals("About Ultraviolette | Our Vision and Mission")) {
                System.out.println(title);	
            } else {
               
                System.out.println("Title does not match expected title.");
            }

            //********* Verify Header *************
            
            String header = new WebDriverWait(driver, Duration.ofSeconds(10))
                    .until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div[text()='ABOUT'])[2]"))).getText();
            if (header.equals("ABOUT")) {
                System.out.println(header);
            } else {
                
                System.out.println("Header does not match expected header.");
            }

            
            //********* Scroll up to footer ********
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("window.scrollTo(0,1000)");
            Thread.sleep(1000);

            //********* Scroll up to header ********
            
            js.executeScript("window.scrollTo(1000,0)");
            Thread.sleep(1000);
            System.out.println("hiii");
            
        }
    }

      