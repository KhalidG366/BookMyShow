package com.BookMyShow.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.BookMyShow.base.base;

public class landingPage extends base{
	WebDriver driver;
	public landingPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//a[normalize-space()='Movies']")
	WebElement movies;
	public WebElement movies() {
		movies.click();
		return movies;
	}

}
