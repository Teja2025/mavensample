package org.sample.mavensample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class pageObjectc { //with page factory

	WebDriver driver;

	//constructor
	pageObjectc(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);// mandatory
	}

	// locators
	@FindBy(xpath="//*[@id=\"__next\"]/div/div[2]/div[2]/div/div/div[1]/div[4]/div[2]/div/div/a[2]/div/h1")
	WebElement testride;
	//locator + finding the elements
	
	//if group of elements
	//@FindBy(tagName="a")
	//List<WebElement> links;
	
	//Action methods
	public void clickTestride()
	{
		 testride.click();
	}



}
