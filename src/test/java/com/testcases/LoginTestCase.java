package com.testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.pages.LoginPage;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTestCase extends BaseClass{	
	
	@Test
	public void test1() {
		
		LoginPage login = new LoginPage(driver);
		login.LoginFunction("abc@xyz.com","Abc@1234");
		
		WebElement error = driver.findElement(By.id("msg_box"));
		
		String ActError = error.getText();
		String ExpError = "The email or password you have entered is invalid.";
		
		Assert.assertEquals(ActError, ExpError);
		
	}
	
	@Test
	public void test2() {
		
		LoginPage login = new LoginPage(driver);
		login.LoginFunction("pqr@xyz.com","Abc@1234");
		
	}

	
	

}

	


