package org.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Adectin {
	static WebDriver driver;
	static Select s;
	public static void LaunchApp(String s) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\eclipse-workspace\\BrowserSelenium\\driv\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get(s);
		}
	public static void fill(WebElement w,String s) {
		w.sendKeys(s);
	}
	public static void klik(WebElement w) {
		w.click();
	}
	public static void dd(WebElement w,int i) {
		s=new Select(w);
		s.selectByIndex(i);
	}
	public static void print(WebElement w) {
		String text = w.getAttribute("value");
		System.out.println(text);
	}
	

}
