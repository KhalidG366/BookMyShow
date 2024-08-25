package com.BookMyShow.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.BookMyShow.base.base;

public class searchPage extends base
{
	WebDriver driver;
	public searchPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
				
	}
	@FindBy(xpath = "//span[@id='4']")
	WebElement searchBox;
	@FindBy(xpath = "//div[@class='bwc__sc-3t17w7-3 fOVSLT']//div[3]//*[name()='svg']")
	WebElement close;
	
	public WebElement searchBox() {
		searchBox.sendKeys("Marathi");
		return searchBox;
	}
	public WebElement close() {
		close.click();
		return close;
	}
	
}
