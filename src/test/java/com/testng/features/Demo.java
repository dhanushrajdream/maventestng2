package com.testng.features;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Demo {
	
	@Test
	public void credentials() {
		String exp = "Vijay";	
		String act = "Vijay";
		Assert.assertEquals(act, exp);
	}
	
	@Test //(retryAnalyzer = Rerun.class)  ---for iretryanalyser 
	public void credentials2() {
		String exp = "123";
		String act = "456";	
		Assert.assertEquals(act, exp);
	}

}

//second link class is rerun
