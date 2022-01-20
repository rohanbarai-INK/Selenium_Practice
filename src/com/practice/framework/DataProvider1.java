package com.practice.framework;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class DataProvider1 {

	
	@DataProvider(name= "test-data")
	public Object Data() {
		Object[][] obj=new Object[2][2];
		obj[0][0]="Rohan";
		obj[0][1]="barai";
		obj[1][0]="Rahul";
		obj[1][1]="barai";
		return obj;
	}
	
	
	@Test(dataProvider="test-data")
	public void Name (String Name, String Last) {
		System.out.println(Name+" "+Last);
	}
}