package com.testNG;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

//how to read excel data  from your frame work?[very importent question for interview]

public class ReadexalData {
	public static void main(String[]args) throws IOException {
		
		FileInputStream fileLocation = new FileInputStream("./TestData/IT data.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(fileLocation);
		XSSFSheet sheet = workbook.getSheet("TestData");
		Iterator<Row> rowIteraor = sheet.iterator();
		rowIteraor.next();
		ArrayList<String> list = new ArrayList<String>();
while (rowIteraor.hasNext()) {
			
			list.add(rowIteraor.next().getCell(1).getStringCellValue());
			System.out.println(list);
		}
	}
	
	 

}
