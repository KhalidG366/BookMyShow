package com.BookMyShow.Testcases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.BookMyShow.base.base;
import com.BookMyShow.pageObject.genresPage;
import com.BookMyShow.pageObject.landingPage;
import com.BookMyShow.pageObject.languagePage;
import com.BookMyShow.pageObject.searchPage;

public class allTest extends base
{
	WebDriver driver;
	base bs = new base();
	
	@BeforeMethod
	public void browserInit() {
		driver=bs.configBrowser();
	}
	@Test
	public void testcase() throws InterruptedException {
		landingPage lp= new landingPage(driver);
		languagePage lap=new languagePage(driver);
		genresPage gp=new genresPage(driver);
		searchPage sp = new searchPage(driver);
		lp.movies();
		lap.hindiclk();
		gp.genres();
		Thread.sleep(3000);
		gp.comedyclk();
		sp.searchBox();
		sp.close();
	}
	@AfterMethod
	public void closer() throws InterruptedException {
		bs.tearDown();
	}
}
