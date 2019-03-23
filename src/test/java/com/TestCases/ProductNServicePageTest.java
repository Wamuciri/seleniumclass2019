package com.TestCases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.TestPages.LoginPage;
import com.Testbase.TestBase;

public class ProductNServicePageTest extends TestBase {
	LoginPage loginpage;
    
	public ProductNServicePageTest() {
		
		super();
	}
	 @BeforeMethod
	 
	 public void Setup() {
		 
		 initil();
		 loginpage.VerifyLogin(prop.getProperty("Username"), prop.getProperty("Password"));
	 }
	 @AfterMethod
	 public void TearDown() {
	 driver.quit();
		 
	 }
}
