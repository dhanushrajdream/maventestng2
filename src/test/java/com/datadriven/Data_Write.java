package com.datadriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Data_Write {
	
	
	public static void datadriven_Write() throws IOException {
		
		File f = new File("C:\\Users\\Admin\\eclipse-workspace\\Maven_Project1\\maven.xlsx");
		
		FileInputStream fis = new FileInputStream(f);
		
		Workbook w = new XSSFWorkbook(fis);
		
	    Sheet createSheet = w.createSheet("dh");
	    
	    Row createRow = createSheet.createRow(0);
	    
	    Cell createCell = createRow.createCell(0);
	    
	    createCell.setCellValue("dhanush");
	    
	    w.getSheet("dh").getRow(0).createCell(1).setCellValue("last ");
	    w.getSheet("dh").getRow(0).createCell(2).setCellValue("tech");
	    w.getSheet("dh").createRow(1).createCell(0).setCellValue("unexpected");
	    w.getSheet("dh").getRow(1).createCell(1).setCellValue("game");
	    w.getSheet("dh").getRow(1).createCell(2).setCellValue("amd");
	    w.getSheet("dh").createRow(2).createCell(0).setCellValue("intel");
	    w.getSheet("dh").getRow(2).createCell(1).setCellValue("inte");
	    w.getSheet("dh").getRow(2).createCell(2).setCellValue("ryzen");
	    
	    FileOutputStream fos = new FileOutputStream(f);
	   
	    w.write(fos);
	   
	    w.close();
		
	}
		
		public static void main(String[] args) throws IOException {
			datadriven_Write();	
	}
	}


