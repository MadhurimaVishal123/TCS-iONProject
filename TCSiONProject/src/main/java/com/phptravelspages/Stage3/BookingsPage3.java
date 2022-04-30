package com.phptravelspages.Stage3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookingsPage3 {
WebDriver driver;
	
	public BookingsPage3(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(css="li.nav-item:nth-child(2) > a:nth-child(1)")
	private WebElement bookingsBtn;
	public void setBookingsBtn() {
		bookingsBtn.click();
	}
	
	@FindBy(xpath="/html/body/div[2]/div[2]/main/div/div[1]/div[4]/a/div/div/div/div[1]/div[1]")
	private WebElement PaidBook;
	public String setPaidBookCount() {
		return PaidBook.getText();
	}
	public void setPaidBook() {
		PaidBook.click();
	}
	
	@FindBy(xpath="/html/body/div[2]/div[2]/main/div/div[1]/div[3]/a/div/div/div/div[1]/div[1]")
	private WebElement CancelledBook;
	public String setCancelledBookCount() {
		return CancelledBook.getText();
	}
	public void setCancelledBook() {
		CancelledBook.click();
	}
	
	@FindBy(xpath="/html/body/div[2]/div[2]/main/div/div[1]/div[2]/a/div/div/div/div[1]/div[1]")
	private WebElement pendingBookCount;
	public String setPendingBookCount() {
		return pendingBookCount.getText();
	}
	public void setPendingBook() {
		pendingBookCount.click();
	}
	
	@FindBy(xpath="/html/body/div[2]/div[2]/main/div/div[1]/div[1]/a/div/div/div/div[1]/div[1]")
	private WebElement ConfirmedBook;
	public String setConfirmBookCount() {
		return ConfirmedBook.getText();
	}
	public void setConfirmBook() {
		ConfirmedBook.click();
	}
	@FindBy(css="body > nav > div > div > ul > li:nth-child(1) > a")
	private WebElement web;
	public void clickWeb() {
		web.click();
	}
//	@FindBy(css=".border-warning > div:nth-child(1) > div:nth-child(1)")
//	private WebElement pend3;
//	public void clickpend3() {
//		pend3.click();
//	}
//	@FindBy(id="booking_status")
//	private WebElement bookstatus3;
//	public void clickbookstatus3() {
//		bookstatus3.click();
//		bookstatus3.selectByVisibleText
//	}
}
