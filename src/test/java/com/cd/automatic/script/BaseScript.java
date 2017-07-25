package com.cd.automatic.script;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BaseScript{
	protected static WebDriver driver;
	public void init() {
		if (driver == null) {
			ChromeOptions options = new ChromeOptions();
//			options.addArguments(
//					"--user-data-dir=D:/Users/Administrator/AppData/Local/Google/Chrome/User Data/Default");
			options.addArguments("--start-maximized", "allow-running-insecure-content", "--test-type");
			System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
			driver = new ChromeDriver(options);
			driver.manage().window().maximize();
		}
	}
	public WebElement findElement(By by) {
		WebElement element=null;
		try {
			element=driver.findElement(by);
		}catch(Exception e) {
			
		}
		return element;
	}
}
