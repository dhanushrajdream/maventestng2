package com.properties;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Configuration_Reader {
	
	public static Properties p;
	
	
	public Configuration_Reader() throws Throwable  {
		
		
		//file
        File f = new File("C:\\Users\\Admin\\eclipse-workspace\\Maven_Project1\\src\\main\\java\\com\\properties\\Adactin.properties");
		
        //input stream
		FileInputStream fis = new FileInputStream(f);
		
		
		p = new Properties();
		
		
		//when we load files only we get property
		p.load(fis);
		
		
	}
	
	public String getUrl() throws Throwable  {
		
		String url = p.getProperty("url");
		return url;
		
	}
	
	public String getUsername() throws Throwable {
		
		String username = p.getProperty("username");
		return username;
		
	}
	
	public String getPassword() {
		
        String password = p.getProperty("password");
	    return password;
	
	}
	public String getFromDate() {
    
		String fromdate = p.getProperty("fromdate");
        return fromdate;
	}
	
	public String getToDate() {
       
		String todate = p.getProperty("todate");
		return todate;
	}
	
	public String getFirstname() {
		
        String firstname = p.getProperty("firstname");
        return firstname;
	}
	public String getLastname() {
    
		String lastname = p.getProperty("lastname");
	    return lastname;
	}
	public String getAddres() {
    
		String addres = p.getProperty("getaddress");
	    return addres;
	}
	public String getCcNumber() {
        String ccnumber = p.getProperty("ccnumber");
        return ccnumber;
	}
	
	public String getCvvNumber() {
		
        String cvvnumber = p.getProperty("cvvnumber");
        return cvvnumber;	
	}
	
	
	
	
	
	
	

}
