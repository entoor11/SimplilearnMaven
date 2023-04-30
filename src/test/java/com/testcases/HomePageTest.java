package com.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.pages.LoginPage;

public class HomePageTest extends BaseClass{
	
	@Test
	public void test3() {
		System.out.print("Test Three");
	}

	
	@Test
	public void test1() {

		LoginPage login = new LoginPage(driver);
		login.LoginFunction("abc@xyz.com", "Abc@1234");

		WebElement error = driver.findElement(By.id("msg_box"));

		String ActError = error.getText();
		String ExpError = "The email or password you have entered is invalid.";

		Assert.assertEquals(ActError, ExpError);

	}
}
