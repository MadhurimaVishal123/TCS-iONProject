package com.phptravelspages.Stage4;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage4 {
	
	/**
     * All WebElements are identified by @FindBy annotation
     */
    WebDriver driver;
    
    @FindBy(xpath="/html/body/div[2]/main/section[1]/div/div/div[5]/div/div/div[2]/div/div/div[1]/div/a/small")
    private WebElement stage4login;
    public void setlogin4() {
    	stage4login.click();
    }
    
    @FindBy(css=".form-signin > div:nth-child(1) > label:nth-child(1) > input:nth-child(1)")
    private WebElement username4;
    @FindBy(css="div.mb-2:nth-child(2) > label:nth-child(1) > input:nth-child(1)")
    private WebElement password4;    
    @FindBy(css=".btn-block")
    private WebElement login4;
    
    public LoginPage4(WebDriver driver){
        this.driver = driver;
        //This initElements method will create all WebElements
        PageFactory.initElements(driver, this);
    }
 
//Set user name in textbox
 public void setUserName(String strUserName){
 	username4.sendKeys(strUserName);     
 }

//Set password in password textbox
 public void setPassword(String strPassword){
    password4.sendKeys(strPassword);
 }

public void clickLogin() {
	// TODO Auto-generated method stub
	login4.click();
	//return new MyBookingsPage(driver);
}

}
