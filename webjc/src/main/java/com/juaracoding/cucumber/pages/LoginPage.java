package com.juaracoding.cucumber.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.juaracoding.cucumber.drivers.DriverSingleton;

public class LoginPage {
    private WebDriver driver;

    public LoginPage() {
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//*[@id=\"username\"]")
    WebElement username;

    @FindBy(xpath = "//*[@id=\"password\"]")
    WebElement password;

    @FindBy(xpath = "//*[@id=\"frmlogin\"]/div[3]/button")
    WebElement btnLogin;
    
    @FindBy(xpath = "//*[@id=\"pageWrapper\"]/div[1]/div/div[3]/ul/li[2]/ul/li/a/span")
    WebElement btnLogout;
    
    @FindBy(xpath = "/html/body/div[3]/div/div[6]/button[1]")
    WebElement btnOk;
    
    @FindBy(xpath = "//*[@id=\"pageWrapper\"]/div[1]/div/div[3]/ul/li[2]/div")
    WebElement hold;

    @FindBy(xpath = "//*[@id=\"simple-bar\"]/div[1]/div[2]/div/div/div/li[2]/a/span")
    WebElement txtDashboard;
    
    @FindBy(xpath  = "//p[@class='alert alert-warning']")
    WebElement txtErrorMessage;

    @FindBy(xpath = "//*[@id=\"swal2-html-container\"]")
    WebElement txtErrorLogin;
    
    public void login(String username, String password) throws InterruptedException{
        this.username.sendKeys(username);
        Thread.sleep(1000);
        this.password.sendKeys(password);
    }

    public void clickBtnLogin() throws InterruptedException{
    	Thread.sleep(1000);
        btnLogin.click();
    }
    
    public void clickBtnLogout() throws InterruptedException{
    	Thread.sleep(1000);
        btnLogout.click();
    }
    
    public void clickBtnOk() throws InterruptedException{
    	Thread.sleep(1000);
        btnOk.click();
    }
    
    public void hold() throws InterruptedException{
    	Thread.sleep(1000);
        Actions actions = new Actions(driver); 
        actions.moveToElement(hold).perform(); 
    }
    
    public String getTxtDashboard() {
    	return txtDashboard.getText();
    }
    
    public String getTxtErrorMessage() {
    	return txtErrorMessage.getText();
    }

      public String getTxtErrorLogin() {
    	return txtErrorLogin.getText();
    }

    

}
