package com.phptravelspages.Stage3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage3 {
	
	/**
     * All WebElements are identified by @FindBy annotation
     */
    WebDriver driver;
    
    
    @FindBy(xpath="/html/body/div[2]/main/section[1]/div/div/div[4]/div/div/div[2]/div/div/div[1]/div/a/small")
    private WebElement stage3login;
    public void setlogin3() {
    stage3login.click();
    }
    
    @FindBy(css=".form-signin > div:nth-child(1) > label:nth-child(1) > input:nth-child(1)")
    private WebElement username3;
    @FindBy(css="div.mb-2:nth-child(2) > label:nth-child(1) > input:nth-child(1)")
    private WebElement password3;    
    @FindBy(css=".btn-block > span:nth-child(1)")
    private WebElement login3;
    
    public LoginPage3(WebDriver driver){
        this.driver = driver;
        //This initElements method will create all WebElements
        PageFactory.initElements(driver, this);
    }
 
//Set user name in textbox
 public void setUserName(String strUserName){
 	username3.sendKeys(strUserName);     
 }

//Set password in password textbox
 public void setPassword(String strPassword){
    password3.sendKeys(strPassword);
 }

public void clickLogin() {
	// TODO Auto-generated method stub
	login3.click();
	//return new MyBookingsPage(driver);
}

}
