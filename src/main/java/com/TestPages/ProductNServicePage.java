package com.TestPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Testbase.TestBase;

public class ProductNServicePage extends TestBase {
	
	@FindBy(xpath="//input=[@id=\"name\"]")
     WebElement Typename;
	@FindBy(xpath="//input=[@id=\"sales_price\"]")
	WebElement Salesprice;
	@FindBy(xpath="//input[@id=\"item_number\"]")
	WebElement itemnumber;
	@FindBy(xpath="//textarea[@class=\"form-control\"]")
    WebElement Description;
	@FindBy(xpath="//span[text()='products & Services']")
    WebElement ProductNService;
	@FindBy(xpath="//a[text()='New Service']")
    WebElement NewService;
	@FindBy(xpath="//button[@id=\"submit\"]")
    WebElement Submit;
	@FindBy(xpath="//*[@class=\"alert alert-success fade in\"]")
    WebElement SuccessMessage;
	
	
	public ProductNServicePage() {
	PageFactory.initElements(driver, this);
	
	}
	public void ProductNService() {
		ProductNService.click();
	}
	public void NewService() {
		NewService.click();
		
		
	}
	public boolean ValidateSuccessMessage() {
		return SuccessMessage.isDisplayed();
	}
	
		public void Neworder(String name,String SalesPrice,String description,String ItemNumber) {
		Typename.sendKeys(name);
		Salesprice.sendKeys(SalesPrice);
		itemnumber.sendKeys(ItemNumber);
		Description.sendKeys(description);
		
		Submit.click();
		
		
		
		
	}
}    
