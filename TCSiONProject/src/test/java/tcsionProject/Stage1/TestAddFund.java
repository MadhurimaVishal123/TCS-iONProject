package tcsionProject.Stage1;

import org.testng.annotations.Test;

import com.phptravels.testbase.TestBase;
import com.phptravelspages.Stage1.AddFundPage;

public class TestAddFund extends TestBase {

	AddFundPage objadd;
	@Test(priority=6)
	public void addfund() {
		
		objadd = new AddFundPage(driver);
		objadd.setaddFundBtn();
		objadd.radioBtn();
		objadd.payNowBtn();
	}
	@Test(priority=7)
	public void myprofile() throws InterruptedException {
		objadd = new AddFundPage(driver);
		objadd.myProfileBtn();
		objadd.addressField();
		objadd.updateProfile();
	}
	@Test(priority=8)
	public void Log() {
		objadd = new AddFundPage(driver);
		objadd.setLogout();
		
	}
}
