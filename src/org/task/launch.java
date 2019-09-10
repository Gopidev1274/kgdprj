package org.task;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class launch {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\GopiDeva\\KGD\\driver");
	WebDriver dev=new ChromeDriver();
	dev.get("http://www.facebook.com");
	dev.manage().window().maximize();
	dev.close();
}
}
