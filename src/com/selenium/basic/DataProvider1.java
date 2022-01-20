package com.selenium.basic;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvider1 {

	@Test(dataProvider="userpass")
	public void login(String firstname,String lastname) {
		System.out.println(firstname+" "+lastname);
		
	}

	@DataProvider
	public Object userpass() {
		Object[][] obj = new Object[2][2];
		obj[0][0]="Rohan";
		obj[0][1]="Barai";
		obj[1][0]="Rahul";
		obj[1][1]="Barai";
		return obj;
	}
}
