package com.juaracoding.cucumber.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.juaracoding.cucumber.drivers.DriverSingleton;

public class PaymentPage {
	  private WebDriver driver;

	    public PaymentPage() {
	        this.driver = DriverSingleton.getDriver();
	        PageFactory.initElements(driver, this);
	    }
	    

	    public void SelectJumlahBarang(String index) throws InterruptedException{
	    	Thread.sleep(1000);
	    	 Select menu = new Select(driver.findElement(By.name("quantity")));
		     menu.selectByValue(index);
	    }
	    
	    public void clickBtnBuy() throws InterruptedException{
	    driver.findElement(By.cssSelector("input[type=\"submit\"]")).click();  
	  	  Thread.sleep(2000);
	    }
	    
	    public void input(String kartu, String moon, String year, String cvvCode) throws InterruptedException{
	    	WebElement card = driver.findElement(By.id("card_nmuber"));
			 card.sendKeys(kartu);
			 Thread.sleep(2000);
			 
			Select bulan = new Select(driver.findElement(By.id("month")));
		     bulan.selectByValue(moon);
		     Thread.sleep(2000);
		     
		    Select tahun = new Select(driver.findElement(By.id("year")));
		     tahun.selectByValue(year);
		     Thread.sleep(2000);
		     
		    WebElement cvv = driver.findElement(By.id("cvv_code"));
			 cvv.sendKeys(cvvCode);
			 Thread.sleep(2000);
	    }
	    
	    public void clickBtnBayar() throws InterruptedException{
	    	driver.findElement(By.cssSelector("input[type=\"submit\"]")).click();  
			  Thread.sleep(2000);
			   
	        
	    }
	    
	    public void clickBtnHome() throws InterruptedException{
	    	
			  driver.findElement(By.cssSelector("a[class=\"button special\"]")).click();  
			  Thread.sleep(2000);  
	        
	    }
	    
}
