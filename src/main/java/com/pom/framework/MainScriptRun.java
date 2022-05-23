package com.pom.framework;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class MainScriptRun extends BaseDriver {

	public static void main(String[] args) throws IOException {
		
		LoginHomePage loginPageObject=new LoginHomePage(driver);
		loginPageObject.userId.sendKeys("mgr123");
		loginPageObject.password.sendKeys("mgr!23");
		loginPageObject.loginButton.click();
		
		ManagerHomePage managerHomePageObject = new ManagerHomePage(driver);
		managerHomePageObject.newCustomerLink.click();
		
		checkPageTitle("https://demo.guru99.com/v4/manager/addcustomerpage.php");
		
		NewCustomerPage newCustomerPageObject = new NewCustomerPage(driver);
		newCustomerPageObject.customerName.sendKeys("Chandan Kumar");
		
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		jse.executeScript("scroll(0, 350)", "");
		
		File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenshotFile, new File("C:\\Users\\chand\\Desktop\\selenium\\screenshot\\newCustomerPageImage.jpg"));
		 
		
		managerHomePageObject.newAccountLink.click();
		
		checkPageTitle("https://demo.guru99.com/v4/manager/addAccount.php");
		
		
		
	}

}
