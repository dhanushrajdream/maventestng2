package com.pomclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_Page {
	
public WebDriver driver; //null
	
	@FindBy(id ="username")
	private WebElement username;
	
	@FindBy(id ="password")
	private WebElement password;
	
	@FindBy(id = "login")
	private WebElement login;
	
	
	public Login_Page(WebDriver driver3) {
		
		this.driver =  driver3;
		PageFactory.initElements(driver, this);
		
	}

	public WebElement getUsername() {
		return username;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getLogin() {
		return login;
	}
	

}
