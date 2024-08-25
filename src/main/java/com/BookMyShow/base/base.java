package com.BookMyShow.base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class base 
{
	WebDriver driver;
	public WebDriver configBrowser() {
		String browserName="chrome";
		if(browserName.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver();
			driver=new ChromeDriver();
		}
		else if (browserName.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver();
			driver=new FirefoxDriver();
		}
		driver.get("https://in.bookmyshow.com/explore/home/pune");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return driver;
	}
	public void tearDown() throws InterruptedException {
		Thread.sleep(10000);
		driver.quit();
	}
}
