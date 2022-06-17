package com.datadriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataDriven {
	
	public static void read_All_Data() throws Throwable {
		
		System.out.println("------all data-------");
		
		File f = new File("C:\\Users\\Admin\\eclipse-workspace\\Maven_Project1\\maven.xlsx");
		
		FileInputStream fis = new FileInputStream(f);
		
		Workbook w = new XSSFWorkbook(fis);
		
		Sheet sheetAt = w.getSheetAt(0);
	
		int numberOfRows = sheetAt.getPhysicalNumberOfRows();
		
		for (int i = 0; i < numberOfRows; i++) {
			
			Row row = sheetAt.getRow(i);
			
			int numberOfCells = row.getPhysicalNumberOfCells();
			
			for (int j = 0; j < numberOfCells; j++) {
				
				Cell cell = row.getCell(j); //data
				
				CellType cellType = cell.getCellType();
				
				if(cellType.equals(CellType.STRING)){
				 
					String value = cell.getStringCellValue();
					System.out.println(value);
				  
				}
				
				else if (cellType.equals(CellType.NUMERIC)) {
					
					double value = cell.getNumericCellValue();
					int num = (int) value;
					System.out.println(num);
					
				}
			}
			
		}
	}//method close
	
         
	public static void read_Particular_Data() throws Throwable {
        
		System.out.println("------------particular datta---------");
		File f = new File("C:\\Users\\Admin\\eclipse-workspace\\Maven_Project1\\maven.xlsx");
		
		FileInputStream fis = new FileInputStream(f);
		
		Workbook W = new XSSFWorkbook(fis);
		
		Sheet sheetAt = W.getSheetAt(0);
		
		Row row = sheetAt.getRow(4);
		
		Cell cell = row.getCell(1);
		
		CellType cellType = cell.getCellType();
		
		if (cellType.equals(CellType.STRING)) {
			
			String stringCellValue = cell.getStringCellValue();
			System.out.println(stringCellValue);
			
		}
		else if (cellType.equals(CellType.NUMERIC)) {
			
			double numericCellValue = cell.getNumericCellValue();
			int numb = (int) numericCellValue;
			System.out.println(numb);
		}
		
	}
	
	
	public static void particularRow() throws Throwable {
        System.out.println("------particular row-----------");
		
		File f = new File("C:\\Users\\Admin\\eclipse-workspace\\Maven_Project1\\maven.xlsx");
		
		FileInputStream fis = new FileInputStream(f);
		
		Workbook w = new XSSFWorkbook(fis);
		
		Sheet sheetAt = w.getSheetAt(0);
		
	    //int numberOfRows = sheetAt.getPhysicalNumberOfRows();
		
		Row row = sheetAt.getRow(4);                                             //row is constant
			
		int numberOfCells = row.getPhysicalNumberOfCells();
			
		for (int j = 0; j < numberOfCells; j++) {                                //looping only cells
				 
			Cell cell = row.getCell(j); //data
				
			CellType cellType = cell.getCellType();
				
				if(cellType.equals(CellType.STRING)){
				 
					String value = cell.getStringCellValue();
					System.out.print(value);
					 
				}
				
				else if (cellType.equals(CellType.NUMERIC)) {
					
					double value = cell.getNumericCellValue();
					int num = (int) value;
					System.out.println(num);
					
			}
		}
	}			
	
	
	
	
	
	
	public static void particularColumn() throws Throwable {
        System.out.println("----------particular coulmn----------------");
		
		File f = new File("C:\\Users\\Admin\\eclipse-workspace\\Maven_Project1\\maven.xlsx");
		
		FileInputStream fis = new FileInputStream(f);
		
		Workbook w = new XSSFWorkbook(fis);
		
		Sheet sheetAt = w.getSheetAt(0);
		
	      int numberOfRows = sheetAt.getPhysicalNumberOfRows();
	      
	      for (int i = 0; i < numberOfRows; i++) {                            //only looping rows
			
	        Row row = sheetAt.getRow(i);
            
			//int numberOfCells = row.getPhysicalNumberOfCells();
			
			Cell cell = row.getCell(1);                                       //cell is constant
			
			CellType cellType = cell.getCellType();
			
			if (cellType.equals(CellType.STRING)) {
				
				String Value1 = cell.getStringCellValue();
				System.out.println(Value1);
				
			}
			else if (cellType.equals(CellType.NUMERIC)) {
				
				double numericvalue = cell.getNumericCellValue();
				int n = (int) numericvalue;
				System.out.println(n);
				
			}
			
			
		
			
			
			
		
		}
	}
		

	
	
	public static void main(String[] args) throws Throwable {
		read_All_Data();
		read_Particular_Data();
		particularRow();
		particularColumn();
		
	}
	
	
	
	
	
	
	
	
	
	
	

	
	
	
	
	
	
	
	

}
