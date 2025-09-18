package utils;

import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFCell;

public class ExcelReader {
    private static final String FILE_PATH = "./Testsamp.xlsx";

    public String getCellData(String sheetName, int rowNum, int colNum) throws IOException {
        FileInputStream fis = new FileInputStream(FILE_PATH);
        XSSFWorkbook workbook = new XSSFWorkbook(fis);
        XSSFSheet sheet = workbook.getSheet(sheetName);
        XSSFRow row = sheet.getRow(rowNum);
        XSSFCell cell = row.getCell(colNum);

        DataFormatter formatter = new DataFormatter();
        String value = formatter.formatCellValue(cell);

        workbook.close();
        fis.close();
        return value;
    }
}