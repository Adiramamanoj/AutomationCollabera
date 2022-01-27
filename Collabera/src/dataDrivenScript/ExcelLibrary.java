package dataDrivenScript;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.LocalDateTime;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelLibrary {
	/***
	 * @author Adi Rama Venkata Manoj
	 */
	  public String  exPath="./TestResources/testDataExcel.xlsx";

	/**
	 * This Method Is Used Read The String Data From Excel File
	 * @param sheetname Provide The Sheetname Where You Have Test Data
	 * @param row Provide The Row Number Where You Have Test Data 
	 * @param cell Provide The Cell Number Where You Have Test Data
	 * @return  It Returns The Data In That Respective Sheet, Row, Cell in the from of String 
	 */

	public String readStringData(String sheetName, int rowNum, int cellNum) {
		Workbook workbook= null;

		try {
			File absPath= new File(exPath);
			FileInputStream fis = new FileInputStream(absPath);
			workbook=WorkbookFactory.create(fis);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (EncryptedDocumentException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		return workbook.getSheet(sheetName).getRow(rowNum).getCell(cellNum).getStringCellValue();

	}



	/**
	 * This Method Is Used Read The Numeric Data From Excel File
	 * @param sheetname Provide The Sheetname Where You Have Test Data
	 * @param row Provide The Row Number Where You Have Test Data 
	 * @param cell Provide The Cell Number Where You Have Test Data
	 * @return  It Returns The Data In That Respective Sheet, Row, Cell in the from of Double 
	 */

	public  double readNumericData(String sheetName, int rowNum, int cellNum){
		Workbook workbook= null;



		try {
			File absPath= new File(exPath);
			FileInputStream fis = new FileInputStream(absPath);
			workbook= WorkbookFactory.create(fis);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (EncryptedDocumentException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return workbook.getSheet(sheetName).getRow(rowNum).getCell(cellNum).getNumericCellValue();

	}




	/**
	 * This Method Is Used Read The LocalDateAndTime Data From Excel File
	 * @param sheetname Provide The Sheetname Where You Have Test Data
	 * @param row Provide The Row Number Where You Have Test Data 
	 * @param cell Provide The Cell Number Where You Have Test Data
	 * @return  It Returns The Data In That Respective Sheet, Row, Cell in the from of LocalDateTime
	 */

	public  LocalDateTime readDateData(String sheetName, int rowNum, int cellNum){
		Workbook workbook= null;



		try {
			File absPath= new File(exPath);
			FileInputStream fis = new FileInputStream(absPath);
			workbook= WorkbookFactory.create(fis);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (EncryptedDocumentException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return workbook.getSheet(sheetName).getRow(rowNum).getCell(cellNum).getLocalDateTimeCellValue();

	}




	/**
	 * This Method Is Used Read The Boolean Data From Excel File
	 * @param sheetname Provide The Sheetname Where You Have Test Data
	 * @param row Provide The Row Number Where You Have Test Data 
	 * @param cell Provide The Cell Number Where You Have Test Data
	 * @return  It Returns The Data In That Respective Sheet, Row, Cell in the from of Boolean 
	 */

	public  boolean readBooleanData(String sheetName, int rowNum, int cellNum){
		Workbook workbook= null;



		try {
			File absPath= new File(exPath);
			FileInputStream fis = new FileInputStream(absPath);
			workbook= WorkbookFactory.create(fis);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (EncryptedDocumentException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return workbook.getSheet(sheetName).getRow(rowNum).getCell(cellNum).getBooleanCellValue();

	}
}
