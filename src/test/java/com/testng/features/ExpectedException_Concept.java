package com.testng.features;

import org.testng.annotations.Test;

public class ExpectedException_Concept {
	
	@Test(expectedExceptions = ArithmeticException.class)
	public void demoi() {
		
		int a=10;
		System.out.println(a/0);

	}

}
