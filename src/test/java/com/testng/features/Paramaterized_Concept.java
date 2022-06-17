package com.testng.features;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Paramaterized_Concept {
	
	
	@Test
	@Parameters({"Username","password"})
	public void credentials(@Optional("infinitywar")String username, String password) {
		
		System.out.println("username:"+username);
		
		System.out.println("password:"+password);

	}

}
