package com.testng.features;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class DummyClass {
	
	@Test
	@Parameters({"username","password"})
	public void credentials(String username, String password) {
		
		System.out.println("username:"+username);
		
		System.out.println("password:"+password);

}
}
