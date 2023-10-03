// import statements 
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Iterator;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
public class POIforgfgRead { 
public static void main(String[] args) 
	{ 
		try { 
			FileInputStream file = new FileInputStream(new File("C:/Users/Sushant/Desktop/ash1.xlsx")); 

			// Create Workbook instance holding reference to .xlsx file 
			XSSFWorkbook workbook = new XSSFWorkbook(file); 

			// Get first/desired sheet from the workbook 
			XSSFSheet sheet = workbook.getSheetAt(0); 

			// Iterate through each rows one by one 
			Iterator<Row> rowIterator = sheet.iterator(); 
			while (rowIterator.hasNext()) { 
				Row row = rowIterator.next(); 
				// For each row, iterate through all the columns 
				Iterator<Cell> cellIterator = row.cellIterator(); 

				while (cellIterator.hasNext()) { 
					Cell cell = cellIterator.next(); 
					// Check the cell type and format accordingly 
					switch (cell.getCellType()) { 
					case Cell.CELL_TYPE_NUMERIC: 
						System.out.print(cell.getNumericCellValue() + "t"); 
						break; 
					case Cell.CELL_TYPE_STRING: 
						System.out.print(cell.getStringCellValue() + "t"); 
						break; 
					} 
				} 
				System.out.println(""); 
			} 
			file.close(); 
		} 
		catch (Exception e) { 
			e.printStackTrace(); 
		} 
	} 
} 
