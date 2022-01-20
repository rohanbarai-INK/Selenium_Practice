package com.selenium.basic;

import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

public class TakeScreenShot {
	
		
		@Test
		public static void captureScreenMethod() throws Exception{
			System.setProperty("webdriver.gecko.driver","D://Selenium Environment//Drivers//geckodriver.exe");
			WebDriver driver = new FirefoxDriver();
			
			driver.manage().window().maximize();
			driver.get("https://www.softwaretestingmaterial.com/capture-screenshot-using-selenium-webdriver");
			File screenshotFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileHandler file=new FileHandler();
			File sourceFile=new File("D:\\\\\\\\SoftwareTestingMaterial.png");
			file.copy(screenshotFile, sourceFile);
			
					
			driver.close();
			driver.quit();		
		}
	}

