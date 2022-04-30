package com.phptravelspages.Stage4;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LandingPage4 {

	WebDriver driver;

	public LandingPage4(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(css = "a.loadeffect:nth-child(6)")
	private WebElement dashboard4;

	public void ClickDash() {
		dashboard4.click();
	}

	@FindBy(css = ".col > div:nth-child(2)")
	private WebElement salesover;

	public String checkSalesOverviewText() {
		return salesover.getText();

	}

	@FindBy(css = ".col-lg-8 > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > h2:nth-child(1)")
	private WebElement reveniew;

	public String viewreveniew() {
		return reveniew.getText();
	}
	@FindBy(css="a.nav-link:nth-child(12)")
	private WebElement tours4;
	public void clickTours4() {
		tours4.click();
	}
	@FindBy(css="#toursmodule > nav:nth-child(1) > a:nth-child(1)")
	private WebElement toursecond;
	public void clickToursecond() {
		toursecond.click();
	}
	@FindBy(css="#Tours > nav:nth-child(1) > a:nth-child(1)")
	private WebElement managetour;
	public void clickManage() {
		managetour.click();
	}
	@FindBy(css="a.loadeffect:nth-child(15)")
	private WebElement booking4;
	public void clickBooking4() {
		booking4.click();
	}
		
	
	
}