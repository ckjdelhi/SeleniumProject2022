package com.test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Guru99BasicAutomation {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\chand\\Desktop\\selenium\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/v4/index.php");
		driver.findElement(By.name("uid")).sendKeys("mgr12");
		driver.findElement(By.xpath("//*[@name='password']")).sendKeys("mgr!23");
		driver.findElement(By.name("btnLogin")).click();
		
		driver.switchTo().alert().accept();
		
		
		String dashbordPageTitle = driver.getTitle();
		
		if(dashbordPageTitle.equals("Guru99 Bank Manager HomePage")) {
			System.out.println("Login Successful.");
			
		}else {
			System.out.println("Login failed.");
		}
		driver.findElement(By.name("uid")).sendKeys("mgr123");
		driver.findElement(By.xpath("//*[@name='password']")).sendKeys("mgr!23");
		driver.findElement(By.name("btnLogin")).click();
		
		dashbordPageTitle = driver.getTitle();
		
		if(dashbordPageTitle.equals("Guru99 Bank Manager HomePage")) {
			System.out.println("Login Successful.");
			
		}else {
			System.out.println("Login failed.");
		}
		
		driver.findElement(By.cssSelector(".menusubnav > li:nth-of-type(2) > a")).click();
		if(driver.getCurrentUrl().equals("https://demo.guru99.com/v4/manager/addcustomerpage.php")) {
			System.out.println("New Customer Page");
		}else {
			System.out.println("Ads page");
			driver.get("https://demo.guru99.com/v4/manager/addcustomerpage.php");
		}
		
		
		driver.findElement(By.name("name")).sendKeys("Chandan Kumar");
		
		driver.findElements(By.name("rad1")).get(0).click();
		
		
		
		driver.findElement(By.id("dob")).sendKeys("01012000");
		
		driver.findElement(By.linkText("New Account")).click();
		if(driver.getCurrentUrl().equals("https://demo.guru99.com/v4/manager/addAccount.php")) {
			System.out.println("New Account Page");
		}else {
			System.out.println("Ads page");
			driver.get("https://demo.guru99.com/v4/manager/addAccount.php");
		}
		driver.findElement(By.name("cusid")).sendKeys("123444");
		
		Select dropDown = new Select(driver.findElement(By.name("selaccount")));
		//dropDown.selectByVisibleText("Current");
		dropDown.selectByValue("Current");
		//dropDown.selectByIndex(1);
		
	}

}
