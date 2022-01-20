package com.practice.framework;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
@Test
public class ExtractDynamicElementInTable {
	static {System.setProperty("webdriver.chrome.driver", "F:\\IT Projects\\JARS\\chromedriver_win32\\chromedriver.exe");}
	WebDriver d=new ChromeDriver();
	
	
	public void extract() {
		d.get("https://www.icc-cricket.com/rankings/mens/team-rankings/test");
		List<WebElement> list = d.findElements(By.xpath("//table[@class='table']/tbody/tr[*]/td[2]"));
		for (WebElement one : list) {
			System.out.println(one.getText());
		}
				
	}
}
