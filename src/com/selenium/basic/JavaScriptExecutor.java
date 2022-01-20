package com.selenium.basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.openqa.selenium.JavascriptExecutor;

public class JavaScriptExecutor {
@Test
public void Login() {
	System.setProperty("webdriver.chrome.driver", "F:\\IT Projects\\JARS\\chromedriver_win32\\chromedriver.exe");
WebDriver d=new ChromeDriver();
d.manage().window().maximize();
d.get("https://demo.actitime.com/login.do");
JavascriptExecutor js= (JavascriptExecutor) d;
js.executeScript("document.getElementById('username').value='manager'");

}
}
