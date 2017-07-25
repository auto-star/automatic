package com.cd.automatic.script;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchWindowException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;


public class DownloadScript  extends BaseScript{
	public String getCurrentUrl() {
		driver.get("http://tv.cctv.com/lm/xwlb/");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try
		{
			boolean flag=(new WebDriverWait(driver, 10)).until(new ExpectedCondition<WebElement>() {
				@Override
				public WebElement apply(WebDriver d) {
					
					return d.findElement(By.xpath("//*[@id=\"content\"]/ul[1]/li[1]/a/div[2]/div[1]"));
				}
			}).isDisplayed();
			if(!flag){
				throw new RuntimeException("element exists, but not displayed");
			}
		}catch(Exception e)
		{
			
			throw new RuntimeException(e.getMessage(),e.getCause());
		}
		driver.findElement(By.xpath("//*[@id=\"content\"]/ul[1]/li[1]/a/div[2]/div[1]")).click();
		try {
			String currentHandle = driver.getWindowHandle();
			Set<String> handles = driver.getWindowHandles();
			if(handles.size()>=2){
				for (String s : handles) {
					if (s.equals(currentHandle)) {
						driver.switchTo().window(s);
						driver.close();
						continue;
					} else {
						driver.switchTo().window(s);
						if (driver.getTitle().contains("《新闻联播》")) {
							break;
						} else
							continue;
					}
				}
			}else{
				
				throw new RuntimeException("there is only one tab , can't switchTab,please check your action");
			}
			
		} catch (NoSuchWindowException e) {
			throw new RuntimeException(e.getMessage(), e.getCause());
		}
		String url=driver.getCurrentUrl();
		System.out.println(url);
		return url;
	}
}
