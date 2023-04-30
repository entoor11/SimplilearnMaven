package com.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.pages.LoginPage;

public class HomePageTest extends BaseClass{
	
//	@Test
//	public void test3() {
//		System.out.print("Test Three");
//	}

	@Test(priority = 2)
	public void test2() {

		LoginPage login = new LoginPage(driver);
		login.LoginFunction("homepage@xyz.com", "Abc@1234");

	}
}
