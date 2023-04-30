package com.testcases;

import java.lang.reflect.Method;

import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.codoid.products.exception.FilloException;
import com.codoid.products.fillo.Recordset;
import com.pages.LoginPage;

public class LoginTestCase extends BaseClass {

	@Test(priority = 1)
	public void test1() {

		LoginPage login = new LoginPage(driver);
		login.LoginFunction("abc@xyz.com", "Abc@1234");

		WebElement error = driver.findElement(By.id("msg_box"));

		String ActError = error.getText();
		String ExpError = "The email or password you have entered is invalid.";

		Assert.assertEquals(ActError, ExpError);

	}

	@Test(priority = 2)
	public void test2() {

		LoginPage login = new LoginPage(driver);
		login.LoginFunction("pqr@xyz.com", "Abc@1234");

	}

	
	//Method name test4 should be same as test4 in excel data
	@Test(priority = 3)
	public void test4(Method method) throws FilloException {

		LoginPage login = new LoginPage(driver);
		//Recordset recordset = connection.executeQuery("select * from data where TestName='test4'");
		Recordset recordset = connection.executeQuery("select * from data where TestName='"+method.getName()+"'");
		
		recordset.next();
		
		String UserName = recordset.getField("UserName");
		String Password = recordset.getField("Password");

		login.LoginFunction(UserName, Password);

	}
	
	

}
