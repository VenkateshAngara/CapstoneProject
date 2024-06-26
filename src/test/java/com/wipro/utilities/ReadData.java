package com.wipro.utilities;

import java.io.File;
import java.io.FileInputStream;
//import java.io.FileNotFoundException;
import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadData {

	public static String[][] getData (String excelSheetName2) throws EncryptedDocumentException, IOException {
		
		
		File file = new File(System.getProperty("user.dir")+"/src/test/resources/testdata/Data.xlsx");
		
		FileInputStream fi = new FileInputStream(file);
		Workbook wb = WorkbookFactory.create(fi);
		Sheet sheetName = wb.getSheet(excelSheetName2); 
		
		int totalRows = sheetName.getLastRowNum();
		System.out.println(totalRows);
		
		Row rowCells = sheetName.getRow(0);
		int totalCols = rowCells.getLastCellNum();
		System.out.println(totalCols);
		
		DataFormatter format = new DataFormatter();
		String testData [][] = new String[totalRows][totalCols];
		
		for(int i=1; i<=totalRows; i++)
		{
			for(int j=0; j<totalCols; j++)
			{
				testData[i-1][j]= format.formatCellValue(sheetName.getRow(i).getCell(j));
				System.out.println(testData[i-1][j]);
			}
			
		}
		return testData;
	}

}
