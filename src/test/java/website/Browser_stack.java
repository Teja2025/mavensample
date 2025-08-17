package website;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import java.net.URL;
import java.net.MalformedURLException;
import java.time.Duration;
import java.util.Set;

public class Browser_stack extends Baseclass {

    public WebDriver driver = null;
    // Your BrowserStack user name and access key
    public static final String username = "ultravioletteaut_JN9D3y";
    public static final String accessKey = "oyrj7yKoyGzLqwdkPbnN";
    public static final String URL = "https://" + username + ":" + accessKey + "@hub-cloud.browserstack.com/wd/hub";

    @BeforeClass
    public void setup() throws MalformedURLException {
        // Set capabilities for BrowserStack
        DesiredCapabilities caps = new DesiredCapabilities();
        
        caps.setCapability("browserName"," Chrome");
        caps.setCapability("browserVersion","64.0");
        caps.setCapability("os","Windows");
        caps.setCapability(" osVersion","10");
        
        driver = new RemoteWebDriver(new URL(URL), caps);
    }


    @Test
    public void contactMethod() throws InterruptedException {
        driver.get("https://www.ultraviolette.com/contact");
        Thread.sleep(3000);

        //*********** Verify title **********
        String title = driver.getTitle();
        if (title.equals("Contact Ultraviolette | Reach Out for Support")) {
            System.out.println(title);
        } else {
            System.out.println("Title does not match expected title.");
        }

        //********** Verify header **********
        String header = new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div[text()='CONTACT'])[2]"))).getText();
        if (header.equals("CONTACT")) {
            System.out.println(header);
        } else {
            System.out.println("Header does not match expected header.");
        }

        //********** Click general query *********
        WebElement info = driver.findElement(By.xpath("//a[text()='info@ultraviolette.com']"));
        Thread.sleep(3000);
        info.click();
        Thread.sleep(3000);

        //************ Click grievances **********
        WebElement support = driver.findElement(By.xpath("//a[text()='support@ultraviolette.com']"));
        Thread.sleep(3000);
        support.click();
        Thread.sleep(3000);

        //*********** Click careers ***********
        WebElement careers = driver.findElement(By.xpath("//a[text()='careers@ultraviolette.com']"));
        Thread.sleep(3000);
        careers.click();
        Thread.sleep(3000);

        //********** Scroll to map *********
        JavascriptExecutor j = (JavascriptExecutor) driver;
        j.executeScript("window.scrollTo(0,500)");
        Thread.sleep(3000);

        //********** Click the map **********
        WebElement hanger = driver.findElement(By.xpath("//img[@alt='Ultraviolette Hangar']"));
        String parentWindow = driver.getWindowHandle();
        System.out.println("Parent window ID: " + parentWindow);
        hanger.click();
        Thread.sleep(3000);

        // Handle new window
        Set<String> childWindows = driver.getWindowHandles();
        for (String childWindow : childWindows) {
            System.out.println(childWindow);
            if (!childWindow.equals(parentWindow)) {
                driver.switchTo().window(childWindow);
                break;  // Once we switch to the new window, we break the loop
            }
        }
        Thread.sleep(3000);

        // Optional: Close the child window and switch back to the parent window
        driver.close();
        driver.switchTo().window(parentWindow);
    }
}