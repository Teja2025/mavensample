package website;

import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Testing extends Baseclass {

    @Test
    public void Test() throws InterruptedException {
        driver.get("https://www.ultraviolette.com/f99/enquiry");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

//        // Fill basic details
//        driver.findElement(By.id("enteredFullName")).sendKeys("Testing");

        // Click the country dropdown
        WebElement dropdownToggle = driver.findElement(By.id(""));
        dropdownToggle.click();

        // Wait for the dropdown options to be visible
        Thread.sleep(2000); // Better to use WebDriverWait instead

        // Fetch all dropdown options
        List<WebElement> dropdownOptions = driver.findElements(By.xpath("//div[@id='dropdown_inputField']//div[@class='item']"));

        System.out.println("Number of countries found: " + dropdownOptions.size());

        // Iterate through each option to check if it's clickable
        for (WebElement option : dropdownOptions) {
            String countryName = option.getText().trim();
            System.out.println("Clicking on country: " + countryName);
            try {
                option.click();
                Thread.sleep(1000); // simulate user click delay

                // Re-open dropdown after each click for next option
                dropdownToggle.click();
                Thread.sleep(1000); // wait for dropdown to reopen
            } catch (Exception e) {
                System.out.println("Failed to click on country: " + countryName);
                e.printStackTrace();
            }
        }
        
//        driver.findElement(By.id("phone-text")).sendKeys("8152946391");
//        driver.findElement(By.id("enteredEmailId")).sendKeys("trfug@gmail.com");
//
//        // Optionally continue to next step
//        driver.findElement(By.xpath("//div[text()='NEXT']")).click();
    }
}
