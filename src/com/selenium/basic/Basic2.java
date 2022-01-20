package com.selenium.basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Basic2 {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "F:\\Downloads\\IDM Downloads\\Compressed\\chromedriver_win32_2\\chromedriver.exe");
	WebDriver d= new ChromeDriver();
	d.get("https://demo.actitime.com/login.do");
	d.manage().window().maximize();
	Thread.sleep(200);
	d.findElement(By.id("username")).sendKeys("admin");
	d.findElement(By.name("pwd")).sendKeys("manager");
	Thread.sleep(200);
	By b = By.id("loginButton");
	d.findElement(b).click();
	
	
	
    	
}
}
