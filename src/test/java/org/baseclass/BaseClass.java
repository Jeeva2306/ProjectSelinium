package org.baseclass;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {


	
	public static void openBrowser(String url) {
//		WebDriverManager.chromedriver().setup();
		WebDriverManager.iedriver().setup();
		WebDriver driver=new InternetExplorerDriver();
		driver.get(url);
		
	}
	public static Cell excelRead(String location,String sheetName,int rowNo,int cellNo) throws FileNotFoundException {
		File file = new File(location);
		FileInputStream fi = new FileInputStream(file);
		Workbook w = new XSSFWorkbook();
		Sheet s1 = w.getSheet(sheetName);
		Row r1 = s1.getRow(rowNo);
		Cell c2 = r1.getCell(cellNo);
		return c2;
	}

}
