package genericClasses;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class TestDataReader {

	DataFormatter df = new DataFormatter();

	/*XSSFWorkbook wbk;
	XSSFSheet sheet;*/
	
	HSSFWorkbook wbk;
	HSSFSheet sheet;

	int celltype;

	public TestDataReader(String filepath) {

		File file = new File(filepath);
		FileInputStream fis;

		try {
			fis = new FileInputStream(file);
			//wbk = new XSSFWorkbook(fis);
			wbk = new HSSFWorkbook(fis);
		} catch (FileNotFoundException e) {
			e.getMessage();
		} catch (IOException e) {
			e.getMessage();
		}
	}

	public Object readDataFromFile(int sheetnumber, int rownumber, int colnumber) {

		sheet = wbk.getSheetAt(sheetnumber);
		Object data = df.formatCellValue(sheet.getRow(rownumber).getCell(colnumber));
		return data;
	}

	public int getRowCount(int sheetnumber) {
		return wbk.getSheetAt(sheetnumber).getPhysicalNumberOfRows();
	}

	public int getColCount(int sheetnumber, int rownumber) {
		return wbk.getSheetAt(sheetnumber).getRow(rownumber).getPhysicalNumberOfCells();
	}

}
