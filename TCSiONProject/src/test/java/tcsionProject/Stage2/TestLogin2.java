package tcsionProject.Stage2;

import java.io.IOException;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.phptravels.testbase.TestBase;
import com.phptravels.utilities.ExcelUtility2;
import com.phptravelspages.Stage2.LoginPage2;

public class TestLogin2 extends TestBase {


	LoginPage2 objlogin2;
//	
//	private String getLoginUrl() {
//		return prop.getProperty("Stage2_url");
//	}
	@Test(priority=0)
	public void logindemo2() throws InterruptedException {
		 objlogin2 = new LoginPage2(driver);
		 objlogin2.setlogin2();
		 ArrayList<String> tabs = new ArrayList<String> (driver.getWindowHandles());
		 driver.close();
		 driver.switchTo().window(tabs.get(1));
	     Thread.sleep(3000);
		 driver.findElement(By.id("cookie_stop")).click();
	}
	
	
	@Test(priority=1)
	public void invalidLoginTC001() throws IOException, InterruptedException {
		 //Create Login Page object
	    objlogin2 = new LoginPage2(driver);
	    driver.navigate().refresh();
	    //driver.findElement(By.id("cookie_stop")).click();
	   //driver.get(getLoginUrl());
	    //login to application
	    String usrname= ExcelUtility2.getSatge2CellData(1, 1);
	    String psswrd=ExcelUtility2.getSatge2CellData(1, 2);
	    objlogin2.setUserName(usrname);
	    objlogin2.setPassword(psswrd);
	 //   Thread.sleep(3000);
	    objlogin2.clickLogin();
	    Thread.sleep(3000);
	    String ActualTittle = driver.getTitle();
	    System.out.println(ActualTittle);
	    String expTittle = "Login - PHPTRAVELS";
	    Assert.assertEquals(ActualTittle, expTittle);
	   
	}

	@Test(priority=2)
	public void invalidLoginTC002() throws IOException, InterruptedException {
		 //Create Login Page object
	    objlogin2 = new LoginPage2(driver);
	   driver.navigate().refresh();
	    //driver.get(getLoginUrl());
	    //login to application
	    String usrname= ExcelUtility2.getSatge2CellData(2, 1);
	    String psswrd=ExcelUtility2.getSatge2CellData(2, 2);
	    objlogin2.setUserName(usrname);
	    objlogin2.setPassword(psswrd);
	   // Thread.sleep(3000);
	    objlogin2.clickLogin();
	    Thread.sleep(3000);
	    String ActualTittle = driver.getTitle();
	    System.out.println(ActualTittle);
	    String expTittle = "Login - PHPTRAVELS";
	    Assert.assertEquals(ActualTittle, expTittle);
	}
	
	@Test(priority=3)
	public void invalidLoginTC003() throws IOException, InterruptedException {
		 //Create Login Page object
	    objlogin2 = new LoginPage2(driver);
	   driver.navigate().refresh();
	  // driver.findElement(By.id("cookie_stop")).click();
	    //driver.get(getLoginUrl());
	    //login to application
	    String usrname= ExcelUtility2.getSatge2CellData(3, 1);
	    String psswrd=ExcelUtility2.getSatge2CellData(3, 2);
	    objlogin2.setUserName(usrname);
	    objlogin2.setPassword(psswrd);
	   // Thread.sleep(3000);
	    objlogin2.clickLogin();
	    Thread.sleep(3000);
	    String ActualTittle = driver.getTitle();
	    System.out.println(ActualTittle);
	    String expTittle = "Login - PHPTRAVELS";
	    Assert.assertEquals(ActualTittle, expTittle);
	}
	
	@Test(priority=4)
	public void validLoginTC004() throws IOException, InterruptedException {
		 //Create Login Page object
	    objlogin2 = new LoginPage2(driver);
	   driver.navigate().refresh();
	   //driver.findElement(By.id("cookie_stop")).click();
	   //driver.get(getLoginUrl());
	    //login to application
	    String usrname= ExcelUtility2.getSatge2CellData(4, 1);
	    String psswrd=ExcelUtility2.getSatge2CellData(4, 2);
	    objlogin2.setUserName(usrname);
	    objlogin2.setPassword(psswrd);
	  //  Thread.sleep(3000);
	    objlogin2.clickLogin();
	    Thread.sleep(3000);
	    String ActualTittle = driver.getTitle();
	    System.out.println(ActualTittle);
	    String expTittle = "Dashboard - PHPTRAVELS";
	    Assert.assertEquals(ActualTittle, expTittle);
	    System.out.println("***Login Successful***");
	}
}
