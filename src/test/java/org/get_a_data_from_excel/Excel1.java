package org.get_a_data_from_excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;



public class Excel1 {

	public static void main(String[] args) throws IOException {
		
		File file = new File("C:\\Users\\hp\\eclipse-workspace\\Maven\\Workbook\\Floor1Employees.xlsx");
		
		FileInputStream stream = new FileInputStream(file);
		
        Workbook workbook1 = new XSSFWorkbook(stream);
      		
		Sheet sheet = workbook1.getSheet("Intel");
		
		Row row = sheet.getRow(3);   // get the Row
		
		Cell cell = row.getCell(4);
		
		Cell cellString = row.getCell(5);  // get the Cell
		
		String stringCellValue = cellString.getStringCellValue();
		
		System.out.println(stringCellValue);  //Output 1-----------INDIA
		
		Cell cellNumeric = row.getCell(4);
		
		double numericCellValue = cellNumeric .getNumericCellValue();
		
		System.out.println(numericCellValue);  //Output 2----------90000.0
		
		System.out.println(cell);             //Output 3------------90000.0
		
		CellType cellType = cell.getCellType();  //get the Cell Type [STRING] OR [NUMERIC]
		
		System.out.println(cellType);           //Output 4-----------NUMERIC
		
		int physicalNumberOfRows = sheet.getPhysicalNumberOfRows();  // get the Row Count
		
		System.out.println(physicalNumberOfRows);    //Output 5-------10
		
		int physicalNumberOfCells = row.getPhysicalNumberOfCells();  // get the Cell Count
		
		System.out.println(physicalNumberOfCells);    //Output 6--------7
		
		for(int i=0;i<physicalNumberOfRows;i++)     
		{
			System.out.println("\t" + "------------------------");
			for(int j=0;j<physicalNumberOfCells;j++) 
			{
				Cell cell1 = row.getCell(j);
				System.out.println(cell1);     //Output 7-------print all row data
			}	
			System.out.println("\t");
		}
		
		switch (cellType) {
		case STRING:
			String stringCellValue2 = cell.getStringCellValue();
			System.out.println(stringCellValue2);
			break;
		case NUMERIC:
			double numericCellValue2 = cell.getNumericCellValue();
			System.out.println(numericCellValue2);
			break;
		default:
			
		}
		FileOutputStream fos = new FileOutputStream(file);
		
		Sheet createSheet1 = workbook1.createSheet("Data2");
		Row createRow1 = createSheet1.createRow(0);
		Row createRow2 = createSheet1.createRow(0);
		Row createRow3 = createSheet1.createRow(0);
		Cell createCell1 = createRow2.createCell(0);
		Cell createCell2 = createRow2.createCell(0);
		Cell createCell3 = createRow2.createCell(0);
		
		workbook1.write(fos);
		
		
		
		
		workbook1.close();	
	}
}
