package com.phptravelspages.Stage1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	/**
     * All WebElements are identified by @FindBy annotation
     */
    WebDriver driver;
    @FindBy(xpath="//*[@id=\"Main\"]/section[1]/div/div/div[2]/div/div/div[2]/div/div/div[1]/div/a/small")
    private WebElement stage1login;
    public void setlogin1() {
    	stage1login.click();
    }
    
    @FindBy(css="input[placeholder='Email']")
    private WebElement username;
    @FindBy(css="input[placeholder='Password']")
    private WebElement password;    
    @FindBy(css=".btn-lg")
    private WebElement login;
    
    public LoginPage(WebDriver driver){
        this.driver = driver;
        //This initElements method will create all WebElements
        PageFactory.initElements(driver, this);
    }
 
//Set user name in textbox
 public void setUserName(String strUserName){
 	username.sendKeys(strUserName);     
 }

//Set password in password textbox
 public void setPassword(String strPassword){
    password.sendKeys(strPassword);
 }

public MyBookingsPage clickLogin() {
	// TODO Auto-generated method stub
	login.click();
	return new MyBookingsPage(driver);
}


}
