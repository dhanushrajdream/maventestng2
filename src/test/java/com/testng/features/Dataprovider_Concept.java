package com.testng.features;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Dataprovider_Concept {
	
	
	@Test(dataProvider ="inputdata")
	public void credentials(String username,String password) {
		
		System.out.println("username:"+username);
		
		System.out.println("password:"+password);
		
		

	}

	@DataProvider
	public Object[][] inputdata() {
		
		return new Object[][] {
			
			{"dhanush","123"},
			{"divya","456"},
			{"subi","789"}
			
			
		};
		
		}
	

	}
	
	

