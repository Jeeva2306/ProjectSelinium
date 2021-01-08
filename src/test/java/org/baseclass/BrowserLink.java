package org.baseclass;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class BrowserLink extends BaseClass{
	public static void main(String[] args) throws FileNotFoundException {
		Cell c = excelRead("C:\\Users\\Vignesh\\eclipse-workspace\\MavenSample1\\excel\\Book1.xlsx", "Sheet1",0,0);
		System.out.println(c);
	}
}