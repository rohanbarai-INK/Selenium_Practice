package com.selenium.basic;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class basic {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "F:\\Downloads\\IDM Downloads\\Compressed\\chromedriver_win32_2\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.manage().window().maximize();
		d.get("http://www.google.com");
		String title=d.getTitle();
		Thread.sleep(5000);
		System.out.println(title);
		if(title.equalsIgnoreCase("google"))
		{
			System.out.println("google is the title");
		}
		else
		{
			System.out.println("title is not google, BUT :"+title);
		}
		Thread.sleep(2000);
		
		String url=d.getCurrentUrl();
		if(url.contains("google.co.in"))
		{
			System.out.println("it is redirected successfully");
		}
		else
		{
			System.out.println("not directed current url is :"+url);
		}
		d.close();
		Thread.sleep(2000);
		
		
	}
	
	
}

