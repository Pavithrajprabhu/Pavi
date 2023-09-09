package com.Base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BasicClass {
	public static WebDriver driver;
	public static Actions act = new Actions(driver);
	
	public static WebDriver launchbrowser(String type) {
		if (type.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}
		else if (type.equalsIgnoreCase(type)) {
			WebDriverManager.firefoxdriver().setup();
			driver =new FirefoxDriver();
		}
		driver.manage().window().maximize();
		return driver;
	}
	public static WebDriver geturl(String url) {
		driver.get(url);
		return driver;
	}
	public static WebDriver close() {
		driver.close();
		return driver;
	}
	public static void quite() {
		driver.quit();
	}
	public static void navigateto(String url) {
		driver.navigate().to(url);
	}
	public static void navigateback() {
		driver.navigate().back();
	}
	public static void navigaterefesh() {
		driver.navigate().refresh();
	}
	public static void navigateforward() {
		driver.navigate().forward();
	}
	public static void switchToFrame(String type, WebElement ele, String value) {
		if (type.equalsIgnoreCase("byvalue")) {
			driver.switchTo().frame(value);
		} else if (type.equalsIgnoreCase("byelement")) {
			driver.switchTo().frame(ele);
		} else if (type.equalsIgnoreCase("byindex")) {
			int data = Integer.parseInt(value);
			driver.switchTo().frame(data);
		}
	}
	public static void title() {
		driver.getTitle();
	}
	public static void currenturl() {
		driver.getCurrentUrl();
	}
	public static void gettitle() {
		driver.getTitle();
	}
	public static void clickonelement(WebElement ele) {
		ele.click();
	}
	public static void typetext(WebElement ele,String text) {
		ele.sendKeys(text);
		ele.clear();
	}
	 
	
}
