package selenium;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteDataToExcel {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//Create an object of ReadDataFromExcel class

				ReadDataFromExcel objExcelFile = new ReadDataFromExcel();

			    //Prepare the path of excel file
				//Prepare the path of excel file
				String filePath="//D:";
				String fileName="TestData1.xls";
				String sheetName="Sheet1";
				String[] valueToWrite = {"Anil Reddy","Password123"};
				//Create an object of File class to open xlsx file
				File file = new File(filePath+"\\"+fileName);
			    //Create an object of FileInputStream class to read excel file

			    FileInputStream inputStream = new FileInputStream(file);

			    Workbook workBook = null;

			    //Find the file extension by splitting file name in substring  and getting only extension name
			    String fileExtensionName = fileName.substring(fileName.indexOf("."));

			   

			    //Check condition if the file is xlsx file

			    if(fileExtensionName.equals(".xlsx")){

			    //If it is xlsx file then create object of XSSFWorkbook class

			    	workBook = new HSSFWorkbook(inputStream);

			    }

			    //Check condition if the file is xls file

			    else if(fileExtensionName.equals(".xls")){

			        //If it is xls file then create object of HSSFWorkbook class

			    	workBook = new XSSFWorkbook(inputStream);

			    }

			    //Read sheet inside the workbook by its name

			    Sheet sheet = workBook.getSheet(sheetName);

			    //Find number of rows in excel file

			    int rowCount = sheet.getLastRowNum()-sheet.getFirstRowNum();
			    Row row = sheet.getRow(0);

			    //Create a new row and append it at last of sheet

			    Row newRow = sheet.createRow(rowCount+1);

			    //Create a loop over the cell of newly created Row

			    for(int j = 0; j < row.getLastCellNum(); j++){

			        //Fill data in row

			        Cell cell = newRow.createCell(j);

			        cell.setCellValue(valueToWrite[j]);

			    }

			    //Close input stream

			    inputStream.close();

			    //Create an object of FileOutputStream class to create write data in excel file

			    FileOutputStream outputStream = new FileOutputStream(file);

			    //write data in the excel file

			    workBook.write(outputStream);

			    //close output stream

			    outputStream.close();

	}

}
