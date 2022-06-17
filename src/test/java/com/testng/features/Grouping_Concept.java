package com.testng.features;

import org.testng.annotations.Test;

public class Grouping_Concept {
	
	@Test(groups = "Non veg")
	public void chicken() {
		System.out.println("chicken");
	}
	@Test(groups = "Non veg")
	public void fish() {
       System.out.println("fish");
	}
	@Test(groups = "Non veg")
	public void prawn() {
       System.out.println("prawn");
	}
	@Test(groups = "Veg")
	public void panner() {
	   System.out.println("panner");

	}
	@Test(groups = "Veg")
	public void shawarma() {
      System.out.println("shawarma");
    }
	@Test(groups = "Vehicle")
	public void tatAltroz() {
		System.out.println("tata altroz");

	}
	@Test(groups = "Vehicle")
	public void r15m() {
		System.out.println("r15m");

	}
	
}
