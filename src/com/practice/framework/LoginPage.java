package com.practice.framework;

import java.sql.Driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	public LoginPage(WebDriver Driver) {
		PageFactory.initElements(Driver, this);
		
	}
		@FindBy (xpath="//input[@id='email']")
		private WebElement username;
		
		@FindBy (id="pass")
		private WebElement password;
		
		@FindBy (xpath="//button[@type='submit']")
		private WebElement loginButton;
		
		public void login(String username1, String password1 ) {
			username.sendKeys(username1);
			password.sendKeys("Prnrr1234@");
			loginButton.click();
		}
	}

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		//		PageFactory.initElements(Driver, this);
//	}
//	
//	
//	@FindBy(id="email")
//	private WebElement unbox;
//	
//	@FindBy(id="pass")
//	private WebElement pwbox;
//	@FindBy(xpath="//button[@type='submit']")
//	private WebElement loginbtn;
//
//
////logic
//public void login(String username, String password) {
//	unbox.sendKeys(username);
//	pwbox.sendKeys(password);
//	loginbtn.click();
//}
