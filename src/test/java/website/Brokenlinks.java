package website;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Brokenlinks {

	public static void main(String[]args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.ultraviolette.com/smarttech");
		List<WebElement> links =driver.findElements(By.tagName("a"));
		for(int i=0;i<links.size();i++) {
			WebElement E1= links.get(i);
			String url=E1.getAttribute("href");
			try {
				URL url1=new URL(url);

				// now we will be creating url connection and getting the response code
				HttpURLConnection httpURLconnect =(HttpURLConnection)url1.openConnection();
				httpURLconnect.setConnectTimeout(5000);
				httpURLconnect.connect();
				if(httpURLconnect.getResponseCode()>=400) {

					System.out.println(url+"-"+httpURLconnect.getResponseMessage()+"is a broken link");
				}

				// fetching and printing response code obtained
				else
				{
					System.out.println(url+"-"+httpURLconnect.getResponseMessage());
				}

			}
			catch (Exception e)
			{

			}
		}
	}
}
