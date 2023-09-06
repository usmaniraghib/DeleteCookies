package com.raghib.selenium;

/**
 * Reference:-
 * https://www.youtube.com/watch?v=8pTTx9HRAog
 */
import java.time.Duration;

import org.openqa.selenium.WebDriver;

public class DeleteCookies extends BaseClass {

	public static WebDriver driver;
	public static String browserName = "chrome";
	public static String browserVersion = "116";
	
	public static String url = "http://google.com";
	
	public static void main(String[] args) {
		// Chrome Browser
		driver = BaseClass.getDriver(browserName, browserVersion);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		// driver.manage().deleteCookieNamed("sessionKey");
		driver.get(url);
		BaseClass.quitDriver();
	}
}
