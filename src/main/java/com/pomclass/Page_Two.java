package com.pomclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Page_Two {
	
public WebDriver driver;
	
	@FindBy(id ="radiobutton_0")
	private WebElement radiobutton_0;
	
	@FindBy(id ="continue")
	private WebElement cont;
	
	
	public Page_Two(WebDriver driver2) {
		this.driver= driver2;
		PageFactory.initElements(driver, this);
	}

	public WebElement getRadiobutton_0() {
		return radiobutton_0;
	}

	public WebElement getCont() {
		return cont;
	}

}
