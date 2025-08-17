package org.sample.mavensample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class pageObjectClass {
	
	WebDriver driver;
	
	//constructor
	pageObjectClass(WebDriver driver)
	{
		this.driver=driver;
	}
	
	//Locators
	By book_your_f77=By.xpath("//*[@id=\"home-configure-expanded-btn\"]/img");
	
	//Action methods
	public void clickf77button()
	{
		driver.findElement(book_your_f77).click();
		
	}
	

}
