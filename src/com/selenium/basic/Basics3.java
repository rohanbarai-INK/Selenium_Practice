package com.selenium.basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Basics3 {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "F:\\Downloads\\IDM Downloads\\Compressed\\chromedriver_win32_2\\chromedriver.exe");
	WebDriver d = new ChromeDriver();
    d.manage().window().maximize();
    d.get("https://demo.actitime.com/login.do");	

    d.findElement(By.xpath("//tr/td/input [@type ='text']")).sendKeys("admin");
    d.findElement(By.xpath("//tr/td/input [@type ='password']")).sendKeys("manager");
    Thread.sleep(200);
    
    d.findElement(By.id("loginButton")).click();
    
}
}
