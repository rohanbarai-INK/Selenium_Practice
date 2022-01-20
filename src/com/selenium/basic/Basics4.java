package com.selenium.basic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Basics4 {
	public static void main(String[] args) throws Exception{
		System.setProperty("webdriver.chrome.driver", "F:\\Downloads\\IDM Downloads\\Compressed\\chromedriver_win32_2\\chromedriver.exe");

		WebDriver d = new ChromeDriver();
	    d.get("https://demo.actitime.com/login.do");
	    WebDriverWait wait=new WebDriverWait(d, 0);
	    wait.until(ExpectedConditions.titleContains(null));
	    		d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    d.manage().window().maximize();
	    Thread.sleep(2000);
	    d.findElement(By.cssSelector("input[type='text']")).sendKeys("admin");
	    d.findElement(By.name("pwd")).sendKeys("manager");
	    System.out.println("Page Opened and Input Filled");
	    Thread.sleep(200);
	    d.findElement(By.xpath("//td/a[@id ='loginButton']")).click();
	    System.out.println("Control Panel Opened");
	    Thread.sleep(2000);
	    d.findElement(By.xpath("//a[@id = 'logoutLink']")).click();
	    System.out.println("Logout successfully");
	    d.close();
	    
	    
	    
	    
	}
}
