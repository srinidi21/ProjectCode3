package org.selenium;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POJOClass1 extends Adectin {
	public POJOClass1() {
		PageFactory.initElements(driver, this);
		}
	@FindBy(id="username")
	private WebElement user;
	@FindBy(id="password")
	private WebElement password;
	@FindBy(id="login")
	private WebElement lgnbtn;
	public WebElement getUser() {
		return user;
	}
	public WebElement getPassword() {
		return password;
	}
	public WebElement getLgnbtn() {
		return lgnbtn;
	}
	

}
