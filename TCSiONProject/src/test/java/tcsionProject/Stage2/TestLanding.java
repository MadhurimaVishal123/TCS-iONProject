package tcsionProject.Stage2;

import org.testng.annotations.Test;

import com.phptravels.testbase.TestBase;
import com.phptravelspages.Stage2.LandingPage;

public class TestLanding extends TestBase {
	
	LandingPage objlandg;
	@Test(priority=5)
	public void verifyhome() {
		objlandg= new LandingPage(driver);
		objlandg.clickHome();
//		String expectedTitle =AutomationConstants.HOME_PAGE_TITLE;
//	    String actualTitle = driver.getTitle();
//	    Assert.assertEquals(expectedTitle,actualTitle);
	}
	@Test(priority=6)
	public void verifyhotels() {
		objlandg= new LandingPage(driver);
		objlandg.clickHotels();
	}
	@Test(priority=7)
	public void verifyflights() {
		objlandg= new LandingPage(driver);
		objlandg.clickFlights();
	}
	@Test(priority=8)
	public void verifytours() {
		objlandg= new LandingPage(driver);
		objlandg.clickTours();
	}
	@Test(priority=9)
	public void verifyvisa() {
		objlandg= new LandingPage(driver);
		objlandg.clickVisa();
	}
	@Test(priority=10)
	public void verifyblog() {
		objlandg= new LandingPage(driver);
		objlandg.clickBlog();
	}
	@Test(priority=11)
	public void verifyoffers() {
		objlandg= new LandingPage(driver);
		objlandg.clickOffers();
	}
	@Test(priority=12)
	public void verifycompany() {
		objlandg= new LandingPage(driver);
		objlandg.clickCompany();
	}
	@Test(priority=13)
	public void verifyusd() {
		objlandg= new LandingPage(driver);
		objlandg.clickUsd();
		objlandg.clickinr();

		//Selecting Items in a Multiple SELECT elements
				//Select currency1 = new Select(driver.findElement(By.id("currency")));
		//currency1.selectByVisibleText("INR");
		//currency1.selectByIndex(6);
	}
	@Test(priority=14)
	public void verifysearch() throws InterruptedException {
		objlandg= new LandingPage(driver);
         objlandg.searchHotels();
	}

}
