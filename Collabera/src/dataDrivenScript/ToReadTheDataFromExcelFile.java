package dataDrivenScript;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.LocalDateTime;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ToReadTheDataFromExcelFile {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream fis= new FileInputStream("./TestResources/testDataExcel.xlsx");
		Workbook workbook= WorkbookFactory.create(fis);
		
	         LocalDateTime data = workbook.getSheet("Sheet1").getRow(2).getCell(3).getLocalDateTimeCellValue();
		System.out.println(data);
	}

}
