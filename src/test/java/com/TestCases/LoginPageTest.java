package com.TestCases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.TestPages.LoginPage;
import com.Testbase.TestBase;


public class LoginPageTest extends TestBase {
	
	
	LoginPage loginpage;
	
	public LoginPageTest() {
		
		super();
	}
 @BeforeMethod
 
 public void Setup() {
	 
	 initil();
	 LoginPage loginpage=new LoginPage();

	 }
 @Test(priority =2)
 public void VerifyLoginPage() {
	loginpage.VerifyLogin(prop.getProperty("username"), prop.getProperty("password"));
	 
 }
 @Test(priority =0)
 public void VerifyLogoofthePage() {
	 boolean Logo=loginpage.VerifyLogo();
	 Assert.assertTrue(Logo);
	 
 }
 @Test (priority =1)
 public void VerifyTitleofthePage() {
	String title=loginpage.VerifyTitle(); 
	Assert.assertEquals(title,"Login - TechFios Test Application - Billing");
 }
 @AfterMethod
 public void TearDown() {
	 driver.quit();
	 
 }
}