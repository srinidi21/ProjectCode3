package org.selenium;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POJOClass2 extends Adectin {
public POJOClass2() {
PageFactory.initElements(driver, this);
}
@FindBy(xpath="(//select[@class='search_combobox'])[1]")
private WebElement location;
@FindBy(id="hotels")
private WebElement hotel;
@FindBy(id="room_type")
private WebElement room_type;
@FindBy(id="room_nos")
private WebElement room_nos;
@FindBy(id="datepick_in")
private WebElement Checkin;
@FindBy(id="datepick_out")
private WebElement Checkout;
@FindBy(xpath="(//select[@class='search_combobox'])[5]")
private WebElement AdultRoom;
@FindBy(xpath="(//select[@class='search_combobox'])[6]")
private WebElement ChildRoom;
@FindBy(id="Submit")
private WebElement Search;
public WebElement getLocation() {
	return location;
}
public WebElement getHotel() {
	return hotel;
}
public WebElement getRoom_type() {
	return room_type;
}
public WebElement getRoom_nos() {
	return room_nos;
}
public WebElement getCheckin() {
	return Checkin;
}
public WebElement getCheckout() {
	return Checkout;
}
public WebElement getAdultRoom() {
	return AdultRoom;
}
public WebElement getChildRoom() {
	return ChildRoom;
}
public WebElement getSearch() {
	return Search;
}


}
