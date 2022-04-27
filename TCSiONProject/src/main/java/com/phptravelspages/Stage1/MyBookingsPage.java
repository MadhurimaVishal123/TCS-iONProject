package com.phptravelspages.Stage1;

import java.util.ArrayList;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyBookingsPage {

	WebDriver driver;
	
	@FindBy(css="#fadein > div.sidebar-nav > div > div.sidebar-menu-wrap > ul > li:nth-child(2) > a")
	private WebElement bookingsbtn;
	@FindBy(css="#fadein > section.dashboard-area > div > div.dashboard-main-content > div > div.row > div > div > div.form-content > div > table > tbody > tr:nth-child(1) > td:nth-child(5) > div > a")
	private WebElement viewvoucher;
	@FindBy(css="div.col-md-6:nth-child(1) > ul")
	private WebElement VouchrConfirm;
	
	
	public MyBookingsPage(WebDriver driver) {
		 this.driver = driver;
	        //This initElements method will create all WebElements
	        PageFactory.initElements(driver, this);
		
	}
	public void setBookingsBtn() {
		bookingsbtn.click();
	}
	public void setViewVoucherbtn() {
		viewvoucher.click();
	}
//	public void setNewTab() {
//		  // hold all window handles in array list
//	      ArrayList<String> newTb = new ArrayList<String>(driver.getWindowHandles());
//	      //switch to new tab
//	      driver.switchTo().window(newTb.get(1));
//	      System.out.println("Page title of new tab: " + driver.getTitle());
//	      //switch to parent window
//	      driver.switchTo().window(newTb.get(0));
//	}
	public void setVouchrConfirm() {
		 ArrayList<String> tabs = new ArrayList<String> (driver.getWindowHandles());
		 driver.switchTo().window(tabs.get(1));
		 String Customer=VouchrConfirm.getText();
		 System.out.println(Customer);
		 boolean c=Customer.contains("user@phptravels.com");
		 System.out.println(c);
	 }
}
