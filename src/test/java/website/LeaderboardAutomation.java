package website;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LeaderboardAutomation {
	 
	    public static void main(String[] args) {
	        // Set the path to the ChromeDriver executable
	        System.setProperty("webdriver.chrome.driver", "./jars/chromedriver.exe");
	 
	        // Initialize the WebDriver
	        WebDriver driver = new ChromeDriver();
	        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	 
	        try {
	            // Open the Ultraviolette website
	            driver.get("https://www.ultraviolette.com");
	            driver.manage().window().maximize(); // Maximize the window
	 
	            // Wait and click on the Leaderboard link (assuming there's a link or menu item for it)
	            WebElement leaderboardLink = wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Leaderboard")));
	            leaderboardLink.click();
	 
	            // Wait for the leaderboard section to load
	            WebElement leaderboardSection = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("leaderboard")));  // Change the locator if needed
	            System.out.println("Leaderboard is visible");
	 
	            // Capture the top 3 ranked users (assuming leaderboard entries have a class name like 'leaderboard-entry')
	            for (int i = 1; i <= 3; i++) {
	                WebElement user = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='leaderboard-entry'][" + i + "]/div[@class='user-name']")));
	                System.out.println("Top " + i + " user: " + user.getText());
	            }
	 
	            // Optional: Capture any additional information from the leaderboard (e.g., user scores, ranks)
	            // For example, capturing the score of the top user
	            WebElement topUserScore = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='leaderboard-entry'][1]/div[@class='user-score']")));
	            System.out.println("Top user score: " + topUserScore.getText());
	 
	        } catch (Exception e) {
	            e.printStackTrace();
	        } finally {
	            // Close the driver
	            driver.quit();
	        }
	    }
	}


