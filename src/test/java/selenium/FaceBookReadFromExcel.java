package selenium;

import java.awt.Robot;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FaceBookReadFromExcel {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//Prepare the path of excel file
				String filePath="//D:";
				String fileName="FaceBookTestData.xlsx";
				String sheetName="Sheet1";
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

			    	workBook = new XSSFWorkbook(inputStream);

			    }

			    //Check condition if the file is xls file

			    else if(fileExtensionName.equals(".xls")){

			        //If it is xls file then create object of HSSFWorkbook class

			    	workBook = new XSSFWorkbook(inputStream);

			    }
			    Sheet sheet = workBook.getSheet(sheetName);

			    Row row = sheet.getRow(1);

			    Sheet sheet1 = workBook.getSheetAt(0);
			       //  Row row = workBook.getRow(1);
			    	String userId=row.getCell(0).getStringCellValue();
		        	System.out.println(row.getCell(0).getStringCellValue());
		        	String passWord=row.getCell(1).getStringCellValue();
		        	System.out.println(row.getCell(1).getStringCellValue());
		        	System.setProperty("webdriver.chrome.driver", "C:\\Ashok\\chromedriver.exe");
		 		    WebDriver driver = new ChromeDriver();
		 		    driver.get("https://www.facebook.com/");	
		 	        driver.findElement(By.name("email")).clear();
		 	        driver.findElement(By.name("email")).sendKeys(userId);
		 	        driver.findElement(By.id("passContainer")).clear();
		 	        driver.findElement(By.id("passContainer")).sendKeys(passWord);

			        }
	}
