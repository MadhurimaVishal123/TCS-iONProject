package tcsionProject.Stage3;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.phptravels.testbase.TestBase;
import com.phptravelspages.Stage3.BookingsPage3;

public class TestBookings3 extends TestBase {
BookingsPage3 objbook;
	
	@Test(priority = 5)
	public void BookingsBtn() throws InterruptedException {
		objbook= new BookingsPage3(driver);
		objbook.setBookingsBtn();
		Thread.sleep(3000);
	}
	@Test(priority = 6)
	public void BookVerificationTC006() throws InterruptedException {
		objbook= new BookingsPage3(driver);
		String PaidBC=objbook.setPaidBookCount();
		String zero="0";
		
		if(PaidBC.contains(zero)) {
			System.out.println("***No Paid Bookings Found***");
		}
		else {	
			objbook.setPaidBook();
			Thread.sleep(3000);
			System.out.println("Paid Bookings Count: "+PaidBC);
			driver.findElement(By.xpath("/html/body/div[2]/div[2]/main/div/div[2]"
					+ "/div/div/div[2]/div/table/tbody/tr[1]/td[14]/a")).click();}
		}
	@Test(priority = 7)
	public void BookVerificationTC007() throws InterruptedException {
		String CancelBC=objbook.setCancelledBookCount();
		String zero="0";
		
		if(CancelBC.contains(zero)) {
			System.out.println("***No Cancelled Bookings Found***");
		}
		else {	
			objbook.setCancelledBook();
			System.out.println("Cancelled Bookings Count: "+CancelBC);
			driver.findElement(By.xpath("/html/body/div[2]/div[2]/main/div/div[2]"
					+ "/div/div/div[2]/div/table/tbody/tr/td[14]/button")).click();
		Thread.sleep(2000);
		// not deleting the booking, because other users need it
		driver.switchTo().alert().dismiss();
		}
	}
	@Test(priority = 8)
	public void BookVerificationTC008() throws InterruptedException {	
		String PendingBC=objbook.setPendingBookCount();
		String zero="0";
		
		if(PendingBC.contains(zero)) {
			System.out.println("***No Pending Bookings Found***");
		}
		else {	
			objbook.setPendingBook();
			System.out.println("Pending Bookings Count: "+PendingBC);
			Thread.sleep(3000);
			Select bookstat=new Select(driver.findElement(By.xpath("/html/body/div[2]/div[2]/main/div/div[2]"
					+ "/div/div/div[2]/div/table/tbody/tr[1]/td[11]/select")));
			bookstat.selectByVisibleText("Confirmed");
			
			String ConfirnBC=objbook.setConfirmBookCount();
			System.out.println("Confirmed Bookings Count: "+ConfirnBC);
		}
	}
	@Test(priority = 9,enabled=false)
	public void RevertChanges() {
		objbook= new BookingsPage3(driver);
		
	}
	@Test(priority=9)
	public void VerifyWeb() {
		objbook= new BookingsPage3(driver);
		objbook.clickWeb();
		
	}
}
