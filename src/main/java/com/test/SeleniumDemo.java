package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumDemo {

	public static void main(String[] args) {
		
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\chand\\Desktop\\selenium\\driver\\chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\chand\\Desktop\\selenium\\driver\\geckodriver.exe");
		
		WebDriver driver= new FirefoxDriver();
		driver.get("https://www.google.com");
		/*WebElement el = driver.findElement(By.cssSelector("[name='q']"));
		el.sendKeys("Selenium");
		el.submit();
		*/
		//driver.findElement(By.linkText("About")).click();
		driver.findElement(By.xpath("//a[text()='About']")).click();
	}

}
