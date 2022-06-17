package com.testng.features;

import org.testng.annotations.Test;

public class Timeout_Concept {
	
	@Test(timeOut = 3000)
	public void demo() throws InterruptedException {
		
		Thread.sleep(1000);
		System.out.println("dh raj");
		
		Thread.sleep(1000);
		System.out.println("dhanush");
		
		Thread.sleep(2000);
		System.out.println("slenium class");

	}
}
