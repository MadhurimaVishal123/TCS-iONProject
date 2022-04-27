package tcsionProject.Stage1;

import org.testng.annotations.Test;

import com.phptravels.testbase.TestBase;
import com.phptravelspages.Stage1.MyBookingsPage;

public class TestBookings extends TestBase {

	
	MyBookingsPage objbookings;
	@Test(priority=5)
	public void mybookings() {
		
		objbookings = new MyBookingsPage(driver);
		objbookings.setBookingsBtn();
		objbookings.setViewVoucherbtn();
		objbookings.setVouchrConfirm();
		
	}
}
