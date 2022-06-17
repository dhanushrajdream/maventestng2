package com.testng.features;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class Ignore_Concept {
	
	@Test
	public void chicken() {
		System.out.println("chicken");
	}
	@Test(enabled = false)
	public void fish() {
       System.out.println("fish");
	}
	@Test
	public void prawn() {
       System.out.println("prawn");
	}
	@Ignore
	@Test
	public void panner() {
	   System.out.println("panner");

	}
	@Test
	public void shawarma() {
      System.out.println("shawarma");
	}

}
