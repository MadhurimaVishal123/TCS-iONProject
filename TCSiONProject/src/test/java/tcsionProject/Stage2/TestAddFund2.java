package tcsionProject.Stage2;

import org.testng.annotations.Test;

import com.phptravels.testbase.TestBase;
import com.phptravelspages.Stage2.AddFundPage2;

public class TestAddFund2 extends TestBase {

	AddFundPage2 objadd2;
	@Test(priority=5)
	public void verifymybooking() {
		objadd2 = new AddFundPage2(driver);
		objadd2.clickBooking2();
	}
	@Test(priority=6)
public void addfund2() throws InterruptedException {
	
		objadd2 = new AddFundPage2(driver);
		objadd2.clickAddFund2();

}
	@Test(priority=7)
public void verifyprofile2() throws InterruptedException {
	objadd2 = new AddFundPage2(driver);
	objadd2.clickProfile2();
	objadd2.clickfirstname2();
	Thread.sleep(2000);
	objadd2.clicklastname2();
	Thread.sleep(2000);
	objadd2.clickphone2();
	Thread.sleep(2000);
	objadd2.clickmail2();
	Thread.sleep(2000);
	objadd2.updateProfile2();
}
	@Test(priority=8)
public void verifylogout2() {
	objadd2 = new AddFundPage2(driver);
	objadd2.clicklogout2();
}
}