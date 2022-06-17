package com.Maven_Project1;

import org.openqa.selenium.WebDriver;

import com.properties.File_Reader_Manager;
import com.sdp.Page_Object_Manager;

public class Runner extends BaseClass {
	
public static WebDriver driver  =browserLaunch("chrome"); 
	
	//pom class one object
	public static Page_Object_Manager pom = new Page_Object_Manager(driver);
	
	//public static Login_Page lp = new Login_Page(driver);
	//public static Page_One pageone = new Page_One(driver);
	//public static Page_Two pagetwo = new Page_Two(driver); 
	//public static Page_Three pagethree = new Page_Three(driver); 
	
	public static void main(String[] args) throws Throwable {
		
		
		
		String url = File_Reader_Manager.getInstanceFRM().getInstanceCR().getUrl();  
        urlLaunch(url);                                                                                       //url
		
		//login page          
        String username = File_Reader_Manager.getInstanceFRM().getInstanceCR().getUsername();
		sendKeys(pom.getInstanceLoginPage().getUsername(), username);                                        //username
		
		String password = File_Reader_Manager.getInstanceFRM().getInstanceCR().getPassword();
        sendKeys(pom.getInstanceLoginPage().getPassword(), password);                                        //find&password typing
                                                     
        clickElement(pom.getInstanceLoginPage().getLogin());                                                 //login button,login.click();
	 
        //page one
         
        
        selectValue(pom.getInstancePageOne().getLocation(), "Paris");                                               // location
                                                                                                                                                                                     
        selectvisibletext(pom.getInstancePageOne().getHotels(), "Hotel Sunshine");                                  //hotel name
                    
        selectindex(pom.getInstancePageOne().getRoom_type(), 4);                                                    //room type
        
	    selectindex(pom.getInstancePageOne().getRoom_nos(), 5);                                                     //number of rooms
	                       
	    clear(pom.getInstancePageOne().getDatepick_in());                                                           //fromdate.clear(); //fromdate in hotel
	    String fromdate = File_Reader_Manager.getInstanceFRM().getInstanceCR().getFromDate();
	    sendKeys(pom.getInstancePageOne().getDatepick_in(),fromdate);                                         
	                                                 
	    clear(pom.getInstancePageOne().getDatepick_out());                                                          //todate.clear();
	    String toDate = File_Reader_Manager.getInstanceFRM().getInstanceCR().getToDate(); //frm-cr
	    sendKeys(pom.getInstancePageOne().getDatepick_out(), toDate);                                               //todate
	    
	    selectValue(pom.getInstancePageOne().getAdult_room(), "4");                                                  //people in rooms
	                                                                                         
	    selectindex(pom.getInstancePageOne().getChild_room(), 4);                                                   //child in rooms
	                                                     
	    clickElement(pom.getInstancePageOne().getSubmit());                                                         //search option
	    
	    //page two 
	                                                                                                 //syntax                                                                        
        clickElement(pom.getInstancePageTwo().getRadiobutton_0());                                                   //radiobutton
                                                                       
        clickElement(pom.getInstancePageTwo().getCont());                                                            //continue button
        
        //page three
        String firstname = File_Reader_Manager.getInstanceFRM().getInstanceCR().getFirstname();                                                                                               //syntax                                                      
        sendKeys(pom.getInstancePageThree().getFirst_name(), firstname);                                               //first name
                                                                
        String lastname = File_Reader_Manager.getInstanceFRM().getInstanceCR().getLastname();
        sendKeys(pom.getInstancePageThree().getLast_name(), lastname);                                                    //last name
        
        String addres = File_Reader_Manager.getInstanceFRM().getInstanceCR().getAddres();
        sendKeys(pom.getInstancePageThree().getAddress(), addres);                                                  //billing adress
        
        String ccnumber = File_Reader_Manager.getInstanceFRM().getInstanceCR().getCcNumber();
        sendKeys(pom.getInstancePageThree().getCc_num(), ccnumber);                                          //credit card number
          
        selectValue(pom.getInstancePageThree().getCc_type(), "VISA");                                                  //cc.selectByValue("VISA"); 
        
        selectValue(pom.getInstancePageThree().getCc_exp_month(), "5");                                                //cc expire month                         
        
        selectValue(pom.getInstancePageThree().getCc_exp_year(), "2022");                                              //cc expire year
                  
        String cvvnumber = File_Reader_Manager.getInstanceFRM().getInstanceCR().getCvvNumber();
        sendKeys(pom.getInstancePageThree().getCc_cvv(), cvvnumber);                                                       //cvv number
                                                                 
        clickElement(pom.getInstancePageThree().getBook_now());                                                        //booknow button
        
        Thread.sleep(10000);
        clickElement(pom.getInstancePageThree().getLogout());                                                          // final logout button
        
        Thread.sleep(10000);	
 	    closeBrowser();
		

		
		
	}
	}


