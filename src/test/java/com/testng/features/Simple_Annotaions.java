package com.testng.features;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Simple_Annotaions {
	
	@BeforeSuite
	public void propertSetup() {
		System.out.println("property setup");
	}
	  @BeforeTest
	 public void browserLaunch() {
       System.out.println("browser launch");
	}
	   @BeforeClass
       public void urlLaunch() {
        System.out.println("url launch");
	   }	
	    @BeforeMethod
	    public void signIn() {
		System.out.println("sign in");
	    }
	       @Test(priority = -1)
	       public void women() {
            System.out.println("women");		
	       }
	       @Test(priority = 0)
	       public void men() {
		   System.out.println("men");
	       }
	       @Test(invocationCount = 5)
	       public void firstKid() {
		   System.out.println("first kid");
	       }
	       @Test
	       public void secondKid() {
		   System.out.println("second kid");
	       }
	     @AfterMethod
	     public void signOut() {
		  System.out.println("signout");
	  }
	    @AfterClass
	    public void homePage() {
         System.out.println("home page");
	  }
	   @AfterTest
	   public void deleteCookies() {
		 System.out.println("delete cookies");
	  }
	  @AfterSuite
	  public void quitBrowser() {
		 System.out.println("Quit browser");

	}

}
