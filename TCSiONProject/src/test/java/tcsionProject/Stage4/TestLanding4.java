package tcsionProject.Stage4;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.phptravels.testbase.TestBase;
import com.phptravelspages.Stage4.LandingPage4;

public class TestLanding4 extends TestBase{
	
	LandingPage4 land4;

	@Test(priority=5)
	public void VerifyDash() throws InterruptedException {
		land4 = new LandingPage4(driver);
		land4.ClickDash();
		Thread.sleep(4000);
		String actualText = land4.checkSalesOverviewText();
		String expectedText = "Sales overview & summary";
		System.out.println("***************" +actualText);
	    Assert.assertEquals(actualText, expectedText);
	    String actualText1 = land4.viewreveniew();
	    String expectedText1 = "Revenue Breakdown 2022";
	    System.out.println("***************" +actualText1);
	    Assert.assertEquals(actualText1, expectedText1);
	}
	@Test(priority=6)
	public void Verifytour4() throws InterruptedException {
		land4 = new LandingPage4(driver);
		land4.clickTours4();
		Thread.sleep(4000);
		land4.clickToursecond();
		Thread.sleep(4000);
		land4.clickManage();
		String ActualTittle = driver.getTitle();
	    System.out.println(ActualTittle);
	    String expTittle = "Tours Management";
	    Assert.assertEquals(ActualTittle, expTittle);
	}
	@Test(priority=7)
	public void Verifybooking4() throws InterruptedException {
		land4 = new LandingPage4(driver);
		Thread.sleep(2000);
		land4.clickBooking4();
		String ActualTittle = driver.getTitle();
	    System.out.println(ActualTittle);
	    String expTittle = "SUPPLIER_BOOKINGS_TITLE";
	    Assert.assertEquals(ActualTittle, expTittle);
		
	}
	
}
