package com.testng.features;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Hard_Assert_Concept {
	
	@Test
	public void userprofile() {

		
		String exp = "Lokesh";
		
		String act ="lokesh";
		
		Assert.assertEquals(act, exp);
		
		
		System.out.println("Validation");
		
		
		
	}
	

}
