package com.pom.framework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ManagerHomePage {
	
	@FindBy(linkText = "New Customer")
	public WebElement newCustomerLink;
	
	@FindBy(linkText = "New Account")
	public WebElement newAccountLink;
	
	
	public ManagerHomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
}
