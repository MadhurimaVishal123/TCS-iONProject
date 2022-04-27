package com.phptravelspages.Stage4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LandingPage4 {

	WebDriver driver;
	
//	@FindBy(css=".col > div:nth-child(2)")
//	private WebElement sales;
//	
//	public void dispSales() {
//		 //check if element visible
//	      boolean t = driver.findElement(By.cssSelector(".col > div:nth-child(2)")).isDisplayed();
//	      if (t) {
//	         System.out.println("Element is dispalyed");
//	      } else {
//	         System.out.println("Element is not dispalyed");
//	      }
//
//	}
	@FindBy(css="a.nav-link:nth-child(12)")
	private WebElement tours4;
	@FindBy(css="#toursmodule > nav:nth-child(1) > a:nth-child(1)")
	private WebElement tours
	
}
