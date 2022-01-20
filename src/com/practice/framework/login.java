package com.practice.framework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

public class login {

	@Test
	public void login() {
		System.setProperty("webdriver.chrome.driver", "F:\\IT Projects\\JARS\\chromedriver_win32_3\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.manage().window().maximize();
		
		
		d.get("https://en-gb.facebook.com/");
		LoginPage Login = new LoginPage(d);
		Login.login("barairohan@gmail.com", "Prnrr1234@");
	}	
}
