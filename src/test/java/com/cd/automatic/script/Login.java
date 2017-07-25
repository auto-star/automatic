package com.cd.automatic.script;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Login extends BaseScript{

	public void test() {
		driver.get("D:\\work\\a.html");
	}
	public String login() {
		try {
			WebElement element=driver.findElement(By.xpath("//select[@id='sec']"));
			new Select(element).selectByVisibleText("a");
		}catch(Exception e) {
			e.printStackTrace();
		}
		return driver.getTitle();
	}
}
