package com.BookMyShow.pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.BookMyShow.base.base;

public class genresPage extends base
{
	WebDriver driver;
	public genresPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(xpath = "//body/div[@id='super-wrapper']/div[@id='super-container']/div[2]/div[3]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]")
	WebElement genres;
	
	public WebElement genres() {
		Select select = new Select(genres);
		select.selectByIndex(1);
		return genres;
	}
	@FindBy(xpath = "//body/div[@id='super-wrapper']/div[@id='super-container']/div[2]/div[3]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]")
	WebElement comedyclk;
	public WebElement comedyclk() {
		comedyclk.click();
		return comedyclk;
	}
}
