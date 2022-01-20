package com.selenium.basic;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

public class CloseAllWindows {
	static {System.setProperty("webdriver.chrome.driver", "F:\\\\IT Projects\\\\JARS\\\\chromedriver_win32_3\\\\chromedriver.exe");}
	
	@Parameters("browser")
	@Test
	public void closeAllWindowsExceptMain(String browser) {
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("--disable-notifications");
		WebDriver driver=new ChromeDriver(opt);
		driver.get("http://naukri.com");
		String main =driver.getWindowHandle();
		Set<String> list =driver.getWindowHandles();
		for (String one : list) {
			if (!main.equals(one)) {
				driver.switchTo().window(one);
				driver.close();
			}
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	/*@Parameters("browser")
	@Test
	public void closeMultipleTab(String browser) {
		System.out.println(browser);
		ChromeOptions ops=new ChromeOptions();
		ops.addArguments("--disable-notifications");
		WebDriver d=new ChromeDriver();
		d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		d.manage().window().maximize();
		d.get("https://www.naukri.com/");
		String main = d.getWindowHandle();
		Set<String> list = d.getWindowHandles();
		
		for (String one : list) {
			//if (!one.equalsIgnoreCase(main)) {
				String title=d.switchTo().window(one).getTitle();
				if (!title.contains("Tech")) {
			d.close();
				}	
		}
		
	}*/
	
}
