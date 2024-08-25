package com.BookMyShow.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.BookMyShow.base.base;

public class languagePage extends base
{
	WebDriver driver;
	public languagePage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//body/div[@id='super-wrapper']/div[@id='super-container']/div[@role='main']/div[@class='sc-133848s-2 sc-b1h692-4 dybRam']/div[@class='sc-133848s-1 sc-b1h692-5 ghBgvC']/div[@class='sc-133848s-3 sc-1y4pbdw-0 iNsScq']/div[@class='sc-133848s-3 sc-1y4pbdw-5 gIa-DnO']/div[1]/div[1]/div[1]")
	WebElement language;
	@FindBy(xpath = "//div[@class='sc-7o7nez-0 ehthfR'][normalize-space()='Hindi']")
	WebElement hindiclk;
	public WebElement language() {
		language.click();
		Select select=new Select(language);
		select.selectByVisibleText("Hindi");
		return language;
	}
	public WebElement hindiclk() {
		hindiclk.click();
		return hindiclk;
		}
}
