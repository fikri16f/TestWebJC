package com.juaracoding.cucumber.step_definitions;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.juaracoding.cucumber.pages.PaymentPage;
import com.juaracoding.cucumber.utils.Constants;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Payment {
	 private static WebDriver driver;
	    private static ExtentTest extentTest;
	    private PaymentPage paymentPage = new PaymentPage();

	    public Payment() {
	        driver = Hooks.driver;
	        extentTest = Hooks.extentTest;
	    }
	    
	    @When("User go to Web")
	    public void user_go_to_web() {
	    	driver.get(Constants.URL);
	    	extentTest.log(LogStatus.PASS, "User go to Web");
	    }
	    @And("User pilih barang")
	    public void user_pilih_barang() throws InterruptedException {
	        paymentPage.SelectJumlahBarang("2");
	        extentTest.log(LogStatus.PASS, "User pilih barang");
	    }
	    @And("User klik button Buy Now")
	    public void user_klik_button_buy_now() throws InterruptedException {
	        paymentPage.clickBtnBuy();
	        extentTest.log(LogStatus.PASS, "klik button Buy Now");
	    }
	    @And("User Input Kartu Pembayaran")
	    public void user_input_kartu_pembayaran() throws InterruptedException {
	        paymentPage.input("1234567890000000", "10", "2020", "123");
	        extentTest.log(LogStatus.PASS, "User Input Kartu Pembayaran");
	    }
	    @And("user Klik button Pay")
	    public void user_klik_button_pay() throws InterruptedException {
	        paymentPage.clickBtnBayar();
	        extentTest.log(LogStatus.PASS, "user Klik button Pay");
	    }
	    @Then("User berhasil membayar")
	    public void user_berhasil_membayar() throws InterruptedException {
	    	paymentPage.clickBtnHome();;
	        extentTest.log(LogStatus.PASS, "User berhasil membayar");
	    }
}
