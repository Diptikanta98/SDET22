package GENERICUTILITIES;

import java.io.FileInputStream;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excelutility {
	public String getExcelData(String sheetName,int rownum,int cellnum) throws EncryptedDocumentException, Throwable {
		FileInputStream file=new FileInputStream(IPATHCONSTANT.excelfilepath);
		Workbook wb=WorkbookFactory.create(file);
		Sheet sh = wb.getSheet(sheetName);
		Row row = sh.getRow(rownum);

		Cell ce=row.getCell(cellnum);

		return ce.getStringCellValue();

	}
}