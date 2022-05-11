package tcsionProject.Stage3;

import java.io.IOException;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.phptravels.constants.AutomationConstants;
import com.phptravels.testbase.TestBase;
import com.phptravels.utilities.ExcelUtility3;
import com.phptravelspages.Stage3.LoginPage3;

public class TestLogin3 extends TestBase {
	
	LoginPage3 objlogin3;
	@Test(priority=0)
	public void logindemo3() throws InterruptedException {
		 objlogin3 = new LoginPage3(driver);
		 objlogin3.setlogin3();
		 ArrayList<String> tabs = new ArrayList<String> (driver.getWindowHandles());
		 driver.close();
		 driver.switchTo().window(tabs.get(1));
		 Thread.sleep(3000);
		 //driver.findElement(By.id("cookie_stop")).click();
	}
	
	@Test(priority=1)
	public void invalidLoginTC001() throws IOException, InterruptedException {
		 //Create Login Page object
	    objlogin3 = new LoginPage3(driver);
	    driver.navigate().refresh();
	   // driver.findElement(By.id("cookie_stop")).click();
	    //driver.get(getLoginUrl());
	    //login to application
	    String usrname= ExcelUtility3.getSatge1CellData(1, 1);
	    String psswrd=ExcelUtility3.getSatge1CellData(1, 2);
	    objlogin3.setUserName(usrname);
	    objlogin3.setPassword(psswrd);
	 //   Thread.sleep(3000);
	    objlogin3.clickLogin();
	    Thread.sleep(3000);
	    String ActualTittle = driver.getTitle();
	    System.out.println(ActualTittle);
	    String expTittle = "Administator Login";
	    Assert.assertEquals(ActualTittle, expTittle);
	   
	}

	@Test(priority=2)
	public void invalidLoginTC002() throws IOException, InterruptedException {
		 //Create Login Page object
	    objlogin3 = new LoginPage3(driver);
	   driver.navigate().refresh();
	    //driver.get(getLoginUrl());
	    //login to application
	    String usrname= ExcelUtility3.getSatge1CellData(2, 1);
	    String psswrd=ExcelUtility3.getSatge1CellData(2, 2);
	    objlogin3.setUserName(usrname);
	    objlogin3.setPassword(psswrd);
	   // Thread.sleep(3000);
	    objlogin3.clickLogin();
	    Thread.sleep(3000);
	    String ActualTittle = driver.getTitle();
	    System.out.println(ActualTittle);
	    String expTittle = "Administator Login";
	    Assert.assertEquals(ActualTittle, expTittle);
	}
	
	@Test(priority=3)
	public void invalidLoginTC003() throws IOException, InterruptedException {
		 //Create Login Page object
	    objlogin3 = new LoginPage3(driver);
	   driver.navigate().refresh();
	   // driver.get(getLoginUrl());
	    //login to application
	    String usrname= ExcelUtility3.getSatge1CellData(3, 1);
	    String psswrd=ExcelUtility3.getSatge1CellData(3, 2);
	    objlogin3.setUserName(usrname);
	    objlogin3.setPassword(psswrd);
	   // Thread.sleep(3000);
	    objlogin3.clickLogin();
	    Thread.sleep(3000);
	    String ActualTittle = driver.getTitle();
	    System.out.println(ActualTittle);
	    String expTittle = "Administator Login";
	    Assert.assertEquals(ActualTittle, expTittle);
	}
	
	@Test(priority=4)
	public void validLoginTC004() throws IOException, InterruptedException {
		 //Create Login Page object
	    objlogin3 = new LoginPage3(driver);
	   driver.navigate().refresh();
	    //driver.get(getLoginUrl());
	    //login to application
	    String usrname= ExcelUtility3.getSatge1CellData(4, 1);
	    String psswrd=ExcelUtility3.getSatge1CellData(4, 2);
	    objlogin3.setUserName(usrname);
	    objlogin3.setPassword(psswrd);
	  //  Thread.sleep(3000);
	    objlogin3.clickLogin();
	    Thread.sleep(8000);
	    String ActualTittle = driver.getTitle();
	    System.out.println(ActualTittle);
	    String expTittle = AutomationConstants.adminDASHBOARDPAGETITLE;
	    Assert.assertEquals(ActualTittle, expTittle);
	    System.out.println("***Login Successful***");
	}
}
