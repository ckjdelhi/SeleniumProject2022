package com.pom.framework;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseDriver {
	public static WebDriver driver = null;
	static {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\chand\\Desktop\\selenium\\driver\\chromedriver.exe");
		
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/v4/index.php");
	}
	
	public static void checkPageTitle(String url) {
		if(driver.getCurrentUrl().equals(url)) {
			System.out.println("Matching");
		}else {
			System.out.println("Ads page");
			driver.get(url);
		}

	}
}
