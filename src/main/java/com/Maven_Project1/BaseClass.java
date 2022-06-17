package com.Maven_Project1;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseClass {
	
	public static WebDriver driver;
	public static Select input;
	public static Actions action;
	public static Robot robot;
	
	
	//browser launch
	public static WebDriver browserLaunch(String browsername) {
	
		if (browsername.equalsIgnoreCase("chrome")) {                                //chrome launch
			
		System.setProperty("webdriver.chrome.driver", 
				System.getProperty("user.dir")+"\\Driver\\chromedriver.exe");
		
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
	}
		else if (browsername.equalsIgnoreCase("ie")) {
	}
		else if (browsername.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", 
					System.getProperty("user.dir")+"\\Driver\\geckodriver.exe");
			
			driver = new FirefoxDriver();
			
			driver.manage().window().maximize();
			
	}
		else if (browsername.equalsIgnoreCase("opera")) {
	}
		return driver;
		
		}
	    //------------------------------------------------------------------------------------------------------------------------
	
	                                                   //wedriver method(over)

	    //get
	    public static void urlLaunch(String url) {
		    driver.get(url);
		}
	    
	    //gettitle
	    public static void getTitle() { 
	    	String title = driver.getTitle();
			System.out.println(title);
		}
	    
	    //getcurrenturl
	    public static void getCurrentUrl() {
	    	String currentUrl = driver.getCurrentUrl();
			System.out.println(currentUrl); 
 		}
	    
	    
	    //navigate 4(to,forward,back,refresh)
	    public static void navigateTo(String input) {
	         driver.navigate().to(input);
		}
	    public static void navigateForward() {
             driver.navigate().forward();
		}
	    public static void navigateBack() {
             driver.navigate().back();
		}
	    public static void navigateRefresh() {
             driver.navigate().refresh();
		}
	    
	    
	    //close 
	    public static void closeBrowser() {	
	        driver.close();
		}
	    
	    //quit browser
	    public static void quitBrowser() {
	        driver.quit();
	    
		}
	    
	    //------------------------------------------------------------------------------------------------------------------------
	     
	                                            //webelement methods 
	    //pending
	    //getatrribute two
	
	    
	    
	    //send keys
	    public static void sendKeys(WebElement element,String input) {
            element.sendKeys(input);
		}
	    
	    //click
	    public static void clickElement(WebElement element) {
	        element.click();
		}
	    //getText
	    public static void getText(WebElement element) {
          
		    String text = element.getText();
		    System.out.println(text);
	    }
	    
	    //getattribute one
	    public static void getattribute(WebElement element) {
        
	    	String attribute = element.getAttribute("aria-label");
		    System.out.println(attribute);
		}
	    //getattributetwo
	    
	    
	    
	  
	    //isselected
	    public static void isSelected(WebElement element) {
	    	
	    	boolean selected = element.isSelected();
	    	System.out.println(selected);
        
		}
	    //isdisplayed
	    public static void isDisplayed(WebElement element) {
	    	
	    	boolean displayed = element.isDisplayed();
	    	System.out.println(displayed);

		}
	    //isenabled
	    public static void isEnabled(WebElement element) {
	    	
	    	boolean enabled = element.isEnabled();
	    	System.out.println(enabled);

		}
	    
	    
	    //clear
	    
	    public static void clear(WebElement element) {
          element.clear();
		}
	   
        
	    
	    
	   //--------------------------------------------------------------------------------------------------------------
	    
	                                                           //select(over)
	    
	    //selectbyvalue
	    public static void selectValue(WebElement element,String byvalue) {
	    	
	        input  = new Select(element);                                                                            //syntax
	        input.selectByValue(byvalue);
	    }
	    //select by visibletext
	    public static void selectvisibletext(WebElement element,String visibletext) {
	    	
	    	input  = new Select(element); 
	    	input.selectByVisibleText(visibletext); 

		}
	    //select by index
	    public static void selectindex(WebElement element,int number) {
             
	    	input  = new Select(element); 
	    	input.selectByIndex(number);
		}
	    //deselect by value
	    public static void deselectByValue(WebElement element,String byvalue) {
	    	
	    	input =new Select(element);
	    	input.deselectByValue(byvalue); 
		}
	    //deselect by visible text
	    public static void deselectByVisibleText(WebElement element,String visibletext) {
	    	
	    	input = new Select(element);
	    	input.deselectByVisibleText(visibletext);

		}
	    //deselect by index
	    public static void deslectByIndex(WebElement element,int number) {
	    	
	    	input = new Select(element);
	    	input.deselectByIndex(number);

		}
	    //is multiple
	    public static void isMultiple(WebElement element) {
	    	
	    	input = new Select(element);
	    	boolean multiple = input.isMultiple();
	    	System.out.println(multiple);

		}
	    //get options
	    public static void getOptions(WebElement element ) {
  
	    	input = new Select(element);
	    	List<WebElement> options =input.getOptions();                            //get text multiple (for each used)
			
			for (WebElement all : options) {
				String text = all.getText();
				System.out.println(text); }
		}
	    //get all selected options
	    
	    public static void getAllSelectedOption(WebElement element) {
        
	    	input = new Select(element);
	    	List<WebElement> allselected = input.getAllSelectedOptions();
			
			for (WebElement all2 : allselected) {
				String text2 = all2.getText();
	            System.out.println(text2);	} 
		}
	    //get first selected option
	    public static void getFirstSelectedOption(WebElement element) {
	    	
	    	input = new Select(element);
	    	WebElement first = input.getFirstSelectedOption();
		    String text3 = first.getText();
		    System.out.println(text3);
		}
	    //deselect all
	    public static void deSelectAll(WebElement element) {
        
	    	input = new Select(element);
	    	input.deselectAll();
	        
		}
	    
	   
//-----------------------------------------------------------------------------------------------------------------------------------------
	                                             //alert(over)
	    
	    public static void alertaccept() {
              
	    	driver.switchTo().alert().accept();
	    	
		}
	    public static void alertDismiss() {
	    	
	    	driver.switchTo().alert().dismiss();
		}
	    
	    public static void alertSendkeys(String input) {
	    	
	    	driver.switchTo().alert().sendKeys(input);
		}
	    public static void alertGetText() {
	    	
	    	String text = driver.switchTo().alert().getText();                                                 //printing get text
			System.out.println(text);
		}
	    
//--------------------------------------------------------------------------------------------------------------------------------------------	    
	                                               //screenshot
	        
	    //day 9 screenshot 
	    public static void screenshot(String location) throws IOException {
        
	    	TakesScreenshot ts =(TakesScreenshot) driver;                                                             //narrowing type casting
			File source = ts.getScreenshotAs(OutputType.FILE);
			File target = new File(location);
			FileUtils.copyFile(source, target);
		}
	    
//-------------------------------------------------------------------------------------------------------------------------------------------------	
	                             //javascript
	    
	    public static void javascriptClick(WebElement element) {
	    	
	    	JavascriptExecutor js = (JavascriptExecutor) driver;                                                             //syntax for javascript executor
			
			js.executeScript("arguments[0].click();" ,element);
		}
	    public static void javascriptScrollIntoView(WebElement element) {
	    	
	    	JavascriptExecutor js = (JavascriptExecutor) driver;                                                             //syntax for javascript executor
			
			js.executeScript("arguments[0].scrollIntoView();", element);   
		}
	    
	    	
//-----------------------------------------------------------------------------------------------------------------------------------	    
                                       //actions(over)
	    
	    //actions click
	    
	    public static void actionsClick(WebElement element) {
	    	action =new Actions(driver);
	    	action.click(element).build().perform();
		}
	    
	    //context click
	    public static void contextClick(WebElement element) {

	    	 action =new Actions(driver);
			 action.contextClick(element).build().perform();
		}
	    //double click
	    public static void doubleClick(WebElement element) {
	    	
	    	action = new Actions(driver);
	    	action.doubleClick(element).build().perform();
         
		}
	    //move to element
	    public static void moveToElement(WebElement element) {
	    	
	    	action = new Actions(driver);
	    	action.moveToElement(element).build().perform();
		}
	    
	    //drag and drop
	    public static void dragDrop(WebElement source,WebElement target) {
	    	
	    	action = new Actions(driver);
	    	action.dragAndDrop(source, target).build().perform();
		}
	 
//-------------------------------------------------------------------------------------------------------------------------------------
	    
	                                                  //robot
	    
	    public static void vkDown() throws AWTException {
	    	
	    	 robot = new Robot(); 
			 robot.keyPress(KeyEvent.VK_DOWN);
			 robot.keyRelease(KeyEvent.VK_DOWN);
		}
	    public static void vkEnter() throws AWTException {
            
	    	robot = new Robot(); 
	    	robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_ENTER);
		}
//-----------------------------------------------------------------------------------------------------------------------------------------	    
                                                   //window handles	    
	    public static void getWindowHandles() {
	    	
	    	Set<String> windowHand = driver.getWindowHandles();
	    	
	    	for (String all : windowHand) {
				System.out.println(all);
				String title = driver.switchTo().window(all).getTitle();
				System.out.println(title);
				}
		}
	    public static void getWindowHandle() {
	    	
             String windowHandle = driver.getWindowHandle();
             System.out.println(windowHandle);
		}
	    public static void getMultipleWindowURl() {
	    	 Set<String> windowHand = driver.getWindowHandles();
	    	 
	    	 for (String all : windowHand) {
	 			System.out.println(all);
	 			String currentUrl = driver.switchTo().window(all).getCurrentUrl();
	 			System.out.println(currentUrl);
		}    	 
}
	    
//----------------------------------------------------------------------------------------------------------------
	                          //wait
	    
	    //implict wait
	    public static void implicitWait(int seconds) {
	    	driver.manage().timeouts().implicitlyWait(seconds,TimeUnit.SECONDS);
	    	
		}
	    // explicit wait
	    public static void explicitWait(WebElement element,int time) {
	    	
	    	WebDriverWait wait = new WebDriverWait(driver, time);
			wait.until(ExpectedConditions.visibilityOf(element));
			
		}
	    
//-------------------------------------------------------------------------------------------------------------------
	    
	                                         //frames 
	    
	    //default page switch
	    public static void switchToDefaultcontent() {
	    	driver.switchTo().defaultContent();
		}
	    
	    //switching frame 
	    public static void switchFrame(WebElement element) {
	    	
	    	driver.switchTo().frame(element);
       
		}
	    public static void switchToFrame(String input) {
            
	    	driver.switchTo().frame(input);
		}

	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
}
