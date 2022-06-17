package com.testng.features;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Soft_Assert_Concept {
	
	@Test
	public void user_Password() {
		
		
		String exp = "123@#$";
		
		String act = "123@#$";
		
		SoftAssert soft = new SoftAssert();
		
		soft.assertEquals(act, exp);
		System.out.println("verification");

	}

}
