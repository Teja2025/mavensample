package website;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
public class readingDataFromExcel {
public static void main(String[] args) throws IOException {
		
		/// system.getpropery will use for get file dynamically
		FileInputStream file = new FileInputStream("C:\\Users\\Tejashwini C\\eclipse-workspace\\mavensample\\src\\test\\java\\DataDriven\\testing data.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		XSSFSheet sheet = workbook.getSheet("data");     // XSSFSheet sheets = workbook.getSheetAt(0);
        int totalNumRows = sheet.getLastRowNum();
        int totalNumCell=sheet.getRow(0).getLastCellNum();
        System.out.println("number of rows: "+ totalNumRows);
        System.out.println("number of cells: "+ totalNumCell);
 
        for(int r=0;r<=totalNumRows;r++)
        {
         XSSFRow CurrentRow = sheet.getRow(r);
         
        	for(int c=0;c<totalNumCell;c++)
        	{
        		XSSFCell cell = CurrentRow.getCell(c); // toString method will return the data from the cell
        		System.out.print(cell.toString()+"\t"); // toString method will convert everything in string format so adding "5000.0" adding .0 for that reason
        	}
        	System.out.println();
        }
        workbook.close();
        file.close();
	}
}
