package org.selenium;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POJOClass3 extends Adectin{
	public POJOClass3() {
		PageFactory.initElements(driver, this);
		}
	@FindBy(id="radiobutton_0")
	private WebElement Select;
	@FindBy(id="continue")
	private WebElement Continue;
	public WebElement getSelect() {
		return Select;
	}
	public WebElement getContinue() {
		return Continue;
	}
}
