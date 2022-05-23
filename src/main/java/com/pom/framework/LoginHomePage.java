package com.pom.framework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginHomePage {
	
	@FindBy(name = "uid")
	public WebElement userId;
	
	@FindBy(xpath = "//*[@name='password']")
	public WebElement password;
	
	
	@FindBy(xpath = "//*[@name='btnLogin']")
	public WebElement loginButton;
	
	
	@FindBy(xpath = "//*[@name='btnReset']")
	public WebElement resetButton;
	
	public LoginHomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
}
