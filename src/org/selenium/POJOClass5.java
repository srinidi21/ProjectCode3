package org.selenium;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POJOClass5 extends Adectin{
	public POJOClass5() {
		PageFactory.initElements(driver, this);
		}
	@FindBy(xpath="(//input[@class='disable_text'])[1]")
	private WebElement hotelname;
	@FindBy(xpath="(//input[@class='disable_text'])[2]")
	private WebElement location;
	@FindBy(xpath="(//input[@class='disable_text'])[3]")
	private WebElement roomtype;
	@FindBy(xpath="(//input[@class='disable_text'])[4]")
	private WebElement arrivaldate;
	@FindBy(xpath="(//input[@class='disable_text'])[5]")
	private WebElement departuredate;
	@FindBy(xpath="(//input[@class='disable_text'])[6]")
	private WebElement totalrooms;
	@FindBy(xpath="(//input[@class='disable_text'])[7]")
	private WebElement adultsroom;
	@FindBy(xpath="(//input[@class='disable_text'])[8]")
	private WebElement childrenroom;
	@FindBy(xpath="(//input[@class='disable_text'])[9]")
	private WebElement pricenight;
	@FindBy(xpath="//input[@name='total_price']")
	private WebElement total_price;
	@FindBy(xpath="(//input[@class='disable_text'])[11]")
	private WebElement gst;
	@FindBy(xpath="(//input[@class='disable_text'])[12]")
	private WebElement finalprice;
	@FindBy(xpath="//input[@name='first_name']")
	private WebElement firstname;
	@FindBy(id="//textarea[@class='disable_textarea']")
	private WebElement address;
	@FindBy(id="(//input[@class='disable_text'])[15]")
	private WebElement orderno;
	public WebElement getHotelname() {
		return hotelname;
	}
	public WebElement getLocation() {
		return location;
	}
	public WebElement getRoomtype() {
		return roomtype;
	}
	public WebElement getArrivaldate() {
		return arrivaldate;
	}
	public WebElement getDeparturedate() {
		return departuredate;
	}
	public WebElement getTotalrooms() {
		return totalrooms;
	}
	public WebElement getAdultsroom() {
		return adultsroom;
	}
	public WebElement getChildrenroom() {
		return childrenroom;
	}
	public WebElement getPricenight() {
		return pricenight;
	}
	public WebElement getTotal_price() {
		return total_price;
	}
	public WebElement getGst() {
		return gst;
	}
	public WebElement getFinalprice() {
		return finalprice;
	}
	public WebElement getFirstname() {
		return firstname;
	}
	public WebElement getAddress() {
		return address;
	}
	public WebElement getOrderno() {
		return orderno;
	}


	

}
