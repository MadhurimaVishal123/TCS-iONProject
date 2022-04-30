package com.phptravelspages.Stage2;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddFundPage2 {
	WebDriver driver;
	
	public AddFundPage2(WebDriver driver) {
		this.driver= driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(css=".sidebar-menu > li:nth-child(2) > a:nth-child(1)")
	private WebElement mybooking2;
	public void clickBooking2() {
		mybooking2.click();
	}
	@FindBy(css="li.user_wallet > a:nth-child(1)")
	private WebElement addfund2;
	public void clickAddFund2() {
		addfund2.click();
	}
//	@FindBy(id="gateway_paypal")
//	private WebElement paypal2;
//	public void clickPayPal2() {
//		paypal2.click();
	

//	@FindBy(css="button.btn:nth-child(3)")
//	private WebElement paynow2;
//	public void clickPaynow2() throws InterruptedException {
//		paynow2.click();
//		Thread.sleep(3000);
//		driver.navigate().back();
//	}
	@FindBy(css=".sidebar-menu > li:nth-child(4) > a:nth-child(1)")
	private WebElement myprofile2;
	public void clickProfile2() {
		myprofile2.click();
	}
	@FindBy(css=".table > tbody:nth-child(1) > tr:nth-child(1) > td:nth-child(3) > div:nth-child(1) > input:nth-child(2)")
	private WebElement firstname2;
	public void clickfirstname2() {
		firstname2.clear();
		firstname2.sendKeys("Thanvi");
	}
	@FindBy(css=".table > tbody:nth-child(1) > tr:nth-child(2) > td:nth-child(3) > div:nth-child(1) > input:nth-child(2)")
	private WebElement lastname2;
	public void clicklastname2() {
		lastname2.clear();
		lastname2.sendKeys("Ram");
	}
	@FindBy(css=".table > tbody:nth-child(1) > tr:nth-child(3) > td:nth-child(3) > div:nth-child(1) > input:nth-child(2)")
	private WebElement phone2;
	public void clickphone2() {
		phone2.clear();
		phone2.sendKeys("9462769643");
	}
	@FindBy(css="table > tbody:nth-child(1) > tr:nth-child(4) > td:nth-child(3) > div:nth-child(1) > input:nth-child(2)")
	private WebElement mail2;
	public void clickmail2() {
		mail2.clear();
		mail2.sendKeys("thanvi@gmail.com");
	}
	@FindBy(css="button.theme-btn:nth-child(1)")
	private WebElement updateprofile2;
	public void updateProfile2() throws InterruptedException {
		JavascriptExecutor js2 = (JavascriptExecutor) driver;
		js2.executeScript("window.scrollBy(0,500)", "");
		Thread.sleep(3000);
    	updateprofile2.click();
	}
	@FindBy(css=".sidebar-menu > li:nth-child(5) > a:nth-child(1)")
	private WebElement logout2;
	public void clicklogout2() {
		logout2.click();
	}
	
	
	
}
