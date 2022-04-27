package tcsionProject.Stage4;

import java.io.IOException;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.phptravels.testbase.TestBase;
import com.phptravels.utilities.ExcelUtility4;
import com.phptravelspages.Stage4.LoginPage4;

public class TestLogin4 extends TestBase {
	
	LoginPage4 objlogin4;
	
	@Test(priority=0)
	public void logindemo4() throws InterruptedException {
		 objlogin4 = new LoginPage4(driver);
		 objlogin4.setlogin4();
		 ArrayList<String> tabs = new ArrayList<String> (driver.getWindowHandles());
		 driver.close();
		 driver.switchTo().window(tabs.get(1));
		 Thread.sleep(3000);
		 //driver.findElement(By.id("cookie_stop")).click();
	}
	
	@Test(priority=1)
	public void invalidLoginTC001() throws IOException, InterruptedException {
		 //Create Login Page object
	    objlogin4 = new LoginPage4(driver);
	    driver.navigate().refresh();
	    //driver.findElement(By.id("cookie_stop")).click();
	    //driver.get(getLoginUrl());
	    //login to application
	    String usrname= ExcelUtility4.getSatge4CellData(1, 1);
	    String psswrd=ExcelUtility4.getSatge4CellData(1, 2);
	    objlogin4.setUserName(usrname);
	    objlogin4.setPassword(psswrd);
	 //   Thread.sleep(3000);
	    objlogin4.clickLogin();
	    Thread.sleep(3000);
	    String ActualTittle = driver.getTitle();
	    System.out.println(ActualTittle);
	    String expTittle = "Supplier Login";
	    Assert.assertEquals(ActualTittle, expTittle);
	   
	}

	@Test(priority=2)
	public void invalidLoginTC002() throws IOException, InterruptedException {
		 //Create Login Page object
	    objlogin4 = new LoginPage4(driver);
	   driver.navigate().refresh();
	    //driver.get(getLoginUrl());
	    //login to application
	    String usrname= ExcelUtility4.getSatge4CellData(2, 1);
	    String psswrd=ExcelUtility4.getSatge4CellData(2, 2);
	    objlogin4.setUserName(usrname);
	    objlogin4.setPassword(psswrd);
	   // Thread.sleep(3000);
	    objlogin4.clickLogin();
	    Thread.sleep(3000);
	    String ActualTittle = driver.getTitle();
	    System.out.println(ActualTittle);
	    String expTittle = "Supplier Login";
	    Assert.assertEquals(ActualTittle, expTittle);
	}
	
	@Test(priority=3)
	public void invalidLoginTC003() throws IOException, InterruptedException {
		 //Create Login Page object
	    objlogin4 = new LoginPage4(driver);
	   driver.navigate().refresh();
	   // driver.get(getLoginUrl());
	    //login to application
	    String usrname= ExcelUtility4.getSatge4CellData(3, 1);
	    String psswrd=ExcelUtility4.getSatge4CellData(3, 2);
	    objlogin4.setUserName(usrname);
	    objlogin4.setPassword(psswrd);
	   // Thread.sleep(3000);
	    objlogin4.clickLogin();
	    Thread.sleep(3000);
	    String ActualTittle = driver.getTitle();
	    System.out.println(ActualTittle);
	    String expTittle = "Supplier Login";
	    Assert.assertEquals(ActualTittle, expTittle);
	}
	
	@Test(priority=4)
	public void validLoginTC004() throws IOException, InterruptedException {
		 //Create Login Page object
	    objlogin4 = new LoginPage4(driver);
	   driver.navigate().refresh();
	    //driver.get(getLoginUrl());
	    //login to application
	    String usrname= ExcelUtility4.getSatge4CellData(4, 1);
	    String psswrd=ExcelUtility4.getSatge4CellData(4, 2);
	    objlogin4.setUserName(usrname);
	    objlogin4.setPassword(psswrd);
	  //  Thread.sleep(3000);
	    objlogin4.clickLogin();
	    Thread.sleep(3000);
	    String ActualTittle = driver.getTitle();
	    System.out.println(ActualTittle);
	    String expTittle = "Dashboard";
	    Assert.assertEquals(ActualTittle, expTittle);
	    System.out.println("***Login Successful***");
	}
}
