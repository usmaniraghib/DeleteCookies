package com.raghib.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DeleteCookies {
	public static void main(String[] args) {
		// Set the driver path
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		// driver.manage().deleteCookieNamed("sessionKey");
		// click on any link
		// login page- verify login url
		driver.get("http://google.com");
		driver.quit();
	}
}
