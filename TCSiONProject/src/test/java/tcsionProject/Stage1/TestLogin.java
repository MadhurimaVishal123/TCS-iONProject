package tcsionProject.Stage1;

import java.io.IOException;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.phptravels.testbase.TestBase;
import com.phptravels.utilities.ExcelUtility1;
import com.phptravelspages.Stage1.LoginPage;

public class TestLogin extends TestBase {
	
	LoginPage objlogin;
	
//	private String getLoginUrl() {
//		return prop.getProperty("Stage1_url");
//	}
	@Test(priority=0)
	public void logindemo1() throws InterruptedException {
		 objlogin = new LoginPage(driver);
		 objlogin.setlogin1();
		 ArrayList<String> tabs = new ArrayList<String> (driver.getWindowHandles());
		 driver.close();
		 driver.switchTo().window(tabs.get(1));
		 Thread.sleep(3000);
		 driver.findElement(By.id("cookie_stop")).click();
	}
	
	
	@Test(priority=1)
	public void invalidLoginTC001() throws IOException, InterruptedException {
		 //Create Login Page object
	    objlogin = new LoginPage(driver);
	    //driver.get(getLoginUrl());
	    //login to application
	    String usrname= ExcelUtility1.getSatge1CellData(1, 1);
	    String psswrd=ExcelUtility1.getSatge1CellData(1, 2);
	    objlogin.setUserName(usrname);
	    objlogin.setPassword(psswrd);
	 //   Thread.sleep(3000);
	    objlogin.clickLogin();
	    Thread.sleep(3000);
	    String ActualTittle = driver.getTitle();
	    System.out.println(ActualTittle);
	    String expTittle = "Login - PHPTRAVELS";
	    Assert.assertEquals(ActualTittle, expTittle);
	   
	}

	@Test(priority=2)
	public void invalidLoginTC002() throws IOException, InterruptedException {
		 //Create Login Page object
	    objlogin = new LoginPage(driver);
	   driver.navigate().refresh();
	    //driver.get(getLoginUrl());
	    //login to application
	    String usrname= ExcelUtility1.getSatge1CellData(2, 1);
	    String psswrd=ExcelUtility1.getSatge1CellData(2, 2);
	    objlogin.setUserName(usrname);
	    objlogin.setPassword(psswrd);
	   // Thread.sleep(3000);
	    objlogin.clickLogin();
	    Thread.sleep(3000);
	    String ActualTittle = driver.getTitle();
	    System.out.println(ActualTittle);
	    String expTittle = "Login - PHPTRAVELS";
	    Assert.assertEquals(ActualTittle, expTittle);
	}
	
	@Test(priority=3)
	public void invalidLoginTC003() throws IOException, InterruptedException {
		 //Create Login Page object
	    objlogin = new LoginPage(driver);
	   driver.navigate().refresh();
	    //driver.get(getLoginUrl());
	    //login to application
	    String usrname= ExcelUtility1.getSatge1CellData(3, 1);
	    String psswrd=ExcelUtility1.getSatge1CellData(3, 2);
	    objlogin.setUserName(usrname);
	    objlogin.setPassword(psswrd);
	   // Thread.sleep(3000);
	    objlogin.clickLogin();
	    Thread.sleep(3000);
	    String ActualTittle = driver.getTitle();
	    System.out.println(ActualTittle);
	    String expTittle = "Login - PHPTRAVELS";
	    Assert.assertEquals(ActualTittle, expTittle);
	}
	
	@Test(priority=4)
	public void validLoginTC004() throws IOException, InterruptedException {
		 //Create Login Page object
	    objlogin = new LoginPage(driver);
	   driver.navigate().refresh();
	   // driver.get(getLoginUrl());
	    //login to application
	    String usrname= ExcelUtility1.getSatge1CellData(4, 1);
	    String psswrd=ExcelUtility1.getSatge1CellData(4, 2);
	    objlogin.setUserName(usrname);
	    objlogin.setPassword(psswrd);
	  //  Thread.sleep(3000);
	    objlogin.clickLogin();
	    Thread.sleep(3000);
	    String ActualTittle = driver.getTitle();
	    System.out.println(ActualTittle);
	    String expTittle = "Dashboard - PHPTRAVELS";
	    Assert.assertEquals(ActualTittle, expTittle);
	    System.out.println("***Login Successful***");
	}
}
