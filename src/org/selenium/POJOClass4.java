package org.selenium;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POJOClass4 extends Adectin{
public POJOClass4() {
PageFactory.initElements(driver, this);
}

@FindBy(id="first_name")
private WebElement firstname;
@FindBy(id="last_name")
private WebElement lastname;
@FindBy(id="address")
private WebElement address;
public WebElement getFirstname() {
	return firstname;
}
public WebElement getLastname() {
	return lastname;
}
public WebElement getAddress() {
	return address;
}
public WebElement getCreditcardno() {
	return creditcardno;
}
public WebElement getCardtype() {
	return cardtype;
}
public WebElement getMonth() {
	return month;
}
public WebElement getYear() {
	return year;
}
public WebElement getCvvnumber() {
	return cvvnumber;
}
public WebElement getBooknow() {
	return booknow;
}

@FindBy(id="cc_num")
private WebElement creditcardno;
@FindBy(xpath="(//select[@class='select_combobox'])[1]")
private WebElement cardtype;
@FindBy(xpath="(//select[@class='select_combobox2'])[1]")
private WebElement month;
@FindBy(xpath="(//select[@class='select_combobox2'])[2]")
private WebElement year;
@FindBy(xpath="(//input[@class='reg_input'])[4]")
private WebElement cvvnumber;
@FindBy(id="book_now")
private WebElement booknow;

}
