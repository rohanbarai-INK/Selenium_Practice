package com.selenium.grid;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class SeleniumGrid {
    RemoteWebDriver driver;
	@Test
	public void RemoteNode1() throws MalformedURLException {
		URL url = new URL("http://192.168.1.6:66666/wd/hub"); 
	DesiredCapabilities cap =new DesiredCapabilities().chrome();
	cap.setBrowserName("chrome");
	cap.setPlatform(Platform.WINDOWS);
	driver=new RemoteWebDriver(url, cap);
	driver.get("http://www.google.com");
	
}
}