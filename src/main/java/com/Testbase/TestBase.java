package com.Testbase;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.Testutil.TestUtil;

public class TestBase {
 
	public static Properties prop;
    public static WebDriver driver;
	
    public TestBase() {
	
	  prop = new Properties();
	  
	  try {
		FileInputStream fle= new FileInputStream("C:\\Users\\Owner\\eclipse-fall2018\\dell.qa\\src\\main\\java\\com\\config\\Config.properties");
		 
			prop.load(fle);
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	
	}
	
	}
      public static void initil() {
    
    	  String browser=prop.getProperty("browser");
    	  
    	  if(browser.equalsIgnoreCase("Chrome")) {
    		  System.setProperty("webdriver.chrome.driver", "\\C:\\Driver\\chromedriver.exe\\");
    	      driver =new ChromeDriver();
    	      
    	      }
    	  else if(browser.equalsIgnoreCase("FF")) {
    		  System.setProperty("webdriver.gecko.driver", "\\C:\\Driver\\geckodriver.exe\\");
    	         WebDriver driver =new FirefoxDriver();
    	  }
     driver.manage().window().maximize();
     driver.manage().deleteAllCookies();
     driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGELOADOUTTIME, TimeUnit.SECONDS);
     driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICITYWAIT, TimeUnit.SECONDS);
     driver.get(prop.getProperty("url"));
    	  { 
    		  }
    	  }
      }
    