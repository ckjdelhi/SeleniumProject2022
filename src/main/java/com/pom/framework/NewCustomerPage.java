package com.pom.framework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NewCustomerPage {
	
	//WebElements
	
	@FindBy(name = "name")
	public WebElement customerName;
	
	
	public NewCustomerPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
}
