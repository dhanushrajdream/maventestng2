package com.sdp;

import org.openqa.selenium.WebDriver;

import com.pomclass.Login_Page;
import com.pomclass.Page_One;
import com.pomclass.Page_Three;
import com.pomclass.Page_Two;

public class Page_Object_Manager {
	
public WebDriver driver; //default driver //null driver
	
	private Login_Page lp;
	private Page_One pageone;
	private Page_Two pagetwo;
	private Page_Three pagethree;
	
	
	public Page_Object_Manager(WebDriver driver2) {     //constructor
		this.driver = driver2;
		
	}
	public Login_Page getInstanceLoginPage() {
		
		if (lp==null) {
	        lp = new Login_Page(driver);
		}
		
		return lp;	
	}
	public Page_One getInstancePageOne() {     //method
		if (pageone==null) {                   //if for first time only
		
			pageone = new Page_One(driver);
		}
		return pageone;
    
		
	}
	public Page_Two getInstancePageTwo() {
		if (pagetwo==null) {
			pagetwo = new Page_Two(driver);	
		}
		
		return pagetwo;

	}
	
	public  Page_Three getInstancePageThree() {
		if (pagethree==null) {
			pagethree = new Page_Three(driver);
		}
		
		return pagethree;

	}

}
