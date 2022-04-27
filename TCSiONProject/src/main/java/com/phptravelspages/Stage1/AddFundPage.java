package com.phptravelspages.Stage1;

import java.util.ArrayList;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddFundPage {

	WebDriver driver;

	@FindBy(css = "#fadein > div.sidebar-nav > div > div.sidebar-menu-wrap > ul > li.user_wallet > a")
	WebElement addfundsbtn;
	@FindBy(id = "gateway_paypal")
	WebElement radiobtn;
	@FindBy(css = "#fadein > section.dashboard-area > div > div.dashboard-main-content > div > div.row > div > div > div.form-content > form > div > div.col-md-3.contact-form-action > div > button")
	WebElement paynowbtn;
	@FindBy(css="#fadein > div.sidebar-nav > div > div.sidebar-menu-wrap > ul > li:nth-child(4) > a")
	WebElement myprofilebtn;
	@FindBy(css=".table > tbody:nth-child(1) > tr:nth-child(11) > td:nth-child(3) > div:nth-child(1) > input:nth-child(2)")
	WebElement addressfield;
	@FindBy(css="button.theme-btn:nth-child(1)")
	WebElement updateprofile;
	@FindBy(css="#fadein > div.sidebar-nav > div > div.sidebar-menu-wrap > ul > li:nth-child(5) > a")
	WebElement logout;

	public AddFundPage(WebDriver driver) {
		this.driver= driver;
		PageFactory.initElements(driver, this);
	}

	public void setaddFundBtn() {
	 ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
		 driver.switchTo().window(tabs2.get(0));
		addfundsbtn.click();
	}

	public void radioBtn() {
		radiobtn.click();
	}

	public void payNowBtn() {
		paynowbtn.click();
		driver.navigate().back();
	}
	
	
	public void myProfileBtn() {
		myprofilebtn.click();
	}
	
	public void addressField() throws InterruptedException {
		JavascriptExecutor js2 = (JavascriptExecutor) driver;
		js2.executeScript("window.scrollBy(0,500)", "");
		Thread.sleep(2000);
		addressfield.clear();
		addressfield.sendKeys("Indiranagar Banglore South");
	}
	public void updateProfile() throws InterruptedException {
		JavascriptExecutor js2 = (JavascriptExecutor) driver;
		js2.executeScript("window.scrollBy(0,500)", "");
		Thread.sleep(3000);
    	updateprofile.click();
	}
	public void setLogout() {
		logout.click();
	}
	

}
