package website;                            //As expected 

import java.io.IOException;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Leader_board extends Baseclass {

    @Test
    public void LeaderboardMethod() throws InterruptedException, IOException {
        driver.get("https://www.ultraviolette.com/squadron/leaderboard");
        Thread.sleep(1000);

        // Get the Leader board values and names
        
        String value1 = driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div/div[2]/div[2]/div[2]/div/div/div/div/div[2]/div[2]/div[1]/div/div/div/div[2]/span[1]")).getText();
        String value2 = driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div/div[2]/div[2]/div[2]/div/div/div/div/div[2]/div[2]/div[2]/div/div[2]/div/div[2]/span[1]")).getText();
        String value3 = driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div/div[2]/div[2]/div[2]/div/div/div/div/div[2]/div[2]/div[3]/div/div[2]/div/div[2]/span[1]")).getText();
        String value4 = driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div/div[2]/div[2]/div[2]/div/div/div/div/div[2]/div[2]/div[4]/div/div[2]/div/div[2]/span[1]")).getText();
        String value5 = driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div/div[2]/div[2]/div[2]/div/div/div/div/div[2]/div[2]/div[5]/div/div[2]/div/div[2]/span[1]")).getText();

        String name1 = driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div/div[2]/div[2]/div[2]/div/div/div/div/div[2]/div[1]/div")).getText();
        String name2 = driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div/div[2]/div[2]/div[2]/div/div/div/div/div[2]/div[2]/div[2]/div/div[1]")).getText();
        String name3 = driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div/div[2]/div[2]/div[2]/div/div/div/div/div[2]/div[2]/div[3]/div/div[1]")).getText();
        String name4 = driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div/div[2]/div[2]/div[2]/div/div/div/div/div[2]/div[2]/div[4]/div/div[1]")).getText();
        String name5 = driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div/div[2]/div[2]/div[2]/div/div/div/div/div[2]/div[2]/div[5]/div/div[1]")).getText();

        // Print names and values before further processing
        
        System.out.println("Leaderboard names and Values:");
        System.out.println(name1 + ": " + value1);
        System.out.println(name2 + ": " + value2);
        System.out.println(name3 + ": " + value3);
        System.out.println(name4 + ": " + value4);
        System.out.println(name5 + ": " + value5);

        // Store all the values in an array 
        
        String[] values = {value1, value2, value3, value4, value5};

        // Check for zero or negative values and throw an error if found
        
        for (String value : values) {
            int numericValue = Integer.parseInt(value.replaceAll("[^\\d-]", "")); // Convert to integer after cleaning non-numeric characters
            if (numericValue <= 0) {
                throw new IllegalArgumentException("Error: The leaderboard contains zero or negative values. Invalid value: " + value);
            }
        }

        // Convert values to integers if they represent numbers
        
        int[] valuesAsInts = new int[values.length];
        for (int i = 0; i < values.length; i++) {
            valuesAsInts[i] = Integer.parseInt(values[i].replaceAll("[^\\d]", "")); // Remove non-numeric characters (if any)
        }

        // Check if the array is sorted in descending order
        
        boolean isDescending = true;
        for (int i = 1; i < valuesAsInts.length; i++) {
            if (valuesAsInts[i-1] < valuesAsInts[i]) {
                isDescending = false;
                break;
            }
        }

        // Output result
        
        if (isDescending) {
            System.out.println("The leaderboard values are in descending order.");
        } else {
            System.out.println("The leaderboard values are NOT in descending order.");
        }

        Thread.sleep(3000);    // Sleep at the end for observation
    }
}