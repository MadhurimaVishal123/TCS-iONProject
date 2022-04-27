package com.phptravelspages.Stage2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage2 {

	 WebDriver driver;
	 @FindBy(xpath="/html/body/div[2]/main/section[1]/div/div/div[3]/div/div/div[2]/div/div/div[1]/div/a/small")
	    private WebElement stage2login;
	    public void setlogin2() {
	    stage2login.click();
	    }
	    
	    @FindBy(css="input[placeholder='Email']")
	    private WebElement username;
	    @FindBy(css="input[placeholder='Password']")
	    private WebElement password;    
	    @FindBy(css=".btn-lg")
	    private WebElement login;
	    
	    public LoginPage2(WebDriver driver){
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

	public void clickLogin() {
		// TODO Auto-generated method stub
		login.click();
	}
}
